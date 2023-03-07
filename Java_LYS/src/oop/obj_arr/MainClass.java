package oop.obj_arr;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		
		//이런 식으로 객체를 생성할 일이 많다면 이렇게 하는 것은 불편하다, 3개니까 이렇게 한거지..
//		Person kim = new Person("김길동", 32, "남자");
//		Person lee = new Person("이영희", 25, "여자");
//		Person park = new Person("박철수", 50, "남자");
//		
		
		
		
		
//일단 Person클래스가서 메서드 하나 만들고 출력 해보자.
		
//		kim.personInfo();
//		lee.personInfo();
//		park.personInfo();
		
		


		//이렇게 하는 것이 불편하다는 것이다. 변수도, personInfo도 일일이 불러줘야 하기 때문에..반복으로도 처리하기엔 제어변수가 없다.
		
		
		
		
		
		//그래서 배열에 넣어서 편하게 하자.
		//일단 위에 있는 것들을 다 주석 처리를 하자.
		
		
		
		
		//배열 기억나니?
//		int[] arr = new int[5]; 			값이 미리 준비가 되어 있지 않다면 쓰는 배열 방법
//		int[] arr = {1, 2, 3, 4, 5};  		값이 미리 준비가 되어 있다면 쓰는 배열 방법
		
		
		
		
		//이제 객체 타입의 배열을 써보자.
//		Person[] people = new Person[3];
		
		
		//객체 타입 배열을 선언 했으니 값을 넣어 보자
//		people[0] = new Person("김철수", 32, "남자");
		
		
		//근데 위에건 불편하니 값을 편하게 넣어 보자
		Person[] people = { //people은 Person타입이다.
				new Person("김길동", 32, "남자"),
				new Person("이영희", 25, "여자"),
				new Person("박철수", 50, "남자"),
		};
		
		//하지만 지금 이 상태는 배열 안에 주소만 들어가 있다. 피플의 주소를 통해 배열로 들어가고, 배열 내부에 주소가 들어가 있다. 
		//그래서 이 주소를 다시 한번 참조하여 객체로 찾아가서 객체 안에 있는 멤버변수와 메서드를 사용해야 한다는것이다.
		//System.out.println(Arrays.toString(people)); 실제로 주소값만 잔뜩 출력이 되는 것을 볼 수 있다.
		//이 주소를 참조해서 객체로 찾아가서 객체 안에 있는 멤버변수와 메서드를 사용해야 한다는것이다.
		
		//피플을 이용해서 배열로 접근해보자. 그 이후 .으로 참조하여 객체에 접근한 다음 객체 내부에 있는 personInfo 를 호출하면 첫번째 객체의 personInfo를 호출한다.
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo();  //인덱스는 3지만 변수길이가 2이니 2까지겠지. 
		
		
		
		
		//근데 배열의 길이가 3이 아니라 10정도만 되도 코드를 여러번 작성해야 하잖아. 이 때 반복문을 사용한다.
//		for(int i=0; i<people.length; i++) {
//			people[i].personInfo(); //people의 인덱스의 주소를 참조해서 personInfo를 부르자. i가 올라가면서 personInfo를 호출한다.
//		}
		
		
		//향상된 for문 써도 된다.
		for(Person p : people) {   //오른쪽의 people은 Person배열이다. 즉, 참조 타입은 Person타입이다. 
								   //이제 배열 내에 있는 주소값들은 p로 전달된다. 그럼 우리는 이 주소를 통해 객체에 접근하자.
			p.personInfo();        // > 주소를 통해 객체에 접근.
		}
	}
}
