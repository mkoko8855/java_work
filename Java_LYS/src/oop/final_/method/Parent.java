package oop.final_.method;

/*
	(클래스 선언 시 final을 사용하면 그 클래스는 상속이 불가능하다.
	
	final 클래스는 자식 클래스를 가질 수 없고 오직 외부에서 객체 생성을 통해서만 사용할 수 있다.
	
	대표적인 final 클래스는 String(문자열 객체) 이다.
	
*/


//파이널이 메서드에 먹는거 확인 한 다음, 파이널을 클래스에 먹는걸 확인하려고 클래스에 파이널 붙였다.
//Parent에 final을 쓴 다는 것은, 상속을 할 수 없다는 것. 즉, 개념을 확장하지 말라는 것이다.
//Child클래스에 빨간불 들어오니 final을 일단 final을 지워주자.
public class Parent {

	void method1() {
		
	}
	
	void method2() {
		
	}
	
	final void method3() {
		
	}
	
	
	
	
	
	
	
	
	
}
