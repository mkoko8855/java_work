package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. 주민 등록 번호 13 자리를 입력 받는다. 
		 * 2. 주민 등록 번호는 -(하이푼)을 포함해서 받는다. 
		 * 3. 13자리가 아니라면 다시 입력
		 * 받습니다. 
		 * 4. 남자인지 여자인지를 구분해서 출력 해 주시면 되겠습니다.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		loop: while (true) {
			System.out.println("주민등록번호 13자리를 하이푼 포함해서 치세요");
			String jm = sc.nextLine();
			jm = jm.replace("-", ""); //하이푼을 지워달라!
			
			if (jm.length() != 13) {
				System.out.println("주민등록번호는 13자리 입니다. 다시 입력 하세요");
			} else {
				switch(jm.charAt(6)) {
				case '1' : case '3' :
					System.out.println("님은 남자에요.");
					break loop;
				case '2' : case '4' :
					System.out.println("님은 여자에요");
					break loop;
				default :
					System.out.println("입력을 잘못 하셨습니다.");
				}
			}
		}
		sc.close();
	}
}
