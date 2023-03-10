package oop.inter.good;


 /*
 	회원 관리에대한 모든 로직을 같은 이름의 메서드를 이용해서
 	
 	일괄 처리하기 위해 인터페이스를 선언했다.
 	
 	또한, 객체를 생성할 때 인터페이스 타입 하나만으로 여러 가지 객체들을 상황에 맞게 교체할 수 있다는 장점도 생긴다.
 */




public interface IUserService {

	//인터페이스는 클래스네임에 I(대문자)를 붙여주는 것이 관례이다.
	
	
	void execute();   //추상 메서드 일단 선언.
	//이제 회원관리에 대한 모든 것은 인터페이스를 구현해서 생성되어야 한다.
	//조인 이라는 것을 생성할 건데, 아이유저서비스를 구현합니다 라고 작성했을 때 (조인말고도 다 만들거다)
	//조인에서는 execute라는 메서드를 무조건 오버라이딩 해야 한다.
	
	
	
}
