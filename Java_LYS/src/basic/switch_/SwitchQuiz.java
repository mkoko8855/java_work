package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요 :");

		loop: while (true) {
			int num1 = sc.nextInt();
			
			System.out.println("연산 선택 : [+, -, *, /]");
			String ys = sc.next();

			System.out.println("두 번째 정수를 입력하세요 :");
			int num2 = sc.nextInt();
			
			switch (ys) {
			case "+":
				int result = num1 + num2;
				System.out.println("덧셈 결과 : " + result);
				break;
			case "-":
				int result2 = num1 - num2;
				System.out.println("뺄셈 결과 : " + result2);
				break;
			case "*":
				System.out.printf("%d x %d = %d\n", num1, num2, num1*num2);
				break;
			case "/":
				if(num2 == 0) {
					System.out.println("연산할 수 없는 입력값 입니다.");
					break;
				}
				System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
				break loop;
			default:
				System.out.println("사칙연산 기호를 정확히 입력하세요.");
				System.out.println("[+, -, *, /]");
				break;
			}
		}
		sc.close();
	}
}
