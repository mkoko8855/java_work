package basic.operator;

public class ConOperatorQuiz {

	public static void main(String[] args) {

		 /*
		 42~396 사이의 난수를 발생시킨 후
		 발생한 난수가 홀수인지 짝수인지의 여부를
		 3항 연산식으로 출력해 보세요
		 */
		
	
		
		
		
		
		
		
		int random = (int)((Math.random()*355+42));
		System.out.println("발생한 난수 : " + random);
		
		String set = (random%2 == 0 ? "짝수" : "홀수");
		System.out.println("결과 : " + set);
	}
}