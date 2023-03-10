package etc.api.lang.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Person park = new Person("박영희", 25);
		Person hong = new Person("홍길동", 24);
//		park.personInfo();
//		hong.personInfo();
		
		
		
		//객체 타입의 변수를 출력하거나 값을 얻을 때에는 뒤에 자동으로 toString()이 붙어서 진행된다.
		System.out.println(park.toString()); //toString빼고 써도 주소값이 출력된다.
		System.out.println(hong.toString()); //toString빼고 써도 주소값이 출력된다.
		//출력 결과 :
		//etc.api.lang.obj.Person@6f2b958e
		//etc.api.lang.obj.Person@5e91993f
		
//		System.out.println(park.equals(hong)); 		//이건 park==hong과 같은 뜻이다. 굳이 저렇게 안쓰고 ==써도 되잖아?
													//이거 대신에 우리 클래스에 맞게 변경을 해보자
		
		
		
		//펄슨클래스에서 클래스에 맞게 변경을 헀으니 확인한번 해보자(instance of 사용한 부분)
		if(hong.equals(park)) {
			System.out.println("이름이 같습니다.");
		} else {
			System.out.println("이름이 다릅니다.");
		} //맨위 객체 선언한 부분에 홍길동 홍길동을 적으면 이름이 같다고 출력 결과가 나온다.
		
		  //출력 결과 : 이름이 다릅니다.
		
		
		
		
		
		
		
		
		
		
		
		
		//finalize()는 이제 자바가 업글된 버전이 나오면 없어질 수 있다. 도태된 언어이다. 사용하는 것을 권장하지는 않는다.
		//또한 gc가 호출되는 순서가 보장 되지 않기 때문에 사용하는 것을 권장하지는 않는다.
//		hong = null;
//		park = null;
//		System.gc(); //가비지 컬렉터를 호출하는 메서드. (부른다고 바로 안올 수도 있음;;)
		//출력 결과 :
		//홍길동이 소멸되었습니다.
		//박영희이 소멸되었습니다.
		
		
		
		
		
		
		

		
		
		
		//클론 메서드 확인하러 왔다
		Person kim = new Person("김복제인간", 100);
		//새로운 변수에 때려박자
		try {
			Person clonePerson = (Person) kim.clone();//리턴이 오브젝트니, 펄슨 타입으로 형변환해주자. 근데 했는데도 문제가 생긴다.
													  //트라이캐치문까지 부르자
			System.out.println("복사된 객체 정보 : " + clonePerson);
			System.out.println("kim의 주소 : " + kim.hashCode());
			System.out.println("복제된 객체 주소 : clonePerson.hashCode()");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
//		출력 결과 :
//		복사된 객체 정보 : Person [name=김복제인간, age=100]
//		kim의 주소 : 1651191114
//		복제된 객체 주소 : clonePerson.hashCode()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//객체의 정보를 위해 toString메서드를 오버라이딩해서 사용하자
		
//		@Override
//		public String toString() {
//			return "Person [name=" + name + ", age=" + age + "]";
//		} 				이걸 Person클래스에 작성해주고 메인와서 실행시켜보면 아래와 같은 출력 결과가 나온다.
		
		
		
//		출력 결과 :
//		Person [name=박영희, age=25]
//		Person [name=홍길동, age=24]
		
		
		
		//그럼 
//		park.personInfo();
//		hong.personInfo();
		//이런건 이제 안써도 된다.
		
		
		
	}
}
