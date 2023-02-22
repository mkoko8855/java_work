package basic.if_;

import java.util.Scanner;

public class ifQuiz05 {

	/*
	 * 국 ,영, 수 점수를 각각 받아서 평균을 구하라(평균은 소수첫째자리까지 출력) 
	 * 평균이 90이 넘으면 다시 한 번 조건을 검사해서 
	 * 95~100 > A+
	 * 94~90 > A0
	 * 80점대는 B, 
	 * 70점대는 C, 
	 * 60점대는 D, 
	 * 나머지는 모두 F 처리하시면 된다. (100점이 만점)
	 * 
	 * EX) 평균 점수 : 95.5 당신이 학점은 A+ 입니다.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		double average = (kor+eng+math)/3.0;
		System.out.printf("평균 : %.1f점\n", average);
		System.out.println("---------------------------");
		
		if(average >= 90) {
			if(average > 100) {
				System.out.println("잘못된 점수입니다.");
			} else if(average >= 95) {
				System.out.println("당신의 학점은 A+ 입니다.");
			} else {
				System.out.println("당신의 학점은 A0 입니다.");
			}
		} else if(average >= 80) {
			System.out.println("당신의 학점은 B+ 입니다.");
		} else if(average >= 70) {
			System.out.println("당신의 학점은 C+ 입니다.");
		} else if(average >= 60) {
			System.out.println("당신의 학점은 D+ 입니다.");
		} else {
			System.out.println("당신의 학점은 F 입니다.");
		}
		sc.close();
		System.out.println("^^");
	}
}
