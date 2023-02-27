package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		/*
		 * 1. 삭제할 친구를 입력 받아서 삭제를 진행 해 주세요. 2. 입력받은 이름이 없다면 없다고 얘기 해 주세요.
		 */

		Scanner sc = new Scanner(System.in);
		String[] kakao = { "무지", "네오", "어피치", "라이언", "춘식이" };
		System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));

		System.out.println("삭제할 친구 입력 : ");
		String name = sc.next();

		boolean flag = false;

		for (int i = 0; i < kakao.length; i++) {
			if (name.equals(kakao[i])) { // 1. (탐색)이름이 발견 되었다면
				flag = true; // 2. 플래그를 트루로 주고
				for (int j = i; j < kakao.length - 1; j++) { // 삭제로직시작, 값을땡기는로직
					kakao[j] = kakao[j + 1];
				}
				break; // 3. 브레이크 건다.
			}
		}

		// 이것 또한 탐색 과정이다.
		if (!flag) { // flag==false? > false는 없다라는 거고 else는 있다.
			System.out.println(name + "(은)는 이름이 없다.");
		} else { //이름이 있는 과정
			String[] temp = new String[kakao.length - 1];
			// 확인과정 System.out.println(Arrays.toString(kakao));
			for (int k = 0; k < temp.length; k++) {
				temp[k] = kakao[k];
			}
			kakao = temp;
			temp = null;
			System.out.println("삭제 후 결과 : " + Arrays.toString(kakao));
		}
	}
}
