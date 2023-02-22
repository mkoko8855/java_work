package basic.switch_;

import java.util.Scanner;
import com.fast.Cw;

public class SwitchExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cw.w("점수를 입력하세요 :");
		
		loop: while (true) {
			int point = sc.nextInt();

			switch (point / 10) {
			case 10:
				if (point > 100) {
					Cw.w("잘못된 점수 입니다.");
					break;
				}
			case 9:
				Cw.w("당신의 학점은 A입니다.");
				break;
			case 8:
				Cw.w("당신의 학점은 B입니다.");
				break;
			case 7:
				Cw.w("당신의 학점은 C입니다.");
				break;
			case 6:
				Cw.w("당신의 학점은 D입니다.");
				break loop;
			default:
				if(point > 100 || point < 0) {
					Cw.w("점수를 잘못 입력하셨습니다.");
				}	else {
					Cw.w("당신의 학점은 F입니다.");
				}
				break;
			}
		}
		sc.close();
	}
}
