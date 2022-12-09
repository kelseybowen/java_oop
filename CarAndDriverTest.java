package main;

import models.Driver;

public class CarAndDriverTest {

	public static void main(String[] args) {
		Driver newDriver = new Driver();
		newDriver.drive();
		newDriver.drive();
		newDriver.drive();
		newDriver.drive();
		newDriver.boost();
		newDriver.refuel();
		newDriver.refuel();
		newDriver.refuel();
	}
}
