package oop.poly.player;

public class Player {

	
	
	String name;
	int level;
	int atk;
	int hp;
	
	
	
	
	Player(){
		System.out.println("Player의 기본 생성자 호출!");
		level = 1;
		atk = 3;
		hp = 50;
	}
	
	
	Player(String name){
		this(); 
		
		
		System.out.println("Player의 2번 생성자 호출");
		
		

		this.name = name;   
	}						
	
	
	
	
	Player(String name, int hp){
		this(name);  
				    
		
		System.out.println("Player의 3번 생성자 호출!");
		
		this.hp = hp;
	}
	
	
	
	
	
	
	void attack(Player target){  
		
		if(this == target) {  
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}
		
		
		
		
		
		System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name );
		
		
		
		
		target.hp -= 10;  
		this.hp += 5;
		System.out.printf("나의 체력 : %d, 상대방 체력 : %d\n", this.hp, target.hp);
	}
	
	
	
	
	
	
	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디 : " + name);
		System.out.println("# 레벨 : " + level);
		System.out.println("# 공격력 : " + atk);
		System.out.println("# 체력 : " + hp);
		//System.out.println("지금 이 메서드를 호출한 객체의 이름은 무엇이냐?" + this.name);       //여기서의 this는 이 메서드를 호출한 것에 값이 출력된다.
		//p2.characterInfo()로 했으면 p2에 해당되겠지.
	}																				
}
