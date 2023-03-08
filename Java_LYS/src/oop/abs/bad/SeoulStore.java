package oop.abs.bad;

public class SeoulStore extends HeadStore {

	
	//상속 하지 않았다고 가정했을 때
	public void orderApple() {
		System.out.println("사과 쥬스의 가격은 3000원 입니다.");
	}
	
	public void orderBanana() {  //이건 오버라이딩이 아닌데..? 
		System.out.println("바나나 쥬스의 가격은 2800원 입니다.");
	}
	
	
	
	
	
	
	
	
	
}
