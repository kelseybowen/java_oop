package models;

public class Car {
	private int gas = 10;
	public Car() {}
	
	
	public int getGasStatus() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas += gas;
	};
	
	
}
