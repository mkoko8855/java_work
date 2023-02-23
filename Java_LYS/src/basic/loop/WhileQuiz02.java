package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {

		/*
		 * 입력받은 수의 약수의 총 합을 구하세요
		 */
		
//		int num = 0;
//		int sum = 0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("약수의 합을 구하셈 : ");
//		num = sc.nextInt();
//		
//		for (int i = 1; i <= num; i++) {
//			if ((num % i) == 0) {
//				System.out.println(i);
//				sum += i;
//			}
//		}
//		System.out.println(num + "의 약수의 합 = " + sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int num2 = 1;  //begin,  가장 작은 약수가 1이고 큰 게 num.
		int total = 0; //누적 합을 담아줄 변수
		
		while(num2 <= num) {
			if(num % num2 ==0) {
				total += num2;
			}
			num2++;
		}
		System.out.println(num + "의 약수 총합은 : " + total);
		
		
		
		
		
		
		
		
	}
}
