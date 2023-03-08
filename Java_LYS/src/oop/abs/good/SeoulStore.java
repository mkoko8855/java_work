package oop.abs.good;

public class SeoulStore extends HeadStore{
//전부 오버라이딩 안하면 위 SeoulStroe에 빨간 불 들어온다. 그래서 오버라이딩 해주자.
//자식 쪽에서 하나라도 빼먹으면 안된다. 자식 객체에는 생성자에는 super가 들어있잖아?
//부모의 실체를 만들고 자식이 물려 받고 개념을 확장하여 사용한다는 의미인데
//부모의 껍데기를 그 누구도 안쓰면 부모 객체가 완성이 안된다.
//그럼 당연히 자식한테도 상속이 문제가 되겠지. 그럼 객체가 생성 되지 않으면서 프로그램이 제대로 동작이 안된다.
	
	
	@Override
	public void orderApple() {
		System.out.println("사과쥬스의 가격은 3000원 이다.");
	}

	@Override
	public void orderBanana(){
		System.out.println("바나나쥬스의 가격은 3500원 이다.");
	}

	@Override
	public void orderGrape() {
		System.out.println("포도쥬스의 가격은 2500원 이다.");
	}

	
	//이제 메인클래스 만들어서 객체 생성해보자.
	
	
	
}
