package basic.casting;

public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
		 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
		 반드시 형 변환 연산자: (type)룰 사용해서 명시적으로
		 형 변환을 진행해야 한다. 이것은 DownCasting이라고 한다.
		
		 명시적으로 형 변환을 해야 하는 이유는?
		 DownCasting의 경우, 타입이 작아지면서 저장 공간이 줄어드는데
		 데이터 손실의 가능성이 항상 존재하기 때문이다.
		 */
		
		
		
		int i = 72;
		char c =(char) i;		//DownCasting 진행.
		System.out.println(c);  //출력 결과 : H
		
		int f = 55;
		short a =(short)f;
		System.out.println(a);  //출력 결과 : 55
		
		double d = 4.98765;
		int j =(int) d;
		System.out.println(j);  //출력 결과 : 4(값손실)
		
		int k = 1000;
		byte b =(byte)k;
		System.out.println(b);  //출력 결과 : -24(값손실)
		
		
		
		
	}
}
