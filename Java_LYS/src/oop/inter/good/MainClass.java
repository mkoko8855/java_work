package oop.inter.good;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		IUserService sv; //뭐때문에 인터페이스 변수를? > 다형성 적용을 위해 인터페이스 타입의 변수를 하나 미리 선언 했다.
						 //변수 sv에는 조인, 로그인, 업데이트, 삭제 다 들어올 수 있다. 
		
		System.out.println("진행 하실 번호를 입력하세요");
		System.out.println("1. 가입 2. 로그인 3. 수정 4. 삭제");
		System.out.println("> ");
		
		int menu = sc.nextInt();
		
		if(menu == 1) {
			sv = new Join();
			sv.execute();
		} else if(menu == 2) {
			sv = new Login();
			sv.execute();
		} else if(menu == 3) {
			sv = new Update();
			sv.execute();
		} else if(menu == 4) {
			sv = new Delete();
			sv.execute();
		}
		sc.close();
	}      
}
     