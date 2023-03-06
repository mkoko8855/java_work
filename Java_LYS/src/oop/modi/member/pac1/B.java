package oop.modi.member.pac1;

public class B {

	
	
	
	
	public B() {
		
		A a = new A();  //이 a를 통해 주소값을 접근 했을 때 사용하는 멤버변수의 차이가 존재 한다.
		
		a.x = 1;
		a.y = 2;
//		a.z = 3;   얘는 private이니까 안된다.
		
		a.method1();
		a.method2();
//      a.method3();   얘도 private이니까 안된다.
		
	}
	
	//그럼 이제 패키지를 바꾸어 보자. pac2 패키지에 C로 가자.
	
	
	
	
	
	
	
	
	
	
	
}
