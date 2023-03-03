package oop.constructor;

import java.util.Scanner;

public class Person {

	/*
	 * Scanner를 이용해서 사용자에게 이름, 나이, 키를 입력 받아서 해당 정보를 저장하는 객체를 디자인 해 보세요.
	 * 
	 * 객체 내에는 해당 사람의 정보를 모두 출력 해 주는 info() 메서드가 존재합니다.
	 * 
	 */

	String name;
	int age;
	int tall;
                                                      //내 코드는 그냥 더러운 코드임. 쌤 걸로 하는게 옳은듯.
	Person(String model) {
		System.out.println("이름, 나이, 키를 입력 하세요");
		Scanner sc = new Scanner(System.in);
		String personName = sc.next();
		int personAge = sc.nextInt();
		int persontall = sc.nextInt();

		name = personName;
		age = personAge;
		tall = persontall;

	}

	void Info() {
		System.out.println("회원 정보 입니다.");
		System.out.println("이름 : " + name );
		System.out.println("나이 : " + age + "살" );
		System.out.println("키 : " + tall + "cm" );
	}
}




//쌤 정답
//package oop.constructor;
//
//public class Person {
//
//	String name;
//	int age;
//	int height;
//	
//	Person() {}
//	
//	Person(String pName, int pAge, int pHeight) {
//		name = pName;
//		age = pAge;
//		height = pHeight;
//	}
//	
//	void info() {
//		System.out.println("*** 정보 ***");
//		System.out.println("이름: " + name);
//		System.out.println("나이: " + age + "세");
//		System.out.println("키: " + height + "cm");
//	}
//	
//}
