package basic;

import java.util.Scanner;

public class ifQuiz05 {

	/*
	 * 국 ,영, 수 점수를 각각 받아서 평균을 구하라(평균은 소수첫째자리까지) 평균이 90이 넘으면 다시 한 번 조건을 검사해서 95~100 >
	 * A+ 94~90 > A0 80점대는 B, 70점대는 C, 60점대는 D, 나머지는 모두 F 처리하시면 된다. (100점이 만점)
	 * 
	 * EX) 평균 점수 : 95.5 당신이 학점은 A+ 입니다.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 : ");
		double kor = sc.nextDouble();
		System.out.println("영어 점수 : ");
		double eng = sc.nextDouble();
		System.out.println("수학 점수 : ");
		double math = sc.nextDouble();
		double average = ((kor+eng+math)/3);
		String grade;
		
		if(average>90 && average <= 100) {
			grade = "A0";
			if(average>=95) {
				grade = "A+";
			}
		} else if(average>=80) {
				grade = "B";
		} else if(average>=70) {
				grade = "C";
		} else if(average>=60) {
				grade = "D";
		} else {
			grade ="F";
		}
		System.out.printf("평균 점수 : %.1f", average);
		System.out.println("님 학점은 " + grade + " 점이요");
		System.out.println("^^");
		sc.close();
	}
}
