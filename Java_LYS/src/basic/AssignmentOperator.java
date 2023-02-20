package basic;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		/*
		 #	대입연산자 (=)
		 #	복합 대입 연산자 (+=, -=, *=, /=, %=)
		 대입(할당)연산자는 변수에 값을 대입할 때 사용하는 연산자 이다.
		 복합 대입 연산자는 대입 연산자에 산술 연산자가 결합이 되어 있는 형태이다.
		 */
		

		 int a = 5;
		 int b = 5;
		 a += 3; // a = a+3
		 System.out.println(a);    //출력결과 : 8
		 
		 
		 System.out.println("--------------------------");
		 
		 
		 a -= 4;  //출력결과: 4     a = a-4
		 System.out.println(a);
		 
		 a *= 6;  //출력결과: 24    a = a*6
		 System.out.println(a);
		 
		 a /= 5;  //출력결과: 4     a = a/5
		 System.out.println(a);
		 
		 a %= 3;  //출력결과: 1     a = a%3
		 System.out.println(a);
		 
		 
	}
}
