package com.OOP;

public class DnDTest {

	public static void main(String[] args) {
		Human BillyBob = new Human();
		Human JoeBob = new Human();
		BillyBob.attack(JoeBob);
		JoeBob.displayHealth();
	}

}
