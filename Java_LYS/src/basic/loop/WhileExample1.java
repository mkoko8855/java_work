package basic.loop;

public class WhileExample1 {

	public static void main(String[] args) {
		
		//제어변수, 논리형 조건식 ,증감식은 반복문의 필수 3요소이다.
		
		
		
		 /*
		 while문의 진행 순서
		 1. 제어변수를 선언한다. (시작값이 정해짐)
		 2. while문의 조건식을 검사해서 조건식이 true면 반복문이 시작.
		 	조건식이 false면 반복문이 종료가 되는 형태이다.
		 3.	while문 블록 내부가 한 바퀴 진행되면 (끝까지 내려가면)
		 	다시 조건식을 검사하여 true라면 반복문을 계속 진행하고
		 	false라면 반복문을 종료한다
		 4.	반복문 내에는 증감식을 반드시 배치해서 제어변수의 값을 꼭 조정!
		 */
		
		
		int n = 1; //제어변수 라고 하며, 반복문이 횟수를 제어할 변수. (영어로는 begin)
		//while 괄호엔 논리형 조건식이 들어가야 함 , 논리형 조건식이란 ? > 반복문의 끝을 지정. (영어로는 and)
		while(n<=10) {
			System.out.println("안녕하세요. 반갑습니다~!" + n);
			n++; //증감식 : 반복문의 종료를 위해 제어변수의 값을 조정 (영어로는 step) , while문 내부에 들어와있어야됨
		}
		
		
		System.out.println("-----------------------------------------");
		
		
		
		
		//1부터 10까지의 누적 합계를 구하시오
		int i = 1;
		int total = 0;  //누적합을 기억해줄 변수
		
		while(i<=10) {
			total += i;  
			i++;
		}
		System.out.println("1부터 10까지의 누적합은 " + total);
	}
}
