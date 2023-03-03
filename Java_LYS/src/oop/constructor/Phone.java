package oop.constructor;





								//           생   성   자 (constructor)







public class Phone {

	String model;
	String color;
	int price;
	
	
	
	 /*
	 	생성자를 통해 객체를 생성할 때 마다 값을 넣는 것을 편하게 해보자.
	 	매번 객체를 만들고 값을 줄때 값이 백 만개 이런식이면 일일이 해 줄수 없으니 하는 작업.
	 
	 	1. 생성자는 말 그대로 객체를 생성해 주는 애이다.
	 	
	 	2. 생성자는 객체를 생성하는 역할을 하며 그렇기 때문에
	 	   클래스 내부에 반드시 하나 이상 존재해야 한다.
	 	   
	 	3. 만약 생성자가 하나도 존재하지 않는다면 JVM(자바가상머신)이 자동으로
	 	   매개변수가 하나도 존재하지 않는 가장 기본형태의 생성자를 만들어준다.
	 	   이것을 영어로 default constructor라고 한다.
	 	
	 	4. 생성자는 반드시 클래스 이름과 대 소문자 마저도 무조건 동일하게 작성하여 선언하고
	 	   리턴 타입은 존재 하지 않는다. 보이드도.
	 	   
	 	5. 생성자 내부에는 객체가 생성 되자마자 해야 할 로직들을 기술 할 수 있다.
	 */
	
	
	
	
	
	
	
	
	//자 그럼 생성자 설명을 했으니 선언 해보자 , 메서드와 비슷하지만 다른 점은 리턴 타입이 없다.
	
	Phone(){    // > 기본 생성자
		System.out.println("기본 생성자가 호출 되었습니다. 라는 확인 문구를 한번 넣어보았습니다.");
		model = "폴더폰";
		color = "회식";
		price = 200000;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*  갤럭시23을 주문받았는데 내용이 똑같다..폴더폰,회식,200000원.. 이것도 바꿔야겠지?
	 	생성자 오버로딩(중복 선언)
	 	
	 	1. 생성자는 중복해서 여러 개 선언할 수 있다.
	 
	 	2. 단, 생성자의 매개변수의 타입, 개수, 순서 중 하나가 달라야 중복을 인정한다.
	 
	 	3. 
	 */
	Phone(String phoneModel){   //일부러 매개변수에 매개값을 집어넣었다. 왜? 중복을 인정받는 조건 중 하나를 따라야하니까 
		System.out.println("2번 생성자 호출!");
		model = phoneModel;
		color = "화이트";
		price = 1000000;
	}
	
	//2. 단, 생성자의 매개변수의 타입, 개수, 순서 중 하나가 달라야 중복을 인정한다.  < 기억해
	Phone(String phoneModel, String pColor){
		System.out.println("3번 생성자 호출!");
		model = phoneModel;
		color = "울트라그레이";
		price = 1200000;
	}
	
	
	
	
	
	
	
	
	
	void showSpec() {
		System.out.println("*** 핸드폰의 정보를 출력해줍니다. ***");
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price + "원");
		
		
		
		
		
		
		
	}
}
