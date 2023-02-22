package basic.if_;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		
		 /*
		 	스캐너를 사용하여 정수 하나 입력받으세요.
		 	1. 입력받은 값이 7의 배수라면 "7의 배수입니다."를 출력.
		 	2. 입력받은 값이 7의 배수라면 "7의 배수가 아닙니다."를 출력.
		 	3. 입력받은 값이 0이라면 "0입니다." 를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		int num = sc.nextInt();
		
		if(num==0) {
			System.out.println("0입니다");
		}else if((num%7)==0) {
			System.out.println("입력한 정수는 7의 배수입니다.");
		}else {
			System.out.println("입력한 정수는 7의 배수가 아닙니다.");
		}
			System.out.println("^^");
			sc.close();
	}
}
