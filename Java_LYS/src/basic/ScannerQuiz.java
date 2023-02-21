package basic;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("이름이뭘까?");
		String name = sc.nextLine();
		System.out.printf("이름 : %s", name);
		
		System.out.println();
		System.out.println("그럼 나이는?");
		int age = sc.nextInt();
		System.out.printf("나이 : %d세", age);
		
		sc.close();
		
		System.out.println();
		
		int birth = 2023-age;
		System.out.println("출생연도 : " + birth + "년");
		
		
		/*
		 System.out.print("이름 : ");
		String name = sc.next();
		System.out.println(name);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.close();
		
		int birth = 2023-age;
		System.out.println("출생년도: " + birth);
		 */
		
		
		
		/*
		 Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		sc.close();
		int birth = 2023-age;
		System.out.println("출생연도 :" + birth);
		 */
	}
}
