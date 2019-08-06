package com.OOP;

public class Bat extends ZooKeeper{

	public Bat() {
		this.setEnergy(300);
	}
	public void fly() {
		System.out.println("WHOOOOOSH");
		this.modifyEnergy(-50);
	}
	public void eatHumans() {
		System.out.println("Yum");
		this.modifyEnergy(25);
	}
	public void attackTown() {
		System.out.println("Whoops. Town's gone.");
		this.modifyEnergy(-100);
	}

}
