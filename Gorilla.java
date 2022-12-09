package models;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("The gorilla has thrown something.");
		super.setEnergyLevel(getEnergyLevel()-5);
		super.displayEnergy();
	}
	
	public void eatBananas() {
		System.out.println("Yum! I love bananas.");
		super.setEnergyLevel(getEnergyLevel()+10);
		super.displayEnergy();
		}
	
	public void climb() {
		System.out.println("The gorilla is climbing.");
		super.setEnergyLevel(getEnergyLevel()-10);
		super.displayEnergy();
	}
	
}
