package basic;

public class PrintExample {

	public static void main(String[] args) {
		
		//자바의 표준 출력 형식은 크게 3가지 이다.
		
		//1. 개행(줄바꿈)을 포함하지 않는 print()
		//2. 자동으로 개행(줄바꿈)을 포함해 주는 println()
		//3. 형식 지정 표준 출력 함수 printf()
		//서식 문자를 이용해서 문자열을 완성시킨 후, 서식 문자에 들어갈 값을 지정해서 출력하는 방식
		
		
		/*
		 	%d : 부호가 있는 정수 데이터
		 	%f : 실수 데이터
		 	%s : 문자열
		 	
		 	#탈출 코드 (escape code)
		 	\n : 줄 개행 명령
		 	\t : 가로 공백 (스페이스 4칸)
		 	
		 */
		
		
		System.out.print("안녕하세요~!");
		System.out.println("Hello~!");
		System.out.print("안녕히 가세요ㅜㅜ");
		System.out.println("bye bye");
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		
		//12월 25일은 크리스마스입니다. 를 출력하자
		
		System.out.println(month + "월 " + day + "일은 " + anni + " 입니다.");
		System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
		
		
		//실수를 표현하는 서식문자 %f
		//%.[자리수를 지정하는 숫자]f > 원하는 자리수까지 표현
		//%라는 문자 자체를 표현할 때는 %% 쓰면 된다
		double rate = 64.126;
		System.out.printf("합격률은 %f입니다.", rate);  //출력결과 : 64.126000
		System.out.printf("합격률은 %.2f입니다.", rate);  //출력결과 : 64.13
		System.out.printf("합격률은 %.2f%%입니다.", rate);  //출력결과 : 64.13%
	}
}
