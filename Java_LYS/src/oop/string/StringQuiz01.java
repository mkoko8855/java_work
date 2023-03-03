package oop.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		
		/*
		  	1. 스캐너를 통해 id를 입력 받는다.
		  	2. 말썽꾸러기 사용자는 id에 공백을 입력할 확률이 굉장히 높다.
		  	3. 공백을 제거하시고 공백을 제거한 아이디가 5글자 미만이라면 다시 입력 받습니다.
		  	4. 5글자 이상 제대로 잘 입력이 되었다면 "id가 등록되었습니다." 출력 후
		  	종료하세요.
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디를 입력 하세요");
			String id = sc.nextLine().trim();
			id = id.trim();
			//중간 공백은 replace로 없애면 된다.
			id = id.replace(" ", "");
			if(id.length() < 5) {
				System.out.println("id는 5글자 이상 입력하세요");
			} else {
				System.out.println("id가 등록 되었습니다.");
				break;
			}
		} 
	}
}
//String name = "					홍길동						";
//System.out.println(name + " 님 안녕하세요!");
//출력 결과 : 					홍길동						 님 안녕하세요!
//System.out.println(name.trim() + " 님 안녕하세요!");




