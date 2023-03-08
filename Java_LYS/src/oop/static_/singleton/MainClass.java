package oop.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		
		//Singleton s1 = new Singleton();
		//s1.method1();
		//s1.method2();
		
		
		
		
		//이제 new로 객체를 안만들어도 되고,
		//Singleton s1 = Singleton.getInstance(); 이렇게 쓸 필요도 없다.
//		Singleton s1 = Singleton.s; //이렇게 쓰자.
//		Singleton.s = null;
		
		
		
		//근데 싱글톤클래스에서 private static Singleton s = new Singleton();를 했기 때문에 s 에는 빨간 줄 긁힌다.
		//Singleton s1 = Singleton.s; 
		//Singleton.s = null;
		
		
		
		//그래서 이렇게 메서드를 호출하자.
		Singleton s1 = Singleton.getInstance();
		s1.method1();
		s1.method2();
		//출력 결과 :
		
		/*
		객체가 생성됨!
		여러 군데에서 쓰이는 중요한 메서드
		꼭 사용해야 하는 귀한 메서드
		*/
		
		
	}
}
