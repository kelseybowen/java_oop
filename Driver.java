package models;

public class Driver extends Car {
	
	public void drive() {
		this.setGas(-1);
		int gasRemaining = this.getGasStatus();
		System.out.printf("You drive the car. \nGas remaining: %d/10\n", gasRemaining);
		if (this.getGasStatus() < 1) {
			System.out.println("GAME OVER.");
		}		
	}
	
	public void boost() {
		if (this.getGasStatus() > 2) {
			this.setGas(-3);
			int gasRemaining = this.getGasStatus();
			System.out.printf("Boosters activated. \nGas remaining: %d/10\n", gasRemaining);
			if (this.getGasStatus() < 1) {
				System.out.println("GAME OVER.");
			}		
		}
		else {
			
			System.out.println("Sorry, not enough gas to use boosters.\n");
		}
	}
	
	public void refuel() {
		if (this.getGasStatus() < 9) {
			this.setGas(2);
			int gasRemaining = this.getGasStatus();
			System.out.printf("Refueled. \nGas remaining: %d/10\n", gasRemaining);
		}
		else {
			System.out.println("Sorry, cannot refuel unless gas is 8 or less.\n");
		}
	}
	
}
