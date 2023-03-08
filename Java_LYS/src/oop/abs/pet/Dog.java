package oop.abs.pet;

public class Dog extends Pet {     //Cat클래스 만들 때 설정 부분에서 상속+오버라이딩 까지 자동 생성하는 기능이 있다. 
    							   //SuperClass에 브라우저 누르고 Pet을 검색하면 된다.

	
	public Dog(String name, String kind, int age) {   //Dog에 불뜨니 똑같이 이걸 해결해야됨. 
		super(name, kind, age);
	}

	
	
	@Override
	public void feed() {   //오버라이딩 해야 객체가 생김.
		System.out.println("강아지는 사료를 와구와구 먹어요");
	}

	@Override
	public void takeNap() {  //오버라이딩 해야 객체가 생김.
		System.out.println("강아지는 마당에서 낮잠을 자요");
	}
}
