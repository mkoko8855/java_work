package oop.constructor;

public class Bread {

	
//	Bread(String model){  
//		System.out.println("빵 나왔어요");
//		Price = 100000;
//		name = "피자빵";
//		ingredient = "빵가루";
//	}
//	
//	
//	Bread(String model, String model2){
//		System.out.println("초코케이크 나왔어요");
//		Price = 200000;
//		name = "초코케이크";
//		ingredient = "밀가루";
//	}
//	
//	
//	void showscreen() {
//		System.out.println("*** 만들었다 확인해라 ***");
//		System.out.println("가격 : " + Price);
//		System.out.println("이름 : " + name);
//		System.out.println("재료 : " + ingredient);
//	}
//}

 // 쌤 정답
//package oop.constructor;
//
//public class Bread {
//	
	int price;
	String name;
	String ingredient;
	
	Bread() {
		
	}     		    //이건 하나 생성해놓는게 좋다. 생성자대로 생성되지가 않을 때가 있다. 나중에..
				    //아예 기초 객체를 상태에서 내가 원하는 값만 집어 넣게끔 해주는 게 베스트다.
					//하나라도 직접 생성자를 선언했을 땐 기본 생성자는 만들어지지 않는다.
					//웬만하면 클래스에 기본 생성자 하나는 깡통으로 들고 있자.
	
	Bread(String Name, String Ingredient, int Price) {
		this.name = Name;
		this.ingredient = Ingredient;
		this.price = Price;
	}
	
	void info() {
		System.out.println("*** 빵 정보 ***");
		System.out.println("빵 이름: " + name);
		System.out.println("빵 가격: " + price);
		System.out.println("주 재료: " + ingredient);
	}
}