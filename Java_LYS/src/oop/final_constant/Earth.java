package oop.final_constant;

public class Earth {

	 /*
	 	# 상수 (constant)       (static과 final의 성질을 가지고 있다)
	 
	 	- 상수는 고정된 불변의 값이다.
	 	
	 	따라서 어디에서 접근을 하더라도 같은 값이 나와야 하며, 값의 변경 또한 불가능 해야 한다.

	 	따라서 자바에서는 상수를 선언할 때 static, final을 동시에 사용한다.
	 */
	
	
	
	
	 static final double RADIUS = 6400; 		//지구의 반지름 약 6400km, 상수는 대문자로 표현하는 것이 관례이다.
	
	 static final double SURFACE_AREA; 	    //static이니 객체 생성 없어도 할 수 있지만, static에서 생성자처럼 사용하는
	 										//정적 초기화자로 사용하자.
	 
	 
	//정적 초기화
	 static {
		 SURFACE_AREA = RADIUS * RADIUS * Math.PI * 4; //원주율도 static final. 즉, 상수로 고정된 값이라 대문자로 두껍게 나온다.
	 }
}
