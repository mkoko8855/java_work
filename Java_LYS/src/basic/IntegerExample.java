package basic;

public class IntegerExample {

	public static void main(String[] args) {
		
		//참고 : 1byte = 8bit
		
		//리터럴이란?
		//1. 변수에 저장되기 전의 그 자체 상수값.
		//2. 자바의 정수 리터럴의 타입은 int이다.
		//3. int보다 더 큰 범위의 수를 표현하기 위해서는 뒤에 L을 붙여 long타입으로 인식해야함.
		
		
		byte a = 127; //127은 byte가 표현할 수 있는 가장 큰 값
		//-2^7 ~ 2^7 - 1
		
		short b = 32767; //short가 표현할 수 있는 가장 큰 값
		
		
		int c = 2147483647; //int가 표현할 수 있는 가장 큰 값
		//-2^31 ~ 2^31 - 1

		long d = 2147483648l; //너무 커서 int보다 조금 더 큰 값으로 적었음(l붙여야함)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
