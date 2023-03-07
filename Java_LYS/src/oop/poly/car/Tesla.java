package oop.poly.car;

public class Tesla extends Car {

	@Override
	void run() {
		//super.run();         ////부모가물려주는 메서드는 필요 없으니 지워줄거다.
		System.out.println("테슬라가 나갑니다~.");
	}
	
	
	
	
	//다음 설명 할 것은, 일단 테슬라 클래스로 가자. 왔다. 메서드하나 쓰고 다시 메인클래스가보자.
	void enterMembership() {
		System.out.println("테슬라 멤버쉽에 가입합니다.");
	}
	
	
	
	
	
}
