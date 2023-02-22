package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {
		
		char c = 'b';
		int i = 2;
		
		
		//서로 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰 쪽에
		//작은 쪽이 맞춰져서 자동으로 형 변환이 진행된 뒤에 연산이 진행된다.
		
		
		
		int intResult = c + i;	     		 //출력결과 : b
	//	char charResult = c + i;       		 오류코드
		
		
		char charResult = (char)(c+i);   	 
		System.out.println(intResult);		 //출력결과 : 100
		System.out.println(charResult);		 //출력결과 : d
		
		
		int k = 10;
		double d = k / 4;
		System.out.println(d);               //출력결과 : 2.0
		//소수점까지 출력이 되길 원한다면 k앞에 (double)을 쓰던, 4말고 4.0을 쓰면 된다.
		
		
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2);         //출력결과 : 170 (int로 자동으로 변환됨)
		//byte + byte는 170이 나올 수 없다. 
		//int 보다 작은 크기의 데이터 연산은 자동으로 값이 int로 변환되는 것이다.
		//왜냐하면 데이터 손실의 방지를 위해서.
	}
}
