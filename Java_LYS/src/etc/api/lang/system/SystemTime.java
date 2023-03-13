package etc.api.lang.system;

public class SystemTime {

	public static void main(String[] args) {
		
		//시스템클래스는 객체 없이 사용 가능.
		
		
		//시스템 메서드
		
		long start = System.currentTimeMillis(); //리턴 타입은 long이다. long변수를 선언해줘야겠지
		
		System.out.println(start);   //출력 결과 : 1678416615172 (천분의1초=밀리초)로 나타낸거. 여기다 나누기 1000 하면 초당으로 출력이 된다.
									//1970년 1월 1일 자정 기준으로 지금까지의 시간이 흐른 뒤를 출력해줌
		
		//메서드 호출로 먼저 찍어놓고, 내가 시간을 측정하고 싶은 로직을 하나 돌리고 로직이 끝나면 한번더 시간을 찍는다. 그리고 빼준다. 그럼 해당 로직의 걸린 시간을 알려준다
		
		
		
		
		/*
		 System 클래스가 제공하는 currentTimeMillis()는
		 1970년 1월 1일 자정을 기준으로 현재까지 소요된 시간을
		 밀리초 (1/1000)로 변환한 long타입의 정수를 반환합니다.
		 */
		
		int total = 0;
		for(int i=1; i<=100000000; i++) { 
			total += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("실행 소요시간: " + (end-start)* 0.001 + "초");
		//출력 결과 : 실행 소요시간: 0.036000000000000004초(1부터 1억까지 구하는 시간)
		
		
		System.out.println(System.getProperties()); //자바의 운영체제의 정보들을 출력해주긴 하는데 많이 사용하진 않는다.
		System.out.println(System.getenv());  //이것도 정보같은거 나옴
		
		
		System.exit(0);  //프로그램 종료
	}
}


















