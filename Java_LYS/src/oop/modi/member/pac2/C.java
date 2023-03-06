package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {
	
	
	public C() {

		A a = new A();   //다른 패키지니까 임포트해야됨.
		
		a.x = 1;   //public 이니까 가능
//		a.y = 2;   //default니까 패키지가 달라져서 안됨.
//		a.z = 3;   //private니까 당연히 안됨.
		
		a.method1(); //public 이니까 가능
//      a.method2(); //defualt니까 안됨
//      a.method3(); //private니까 안됨
	
	}
	
	
	
	
	
}
