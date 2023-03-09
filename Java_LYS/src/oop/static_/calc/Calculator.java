package oop.static_.calc;

public class Calculator {

	
	
	
	 /*
	 	 계산기마다 색깔이 각각 다를 수 있기 때문에 color같은 변수는
	 	 데이터를 공유 시키지 말고, 객체 별로 따로 관리해야 한다.
	 	 
	 	 
	 	 반면,
	 	 pi같은 원주율 값은 계산기마다 값이 동일해야 하기 때문에
	 	 static을 붙여서 데이터를 공유하게 하는 것이 유리하다.
	 	 
	 */
	
	
	
	String color;
	static double pi = 3.141592;
	
	
	
	
	
	/*
	 	메서드 내부에서 static이 붙지 않은 데이터를 참조하고 있는 메서드는
	 	
	 	해당 변수의 정확한 위치(객체의 주소값)을 알려줘야 하기 때문에
	 	
	 	정적 메서드로 선언하기가 부적합 하다.
	 */
	
	public void paint(String color) {  //여기에 static붙이면 this를 사용 못함. static은 객체 생성 없이도 호출이 가능하기 때문.
		//만약 static붙이고 this를 쓰기 위해 객체를 생성해주는 것은 근본적인 해결 방안이 못된다.
		System.out.println("계산기에 " + color + "색을 칠합니다.");
		this.color = color;
	}
	
	
	
	
	
	
	
	
	
	
	 /*
	 	메서드 내부에서 인스턴스 변수를 사용하지 않고 범용성 있게 사용하는
	 	메서드는 static 키워드를 붙여서 정적 메서드로 선언하는 것이 좋다.
	 */
	 
	//원 넓이 공식은 변하지 않으니 static으로 관리하는 것이 용이하다.
	public static double areaCircle(int r) { //반지름을 받으려고 int r 선언.
		return r * r * pi;
	}
	
}
