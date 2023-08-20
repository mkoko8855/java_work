package oop.constructor;

public class BreadMain {

		//문제
		
	     /*
		 	객체를 생성하지 않았을 때의 예시를 보고
		 	빵 객체를 생성할 수 있는 클래스를 작성해 보세요.
		 	클래스 이름은 Bread로 통일 하겠습니다.
		 	
		 	- BreadMain에서 똑같이 피자빵, 초코케이크의 정보를
		 	호출해 보세요. (생성자는 여러분들 마음대로 하세요)
		 */
		
		
//		Bread basic = new Bread("빵");   
//		basic.showscreen();
//		
//		
//		Bread basic1 = new Bread("빵", "초코케이크");
//		basic1.showscreen();
		
		
//	}
//}
//쌤 정답
//package oop.constructor;
//
//public class BreadMain {
//	
//	//피자빵

	public static void main(String[] args) {
		
		/*
		 - 객체를 생성하지 않았을 때의 예시를 보고
		  빵 객체를 생성할 수 있는 클래스(설계도)를 작성해 보세요.
		  클래스 이름은 Bread로 통일하겠습니다.
		  
		 - BreadMain에서 똑같이 피자빵, 초코케이크의 정보를
		  호출해 보세요. (생성자는 여러분들 맘대로~)
		 */
		
		
		//이렇게 줘도 가능
		Bread pizza = new Bread();
		pizza.name = "피자빵";
		pizza.price = 500;
		pizza.ingredient = "밀가루";
		pizza.info();
		
		
		//이렇게 줘도 가능
		Bread c = new Bread("초코케이크", "초콜렛", 1500);
		c.info();

	}

}

