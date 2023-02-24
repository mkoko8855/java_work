package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		//자바에서는 문자열 동등 비교 시 == 이라는 연산자를 사용하면
		//제대로 비교가 안된다.
		//왜냐면 문자열 String 타입이 기본 데이터 타입이 아니라
		//객체 참조 타입이기 때문이다.
		//객체 참조 타입은 해당 값을 직접 들고 있는 것이 아니라
		//객체의 주소 값을 들고 있기 때문에 문자열이
		//아무리 같더라도 주소가 다르면 false를 도출한다. 그래서 name=="그만" 은 안됨.
		//그러므로 문자열 동등 비교를 진행할 때는
		//[비교문자열1.equals(비교문자열2)]를 사용하여 진행해야 한다.
		
		
		Scanner sc = new Scanner(System.in);
		String[] names = new String[6];  //입력받을것이기 때문에 바로 {}로 생성은 불가.
		
		for(int i = 0; i < names.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			names[i] = name;
		}
		
		System.out.println(Arrays.toString(names));
		
		//6명의 이름을 차례로 입력하면 [홍길동, 김철수, 박영희 , , , ] 로 출력됨.
		
		
		
		
		
		
		//만약 값을 입력 하지 않은 부분에 null이 출력 되는 것이 보기 싫다면 다음과 같이 해.
		System.out.println("-------------------------------");
		System.out.println("입력 받은 이름 : ");
		for(String n : names) {  //n에 배열 값들이 하나씩 들어 갈 것임
			if(n == null)
				break;
			System.out.print(n + " ");
		}
		
		sc.close();
	}
}
