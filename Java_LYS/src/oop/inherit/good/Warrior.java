package oop.inherit.good;

/*
 
 # 이 워리어 클래스는 자식 클래스, 하위 클래스 (child, Sub class)라고 한다.
 
 - 부모 클래스로부터 멤버변수(필드)와 메서드를 물려 받는 클래스를
   자식 클래스 라고 한다.
   
 - 상속을 적용 시키려면 자식 클래스 선언부에 클래스 이름을 뒤에 키워드인 extends를 쓰고 물려 받을 부모 클래스의 이름을 적는다.
 
 
 */

public class Warrior extends Player {

	int rage;
	
	void characterInfo() {
								//부모가 물려준 클래스를 나에게 맞게 재정의 한다 라는 것이 바로 메서드 오버라이딩 이다.
		super.characterInfo();  //오버라이딩 부분 > 부모의 캐릭터인포를 먼저 부르고 출력 하겠다 하고 메인클래스가서 출력 결과를 확인하면 분노까지 출력이 된다.
		System.out.println("분노 : " + rage);
	}
}
