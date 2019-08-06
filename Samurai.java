package com.OOP;

public class Samurai extends Human {
	static int count = 0;
	public Samurai() {
		this.setHealth(200);
		count ++;
	}
	public void deathBlow(Human target) {
		target.setHealth(0);
		this.setHealth(this.displayHealth()/2);
	}
	public void meditate() {
		this.setHealth(this.displayHealth()*3/2);
	}
	public static int howMany() {
		System.out.println(count);
		return count;
	}
}
