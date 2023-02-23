package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {

		/*
		 * 정수 1개를 입력 받아서 해당 정수가 소수(prime number) 인지를 판별하시면 됩니다.
		 */

//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요 : ");
//		int num = sc.nextInt();
//		int num2 = 2;
//
//		while (num % num2 != 0) {
//			num2++;
//		}
//
//		if (num == num2) {
//			System.out.println(num + "은 소수");
//		} else {
//			System.out.println(num + "은 소수가 아님");
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();

		int i = 1;
		int count = 0;

		while (i <= num) {
			if (num % i == 0) {
				count++;
			}
			i++;
		}

		if(count == 2) {
			System.out.println(num + " 은 소수 입니다.");
		} else {
			System.out.println(num + " 은 소수가 아닙니다.");
		}
		
		
		
		System.out.println("--------------------");
		
		
		
		int j = 2;  //1은 모든 수의 약수이기 때문에 배제합니다.
		
		while(num % j != 0) {
			j++;
		}
		
		System.out.println(num == j ? "소수입니다." : "소수가 아닙니다.");
	}
}
