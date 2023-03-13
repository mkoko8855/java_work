package etc.api.lang.stringbuilder;

public class StrBuilderExample {

	public static void main(String[] args) {
		
		
		 /*
		 String 클래스의 단점
		 
		 - String 클래스는 아주 많이 쓰이고 좋은 기능들을 많이 가지고 있지만
		 
		 메모리를 과소비하는 단점이 있다.
		 
		 왜 메모리를 과소비해? > String 객체는 처음 초기화된 데이터에 변화를 주어야 하는 상황에서
		 기존 객체를 활용하지 않고 새로운 객체를 계속해서 생성한다.
		 
		 그래서 나온 애가 바로 StringBuilder, StringBuffer 라는 애들이다. (사용법은 같다. 하나만 배우면 다른거하나 그대로 쓸 수 있음)
		 
		 기능은 같지만 사용하는 곳이 좀 다르다. (자바 5버전부터 사용 가능)
		 
		 String 클래스 단점으로 인한 메모리 과부하 및 속도가 느려지는 현상을 개선하기 위해서
		 
		 StringBuilder가 새롭게 추가 되었다.
		 
		 StringBuilder는 기존 객체를 계속 재활용 하면서 실제 객체 내부의 값을
		 변경하게 된다.
		 
		 StringBuilder 와 StringBuffer는 메서드가 동일하다.
		 
		 환경이 다르다. 스트링빌더는 싱글(단일)쓰레드, 스트링버퍼는 멀티(다중)쓰레드에서 문자열을 공유해야 할 때 사용한다.
		 
		 우리는 지금 메인쓰레드 하나를 쓰고 있다.
		 */
		
		
		String str = "hello";
		System.out.println("str의 주소값 : " + str.hashCode());
		//출력 결과 : str의 주소값 : 99162322
		
		
		//바꾸자
		str = "hello world";
		System.out.println("str의 주소값 : " + str.hashCode());
		//출력 결과 : str의 주소값 : 1794106052
		
		
		//또 바꾸자
		str = "hello~!";
		System.out.println("str의 주소값 : " + str.hashCode());
		//출력 결과 : str의 주소값 : 805714869
		
		
		
		
		
		System.out.println("-----------------------------------------------------");
		
		
		
		
		
		
		
		//스트링 빌더 생성해보자
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);   //출력 결과 : hello
		//스트링은 객체를 갈아 치우지만 얜 아니다.
		//그걸 알기 위해 주소 한번 찍어보자
		System.out.println("sb의 주소값 : " + sb.hashCode());
		//sb의 주소값 : 1365202186
		
		
		
		
		
		
		
		
		
		//스트링 빌더의 메서드는 무엇이 있는지 알아보자
		//문자열을 맨 끝에 추가하는 메서드 > append(문자열) 이다.
		//헬로에 월드를 붙여보자
		sb.append(" world");
		System.out.println(sb);
		//출력 결과 : hello world
		
		
		
		
		
		
		
		
		//문자열을 특정 인덱스에 삽입하는 메서드 > insert(인덱스먼저 지목하고, 삽입할 문자열)
		sb.insert(6,  "my ");
		System.out.println(sb);  //6번인덱스는 스트링빌더에있는 문자열인 hello world, 즉. 여섯번째는 공백이다.
								 //그 공백자리에 my가 들어간다
		
		//출력 결과 : hello my world
		
		
		
		
		
		
		
		//다음은 특정 인덱스 범위의 문자열을 교체하는 메서드 > replace(매개값으로는 begin, end, 문자열 3개를 주면 된다.)
		//아까 추가했던 my를 your로 바꿔보자, 참고로 끝범위는 미만으로 인식됨.
		sb.replace(6,  8, "your");  //즉, 이건 6번에서 7번까지를 your로 바꾼다는 것이다.
		System.out.println(sb);
		//출력 결과 : hello your world
		
		
		
		
		
		
		
		
		
		//문자열 내의 특정 단어를 삭제하는 메서드 > delete(begin, and);
		sb.delete(6, 11); //6번부터 10번까지 삭제해달라는 얘기다.
		System.out.println(sb); //즉, hello your world의 6번부터 10번까지니 your 공백이 삭제된다.
		//출력 결과 : hello world
		
		
		
		
		
		
		
		
		//문자열을 역순으로 배치
		sb.reverse();   //반대로 뒤집어주는 메서드다.
		System.out.println(sb);
		//출력 결과 : dlrow olleh
		
		
		
		
		
		
		//아까 작성했던 주소값 실행시키자
		System.out.println("sb의 주소값 : " + sb.hashCode());
		//문자열 지지고 볶고 이것저것 헀는데도 문자열은 동일 한 것은 알 수 있다.
		//출력 결과 : sb의 주소값 : 1365202186
		
		
	}
}
