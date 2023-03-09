package oop.static_.method;

public class Count {

	 				//변수에 static이 아닌 메서드에 static이 붙은 것을 보자
	
	
		public int a;  //인스턴스 변수 (멤버 변수)
		public static int b;   //정적 변수 (클래스 변수)
		
		
		 /*
		 	인스턴스 메서드 : 객체를 생성하여 주소값을 통해 접근 한 후 호출하는 메서드
		 	
		 	인스턴스 메서드 안에서는 정적(static) 변수와 인스턴스 변수 모두 참조 할 수 있다.
		 */
		
		
		public int method1() {
			return this.a + Count.b;  //클래스 변수는 클래스이름.클래스변수명 으로 접근해야 하니까.
		}
		
		
		
		
		
		 /*
		 	- static블록 (메서드, 정적 초기화자) 내부에서는
		 	
		 	static이 붙은 변수나 메서드만 사용 할 수 있다.
		 	
		 	this는 사용 할 수가 없다. > 나타 낼 주소값이 없기 때문 > 클래스 변수는 객체 생성 없이도 호출이 되기 때문
		 	
		 	만약에 static 블록 내부에서 static이 붙지 않은 인스턴스 변수나 인스턴스 메서드를 사용하려면 !!!!!!!!!!!!!!!!!!
		 	
		 	반드시 객체를 생성해서 주소값을 통해 참조해야 한다. !!!!!!!!!!!!!!!!!
		 */
		
		
		
		public static int method2() {
			//this.a를 쓰고 싶으면, Count ccc = new Count(); 라고 만들어야 한다 (멤버변수는 객체가 필요하니까.)
			//그럼 return ccc.a + Count.b; 가 되겠지.
			
			//여기에 this.a라면 안먹음, this가 존재 하지 않기 때문이다. 즉, static붙으면 this라는 키워드는 아예 X
			return Count.method2();   
		}
		
		
		
		
		
	
	
	
	
	
	
	
	
}
