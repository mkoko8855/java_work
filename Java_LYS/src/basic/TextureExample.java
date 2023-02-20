package basic;

public class TextureExample {

	public static void main(String[] args) {
		
		char c1 = 'A';			   //캐릭터 타입은 한 글자(단일 글자)만 가능
		System.out.println(c1);    //출력결과 : A
		
		
		char c2 = 65;
		System.out.println(c2);    //출력결과 : A
		
		
		char c3 = 44032;		   //한글도 가능
		System.out.println(c3);    //출력결과 : 가		
		
		
		
		
		/////////////////////////////////////////
		
		
		
		
     	 /*
		 	# 문자열을 저장할 수 있는 데이터 타입? String
		 	String은 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입한다.
		 	String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
		 	기본 데이터 타입처럼 사용한다. (사실 객체 타입이다.)
		 */
		
		
		
		
		String s1 = "my dream";
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2);  //출력 결과 : my dream is a programmer
		
		
		
		
		//문자열과 다른 데이터 타입 간의 연산
		//결과는 무조건 문자열의 덧셈 연산과 같다.
		System.out.println("-------------------------------");
		
		System.out.println(100+100);
		System.out.println("100"+"100");  //출력 결과 : 100100
		System.out.println("100"+100);  //출력 결과 : 100100
		System.out.println(3.14+"hi");  //출력 결과 : 3.14hi
		
		
		
		int month = 10;
		int day = 13;
		//내 생일은 10월 13일 이다. 라는 문장을 완성하고싶다면?
		System.out.println("내 생일은 " + month + "월 " + day + "일" + " 이다.");
		
	}
}
