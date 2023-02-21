package basic;

import java.util.Scanner;

public class ifQuiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해야죠!");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max = 0;
		int mid = 0;
		int min = 0;

		if (a > b && a > c) { // a가 b와 c보다 컸을 때
			max = a; // max=a라고 할 때,
			if (b > c) { // b가 c보다 클 때,
				mid = b; // a가 max니까 b는 중간 값이고
				min = c; // c가 최소값
			} else { // 그 외에
				mid = c; // 중간값이 c이고
				min = b; // 최소값이 b일때
			}
		} else if (b > c && b > a) { // b가 c보다 크고 a보다 클 때
			max = b; // max=b라고 할 때,
			if (a > c) { // a가 c보다 클 때,
				mid = a; // a가 중간값이고
				min = c; // c가 최소값이다. 왜? b는 max고
			} else { // 그 외에
				mid = c; // b가 max니까 mid는 c, min은 a
				min = a;
			}
		} else if (c > b && c > a) { // a와 b가 max일 때 가정했으니 c도 max로 가정
			max = c; // max = c
			if (a > b) { // a가 b보다 클 때,
				mid = a; // 최대값이 c니까, a는 b보다 크니까
				min = b; // a는 중간값이 되고 b는 최소값이 된다.
			} else { // 그 외에
				mid = b; // b가 중간
				min = a; // a가 최소값
			}
		}
		sc.close();
		System.out.println("가장 큰 값은 : " + max);
		System.out.println("중간 값은 : " + mid);
		System.out.println("가장 작은 : " + min);
		System.out.println("^^");
	}
}
