package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {

		String[] foods = { "삼겹살", "족발", "피자", "햄버거" };

		System.out.println(Arrays.toString(foods));
		// [삼겹살, 족발, 피자, 햄버거]

		foods[0] = "치킨";
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));
		// [치킨, 족발, 탕수육, 햄버거]

		System.out.println("-------------------------------");

		// 배열의 인덱스 탐색
		Scanner sc = new Scanner(System.in);
		System.out.println("탐색 할 음식을 입력하세요 : ");
		String name = sc.next();

	
		// 인덱스를 알아 내야 하기 때문에 향상for문 안 쓸 것임
		for (int i = 0; i < foods.length; i++) {
			if (name.equals(foods[i])) {
				System.out.println("탐색 완료");
				System.out.println("인덱스는 " + i + "번");
				break;
			} else if(i == foods.length -1) {
				System.out.println("없는 음식 입니다.");
			}
		}
		sc.close();
	}
}
