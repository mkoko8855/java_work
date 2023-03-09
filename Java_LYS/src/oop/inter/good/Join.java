package oop.inter.good;

public class Join implements IUserService {
//조인 클래스만들 때 인터페이시스에서 add 누르고 IUserService 찾으면 바로 implements가 써지고 오버라이딩까지 할 수 있다.
	
	
	@Override
	public void execute() {
		System.out.println("회원 가입 로직이 실행됩니다.");
		System.out.println("DB 접속도 하고 입력값도 가져오고 값을 집어넣고 등등..");
	}

}
