package basic.loop;

public class LoopNestingQuiz01 {

	public static void main(String[] args) {

		/*
		 * 1. 구구단을 다음과 같이 가로로 출력해 보세요.
		 * 
		 * 2단: 2x1=2 2x2=4 2x3=6 ..... 3단: 3x1=3 3x2=6 3x3=9 ..... 4단: 4x1=4 4x2=8
		 * 4x3=12 .....
		 * 
		 * 2. 구구단을 다음과 같이 세로로 출력해 보세요. 각 단의 간격은 탭 하나로 고정하겠습니다. 2단 3단 2x1=2 3x1=3 2x2=4
		 * 3x2=6 2x3=6 3x3=9 . . .
		 */

		for (int i = 2; i < 10; i++) {
			System.out.print(i + "단을 출력 합니다. ");

			// 위에서 i의 값이 2라면 2x1 ~ 2x9 까지 진행 합니다.
			// 이 반복문(j)이 종료되면 위의 반복문 변수 i가 1 증가하여 다시 3x1 ~ 3x9 까지 진행하는 식으로 9단까지 반복 합니다
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " x " + j + " = " + i * j + " ");
				// System.out.printf("%d단 : %d * %d = %d ", i, i, j,(i*j));
			}
			System.out.println();
		}

		// 1번

		for (int i = 2; i < 10; i++) {
			System.out.print(i + "단을 출력 합니다. ");

			for (int j = 1; j < 10; j++) {
				System.out.print(i + " x " + j + " = " + i * j + " ");
			}
			System.out.println();
		}

		System.out.println("-------------------------");
		// 2번

		for (int hang = 0; hang <= 9; hang++) {

			for (int dan = 2; dan <= 9; dan++) {
				if (hang == 0) {
					System.out.print(dan + "단\t");
				} else {
					System.out.printf("%dx%d=%d\t", dan, hang, dan * hang);
				}
			}
			System.out.println();
		}
		System.out.println("------------------------");

		// 임의로 문제내보기 3번 :
		// 3단과 4단을 지워라
		for (int z = 2; z <= 9; z++) {
			if (z != 3 && z != 4) {
				for (int k = 1; k <= 9; k++) {
					System.out.println(z + "*" + k + "는" + z * k + "입니다.");
				}
			}
		}
	}
}
