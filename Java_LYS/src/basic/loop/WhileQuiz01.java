package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {

		/*
		 * 구구단 단수를 입력받아서 해당 단수의 구구단을 출력.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("몇단이요?");
		int num = sc.nextInt();

		int i = 1;

		while (i < 199) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
			i++;
		}
	}
}



//%s : 문자열
//%c : 문자 1개
//%d : +-부호 있는 정수
//%u : +-부호 없는 정수
//%f : 실수
//%0.3f : 실수 (소수점 3자리까지 나오게)
//%X : 16진수 대문자로
//%x : 16진수 소문자로
//%02X : 16진수 대문자로. 2자리 헥사에서, 앞의 빈 칸 있으면 0으로 채움