package oop.modi.constructor.pac1;

public class B {

	
	A a1 = new A(true);	//public이엿지.
	A a2 = new A(30);  //default엿지.
//	A a3 = new A(5.56); 얜 왜 안됨? double값을 받는 생성자는 보이지 않는다. 즉, private 때문에 가려져서.
//                      해결 방법은 private이라는 것을 없애야 생성이 된다. private은 같은 클래스 안에서만 가능하다.
	
	
}
