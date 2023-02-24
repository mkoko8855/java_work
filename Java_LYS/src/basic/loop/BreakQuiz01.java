package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		// 2~19가지의 난수를 생성하셔서 구구단을 출력.
		// 19행까지
//			int dan = (int) ((Math.random()*18) + 2);
//				
//				System.out.println("*** 구구단 " + dan + "단 ***");
//				System.out.println("--------------------------");
//				for(int hang=1; hang<=19; hang++) {
//					System.out.printf("%d x %d = %d\n"
//							, dan, hang, dan*hang);
//				}
//			}
//		}

		/*
		 * 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
		 * 지속적으로 문제를 출제한 후 정답을 입력받으세요 (덧셈,뺄셈)
		 * 사용자가 0을 입력하면 반복문을
		 * 탈출시키세요.
		 * 
		 * 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("연산퀴즈");
		System.out.println("종료하시려면 0을 입력해주세요.");
	
		int cCount = 0; //정답(카운트 해야 할 것)
		int icount = 0; //오답(카운트 해야 할 것)
		
		while(true) {
			int rn1 = (int) ((Math.random()*100)+1);
			int rn2 = (int) ((Math.random()*100)+1);
			int num = (int) (Math.random()*2); //0이상 2미만으로, 0과 1만 생성되는 것이며 부호를 결정하게 해주는 난수이다.
			//0이면 덧셈, 1이 되면 뺄셈.
			
			int correct;
			
			if(num == 0) {
				System.out.printf("%d + %d  = ???\n", rn1, rn2);
				correct = rn1 + rn2;
			} else {
				System.out.printf("%d - %d  = ???\n", rn1, rn2);
				correct = rn1 - rn2;
			}
			
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer == correct) {
				System.out.println("정답이요");
				++correct;
			} else if(answer == 0) {
				System.out.println("탈출이요");
				break;
			} else {
				System.out.println("틀렸습니다.");
				++icount;
			}
		}
		System.out.println("------------------------");
		System.out.println("정답 횟수 : " + cCount + "회");
		System.out.println("정답 횟수 : " + icount + "회");
		sc.close();
	}
}
