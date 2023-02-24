package basic.array;

import java.util.Arrays;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		
		/*
		 	향상된 for문 (forEach)문 이란?
		 -	제어변수(인덱스)의 사용 없이 배열 내부의 요소를
		 	전체 참조할 수 있게 해 주는 반복문.
		 
		 EX)
		 for(배열 요소를 받아 줄 수 있는 변수 : 배열변수명) {
		 		이쪽은 반복 실행문을 써주면 된다.
		 	}
		 */
		
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
			//일반 for문 사용
			for(int i=0; i<week.length; i++) {       
				System.out.println(week[i] + "요일 좋아요");  //출력결과 : 월요일 좋아요 화요일 좋아요 수요일 좋아요 목요일 좋아요...
			}
		
			//향상 for문 사용, day는 임의로 설정해준 것, 즉 우항을 받아줄 수 있는 데이터 타입의 명을 새롭게 정의해주면 됨.
			for(String day : week) {  //그러나 향상된 for문은 index 요소 하나하나를 활용 할 수 없음. 인덱스 자체를 설정 안 했기 때문.
				System.out.println(day + "요일 좋아요");  //출력결과 : 월요일 좋아요 화요일 좋아요 수요일 좋아요 목요일 좋아요...
			}
		
			
			
			
			/*
	         1. scores라는 이름으로 int배열을 하나 선언해서
	         점수 데이터를 저장하세요.
	         {96, 88, 74, 63, 100, 55}

	         2. 향상 for문(forEach)을 사용하여 총점과 평균을 구해보세요.
	         총점(int), 평균(double, 소수점 둘째 자리까지 출력)
	         */
			
			int[] scores = {96, 88, 74, 63, 100, 55};
			int total = 0;
			
			for(int s : scores) {
				total += s;
			}
			double avg = total / scores.length;
				System.out.printf("총점: %d점, 평균 : %.2f점\n", total, avg);
		}
}

