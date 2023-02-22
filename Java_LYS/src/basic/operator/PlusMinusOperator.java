package basic.operator;

public class PlusMinusOperator {

	public static void main(String[] args) {
		
		//증감 연산자 (++, --) : 변수에 값을 단순히 하나 올리거나 내릴 때 사용.
		
		int i = 1;
		int j = i++;    //후위 연산 ( 선연산 후증감)
		int k = i--;
		System.out.println("i의 값: " + i);
		System.out.println("j의 값: " + j);
		System.out.println("k의 값: " + k);
		
		
		System.out.println("--------------------------");
		
		
		int x = 1;
		int y = ++x;	//전위 연산 (선증감 후연산)
		int z = --x;
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
		System.out.println("z의 값: " + z);
		
		
		System.out.println("--------------------------");
		
		
		int a = 3;
		int b = a++ + 5 * 3;
		System.out.println(b);    //출력결과 : 18
		System.out.println(a);    //출력결과 : 4
		
		
		
		
		
		
	}
}
