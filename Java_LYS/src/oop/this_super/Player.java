package oop.this_super;

public class Player {

	
	
	String name;
	int level;
	int atk;
	int hp;
	
	
	 /*
	 		# this
	 	
	 	- this 란? 자기 자신 객체를 가리키는 키워드 이다.
	 	
	 	- 생성자 또는 메서드 내에서 this를 사용하면 this는 
	 	
	 	- 그 생성자 또는 메서드를 호출한 객체의 주소값을 띄게 된다.
	 	
	 	- this()를 사용해서 같은 클래스 내의 다른 생성자를 호출 할 수도 있다.
	 	
	 	- 이 때는 매개변수의 선언에 따라 괄호 내에 적절한 값을 전달 하면 된다.
	 
	 */
	
	
	
	
	
	
	
	
	
	
	Player(){
		System.out.println("Player의 기본 생성자 호출!");
		//System.out.println("this의 주소 값 : " + this);
		level = 1;
		atk = 3;
		hp = 50;
	}
	
	
	Player(String name){
		this(); //이건 같은 클래스의 다른 생성자를 부르는 문법이다. 즉, 다른 생성자인 위의 기본생성자를 부를 수 있다. 메인클레스가서 실행 확인 해보자.
		//출력 : 결과
		//Player의 기본 생성자 호출!   < 출력문이 기본 생성자부터 출력된다.
		//Player의 2번 생성자 호출	  < 그 다음, 해당된 p2 출력됨.
		
		System.out.println("Player의 2번 생성자 호출");
		//System.out.println("this의 주소 값 : " + this);
		
//		level = 1;
//		atk = 3;       //this(); 확인하려고 잠깐 주석
//		hp = 50;
		this.name = name;   //매개변수를 pname이라고 하고 name=pname 으로 해도 된다. 그런데 항상 이렇게 쓰는건 이상하잖아. this붙이자.
							//누가 부르느냐에 따라 달라지는 것이 this이다.
	}						
	
	
	
	//생성자 하나 더뽑아보자
	Player(String name, int hp){
		this(name);  //이 문법은 반드시 생성자의 최상단의 위치해야 한다. 즉, 다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 한다.
				     //이 this(name)이 전사2가 나와야 하는게 아니라 전사3을 받는다고 메인 메서드에 적었고,
					 //Player(String name)의 값을 받되, Player(String name)이 객체는 또 this()로 인해 그 위의 기본 생성자로 간다.
					 //기본 생성자를 부르고, 그 아래 String name을 또 부르고, 그 생명주기가 끝나고 다시 String name, int hp값을 받는 것이다.
		
		System.out.println("Player의 3번 생성자 호출!");
		//this.name = name;   3번생성자가 받은 name값을 위로 써줘서 넘겨. 그럼 2번 생성자 name값은 3번 생성자 name 값이 들어간다.
		this.hp = hp;
	}
	
	
	
	
	
	
	void attack(Player target){
//		System.out.println("target : " + target);      메인에서의 출력 결과 : target : oop.this_super.Player@5e91993f
//		System.out.println("this : " + this);		   메인에서의 출력 결과 : this : oop.this_super.Player@1c4af82c
		
		if(this == target) {   //this==target은 자기가 자기를 때리는거잖아. 주소값이 같으니.
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}
		
		//출력 메세지를 이렇게 낼것이다.     x가 y를 공격하는 식의 로직을 짜봐라.
		System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name );
		//출력 결과 : 전사3가 전사2를 공격합니다.
		
		
		
		//상대방의 체력을 10 낮추고 나의 체력을 5 회복하고 싶다면?
		target.hp -= 10;  //target.hp - 10; 이라고 쓰지말고  -=10; 이라고 해주자.
		this.hp += 5;
		System.out.printf("나의 체력 : %d, 상대방 체력 : %d\n", this.hp, target.hp);
		//출력 결과 : 나의 체력 : 205, 상대방 체력 : 40
		
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
