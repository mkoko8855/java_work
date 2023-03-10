package etc.api.lang;

public class MathExample {

	public static void main(String[] args) {
		
		
		//올림
		int i = (int) Math.ceil(1.1);  //올려주긴올려주지만 더블로 리턴을 요구한다. 그래서 빨간줄 긁히는데, 그래서 인트로 담아야 한다..왜그런진모름
		System.out.println(i);
		//출력 결과 : 2
		
		
		
		
		
		
		
		//내림
		double d = Math.floor(1.5);
		System.out.println(d);
		//출력 결과 : 1.0
		
		
		
		
		
		
		
		//반올림
		double d2 = Math.round(3.14);
		System.out.println(d2);
		//출력 결과 : 3.0
		
		
		
		
		
		
		
		
		
		//반올림 > 소수점 많게 해보기
		double d3 = Math.round(3.141592 * 1000) * 0.001;  
		System.out.println(d3);
		//출력 결과 : 3.142
		//원래 3.141인데 뒤에가 5여서 반올림이 된 것이다.
		
		
		
		
		
		
		
		
		//제곱
		double d4 = Math.pow(3.0, 4.0);   //3의 4승은 81이다. 더블이니 81.0이 나오겠지.
		System.out.println(d4);
		
		
		
		
		
		
		
		
		
		//최대값
		int max = Math.max(2, 10);    //2와 10중에 누가 더 크니?
		System.out.println(max);
		//출력 결과 : 10
		
		
		
		
		
		
		
		
		
		//최소값
		int min = Math.min(24, 33);
		System.out.println(min);

		
		
		
		
		
		
		
		
		
		//자바의 공식 문서
		//자바표준API 검색 후, 오라클 창뜨는거 들어가서 주소란에 7을 8로, 이런식으로 바꾸면 버전 별로 들어갈 수 있다.
		
		
	}
}
