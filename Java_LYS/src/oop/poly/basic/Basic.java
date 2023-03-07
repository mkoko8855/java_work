package oop.poly.basic;
                         

									//        다           형           성

 /*
  
 	자바에서는 하나의 클래스 파일에 여러 개의 클래스를 선언할 수 있다.
 	
 	밀접한 연관이 있는 클래스를 모아 놓기 위해 사용한다.
 	
 	단, 파일명과 동일한 클래스가 반드시 존재 해야 하고,
 	
 	해당 클래스만 public으로 선언할 수 있다.
 	
 */




class A{
	
}



class B extends A{
	
}


class C extends A{
	
	
	
}



class D extends B{
	
}


class E extends C{
	
}




public class Basic {

	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	//위를 배열로 만들면 배열이 5개 필요하다. 타입이 서로 다르니까.
	

	
	
	
	 /*
	  	다형성이란?
	  	자식 객체가 모든 부모이 타입을 가질 수 있다는 것을 의미한다.
	  	
	  	즉, 부모 타입 변수에 자식 객체의 주소 값을 얼마든지 저장할 수 있다는 것이다.
	 */
	
//	A v1 = new A();    //이거 대신에
//	A v1 = new B();    //이거 가능하다는 것이다, 클래스 타입 B가 A타입으로 자동 형변환(promotion)이라고 한다.
//	A v2 = new C();    //이것도 가능하다. C는 A의 자식이 맞으니까.
//	A v3 = new D();    //이것도 가능하다. D는 B의 자식이지만 B는 A의 자식이기도 하니까.
//	A v4 = new E();    //이것도 가능하다. E는 C의 자식이지만 C는 A의 자식이기도 하니까.
//	A v5 = b;          //자동 형변환이 일어나서 b가 가능하다.
	
//	B v6 = new D();    //D는 B의 자식이니까 가능.
//	C v7 = new E();    //E는 C의 자식이니까 가능.
	
	//위는 배열이 1개 필요하다. 타입이 같잖아.
	
	
	
	
	
	
	//그러나 상속 관계가 없다면 다형성 적용이 불가능하다.
	//즉, 다형성은 무조건 상속 관계 하에서만 발생한다.
	
//	B v8 = new E();  //안됨. 서로 관계가 없잖아.
//	C v9 = new D();  //안됨. 서로 관계가 없잖아.
//	B v10 = new C(); //안됨. 부모는 같지만 서로 관계가 없잖아.
//	D v11 = new E(); //안됨. 서로 관계가 없잖아.
	
	
	
	
	
	
	//Object는 자바의 최상위 클래스다.
	//모든 클래스는 결국 Object의 자식이다.
	//즉, Object타입의 변수에는 어떠한 객체도 들어올 수 있다.
	
	
	
	
	
	
	
	Object o1 = new A();
	Object o2 = new B();
	Object o3 = new C();
	Object o4 = new D();
	Object o5 = new E();
	//이것들은 오브젝트가 최상위클래스 이기에 가능하다.
	
	Object o6 = new String("안녕하세요");       //가능
	Object o7 = new Basic();				 //가능 컴파일과정에서 extends가 자동 생성되기 떄문.
	
	
	
	
	
}
