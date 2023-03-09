package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample { // 캐치문 여러개 쓰기 (언제 어디서 무슨 에러가 났는지 알아얒)

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		try {
			System.out.println("정수 : ");
			int n = sc.nextInt();

			int result = 100 / n;

			System.out.println(arr[result]);

			String s = null;
			s.equals("메롱");

			
			//다중 catch문은 실제로 에러가 발생하면 위에서부터 순서대로 catch문을 검색하면서 내려오기 때문에
			//부모 타입의 예외를 자식 타입의 예외보다 위에 작성하면 안된다 (즉, Exception e는 맨 위에 올 수 없다)
			
			//catch 옆에 괄호에 예외 타입을 여러 개 작성하고 싶은 경우는
			// | 기호를 이용해서 타입을 나열 해 주면 하나의 catch 블럭으로 여러 타입의 예외를 동시에 처리 가능하다. (JAVA 7버전부터 가능한 문법)
			
		} catch (InputMismatchException e) { //예외처리를 하나로 묶고 싶으면 InputMismatchException | ArithmeticException e 써주면 된다.
			System.out.println("스캐너가 값을 제대로 입력하지 못한 것이다. 정수를 제대로 입력해라");
		} catch (ArithmeticException e) {
			System.out.println("0을 입력 하지 마세요(산술연산에러)");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위가 벗어났어");
		} catch (NullPointerException e) {
			System.out.println("NULL을 참조하면 어떡해?");
		} catch (Exception e) {   //이건 권장사항, 마지막은 Exception으로 마무리 지어주자.
			System.out.println("알 수 없는 에러가 확인 되었다.");
//			System.out.println("에러 원인 : " + e.getMessage());     //만약 catch (NullPointerException e) {System.out.println("NULL을 참조하면 어떡해?");이걸 주석처리 하고 그 메서드 쓰면 오류 정보를 알 수 있다.
		}
		
		
		
		System.out.println("프로그램 정상 종료");
		sc.close();
	}
}
