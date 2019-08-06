package com.OOP;

public class Human {
	private int strength;
	private int intelligence;
	private int stealth;
	private int health;

	public Human() {
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
		this.health = 100;
	}

	public int displayStrength() {
		System.out.println(this.strength);
		return this.strength;
	}
	public int displayIntelligence() {
		System.out.println(this.intelligence);
		return this.intelligence;
	}
	public int displayStealth() {
		System.out.println(this.stealth);
		return this.stealth;
	}
	public int displayHealth() {
		System.out.println(this.health);
		return this.health;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void modifyStrength(int strength) {
		this.strength += strength;
	}
	public void modifyIntelligence(int intelligence) {
		this.intelligence += intelligence;
	}
	public void modifyStealth(int stealth) {
		this.stealth += stealth;
	}
	public void modifyHealth(int health) {
		this.health += health;
	}
	public void attack(Human attacked) {
		attacked.health -= this.strength;
	}
}
