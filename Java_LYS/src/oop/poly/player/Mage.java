package oop.poly.player;


public class Mage extends Player {

	
	int mana;

	
	Mage(String name){
		super(name);
		this.mana = 6000;
	}
	
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 정신력 : " + mana);
	}
}
