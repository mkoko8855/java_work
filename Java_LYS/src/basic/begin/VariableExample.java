package basic.begin;

public class VariableExample {

	public static void main(String[] args) {
		
		/*
		#. 변수 (Variable) 란?
		1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것이다.
		2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
		   적당한 데이터 타입을 선언해야 한다.
		   EX) int란? 4바이트의 정수
		       String이란? 문자열(문장)
		     	  
		3. 변수는 동일한 이름으로 중복 선언할 수 없다.
		4. 변수 내부의 값은 언제든지 변경이 가능하다.
		*/
		
		
		//변수의 선언 : [자료형(데이터 타입)] [변수명];
		int age;
		
		
		
		//변수의 초기화 : [변수명] = [값];
		age = 40;
		
		
		
		//변수의 값 참조(사용)
		System.out.println(age);
		
		
		
		//변수는 선언과 초기화를 동시에 할 수 있다.
		//(처음 만들 때 한번만 가능하다.)
		int score = 90;
		score = 66;
		System.out.println(score);
		
		
		
		//변수에는 다른 변수의 값도 저장이 가능하다.
		int myScore = score - 20;
		System.out.println(myScore);
		
		
		
		//변수의 자료형에 맞지 않는 데이터는 저장이 불가능하다.
		//int count = "한번"; (허용안됨)
		float scores = 23.5f;
		System.out.println(scores);
		//String str = 100; (X)
		//String str = "qwe"; (O)
		
		
		
		//변수는 자료형(데이터 타입)이 달라도 이름이 동일하다면
		//중복 선언할 수 없다.
		//String name = "홍길동";	(O)	
		//int name = 1004;      (X)
		  
		
		  
		//선언 및 초기화하지 않은 변수는 사용이 불가능하다.
		//int result = myScore + num; (num 선언을 하지 않았기 때문에 불가)
		
		//int result;   선언 한 다음
		//System.out.println(result);  출력하면 result 초기화가 안됐기 때문에 안됨.
		
		
		
	}
}
