package oop.inherit.good;

public class Player {

	
	 /*
	 	# 얘가 바로 즉, Player 클래스가 바로 부모 클래스, 상위 클래스(Parent, super class) 라고 한다.
	 	
	  - 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부른다.
	  
	  - 상속을 사용하면 데이터를 물려받는 클래스에게 부모 클래스의 멤버변수(필드) 와 메서드가 상속이 된다.
	  
	  - 단 ,생성자는 상속이 되지 않는다.
	  
	 */
	
	
	String name;
	int level;
	int atk;
	int hp;
	
	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디 : " + name);
		System.out.println("# 레벨 : " + level);
		System.out.println("# 공격력 : " + atk);
		System.out.println("# 체력 : " + hp);
	}
}