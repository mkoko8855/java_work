package basic.if_;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num > num2) {
			System.out.println(num + " 가 더 큰 수 입니다.");
		} else if(num < num2) {
			System.out.println(num + " 가 더 작은 수 입니다.");
		} else if(num == num2) {
			System.out.println(num + " 와 " + num2 + " 는 같습니다.");
		} 
		System.out.println("^^");
		sc.close();
	}
}



