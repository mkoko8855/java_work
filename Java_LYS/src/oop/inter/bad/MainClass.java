package oop.inter.bad;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("진행 하실 번호를 입력하세요");
		System.out.println("1. 가입 2. 로그인 3. 수정 4. 삭제");
		System.out.println("> ");
		
		int menu = sc.nextInt();
		
		if(menu == 1) {
			Join j = new Join();
			j.join(); //메서드를 부르기 위해 객체를 만들었고 객체의 주소값은 j에, j라는 주소를 통해 객체에 접근한 후 객체 안 join을 부른 것이다.
		} else if(menu == 2) {
			Login log = new Login();
			log.login();  //로그인이라는 메서드를 호출 하겠다.
		} else if(menu == 3) {
			Update update = new Update();
			update.update();
		} else if(menu == 4) {
			Delete del = new Delete();
			del.delete();
		}
		sc.close();
	}
}
        //타입이 지금 다 다르다. 변수 이름도 다 다르다. 난 이게 싫어 어떻게해?
		//서로 동일한 동작을 하는 약속된 틀을 만들고 싶다.
		//다형성 까지 만들면 훨신 편하겠지 (부모타입객체만들면 자식은 다 들어올 수 있으니)


		//위 코드들은 인터페이스를 사용하지 않은 것이고 good패키지는 인터페이스를 쓸 것이다.