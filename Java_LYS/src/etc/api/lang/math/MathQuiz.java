package etc.api.lang.math;

import oop.static_.method.Count;

public class MathQuiz {
	
	
				//나중에 페이징 할 때 Math.ceil을 사용한다.
	
	
	
	
	 /*
	 	1~10이 전달되면 1이 반환,
	 	11~20이 전달되면 2가 반환,
	 	21~30이 전달되면 3이 반환,
	 	이러한 로직을 수행하는 static 메서드 page를 선언해라.
	 */
	
	public static int page(int num){
		return (int) Math.ceil(num/10.0);   
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(page(68));   //6.8을 올리니 7이 온다.
		System.out.println(page(70));	//7에서 ceil쓰니 7이 온다.
		
		
		
	}
}
