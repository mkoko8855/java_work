package oop.inter.basic;



//클래스가 상속 가능한 것처럼 인터페이스도 extends를 사용하여
//인터페이스 간의 상속을 구현할 수 있다.
//인터페이스 끼리는 다중 상속도 가능하다. (클래스가 단일 상속만 가능)
public interface Inter2 extends ParentInter {

	
								//인터페이스들 끼리 상속이 가능하다.
	
//	void method1(); 이건 Inter의 메서드인데 이것이 물려질 것이다.
//  그리고 다중 상속이 가능하다. 껍데기를끼리 주고 받기 가능.
	
	int i = 5;  //static final로 인식되고 이것은 인터페이스 값이 아니라 상수이다. 스태틱이 저장되는 공간에 저장될 것임.
	
	void method2(); //abstract.   메서드도 껍데기만 만들 수 있다. 
}


