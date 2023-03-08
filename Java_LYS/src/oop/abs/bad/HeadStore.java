package oop.abs.bad;

//쥬스 프렌차이즈 본사
public class HeadStore {

	                            // 추  상  (abstract)
	
	
	
	//상속을 받는 클래스들에게 오버라이딩을 권유 (강제성은 없음), 
	//헤드스토어를 상속받아서 장사를 하려는 가맹점들에게 메뉴이름만 정해주고 싶을 뿐..니네 가게에서 알아서팔아라 라고 권유중.
	public void orderApple() {
		System.out.println("0원 입니다. 가게에서 알아서 가격을 정해주세요");
	}
	
	public void orderBanana() {
		System.out.println("0원 입니다. 가게에서 알아서 가격을 정해주세요");
	}
	
	public void orderGrape() {
		System.out.println("0원 입니다. 가게에서 알아서 가격을 정해주세요");
	}
	
	
	
	
	
	
	
	
	
}
