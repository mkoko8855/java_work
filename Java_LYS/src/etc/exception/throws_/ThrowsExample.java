package etc.exception.throws_;

public class ThrowsExample {

	
	
	
	 /*
	 	throws 란 ?
	 	
	 	예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우,
	 	예외 처리를 메서드의 호출부로 떠넘기는 방식이다.
	 	
	 	throws는 생성자에서도 선언이 가능하며 메서드나 생성자를 호출 시
	 	예외 처리를 강요 하고 싶을 때 사용 한다.
	 	
	 	또한, 원하는 영역으로 예외를 모아서 한번에 처리하는 것도 가능하다.
	 */
	
	
	static String[] greetings = {"안녕", "헬로", "니하오"};  //밑에 있는 메서드에서 바로 선언하려고 static으로했음
	
	static void greet(int idx) throws Exception {
		System.out.println(greetings[idx]);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
//		greet(0); 		//0번 인덱스호출해줘      출력 결과 : 안녕
//		greet(1);                      
//		greet(2);
//		greet(3);		이건 에러다. System.out.println(greetings[idx]); 이게 문제다.
//						예외처리를 문제인 곳에다 할라 하다가, greet메서드는 잘못이 없는데, 이 떄 throws를 쓴다.
//						메서드의 호출부로 던져버리자. 그럼 된다.
		
		
		try {
			greet(3);
		} catch (Exception e) {
			e.printStackTrace(); //이건 예외 발생 원인을 역 추적하여 예외가 어디에서 발생했는지, 그 이유는 무엇인지
								 //메세지를 통해 개발자에게 전달하므로 자주 사용하는 메서드이다.
		} 
		System.out.println("프로그램 종료");
		
		
		
		
		
		
	}
}
