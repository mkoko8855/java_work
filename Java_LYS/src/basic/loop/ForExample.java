package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {

		
		/*
		 * 1~10까지의 누적합 (와일문과 포문)
		 */
		
		int b = 1;
		int total = 0;
		while(b <= 10) {
			total += b;
			b++;
		}
		System.out.println(total);   //출력 결과 : 55
		
		
		System.out.println("----------------------------------------------------");
		
		
		
		
		// 이것을 for문으로 바꿔보자.
		// 1~10까지의 누적합
		int totalh = 0;
		for (int i = 1; i <= 10; i++) {
			totalh += i;
		}
		System.out.println(totalh);

		System.out.println();        //출력 결과 : 55

		
		
		
		
		
		
		
		// 1~200 까지의 정수 중 6의 배수이면서
		// 12의 배수는 아닌 수를 가로로 출력해보세요

		for (int i = 1; i <= 200; i++) {
			if (i % 6 == 0 && i % 12 != 0) {
				System.out.print(i + " ");
			}
		}

		
		
		
		
		
		
		
		
		System.out.println("-------");

		
		
		
		
		
		
		
		
		
		// 1~60000까지의 정수 중 177의 배수의 개수
		int count=0;
		for(int i=1; i<=60000; i++) {
			if(i%177==0) {
				count++;
			}
		}
		System.out.println(count);   //출력 결과 : 338 개

		
		
		
		
		
		
		
		
		
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
