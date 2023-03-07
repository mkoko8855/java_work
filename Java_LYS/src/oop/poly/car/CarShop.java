package oop.poly.car;

public class CarShop {

											//instance of
	
	 /*
	 	- instanceof는 객체가 지정한 클래스 타입을 가질 수 있는 객체인지를 검사할 때 사용하는 연산자 이다.
	 	 
	 	- 그래서 instanceof를 기준으로 좌항의 객체가 우항의 클래스 타입을 가질 수 있는 지를 물어봐서 그렇다면 true, 그렇지 않다면 false를 도출한다.
	 	
	 */
							//즉, 좌항의 객체가 우항의 타입을 가질 수 있니? 라고 물어보는 키워드다.
	
	
	
	
	
	
	public void carPrice(Car c) {  //소나타, 테슬라, 포르쉐가 오려면 매개변수에 Car c 라고 작성 해야 겠지.
								   //Car라는 클래스의 자식이라면 누구나 다 가능해야 하니 부모 타입의 변수를 선언 한 것이다.
		
		if(c instanceof Sonata) {
			System.out.println("소나타의 가격은 3000만원 입니다.");
		} else if(c instanceof Tesla) {
			System.out.println("테슬라의 가격은 7000만원 입니다.");
		} else if(c instanceof Porsche) {
			System.out.println("포르쉐의 가격은 2억4천만원 입니다.");
		}
	}
	//위를 작성했으면 메인으로 가자
	
	
	
	
	
	
	
}
