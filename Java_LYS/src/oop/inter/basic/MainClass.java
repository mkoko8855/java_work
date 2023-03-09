package oop.inter.basic;

public class MainClass {

	public static void main(String[] args) {

		
//									  //인터페이스는 객체를 생성할 수 없는 추상적인 개념이다.
//		Inter i1 = new Inter();  	  //인터페이스는 생성자도 안되지만 객체 생성도 안된다.
		
		
		
		
		System.out.println("상수 : " + Inter.NUM);  //static메서드와 NUM은 둘다 스태틱이니까 가능.
		Inter.staticMethod(); 		  //호출할 때 이름만 빌린 것이다. 이 static은 Inter클래스에 있다.
		
		
		
		ImplClass1 i1 = new ImplClass1(); //임플클래스1의 객체를 만들어 보았다. 평범하게 만든 것이고
		i1.method1();
		i1.method2();
		i1.method3();
		i1.parentMethod();
		
		//출력 결과 :
		/*
		상수 : 5
		가능합니다.
		Inter의 추상 메서드 구현!
		Inter2의 추상 메서드 구현!
		ImplClass1의 메서드 구현!
		부모 인터페이스의 메서드 구현!
		*/
		
		
		
		
		
		
		
		
		
		
		
		//그러나 이거 출력되는거 볼라고 메인클래스 만든거 아님
		System.out.println("----------------------------------------------------------");
		//다형성을 보여주려고 했다.
		
		
		 /*
		 	1. 다형성은 상속이 전제되어야 하는 것이 원칙이지만
		 	   예외로 인터페이스와 클래스 간의 구현 관계에서도
		 	   다형성 발생을 허용한다.
		 	   인터페이스 변수 = new 객체(); 도 가능하다.
		 */
		
		Inter it1 = new ImplClass1(); 	//평범하게 만든 것이 아닌 것인데 문법 상 문제가 없다!
		it1.method1();				    //얜 가능
		it1.parentMethod();             //얘도 가능함. 근데 위에선 메서드 1, 2, 3, 부모꺼 까지 다 불렀는데 여기선 타입이 Inter라서 
										//Inter라는 타입으로 다가가는건 부모입장이기 때문에 자식의 메서드를 호출 할 수 없다.
		
		
		
		//만약 Inter2의 상속관계를 끊고(extends Inter를 지우고) extends ParentInter로 쓴다면,
		//ImpClass3에 빨간불 들어온다. 3가서 method1()을 지워주고, 이 상태에서 메인메서드와서
		//it1.method1()과 it1.parentMethod()만 적을 수 있다.
		//이 때,  위의 Inter it1 = new ImplClass1(); 이걸 강제 형변환 해줘야 한다.
		//(ImplClass1)it1.metohd2(); 라고 호출하면 (ImplClass1)에 빨간줄 긁힌다.
		//그 이유는 연산자의 우선 순위 때문이다. 지금 쓴 연산자는 (ImplClass1) 와 . 이다.
		//참조연산자가 더 순위가 높다. 그러면 it1.metohd2();부터 진행하고 나온 결과를
		//(ImplClass1)로 해줘야 한다.
		//즉, ((ImplClass1)it1).method2(); 이렇게 호출 해야 한다.
		//((ImplClass1)it1).method3();도 부를 수 있다.
		
		
		
		
		//연산자의 우선 순위
		//괄호() > 참조(.) > 단항 > 이항 > 삼항 > 대입
		
		
		((ImplClass1)it1).method2();
		//((ImplClass1)it1).method2();       이것도 되지만
		//((Inter2)it1).method2();로 변환이 된다.
		//즉, 인터페이스들 끼리 주고받고가 가능하다. 즉, Inter와 Inter2도 서로 가능.

		
		
		
		
       	 /*
		 	인터페이스의 다형성도 앞에서 배운 클래스의 다형성 처럼
		 	정보가 없다면 메서드 호출이 불가능 하기 때문에 형 변환이 필요하다
		 	
		 	그러나, 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
		 	구현하는 클래스들끼리 서로 즉시 형 변환이 가능하다.
		 */
		
		
		
		
		
		
		//인터2타입으로 생성해보자
		Inter2 it2 = new ImplClass1(); //임플1은 인터2 타입도 가질 수 있다.
		it2.method2();
		it2.parentMethod();
		//그러나 메서드1을 못부른다 그럼 이렇게 하자
		((Inter)it2).method1(); //즉시 형변환.
		
		
		
		
		
		
		
		Inter it3 = new ImplClass2();   //가장 최상위 인터 배열에 다 들어올 수 있다.
		Inter2 it4 = new ImplClass3();  //가장 최상위 인터 배열에 다 들어올 수 있다.
		ParentInter[] inters = {it1, it2, it3, it4};   //최상위 인터 배열에 다 넣었다.
		
	
		
		
		
		//근데 대체 인터페이스를 뭘 어떻게 활용하라고? 얻는 이점이 뭔데?
		
		
		
		
		
		
		
		
		
	}
}
