package etc.exception.throw_;

public class ThrowExample {

	/*
    	# 예외를 강제로 발생시키는 키워드 throw
    
      메서드나 생성자 실행 도중에 throw 키워드를 만나면
      즉시 throw로 생성한 예외가 발생합니다.
     
      예외가 발생되면 실행되던 코드는 즉시 중단되고 예외를 처리할 수 있는
      catch문으로 바로 이동하게 됩니다.
     
      이를 적절히 활용하면 void가 아닌 메서드를
      강제로 종료시킬 때 사용할 수 있습니다.
      또한, 에러 상황은 아니지만 프로그램 실행에 적절치 못한 상황에서
      코드의 흐름을 바꿔 줄 수가 있습니다.
     
    */
	
	
	//간단한 메서드하나 선언해보자, 1부터 num까지의 누적 합
	static int calcTotal(int num) throws Exception {
		if(num <= 0) {
										//return; //이건 보이드가 아니니 강제 종료가 안된다. 뭐라도 줘야 하니 0을 주자
										//return 0; //근데 이게 싫어. 리턴이 안됐으면좋겠어. 이럴 때는 리턴 대신에 프로그램이 그 즉시 멈추는 그 성질을 이용해서
				throw new Exception();	//예외 객체를 하나 생성하자! 그리고 메서드로 던져, 그럼 여기서 예외처리가 강제가 됨.
										//이부분은 이제 강제로 중지가 되고 메서드 throws Exception은 또 아래로 던진다는 것이다.
		}
		int total = 0;
		for(int i=1; i<=num; i++) {
			total += i;
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		
		//예외를 일부러 발생 시킬 때 throw를 쓴다.
		try {
		System.out.println(calcTotal(100));    //1~100까지의 누적 합계인 출력 결과 : 5059
		System.out.println(calcTotal(-120));   //출력 결과 : 0        
		} catch (Exception e) {
			System.out.println("매개값은 양수로 주세요");
		}
		//근데 내 기준에서는 -120이라는 값이 어이가없어. 터뜨리자. 음수나 0이라면 종료를 시켜줄건데, 우리가 아는 문법에선 잘 안된다.
		//int메서드는 return써도 강제 종료가 안된다. 그래서 throw쓴다.
		//일부로 if로 예외로 만들어 줄꺼야. 처음에 리턴을 써서 강제종료 하려 했더니 보이드가 아니니 리턴을 쓸 수 없으니
		//일부로 쓰로우로 새로운 예외 객체를 만들어줘서 예외가 발생하면 호출부로 집어 던진다.
		//강제탈출을 위해 throw를 쓴다는 것이다. 리턴이 없어도 int메서드를 탈출 시킬 수 있다는 것이다.
		
		
		
		
	}
}
