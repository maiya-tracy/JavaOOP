package com.OOP;

public class Gorilla extends ZooKeeper {
	public void throwSomething() {
		System.out.println("Gorilla threw something");
		this.modifyEnergy(-5);
	}
	public void eatBananas() {
		System.out.println("Gorilla ate yummy bananas");
		this.modifyEnergy(10);
	}
	public void climb() {
		System.out.println("Gorilla climbed a tree");
		this.modifyEnergy(-10);
	}
}
