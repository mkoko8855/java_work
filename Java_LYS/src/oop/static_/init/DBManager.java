package oop.static_.init;

public class DBManager {

	
	public static String addr;
	public static String uid;
	public static String uPw;
	
	
	
	//정적(클래스) 변수를 자동으로 초기화하려면 정적 초기화자가 필요하다.
	static {       //정적초기화자
		System.out.println("정적 초기화자가 호출됨!");
		addr = "192.168.0.1 : 8181 / XEPDB1";
		uid = "abc1234";
		uPw = "aaa1111!";
	}
	//정적 초기화자를 쓰면 아래 생성자는 호출이 안됨.
	
	public DBManager() {
		System.out.println("생성자가 호출됨!");
		addr = "192.168.0.1 : 8181 / XEPDB1";
		uid = "abc1234";
		uPw = "aaa1111!";
	}
	
	
	
	
	
	
	
	
	
}
