package oop.inter.basic;

 /*
 
 1. 인터페이스를 작성한 후에는 클래스를 생성해서
 	인터페이스에 명세된 내용을 구현하면 된다.
 	
 2. 구현은 implements를 쓴다. 그럼 ImplClass1에 빨간줄 긁힘. 추상메서드기에 메서드를 완성을 시켜줘야 한다. (3, 4번과 같음)
 
 3. 인터페이스의 구현 키워드는 implements 이다.
 	상속과 같이 클래스 이름 뒤에 구현 하고자 하는 인터페이스 이름을 작성한다.
 	
 4. 인터페이스에 선언된 추상 메서드는 반드시 구현 클래스에서 오버라이딩을 진행 해야 한다.
 
 5. 인터페이스는 하나의 클래스에서 어러 개의 인터페이스를 동시에 다중 구현을 할 수 있다.
 	(public class ImplClass1 implements Inter, Inter2 같이 다중 구현 가능하지만 Inter2의 메서드도 완성해야됨)
 */


public class ImplClass1 implements Inter, Inter2 {

	//인터페이스를 클래스가 구현한다 라는 뜻이 임플리먼트 이다.
	//이제 인터페이스와 클래스간의 관계를 알아보자.
	
	
	
	//Inter 클래스에 있는 것을 오버라이딩 해야 한다. (메서드 완성), 실제 내용을 클래스 쪽에서 채우는 것이다.
	
	@Override
	public void method1() {
		System.out.println("Inter의 추상 메서드 구현!");
	}
	
	@Override
	public void method2() {
		System.out.println("Inter2의 추상 메서드 구현!");
	}
	
	
	//그리고 ImplClass1 본인의 메소드 구현
	public void method3() {
		System.out.println("ImplClass1의 메서드 구현!");
	}

	
	
	
	
	@Override //부모인터페이스가 생성되었고 상속 관계를 맺어 줬으니 이 메서드 써줘야 겠지.
	public void parentMethod() {
		System.out.println("부모 인터페이스의 메서드 구현!");
	}
	
	
}
