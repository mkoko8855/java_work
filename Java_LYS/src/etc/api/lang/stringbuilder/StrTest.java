package etc.api.lang.stringbuilder;

public class StrTest {

	public static void main(String[] args) {
		
		
		//성능상 좋다고 하니 그 차이를 알아보자
		
		
		//일단 String test하기 전에 시간을 먼저 찍자
		long start = System.currentTimeMillis();
		
		
		/*
		//String test
		String str = "a";
		for(int i=1; i<=500000; i++) {
			str += "a"; //기존의 str에 a를 이어 붙여라   >   그럼 반복문이 돌 때마다 a라는 문자열이 추가된다. 근데 String은 계속 객체를 갖다 버림.
		}
		*/  //출력 결과 : 28초
		
		
		
		
		
		
		//스트링 빌더 써보기 위해 위에껀 잠깐 주석처리 하고.
		StringBuilder sb = new StringBuilder("a");
		for(int i=1; i<=500000000; i++) {
			sb.append("a");  //기존 문자열에 a를 계속 붙여라. 문법만 다를뿐 위와 조건은 같다.
		}
		//실행 결과 : 0.013000000000000001초
		//500만번이면 0.04초
		//5000만번이면 0.234초
		//5억번이면 1.994초
		
		
		
		
		
		
		
		long end = System.currentTimeMillis();
		System.out.println("실행 결과 : " + (end-start)*0.001 + "초");
		
		
		
		
		
		
		
	}
}
