package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {

		/*
		 * 1~10까지의 누적합 (와일문과 포문)
		 */

//		
//		int i = 1;
//		int total = 0;
//		while(i <= 10) {
//			total += i;
//			i++;
//		}

		// 이것을 for문으로 바꿔보자.
		// 1~10까지의 누적합
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
		}
		System.out.println(total);

		System.out.println();

		// 1~200 까지의 정수 중 6의 배수이면서
		// 12의 배수는 아닌 수를 가로로 출력해보세요

		for (int i = 1; i <= 200; i++) {
			if (i % 6 == 0 && i % 12 != 0) {
				System.out.println(i + " ");
			}
		}

		System.out.println("-------");

		// 1~60000까지의 정수 중 177의 배수의 개수
//		int count=0;
//		for(int i=1; i<=60000; i++) {
//			if(i%177==0) {
//				count++;
//			}
//		}
//		System.out.println(count);

		System.out.println("------------");

		// 입력받은 정수까지의 팩토리얼 값을 구하세요

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 값 : ");
		int num = sc.nextInt();
		int fac = 1; // 팩토리얼 최종 값을 담을변수

		for (int i = 1; i <= num; i++) {
			fac *= i;
		}
		System.out.printf("%d! : %d\n", num, fac);
		sc.close();
	}
}
