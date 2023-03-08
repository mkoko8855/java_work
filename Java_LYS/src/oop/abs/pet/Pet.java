package oop.abs.pet;

//애완동물 들의 공통 클래스(부모) 가 될 것이다. 그러나 실체가 없는 추상적 개념으로 선언을 해 줄 것이다.

public abstract class Pet {

	
	//이번엔 은닉으로 구현해보자
	private String name;
	private String kind;
	private int age;
	
	
	
	//다음으로, 생성자 만들어 주자 알트쉬프트s > 제너레이트 컨스트럭터 유징 필드
	public Pet(String name, String kind, int age) {
		super();
		this.name = name;
		this.kind = kind;
		this.age = age;
	}

	
	//먹이를 먹는 기능인 메서드 선언해주자 > 반드시 오버라이딩(구체화) 해야한다.
	public abstract void feed();
	//추상 메서드가 존재하니, 이 클래스도 추상을 넣어주자
	
	//그리고 낮잠을 자는 기능 > 반드시 오버라이딩(구체화) 해야한다.
	public abstract void takeNap();
	
	
	//그 다음 동물 클래스를 만들어 주자.
	
	
	//프라이빗이니 게터 세터 구현해주자
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
}
