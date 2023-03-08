package oop.abs.bad;

public class MainClass {

	public static void main(String[] args) {
		
		HeadStore store = new SeoulStore();  //다형성 적용
		store.orderApple();
		store.orderBanana();
		store.orderGrape();
		
	     /*
		    사과 쥬스의 가격은 3000원 입니다.
		    바나나 쥬스의 가격은 2800원 입니다.
			0원 입니다. 가게에서 알아서 가격을 정해주세요
		 */ 
		
		//출력보면 오버라이딩 안쓰고 지들 멋대로지?
		//good패키지로 가보자.
		
		
		
	}
}
