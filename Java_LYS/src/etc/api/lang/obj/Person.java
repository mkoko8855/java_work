package etc.api.lang.obj;

public class Person implements Cloneable {

	private String name;
	private int age;

	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	
	//toString오버라이딩
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}



	
	//equals오버라이딩
	@Override
	public boolean equals(Object obj) {
		//펄슨 객체의 name이 같은지 비교하자
		//obj의 타입을 펄슨 타입으로 내려줘야한다
		//그러나 이 행동을 하기 전에 obj으로 전달 된 객체가 펄슨타입으로 내릴 수 있는지 확인부터 해야 한다.
		//다형성이 적용된 변수에 확인을 하려면 intanceof를 사용해야 한다.
		if(obj instanceof Person) {   //그러나 펄슨타입을 가질 수 없으면, 즉,false면 그냥 false 주면 된다.
			Person p = (Person) obj;
			//이제 p로 접근하자
			if(this.name.equals(p.name)) {
				//여기서 트루면 트루를 리턴해주자
				return true;
			}
		}
		return false;  //그냥 false줬다.
	}
	

	
	
	
	//다음은 finalize() 에 대해 알아보자
	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동 호출 (gc가 실행될 때)
		System.out.println(this.name + "이 소멸되었습니다.");
	}
	
	
	
	
	
	
	
	//다음은 객체를 복사하는 메서드에 대해 알아보자
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();  // 클론을 쓰기위해선 펄슨 클래스에서 implements(인터페이스) cloneable을 써줘야 정상동작한다.
	}
	
	
	
	
	
	
	
	
	
	
	
	public void personInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");

	}
}
