package oop.overloading;

public class Calculator {

	
     /*
	 
	  	# 오버로딩 ( 중복 ) : 하나의 클래스 내부에서 같은 이름을 가진 메서드나
	  	  				  생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법이다. (생성자 에서도 사용 했었다.)
	  	  				  
	  	
	  	# 오버로딩 적용 조건 : 	1. 매개 변수의 데이터 타입이 다를 것 혹은,
	  				     	2. 매개 변수의 전달 순서가 다를 것 혹은,
	  				     	3. 매개 변수의 개수가 다를 것
	  						   (셋중에 하나만 만족해도 오버로딩 가능)
	  
	 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//문제
	/*
    - Calculator 클래스에 calcRectArea() 메서드를 선언하여

    1. 길이를 하나만 전달하면 정사각형의 넓이를 리턴.
    2. 길이를 두 개 전달하면 (가로, 세로) 직사각형의 넓이를 리턴.
    3. 길이를 세 개 전달하면 (밑변, 윗변, 높이) 사다리꼴의 넓이를 리턴.

    MainClass에서 객체를 생성한 후 직접 메서드를 호출해서 출력해 보세요.
    (길이가 5인 정사각형의 넓이, 가로10 세로20인 직사각형의 넓이
    윗변 5 밑변 13 높이 7인 사다리꼴의 넓이) 
    */
		
	
		 int calcRectArea(int r){
			return r*r;
		}
	
	
		 int calcRectArea(int width, int height) {
			return width*height;
		}
	
		
		
		double calcRectArea(int ceil, int floor, int height) {
			return (ceil+floor)*height/2.0;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
		void inputData() {   //되는지 안되는지 선언만 한 것.
			
		}
	
		
		
		
		void inputData(int a) {
			
		}
		
		
		
	
		void inputData(int a, int b) {
			
		}
	
	
		
		
//		void inputData(int b, int a) {     		  			//타입이 같고 위치(전달순서)만 바꾼 것이기 때문에 오버로딩 불가능
//			
//		}
	
		
		
		
		void inputData(String s) {
			
		}
	
		
		
		
		
		void inputData(int a, double b) {
			
		}
		
		
		
		
		
		void inputData(double b, int a) {                  //위와 다르게, 타입이 다른 상태에서 위치만 바꾸도 가능하다.
			
		}
		
		
		
		
		
//		void inputData(int number) {                       //맨 위인 int a랑 타입이 같기 때문에 int a랑 빨간줄 긁힘 즉, 
//															 정수 매개값 1개를 받는 메서드가 이미 선언 되었기 때문에 불가능.
//			
//		}
		
		
		
		
		
//		int inputData(int number) {						   //똑같이 int a를 위에서 이미 선언 했기 때문에 호출할 땐 메서드이름만 부르기 때문에
														   //구분이 안가는 문제가 생긴다.
//			return 0;
//		}												   //즉, 반환 유형(리턴 타입)은 오버로딩에 영향을 미치지 못한다.
		

		
}
