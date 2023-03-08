package oop.abs.pet;

public class Cat extends Pet {   //Cat클래스 만들 때 설정 부분에서 상속+오버라이딩 까지 자동 생성하는 기능이 있다. 
	                             //SuperClass에 브라우저 누르고 Pet을 검색하면 된다.
								 //그러나 이 줄에 Cat에 빨간줄 뜬다.
//	public Cat() {
//		super();                 //그래서 < 이게 없어서그래..자식쪽에서 3개를 넘기던지 해야 된다.
//	}
	
	
	
	public Cat(String name, String kind, int age) {
		super(name, kind, age);        ////그래서 < 이게 없어서그래..자식쪽에서 3개를 넘기던지 해야 된다.
	}
	
	
	
	@Override
	public void feed() {
		System.out.println("고양이는 생선을 냠냠 먹어요");
	}

	
	
	@Override
	public void takeNap() {
		System.out.println("고양이는 캣타워에서 자요");

	}

}
