package basic.method;

import java.util.Arrays;

/*
      매개변수 ( parameter 또는 argument)
      1. 매개변수는 메서드를 호출할 때, 메서드 실행에 필요한 값들을
         메서드 내부로 전달하는 매개체 역할을 한다.
      
      2. 메서드 호출부에서 어떤 매개값을 전달 하느냐에 따라
      	 메서드의 실행 결과는 달라질 수 있다.
      	 
      3. 매개값을 몇 개 받아서 사용할지는 메서드를 선언할 때 선언부에서
      	 () 안에 미리 개수와 타입을 지정한다.
      	 
      4. 매개변수의 이름을 지을 때는 호출자가 선언부로 돌아와서
         매개값을 확인하지 않게, 어떠한 값을 담는 변수 인지 그 뜻을 알기 쉽게 지어주면 서로에게 좋다.
      
      5. 매개변수를 하나도 선언하지 않을 수 있다.
      	 이 때는 메서드의 선언부에 괄호 내부를 비워둔다. 그리고 호출할 때도 괄호를 비워서 호출한다.
      	 
         
*/



public class MethodExample2 {

	//begin(시작 값도 미리 받아서 해보자)
	//x부터 y까지의 누적 합계를 구하는 메서드
	static int calcRangeTotal(int start, int end) {   //변수 이름을 x나 y로 하는 것은 좋지 않다. 의미 있게 start와 end로 바꿨다.
		int total = 0; //누적값 담아줄 변수
		
//		if(start > end) {
//			int temp = start;
//			start = end;               27~31번 줄은 x와 y값을 바꾸는 코드다.
//			end = temp;
//		}
		
		for(int i=start; i<=end; i++) {
			total += i;
		}
		return total;
	}
	
	
	
	
//매개변수가 필요 없는 경우
	static String selectRandomFood() { //괄호는 무조건 있어야한다. 그래야 함수 형태로 바뀌기 때문에. 괄호가 없는 변수 형태면 문제가 생긴다.
//난수하나 생성해서 푸는 문제. 외부에서 받을 필요가 없는 문제니 괄호를 비워주면 되고, 부를 때에도 값을 안주면 된다. 왜? 안받으니까 값을 줄 필요없지.
		double rn = Math.random(); //0.0이상 1.0미만 랜덤으로 생성됨. 실수 난수기 때문에 double로 선언함.
		if(rn > 0.66) {
			return "치킨";
		} else if(rn >0.33) {
			return "족발";
		} else {
			return "삼겹살";
		}
	}
	
	
	
	
	
	
	//이번엔 정수를 n개를 전달하면 그 정수들의 총 합을 리턴하는 메서드를 선언해보자.
	//범위를 지정하는게 아니고 값을 여러 개 전달하면 그 합을 계산하는 것이다.
	//10개일수도 200개일수도 있다.
	
	static int calcNumberTotal(int[] nums) {  //정수가 n갠데 어떻게 매개변수를 줄 것인가..
											  //배열이면 해결을 할 수 있다. int[] nums 라고 해주자.
		int total = 0; //누적합을 담아줄 변수
		
		
//		배열이니 향상된for문(for-each)문 써도됨
//		for(int n : nums) {
//			total += n;
//		}
		
		for(int i = 0; i<nums.length; i++) {
			total += nums[i];
		}
		return total;
	}
		
	
	
	
	
	//가변 인수 작성법
	//변하는 것이 가능한 가변 인수(또는 가변 파라미터)를 사용한 매개변수 작성법
	//정수 n개를 받는 상황에서는 배열도 받을 수 있지만 가변인수를 사용해서 받아내는것도 가능하다.
	//콤마로 나열되어 들어오는 여러 개의 값을 배열로 묶어서 내부로 전달한다.
	static int calcNumberTotal2(int...nums) {
		int total = 0;
		for(int k : nums) {
			total += k;
		}
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//------------------------아래는 메인메서드. 호출하는 부분이다.
	
	
	
	
	public static void main(String[] args) {
		
	int result = calcRangeTotal(3, 7);   
	System.out.println(result);
	//출력 결과 : 25
		
		
	
	
	
	
	System.out.println("오늘 점심 뭐먹지??? : " + selectRandomFood());
	//출력 결과 : 치킨 족발 삼겹살 셋 중 하나씩 바뀌면서 출력될 것임.
	
	
	
	
	
	
	int[] arr = {10, 30, 50, 70, 90, 110};  //내부에 몇개를 쓰던 상관 없음 매개변수에 정수n개를 커버할 배열을 줬으니.
	int sum = calcNumberTotal(arr);
	System.out.println(sum);  //누적 합 출력 결과 : 360
	//또 다른 방법
	sum = calcNumberTotal(new int[] {10, 30, 50, 70, 90, 110});  //위 int[] arr{10, 30..}이 선언이 되지 않았으면 이렇게 써도 됨.
	System.out.println(sum);  //누적 합 출력 결과 : 360
	
	
	
	
	
	//가변 파라미터에 값을 보낼 때는 콤마로 쭉 나열하거나
	//배열로 포장해서 보내도 된다. 위에 처럼.
	//가변인수 쓴거 호출해야지.
	sum = calcNumberTotal2(10, 30, 50, 70, 90, 110);   //바로 값 박아버리기 가능.
	System.out.println(sum);  //누적 합 출력 결과 : 360
	
	
	}
}
