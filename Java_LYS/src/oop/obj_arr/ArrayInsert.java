package oop.obj_arr;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		/*
		 * - 스캐너를 이용하여 Person객체를 생성하는 데 필요한 정보를 입력받으시면 되겠습니다. 입력받은 정보를 토대로 Person객체를 생성한
		 * 후 여러 개의 Person 객체를 배열에다 담아 둘 생각입니다.
		 * 
		 * - 배열의 크기는 3개로 하겠습니다. 반복문을 이용하여 입력을 반복해서 받아주시면 됩니다.
		 * 
		 * - 입력이 끝나면 배열 안에 있는 모든 주소값을 순회하여 각 객체의 personInfo()를 호출해 보세요.
		 */

		// 이름, 나이, 성별을 입력받고.
		// 펄슨 객체를 하나 생성 후,
		// 생성된 객체를 만들어놨던 펄슨 배열에 넣자.
		Scanner sc = new Scanner(System.in);

		Person[] people = new Person[3];

		for (int i = 0; i < people.length; i++) {
			System.out.println("이름을 입력 하세요 : ");
			String name = sc.next();

			System.out.println("나이를 입력 하세요 : ");
			int age = sc.nextInt();

			System.out.println("성별을 입력 하세요 : ");
			String gender = sc.next();

//			Person p = new Person(name, age, gender); //이거써도됨.

//			Person p = new Person(); //이거써도됨
//			p.setName(name); //네임이 프라이빗이니까.
//			p.setAge(age); //근데 귀찮으니 매개변수 값으로 넣자.
//			p.setGender(gender); //ok?

			// 그 다음
			// people[i] = p; 이걸 써도 되지만
			people[i] = new Person(name, age, gender); // 이걸 쓰면 위에 객체를 지워줘야겠지. 주석 처리하자.

			System.out.println("★ 정보 입력 완료 ★");
		}
			
		for (Person p : people) {
			p.personInfo();
		}
	}
}
