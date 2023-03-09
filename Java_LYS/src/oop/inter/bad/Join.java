package oop.inter.bad;

public class Join {

	//생성자 하나만 뽑자 컨스페이스엔터
	public Join() {
		System.out.println("회원 가입 요청이 들어옴!");
	}
	
	
	
	//조인객체에 메서드 선언 해보자
	public void join() {
		System.out.println("회원 가입 로직이 실행됩니다.");
		System.out.println("DB 접속도 하고 입력값도 가져오고 값을 집어넣고 등등..");
	}
}
