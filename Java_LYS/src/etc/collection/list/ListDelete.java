package etc.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDelete {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> kakao = new ArrayList<>();
		Collections.addAll(kakao, "무지", "네오", "어피치", "라이언", "제이지", "춘식이");

		System.out.println("현재 저장된 친구들 : " + kakao);

		System.out.print("삭제 할 친구들 입력하세요 : ");
		String name = sc.next();

		
		
		// 입력받은 이름을 리스트 내에서 삭제하세요.
		// 삭제 후 결과도 출력하세요.
		// 없으면 없는 이름이라고 출력하세요

		
		
		// array패키지에서 풀었던 문제를 ArrayList 메서드를 적용해서 풀어서 훨씬 쉽게 문제를 풀었다.
		// 원래라면 바로 반복문을 열었다.
		// if를 쓰면 된다.

		
		
		if (kakao.contains(name)) { // 내가 어떠한 문자열 값이 리스트 내부에 있는지 궁금해서 이거 했다.
			kakao.remove(name);
			System.out.println("삭제 후 정보 : " + kakao);
		} else {
			System.out.println("없어요");
		}
		sc.close();
	}
}
