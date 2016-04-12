/**
 *   File Name: SampleApplication.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 9, 2016
 *
 */

package com.sqa.MA.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * SampleApplication //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class SampleApplication {

	static List<ElectronicDevice> electronicDevices;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		createElectronicDevices();
		displaydevices();
		addDevices(new ElectronicDevice(), new ElectronicDevice());
		displaydevices();
		removeDevice();
		displaydevices();

	}

	/**
	 * @param electronicDevices2
	 */
	private static void addDevices(ElectronicDevice... electronicDevicesArgs) {
		for (ElectronicDevice ed : electronicDevicesArgs) {
			electronicDevices.add(ed);
		}

	}

	/**
	 *
	 */
	private static void createElectronicDevices() {
		electronicDevices = new ArrayList<ElectronicDevice>();
		electronicDevices.add(new ElectronicDevice());
		electronicDevices.add(new ElectronicDevice());
		electronicDevices.add(new ElectronicDevice());
		electronicDevices.add(new ElectronicDevice());
		electronicDevices.add(new ElectronicDevice());

	}

	/**
	 *
	 */
	private static void displaydevices() {
		System.out.println("-------------------------------------------------------");
		for (ElectronicDevice device : electronicDevices) {
			System.out.println(device.getClass().getSimpleName() + " - " + device);
		}
		System.out.println("-------------------------------------------------------");

	}

	/**
	 *
	 */
	private static void removeDevice() {
		if (electronicDevices.size() >= 1) {
			System.out.println("Remove a device.....");
			electronicDevices.remove(electronicDevices.size() - 1);
		} else {
			System.out.println("Sorry no more items may be removed at this time. Havea nice day!");

		}

	}

}
