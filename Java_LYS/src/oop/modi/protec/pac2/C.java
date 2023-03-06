package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A {

	
	
//	A a1 = new A(30);    protected라서 안됨. 빨간 줄의 이유는 import문제가 아니라 생성자를 부르지 못하니 객체 생성이 안된다.
//	A a2 = new A(5.67);	 default는 패키지가 바뀌니까 사용이 불가됨이 확인이 되었다. 변수와 메서드도 마찬가지다.
	
	
	
	
	//패키지가 A클래스는 pac1에 있고 지금 작성하는 C클래스는 pac2에 있다. 그래서 디폴트랑 프로텍티드가 접근을 못하는데
	//만약 C클래스가 A클래스와 상속 관계에 있다면?
	//프로텍티드는 제한적으로 접근이 가능하다. 아래 설명을 마저 보자.
	
	
	
	//일단 생성자 하나 뽑아봐
	public C() {
		
	     /*
		 	- protected 제한자는 패키지가 다른 경우, 두 클래스 사이에 상속 관계가 있다면 super 키워드를 통해서 참조를 허용한다.
		 */
		
		super(30);
//		super(5.67); 얘는 안된다. 프로텍티드가 아니라 상속가 관계 없는 디폴트 이기 때문이다.
		
		super.x = 1; //가능
//		super.y = 2; //불가능
		
//		super.method1(); //상속 관계기 때문에 가능
//		super.method2(); //프로텍티드가 아니기 때문에 불가
		
		
		
		//즉, 프로텍티드는 상속을 강제(강요) 할 때 사용한다.
	}
}
