package basic.loop;

public class ContinueExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
				//while문에선 continue는 증감은 안돌아감.
			}
			System.out.println(i + " ");
		}
		System.out.println("\n반복문 종료!");
	}
}
