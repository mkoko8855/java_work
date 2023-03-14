package etc.generic.basic;

public class MainClass {

	public static void main(String[] args) {
		 /*
		 	제네릭이란?
		 	
		 	클래스 내부에서 타입을 지정하는 것이 아니라
		 	
		 	외부에서 객체를 생성할 때 타입이 지정될 수 있게 하는 문법이다.
		 	
		 	제네릭을 사용하면 객체로 생성할 때 사용할 타입을 지정할 수 있고
		 	
		 	따로 타입을 체크하고 변환할 필요가 없다. 즉, 관리가 용이하고 잘못된 타입이 들어올 수 있는 것을 방지 하기 때문에
		 	
		 	유지보수성, 코드의 재사용성도 좋다.
		 
		 */

		
		
		//객체 생성 해보자 (박스)
		
		Box<String> box = new Box<>();   //원래 뒤에 <>에도 String이라고 써줘야 되는데 자바7이후로 생성자타입은 생략이 가능해졌다. 변수타입쪽에만 제네릭 선언해주면 됨.
		
		box.setT("홍길동"); //Box클래스보면 우린 타입을 T라고 했지만, 메인메서드에 Box<String>box. 즉, String이라고 타입을 줬기 때문에 변경된 것이다.
		
		String name = box.getT(); 			//여기도 타입은 String이다. 즉, 제네릭은 형 변환이 따로 필요가 없다.
		
		
		
		
		//박스 하나 더 생성해보자
//		Box<Int> intBox = new Box<>(); 		//제네릭은 객체타입을 선언해야 하기에 int라는 기본데이터타입을 지정할 수 없다.
		Box<Integer> intBox = new Box<>();  //문제 없이 가능.
		
		
		//정수 넣어보자
		intBox.setT(2); //아깐 리턴타입이 스트링처럼 이번엔 인티져다.
		int num = intBox.getT(); //getT의 리턴타입도 인티져라는 것을 확인이 되었다.
		
		
		//펄슨도 마찬가지다.
		Box<Person> pBox = new Box<>();
		pBox.setT(new Person());
		Person p = pBox.getT();    //형변환 필요 없이 된다는 것이다. 리턴 타입이 펄슨. 즉, 내가 타입을 결정하고, 그 타입으로 멤버와 메서드의 타입이 결정 된다는 것이다.
		
		
		
		
		
		
		
	}
}
