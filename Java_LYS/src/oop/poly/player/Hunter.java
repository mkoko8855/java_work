package oop.poly.player;

public class Hunter extends Player {

	String pet;

	
	
	
	
	Hunter(String name){
		super(name);
		this.pet = "꼬끼오";
	}
	
	
	
	
	
	
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 펫 이름 : " + pet);
	}
}
