package models;

public abstract class Mammal {
	private int energyLevel = 100;
	
	public Mammal() {}
	
	public int displayEnergy() {
		System.out.println("Energy level: " + this.energyLevel + "\n");
		return this.energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
