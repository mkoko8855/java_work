package basic;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("나이와 키가 어떻게 되세요?");

		int age = sc.nextInt();
		System.out.println("나이 : " + age + "살");

		int cm = sc.nextInt();
		System.out.println("키 : " + cm + "cm");

		System.out.println("●--------------------------●");

		if (age >= 8 && cm >= 140) {
			System.out.println("키와 나이가 충족됩니다. 탑승하세요");
		} else {
			System.out.println("키와 나이가 충족하지 못합니다. 죄송합니다.");
		}
			System.out.println("오늘 하루 즐거운 시간 되세요!");
	}
}
