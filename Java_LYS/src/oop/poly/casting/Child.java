package oop.poly.casting;

public class Child extends Parent {

	//Chile만의 변수를 선언해보자
	public int n2; //부모가 준게 아니라 자식 고유의 멤버 변수를 만들어 줬다. (참고로 부모는 n1이다)
	
	
	
	
	//부모의 메서드1을 재정의하자
	@Override
	public void method1() {
		System.out.println("부모의 method1을 재정의한 1번 메서드 호출");
	}
	
	
	
	//자식 고유의 메서드를 만들자
	public void method3() {
		System.out.println("자식 고유의 3번 메서드 호출");
	}
	
	
	
	//이제 메인클래스를 하나 생성해주고, 메인클래스로 가보자
	
	
	
	
	
	
	
	
	
	
	
}
