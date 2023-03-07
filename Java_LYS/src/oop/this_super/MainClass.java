package oop.this_super;

public class MainClass {

	public static void main(String[] args) {
		
		
		Player p1 = new Player();
		
		p1.name = "전사1";  //얘는 네임을 받지 않기 때문에 적어줘야함
		System.out.println("p1의 주소값 : " + p1);
		p1.characterInfo();
		
		
		
		
		System.out.println("--------------------------------------------");
		
		
		
		
		
		Player p2 = new Player("전사2");
		//얘는 네임을 받기 때문에 알아서 전달 됨, 하지만 출력 결과가    아이디 : NULL이다.    왜?  Player클래스의 name=name 이 문제다. 그래서 this를 붙여준다.
		System.out.println("p2의 주소값 : " + p2);
		p2.characterInfo();
		
		
		
		
		
		
		
		System.out.println("--------------------------------------------");
		
		
		
		
		
		
		Player p3 = new Player("전사3", 200);
		p3.characterInfo();
		//출력 결과 : 
		//Player의 기본 생성자 호출!
		//Player의 2번 생성자 호출
		//Player의 3번 생성자 호출!
		//*** 캐릭터의 정보 ***
		//# 아이디 : 전사3
		//# 레벨 : 1
		//# 공격력 : 3
		//# 체력 : 200
		
		
		
		
		
		System.out.println("--------------------------------------------");

		
		
		
		
		
		
		//전사3이 전사2를 때리고싶다
		p3.attack(p2);  //p3는 this고 p2는 target이다.
		//출력 결과 : 
		//target : oop.this_super.Player@5e91993f   (타겟으로 전달된 p2가 출력됨)
		//this : oop.this_super.Player@1c4af82c		(this의 대상인 p3가 출력됨)
		
		//출력 결과 :
		//나의 체력 : 205, 상대방 체력 : 40
		
		p1.attack(p2);
		//출력 결과 :
		//전사1가 전사2를 공격합니다.
		//나의 체력 : 55, 상대방 체력 : 30

		p2.attack(p2);
		//출력 결과 : 스스로는 때릴 수 없습니다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("-----------------------------------------------------------");
		
		
		Warrior w1 = new Warrior("전사짱짱맨");
		w1.characterInfo();
		//출력 결과 : 
		//Player의 기본 생성자 호출!   < 자식 객체인데 왜 부모생성자가..? 상속은 생성자 상속은 하지 않을텐데..
		//*** 캐릭터의 정보 ***
		//# 아이디 : null
		//# 레벨 : 1
		//# 공격력 : 3
		//# 체력 : 50
		//분노 : 0

		
		
		
		//전사짱짱맨을 넣은 후 출력 결과
		//Player의 기본 생성자 호출!    super를 타고 this를 탔으니 제일 기본 생성자인 Player() 값이 나오니, 기본 생성자가 제일 먼저 호출한다.
		//Player의 2번 생성자 호출      그 다음, 기본 생성자는 끝났으니 2번 생성자가 호출된다.
		//*** 캐릭터의 정보 ***		   그 다음, Player(String name)의 생성자에서 맨 마지막 tihs.name=name을 불러서 전사짱짱맨이 출력이 된다.
		//# 아이디 : 전사짱짱맨
		//# 레벨 : 1
		//# 공격력 : 3
		//# 체력 : 50
		//분노 : 60
		System.out.println("-----------------------------------------");
		
		
		
		Mage m1 = new Mage("대마법사");
		m1.characterInfo();
		
		
		
		
		System.out.println("-----------------------------------------");

		
		
		
		Hunter h1 = new Hunter("사냥꾼");
		h1.characterInfo();
		
		
		
		w1.attack(m1);    // 다형성 적용한 부분
		m1.attack(h1);    // 다형성 적용한 부분
		
	}
}
