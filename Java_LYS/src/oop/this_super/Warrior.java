package oop.this_super;

public class Warrior extends Player {

	int rage;

	
	Warrior(String name){
//		super(); //이건 상속개념에서 생성자가 자동 생성 되듯이, super(); 로 자동 생성 된다. 즉, 부모의 생성자 호출은 자연스럽게 됨.
				 //즉, 모든 생성자에는 super()가 내장되어 있다. 자식 객체가 생성 될 때는 부모의 객체도 생성이 되어야 부모의 속성과 기능이 실존하게 되고, 물려 줄 수 있기 때문이다.
				 //즉, 부모 생성자를 호출 한 셈이니 Player의 멤버변수와 메서드를 가져오는 것이다.
		super(name);
		//this.name = name; 얘 쓰지 말고 super() 에 넣자.
		this.rage = 60;
	}
	
	//결과
	//Player의 기본 생성자 호출!
	//*** 캐릭터의 정보 ***
	//# 아이디 : null
	//# 레벨 : 1
	//# 공격력 : 3
	//# 체력 : 50
	//분노 : 0
	
	//그러나, super(); 아래에 this.name이랑 this.rage를 넣어줬으니
	
	//결과
	//Player의 기본 생성자 호출!
	//*** 캐릭터의 정보 ***
	//# 아이디 : null
	//# 레벨 : 1
	//# 공격력 : 3
	//# 체력 : 50
	//분노 : 60
	
	
	
	
	@Override

	void characterInfo() {
		super.characterInfo();
		System.out.println("분노 : " + rage);
	}
}
