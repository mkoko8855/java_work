package basic;

public class CastingExample1 {

	public static void main(String[] args) {
		
		
		/*
		 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		 자바 가상 머신(JVM)이 자동으로 타입을 올려서 변환해준다.
		 (promotion 이라고 하기도 하며 UpCasting 이라고 한다)
		 */
		
		
		byte b = 10;
		int i = b;
		System.out.println(i);      //출력 결과 : 10
		
		
		System.out.println("----------------------");
		
		
		char c = 'A';
		int j = c;
		System.out.println("A의 문자 번호:" + j);  //출력 결과 : 65
		
		
		System.out.println("----------------------");
		
		
		int k = 500;
		double d = k;
		System.out.println(d);    //출력 결과 : 500.0
		
	}
}
