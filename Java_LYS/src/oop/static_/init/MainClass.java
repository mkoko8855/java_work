package oop.static_.init;

public class MainClass {

	public static void main(String[] args) {
		
		//DBManager manager = new DBManager();
		
		System.out.println("주소 : " + DBManager.addr);
		System.out.println("계정명 : " + DBManager.uid);
		System.out.println("비밀번호 : " + DBManager.uPw);
		
		//객체가 있을 때 출력 결과 :
		/*
		생성자가 호출됨!
		주소 : 192.168.0.1 : 8181 / XEPDB1
		계정명 : abc1234
		비밀번호 : aaa1111!
		*/
		
		
		
		
		
		//DBManager manager = new DBManager(); 는 static을 못받는다.
		//그래서 맨 위에 객체를 만들 필요가 없기 때문에 주석 처리 했다.
		//그래서 DBManager.addr,uid,uPw를 써줬다.
		 /*
		 	주소 : null
			계정명 : null
			비밀번호 : null
		 */
		
		
		
		
		
		
		
		//정적 초기화자를 호출하려면 클래스를 로딩하면 된다.
		//로딩 방법 1번 : 클래스의 이름을 참조하여 static 멤버를 호출한다. (우리는 DBManager.addr처럼 클래스 이름을 선언하는걸로 1번 방법으로 했다.)
		//로딩 방법 2번 : 객체를 생성한다.
		//그리고 정적 초기화자는 클래스 로딩 시 최초 1회만 호출이 된다. 다시 부를 수 없다.
		//만약 static멤버를 초기화 해야 할 상황이 생기면 미리 정적 초기화자를 쓴다.
		
		
		
		 /*
		    정적 초기화자가 호출됨!
			주소 : 192.168.0.1 : 8181 / XEPDB1
			계정명 : abc1234
			비밀번호 : aaa1111!
		 */
		
		
	}
}
