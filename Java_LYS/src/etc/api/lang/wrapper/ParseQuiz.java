package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ssn;
		char c; // 뒷자리 첫번째 숫자, 한번 쓰고 말거면 메서드 계속 불러도 상관이 없지만.. 계속 써야하니 선언 해주자

		while (true) {
			System.out.println("주민등록번호 입력하세요 : ");
			ssn = sc.next();

			if (ssn.indexOf("-") == -1) { // -1이면 하이푼이 없다는 소리다.
				System.out.println("주민등록번호는 하이푼을 포함시켜 주세요");
				continue;
			}

			c = ssn.charAt(7); //chatAt을 계속 써야하는 사태가 생기니 char c;라고 변수에 담아놓고 쓰자
			if (!(c == '1' || c == '2' || c == '3' || c == '4')) {
				// c가 1~4중 하나만 true면 전체 결과가 true임.
				// 그러나 1~4중 아니라면 전체 결과는 false임.
				// 낫을 붙였으니 1~4중 하나라도 없다면 if문을 실행시키겠다 라는 의미다.
				System.out.println("뒷자리 첫번째 숫자는 1, 2, 3, 4 중 하나 여야 한다.");
				continue;
			}

			try {
				// 정수변환을 해서 예외가발생한다면 다시 입력 받을 수 있게 해주자
				String test = ssn.substring(0, 6);
				String test2 = ssn.substring(7); // 7번부터 끝까지
				Integer.parseInt(test);
				Integer.parseInt(test2);
				// test와 test2가 순수한 정수가 아니라면 넘벌포맷익셉션이라는 예외가 생긴다.
				// 트라이캐치로 하자.
				break; // 문제 발생하면 break, 문제가 캐치문으로 간다.
			} catch (NumberFormatException e) {
				System.out.println("정수로 정확하게 입력을 해야 합니다.");
			}
		} //입력값을 검증하는 거까지 했음.
		
		
		//92따로 10따로 13따로 이런식으로 계산해보자
		int year = Integer.parseInt(ssn.substring(0, 2));
		int month = Integer.parseInt(ssn.substring(2, 4));//2번이상 4번미만
		int day = Integer.parseInt(ssn.substring(4, 6));//4번이상 6번미만
		
		
		String gender; //선언만하자, 조건에 따라서 값이 달라지니까.
		int birthYear; //출생연도
		
		if(c=='1'||c=='3') {
			gender = "남자";
		} else {
			gender = "여자";
		} 
		
		//출생연도를 구해보자
		if(c=='1' || c=='2') {
			birthYear = 1900 + year;
		} else {
			birthYear = 2000 + year;
		}
		
		//출생연도 구헀으니 나이를 얻자
		int age = 2023 - birthYear;
		
		System.out.printf("%d년 %d월 %d일 %d세 %s\n", birthYear, month, day, age, gender);
	}
}
