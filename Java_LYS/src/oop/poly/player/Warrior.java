package oop.poly.player;

public class Warrior extends Player {

	int rage;

	
	Warrior(String name){

		super(name);
		
		this.rage = 60;
	}
	
	public void rush(Player p) {
		 /*
		    문 제 
		 	- 전사의 고유 기능인 돌진(rush) 메서드를 작성한다.
		 	
		 	- rush의 대상은 모든 직업들 이다.
		 	
		 	- 만약 rush의 대상이 전사라면 10의 피해를 받고,
		 	  마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받는다.
		 	  
		 	- 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 줘라.
		 	
		 	- 남은 체력도 출력 해 줘라.
		 	
		 	- main에서 객체를 생성한 후 호출 하셔서 잘 적용이 되는지 확인 해줘라.
		 */
		
		System.out.printf("%s님이 %s님에게 돌진을 시전 했습니다.\n", this.name, p.name);
		
		
		
		if(p instanceof Warrior) {
			p.hp -= 10;
			System.out.printf("%s(전사)님이 10의 피해를 입었습니다.\n", p.name);
		} else if(p instanceof Mage){
			p.hp -= 20;
			System.out.printf("%s(마법사)님이 20의 피해를 입었습니다.\n", p.name);
		} else if(p instanceof Hunter) {
			p.hp -= 15;
			System.out.printf("%s(사냥꾼)님이 15의 피해를 입었습니다.\n", p.name);
		}
		
		//이제 남은 체력 출력
		System.out.printf("%s님의 남은 체력 : %d\n", p.name, p.hp);
		System.out.println("-----------------------------------------");
		
	}
	
	@Override

	void characterInfo() {
		super.characterInfo();
		System.out.println("분노 : " + rage);
	}
}
