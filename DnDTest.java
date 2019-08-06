package com.OOP;

public class DnDTest {

	public static void main(String[] args) {
		Human BillyBob = new Human();
		Human JoeBob = new Human();
		BillyBob.attack(JoeBob);
		JoeBob.displayHealth();
		System.out.println("***********");
		Samurai Sammy = new Samurai();
		Samurai Tammy = new Samurai();
		Samurai Uammy = new Samurai();
		Samurai Vammy = new Samurai();
		Sammy.deathBlow(BillyBob);
		BillyBob.displayHealth();
		Sammy.displayHealth();
		System.out.println("***********");
		Sammy.meditate();
		Sammy.displayHealth();
		Samurai.howMany();
		System.out.println("***********");
		Wizard wiz = new Wizard();
		wiz.heal(BillyBob);
		wiz.fireball(Tammy);
		System.out.println("*Wiz*");
		wiz.displayHealth();
		System.out.println("*BillyBob*");
		BillyBob.displayHealth();
		System.out.println("*Tammy*");
		Tammy.displayHealth();
		System.out.println("***********");
		Ninja ninny = new Ninja();
		ninny.steal(Tammy);
		System.out.println("*Tammy*");
		Tammy.displayHealth();
		System.out.println("*Ninny*");
		ninny.displayHealth();
		ninny.runAway();
		System.out.println("*Ninny*");
		ninny.displayHealth();
		
	}

}
