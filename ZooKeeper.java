package com.OOP;

public class ZooKeeper {
	private int energyLevel;
	
	public ZooKeeper() {
		this.energyLevel = 100;
	}

	public void setEnergy(int energy) {
		this.energyLevel = energy;
	}
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	public void modifyEnergy(int change) {
		this.energyLevel += change;
	}
}