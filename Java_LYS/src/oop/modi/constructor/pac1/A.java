package oop.modi.constructor.pac1;

public class A {

	
	A a1 = new A(true);
	A a2 = new A(50);
	A a3 = new A(3.14);
	
	
	
	//일단 생성자를 중복 선언해보자
	public A(boolean b) {
		
	}
	
	
	
	
	
	A(int i) { //접근제한자 : default
		
	}
	
	
	
	
	private A(double d) {	//접근제한자 : private
		
	}
	
	
	
	
}
