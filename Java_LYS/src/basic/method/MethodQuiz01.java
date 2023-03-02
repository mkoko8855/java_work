package basic.method;

import java.util.Arrays;

public class MethodQuiz01 {
	
	/*
    1. calcDivisor()라는 메서드를 선언하세요.
    2. 이 메서드는 정수 하나를 전달받아서 해당 정수의
     모든 약수를 가로로 출력하고 약수의 개수를 리턴하는
     메서드입니다. (가로로 출력은 메서드 내부에서 진행)
    3. 메서드 선언을 완료하시고, main에서
     72의 약수의 개수와 10의 약수의 개수를 출력해 보세요.
     호출 두번 하시는 거에요.
    */
	
	
//	static int calcDivisor(int start) {
//		int count = 1;  
//		int count1 = 0; 
//		while(count <= start) {
//			if (start % count == 0) {
//				count1 += 1;
//			}
//			++count;
//		}
//		return count1;
//	}
	
	
	//선생님 풀이
	static int calcDivisor(int num){
		int count = 0;   //나누어 떨어질 때 마다 카운트셈
		System.out.println("약수 : ");
		for(int i=1; i<num; i++) {
			if(num%i == 0) {
				System.out.print(i + " ");
				count++; //나누어 떨어 질 때만 올리겠다.
			}
		}
		return count;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//		int result = calcDivisor(72);
		//		int result2 = calcDivisor(10);
		//		System.out.println(" 72의 약수의 개수 : " + result + " 개");
		//		System.out.print(" 10의 약수의 개수 : " + result2 + " 개");

		
		//선생님 풀이
		System.out.println("72의 약수의 개수 : " + calcDivisor(72));
		System.out.println("10의 약수의 개수 : " + calcDivisor(10));
		
		//결과
		//  약수 : 
		//	1 2 3 4 6 8 9 12 18 24 36 
		//	72의 약수의 개수 : 11
		//	약수 : 
		//	1 2 5 
		//	10의 약수의 개수 : 3
	}
}
