package etc.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		//그래서 클래스만들 때 타입을 고정 시킬 수 있다. 그 타입만 들어올 수 있도록. 제네릭을 통해 타입 안정화를 시켜줄 수 있다.
		
		//Object타입으로 선언하면 무엇이든 저장할 수는 있지만 반대로 저장했던 값을 꺼내올 때는 타입별로 일일히 형변환을 해야하는
		//문제가 발생한다. 잘못 형변환 했을 때는 예외가 발생할 수도 있다.
		
		
		
		
		Box box = new Box();
		
//		box.setObj("홍길동"); //오브젝트 객체 보내줘도 다 받아준다. 일단 스트링 객체를 저장 했다.
		box.setObj(new String("홍길동"));

		//박스 하나 더 만들자
		
		Box box2 = new Box();
//		box2.setObj("김철수");
		box2.setObj(new String("홍길동"));
		
		
		System.out.println(((String)box.getObj()).charAt(0));  //타입을 String으로 내려줘야 charAt 사용 가능. 왜? obj타입이라..
		//출력 결과 : 홍
		
		
		
		
		
		
		
		
		Box p = new Box();
		p.setObj(new Person());
		
//		Person p2 = p.getObj(); //obj객체에 펄슨을 담았는데 리턴을 p.getObj(부모타입)을 받으려니 안된다. 형변환이 필요하다.
		Person p2 = (Person) p.getObj();
		
		
		
		
		
		
		//그래서 good 클래스를 만들어서 제네릭을 만들어볼 것이다.

		
		
	}
}
