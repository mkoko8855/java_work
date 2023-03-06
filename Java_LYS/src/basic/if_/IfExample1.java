package basic.if_;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요 : ");
		int point = sc.nextInt();
		System.out.println("내 점수: " + point + "점");

		System.out.println("-------------------------");

		if (point >= 70) { // if는 조건식 결과가 참 일 때만 블럭 내부로 진입 가능
			System.out.println("70점 이상입니다, 합격입니다.");
		} else { // else에는 조건식이 올 수 없음
			System.out.println("70점 미만입니다, 불합격입니다.");
		}
		System.out.println("수고하셨습니다.");
	}
}