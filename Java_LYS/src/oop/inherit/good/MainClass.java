package oop.inherit.good;
public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior();

		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "전사1";
		w1.rage = 60;
		w1.characterInfo();

		System.out.println("---------------------------");

		Mage m1 = new Mage();

		m1.level = 2;
		m1.atk = 5;
		m1.hp = 100;
		m1.name = "마법사1";
		m1.mana = 500;
		m1.characterInfo();

		System.out.println("---------------------------");

		Hunter H1 = new Hunter();
		H1.level = 3;
		H1.atk = 10;
		H1.hp = 200;
		H1.name = "헌터1";
		H1.pet = "고양이";
		H1.characterInfo();
	}
}
