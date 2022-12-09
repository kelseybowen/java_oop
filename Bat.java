package models;

public class Bat extends Mammal{
	
	public Bat() {
		super.setEnergyLevel(300);
	}

	public void fly() {
		System.out.println("SCREECH");
		super.setEnergyLevel(getEnergyLevel()-50);
		super.displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("Yummy humans!");
		super.setEnergyLevel(getEnergyLevel()+25);
		super.displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("FIRE FIRE FIRE");
		super.setEnergyLevel(getEnergyLevel()-100);
		super.displayEnergy();
	}
}
