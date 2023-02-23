package basic.loop;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {

		int i = 48;

		while (i <= 150) {
			if (i % 8 == 0) {
				System.out.print(i + " ");
			}
			++i;
		}

		
		
		
		System.out.println(); // 줄개행

		
		
		
		// 1부터 100까지의 정수 중 4의 배수이면서
		// 8의 배수가 아닌 수를 가로로 출력하세요
		int a = 1;
		while (a <= 100) {
			if (a % 4 == 0 && a % 8 != 0) {
				System.out.print(a + " ");
			}
			++a;
		}

		
		
		
		
		
		System.out.println();

		
		
		
		
		
		// 1~30000까지 정수 중 258의 배수의 개수를 출력
		int sd = 1;
		int cnt = 0; //배수의 개수를 기억해 줄 변수.

		while (sd <= 30000) {
			if (sd % 258 == 0) {
				cnt += 1;    //cnt += 1; = count++;
			}
			sd++;
		}
		System.out.println("갯수 : " + cnt + "개");

		
		
		
		
		
		
		
		
		System.out.println();
		
		
		
		
		// 1000의 약수의 개수를 구하세요.
		// 1부터 1000까지의 하나씩 올려가며 1000이랑 나눠보셈
		// 그랬을 때 나누어 떨어지는 애가 약수입니다.

		int ia = 1;
		int count1 = 0;

		while (ia <= 1000) {
			if (1000 % ia == 0) {
				System.out.println(ia);
				count1 += 1;
			}
			++ia;
		}
		System.out.println("갯수 :" + count1);
	}
}
