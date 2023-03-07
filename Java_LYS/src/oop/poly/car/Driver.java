package oop.poly.car;

public class Driver {

	
//	public void drive(Sonata s) {   //소나타 객체 주소값을 전달 받아 run이라는 메서드를 돌릴 것이다.
		
//		System.out.println("운전을 시작합니다.");
//		s.run();
//	}
	
	
	//메인으로가서 드라이버클래스를 호출 시켜 보자.
	
	
	
	
	//그럼 오버로딩 해야지 다시 드라이버클래스 ㄱㄱ > 왔다. 이부분이다. 이제는 테슬라도 운전할 수 있겠지. 다시 메인클래스 ㄱㄱ
//	public void drive(Tesla t) {
//		System.out.println("운전을 시작합니다.");
//		t.run();
//	}
	
	
	
	
	//위에서 다 주석하고 매개변수에 Car c를 넣어보자. 그럼 소나타, 테슬라, 포르쉐 모두 변수 사용 가능하다. 작성했으면 메인으로 가보자.
	public void drive(Car c) {
		System.out.println("운전시작!");
		c.run();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//이번엔 리턴 타입의 다형성이다.
	//차를 사는 메서드 선언해보자 (이번엔 리턴타입의 다형성이다)
	//소나타와 포르쉐와 테슬라의 모두 같은 타입은 Car타입이잖아. 그래서 Car타입을 써줬다.
	public Car buyCar(String name){
		if(name.equals("소나타")) {
			System.out.println("소나타를 구입합니다.");
			return new Sonata(); 
		} else if(name.equals("포르쉐")) {
			System.out.println("포르쉐를 구입합니다.");
			return new Porsche();
		} else if(name.equals("테슬라")) {
			return new Tesla();
		} else {
			System.out.println("그럼 대체 뭐달라고?");
			return null;
		}
	}  //이제 호출하러 메인클래스 가자
	
	
	
	
	
	
	
	
	
	
	
	
}
