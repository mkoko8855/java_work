package oop.final_.field;

public class Person {

	
	//final 변수는 불변의 값을 의미한다.
	//그렇기 때문에 반드시 초기화가 필요하다.
	//초기화 하는 방법은 직접 하는 방법과 생성자를 이용하는 방법이 있다.
	
	
	final String nation = "대한민국";   //final은 무조건 초기화 해줘야 한다. 그러나 생성자로도 초기화할 수 있긴 하다 (아래설명)
	final String name;
	int age;
	
	
	
	//객체가 생성하자마자 해야할 생성자를 이용하여 초기화를 하면 name도 바꾸면서 final붙일 수 있다.
	public Person(String name) {   //생성자 왈 : 너 생성자 뽑았으니 객체 생성할 때 name을 보내 달라 그래, 그래야 내가 final을 지정할 수 있으니까.
								   //즉, 위 변수선언 final String name; 부분에서 값을 안줬으니 여기서 String name을 줘야 한다.
		this.name = name;
		
	}
}
