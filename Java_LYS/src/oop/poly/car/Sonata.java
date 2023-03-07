package oop.poly.car;

public class Sonata extends Car {

	//부모클래스인 Car의 void run()이 마음에 안들어. 바꿀래. 오버라이딩하자(컨+쉬프트+s)
	
	
	@Override
	void run() {
		System.out.println("소나타가 갑니다 가요");
	}
	
}
