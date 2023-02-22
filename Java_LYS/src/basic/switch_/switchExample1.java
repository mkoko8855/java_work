package basic.switch_;

import java.util.Scanner;
import com.fast.Cw;

public class switchExample1 {

	public static void main(String[] args) {

		/*
		 * switch 키워드 뒤에 나오는 괄호 안에는 boolean형 조건식이 아닌 변수나, 연수의 연산식을 적어야 하며, 타입은 정수나 문자열만
		 * 가능하다.
		 */

		/*
		 * switch 괄호 안에 지정하신 기준값에 따라 만족하는 case문을 순서대로 탐색합니다. 적합한 case가 존재하는 경우에는 해당
		 * case에 종속된 문장을 실행합니다. 따로 조치가 없다면 나이저 케이스들이 연속적으로 실행된다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("성별을 입력하세요. (M/F)");
		System.out.println("> ");

		String gender = sc.next();

		switch (gender) {

		case "ㅡ":
		case "m":
		case "M":
			Cw.w("남자입니다.");
			break; // 해당 case만 실행하고 switch문을 종료해라!
		case "ㄹ":
		case "f":
		case "F":
			Cw.w("여자입니다.");
		default:
			Cw.w("치지마라");
			break;
		}
	}
}
