package oop.modi.protec.pac1;

public class B {

	
	A a1 = new A(30);   //protected. 같은 패키지 안에서 사용 가능을 확인했음
	A a2 = new A(3.14); //default. 같은 패키지 안에서 사용 가능을 확인했음
	
	
	public B() {
		a1.x = 1;  //x가 protected 라 접근 가능
		a1.y = 2;  //y가 디폴트라 접근 가능
		
		
		
		
		a1.method1();   //메서드 호출도 마찬가지로 문제가 없다.
		a2.method2();	//메서드 호출도 마찬가지로 문제가 없다.
	}
}


//그럼 패키지를 바꿔보자. 디폴트는 접근이 안되었고, protected는 어떤 반응을 보일지 보자. protec.pac2의 C클래스로 가자