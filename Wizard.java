package com.OOP;

public class Wizard extends Human {
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	public void heal(Human target) {
		target.modifyHealth(this.displayIntelligence());
	}
	public void fireball(Human target) {
		target.modifyHealth(this.displayIntelligence()*(-3));
	}
}
