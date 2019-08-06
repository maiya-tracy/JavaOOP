package com.OOP;

public class Ninja extends Human {
	public Ninja() {
		this.setStealth(10);
	}

	public void steal(Human target) {
		target.modifyHealth(this.displayStealth()*(-1));
		this.modifyHealth(this.displayStealth());
	}
	public void runAway() {
		this.modifyHealth(-10);
	}
}
