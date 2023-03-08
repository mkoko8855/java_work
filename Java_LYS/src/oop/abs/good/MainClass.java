package oop.abs.good;

public class MainClass {

	public static void main(String[] args) {
		
		
		 /*
		 	추상 클래스(추상 메서드)를 사용하면 오버라이딩이 강제화 되기 때문에
		 	
		 	프로그래머의 오버라이딩 실수를 방지할 수 있고 부모 클래스에서
		 	
		 	메서드를 선언 할 때 메서드 내부에 어떤 내용을 써야 할 지 막연할 때도
		 	
		 	구현하기가 편하다.
		 
		 	그리고 다형성을 적용시켰을 경우에도 안전하게 사용이 가능하다.
		 */
		
		
		
		
		
//											 추상클래스는 스스로의 객체를 생성할 수 없다. 객체가 완성 된 상태가 아니기 때문이다.
//		HeadStore h = new HeaStore();    >   부모 타입의 객체는 안된다. 왜?
//                                           HeadStore타입은 객체화 될 수 없다고 얘기한다.
//                                           abstract는 객체 생성이 안되기 때문이다.
//                                           오해하면 안되는게 생성자는 HeaStore클래스에 존재할 수 있다.
//											 즉, 객체가 아예 생성이 되는건 아니다. 근데 객체화 할 수 없다고 경고가 뜨는 것은
//											 public abstract void orderApple(); orderBanana(); orderGrape();가 있기 때문이다. 자기 혼자 객체 생성은 안되고 자식의 의해서 완성이 되기 때문이다.
//											 즉, 자식이 오버라이드 해야 한다고 기억하자..
		
		
		
		
		//다형성 적용
		HeadStore s = new SeoulStore();  //오버라이딩 완성해서 객체엔 문제가 없다.
		s.orderApple();
		s.orderBanana();
		s.orderGrape();
		s.orderWaterMelon(); //얜 강제된게 아니긴해
		
		//출력 결과
		/*
		 사과쥬스의 가격은 3000원 이다.
		 바나나쥬스의 가격은 3500원 이다.
		 포도쥬스의 가격은 2500원 이다.
		 수박 쥬스의 가격은 4000원 입니다.
		 */
		//문제 없는 것을 확인 했다.
		
	}
}
