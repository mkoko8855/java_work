package oop.constructor;

public class PersonMain {

	public static void main(String[] args) {
		
		
		 /*
		 	Scanner를 이용해서 사용자에게
		 	이름, 나이, 키를 입력 받아서
		 	해당 정보를 저장하는 객체를 디자인 해 보세요.
		 	
		 	객체 내에는 해당 사람의 정보를 모두 출력 해 주는
		 	info() 메서드가 존재합니다.
		 
		 */
														//내 코드는 그냥 더러운 코드임. 쌤 걸로 하는게 옳은듯.
		Person basic = new Person("회원 정보");            //이 매개변수 말이 안됨. 출력은 정상이지만 더러운 코드임. 절대X
		basic.Info();
		
	}
}


//쌤 정답
//package oop.constructor;
//
//import java.util.Scanner;
//
//public class PersonMain {
//
//	public static void main(String[] args) {
//		
//		/*
//		 Scanner를 이용해서 사용자에게
//		 이름, 나이, 키를 입력받아서 
//		 해당 정보를 저장하는 객체를 디자인 해 보세요.
//		 객체 내에는 해당 사람의 정보를 모두 출력 해 주는
//		 info() 메서드가 존재합니다.
//		 */
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름: ");
//		String name = sc.next();
//		
//		System.out.print("나이: ");
//		int age = sc.nextInt();
//		
//		System.out.print("키: ");
//		int height = sc.nextInt();
//		
//		Person p = new Person(name, age, height);
//		p.info();
//		sc.close();
//	}
//
//}
















