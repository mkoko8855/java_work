package oop.modi.member.pac1;

public class A {

	public int x;
	int y;  //아무 것도 붙이지 않으니 default임.
	private int z;
	
	
	
	
	
	
	//생성자 쉽게 뽑는 법 (컨트롤+스페이스)
	//1. 변수와 메서드 사이에 생성자를 선언하는게 일반적이다.
	public A() {
		x = 1;
		y = 2;
		z = 3;
		
		method1();  //앞에는 전부 this가 생략 되어있다. 그래서 생성자 안에서 메서드 부를 수 있음.
		method2();  //앞에는 전부 this가 생략 되어있다. 그래서 생성자 안에서 메서드 부를 수 있음.
		method3();  //앞에는 전부 this가 생략 되어있다. 그래서 생성자 안에서 메서드 부를 수 있음.
	}
	//즉, 같은 클래스에서는 문제가 없다. 그럼 클래스만 바꾸어보자. 클래스 B로 가자.
	
	
	
	
	
	
	
	public void method1() {
		
	}
	
	
	void method2() {
		
	}
	
	
	
	private void method3() {
		
	}
	
	
	
	
	
	
}
