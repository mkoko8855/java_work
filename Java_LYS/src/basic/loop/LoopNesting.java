package basic.loop;

public class LoopNesting {

	public static void main(String[] args) {

		/*
		 * # 반복문 중첩 (loop nesting)
		 * 
		 * 외부 반복문 내부에 내부 반복문이 존재하는 형태를 반복문 자체를 반복 시켜야 할 경우에 중첩을 사용한다.
		 * 
		 * 내부 반복문이 종료가 되어도 외부 반복문이 끝나지 않는다면 내부 반복문은 외부 반복문의 제어변수의 크기 및 범위까지 계속해서 반복 실행되게
		 * 됩니다.
		 */

			// 2단부터 시작하고 9단까지 실행하며 반복문이 한번 돌때마다 1씩 증가 시킵니다.
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단을 출력 합니다.");

			// 위에서 i의 값이 2라면 2x1 ~ 2x9 까지 진행 합니다.
			// 이 반복문(j)이 종료되면 위의 반복문 변수 i가 1 증가하여 다시 3x1 ~ 3x9 까지 진행하는 식으로 9단까지 반복 합니다
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
