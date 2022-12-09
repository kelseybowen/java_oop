package main;

import models.Bat;

public class BatTest {

	public static void main(String[] args) {
		Bat barry = new Bat();
		
		barry.attackTown();
		barry.attackTown();
		barry.attackTown();
		
		barry.eatHumans();
		barry.eatHumans();
		
		barry.fly();
		barry.fly();

	}

}
