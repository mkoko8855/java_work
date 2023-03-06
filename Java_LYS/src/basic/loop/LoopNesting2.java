package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {

		/*
		 * - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를 가로로 
		 * 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다. 
		 * 
		 * ex) 입력받은 수
		 * -> 30 소수: 2 3 5 7 11 13 17 19 23 29 
		 * 소수의 개수: 10개
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하라고 : ");
		
		int num = sc.nextInt();
		
		int count = 0;  //소수의 개수
//cnt 선언을 여기서 해주면 안됨. cnt는 전의 반복했던 숫자를 기억한다. i가 바뀌어야 하니 cnt는 다시 0으로 돌아와서 다시 세야지.
		
		for (int i = 1; i <= num; i++) {
			int cnt = 0; //소수의 판별을 위해 약수의 개수를 세어 줄 변수
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					++cnt;
				}
			}
			if (cnt  == 2) {
				System.out.print(i + " ");
				++count;
			}
		}
		System.out.println("\n개수 : " + count);
		sc.close();
	}
}
