/*
		 # 메서드 (method)
		 
		 - 메서드는 반복되는 코드 블록에 이름을 붙여놓은 것입니다.
		 
		 - 메서드는 반복되는 코드를 줄여주고
		  좀 더 구조화 시켜서 우리가 코드를 알아보기 쉽게 합니다. (코드의 모듈화)

		 - 메서드는 선언하는 과정과 호출하는 과정으로 나누어집니다.
		 
		 - 메서드의 선언은 메서드 내부에서는 불가능합니다. 즉, 독립적으로만 가능
		   새로운 메서드의 선언은
		   반드시 메서드 블록 외부 and 클래스 블록 내부에서만 가능합니다.

		 - 메서드의 호출은 메서드나 생성자 내부에서만 가능합니다.
		 
		 - 메서드의 호출은 곧 메서드를 사용하는 것을 의미하며, (맨 아래 자세한 흐름 설명 있음)
		 1. 메서드가 필요로 하는 데이터(매개값)를 호출부에서 전달하면
		 2. 그 값을 받아서 메서드 내부로 전달하고, 로직이 실행됩니다.
		 3. 실행 결과값을 메서드를 호출한 곳으로 다시 반환합니다.
		 4. 반환된 값은 변수에 담아서 저장하거나, 출력하는 등 다양하게 활용합니다.
 */

//메서드 블럭의 내부이면서 클래스블럭 외부에서만 가능
package basic.method;

public class MethodExample1 {   //여긴 선언 가능

									 //메서드의 선언(static은 뒤에서 알려드릴게요 지금은 없다고 생각하세요)
	static int clacTotal(int x) {    //clacTotal이 메서드 이름이고, 우리가 부를 것임, int x는 매개변수임. 이 매개변수가 for문에 and자리에 전달함.
		int total = 0;				 //clacTotal(int x)은 인트값 하나가 필요하단 의미다.
		for(int i=1; i<=x; i++) {	 
			total += i;				 //clacTotal이라는 메서드는 실행의 흐름을 돌려받기 위해 선언했다.
									 //그래서 return을 적었고, 뒤에는 어떤 값을 받을지 적어준다.
		}
		return total; //total이라는 값을 돌려받는다. return 값이 맨 위 메서드 앞 변수데이터인 int와 같아야 함.
	} //1~n까지의 누적합 계산
	
	
	public static void main(String[] args) {  //메인메서드 안에서 다른 메서드 선언 불가
											  //메서드의 호출은 다른 메서드나 생성자 내부에서만 가능합니다.
											  //return은 55라는 값은 메인메서드의 clacTotal(10)으로 리턴된다.
											 
		//메인에서 clacTotal을 불러보자
		int total = clacTotal(10);   //함수의 호출 부분임. 메서드가 원하는 타입의 값을 전달해주자. 리턴값을 보관해서 호출하자.
									 //즉, 10은 위의 int x가 받는 다는 것이다.
		System.out.println(total);   //출력 결과 : 55
		
		//이번엔 바로 출력해보자
		System.out.println("1~100까지 누적 합 : " + clacTotal(100));  //바로 100넣어서 total이라는 변수에 5050이 쌓임. 그것이 이 출력문장으로, 리턴값으로 돌아옴.
		//출력 결과 : 1~100까지 누적 합 : 5050
		System.out.println("1~200까지 누적 합 : " + clacTotal(200));
		//출력 결과 : 1~200까지 누적 합 : 20100
		System.out.println("1~300까지 누적 합 : " + clacTotal(300));
		//출력 결과 : 1~300까지 누적 합 : 45150
	}
	//이 부분은 메인 메서드 바깥이니 여기도 다른 메서드 선언 가능. 그러나 여기선 별로 선언 안함.
}




/*
흐름설명
sysout해서 출력을 하면,
JVM이 실행 하는 파일 내에 메인이라는 함수를 호출한다.
호출된 메인메서드 내부 코드가 실행된다.
int total변수에 calctotal의 리턴값을 받겠다 라고했으니 calctotal의 값이 호출되고 값이 전달된다.
전달된 값은 맨 위 int x로 가고, for문의 x로 채워지고, 계산이 진행된다.
마지막 return total은 메인메서드 calctotal로 간다.
그리고 출력이 된다.
*/