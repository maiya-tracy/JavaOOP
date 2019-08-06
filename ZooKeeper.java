package com.OOP;

public class ZooKeeper {
	private int energyLevel = 100;

	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	public void modifyEnergy(int change) {
		this.energyLevel += change;
	}
}