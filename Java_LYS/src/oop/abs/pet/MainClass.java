package oop.abs.pet;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		Pet dog = new Dog("초코", "푸들", 3); //부모타입의 자식 객체라는 다형성 적용
		Pet cat = new Cat("야옹이", "러시안 블루", 2);
		
		//이제 부모타입의 자식 객체라는 것을 생성했고 부모가 채워주지 못한 것을 자식쪽에서 구현 헀으니 객체에 접근해서 사용하는데 문제 없음
		
		dog.feed();
		dog.takeNap();
		cat.feed();
		cat.takeNap();
		
		 //출력 결과 :
		 /*
		 강아지는 사료를 와구와구 먹어요
		 강아지는 마당에서 낮잠을 자요
		 고양이는 생선을 냠냠 먹어요
		 고양이는 캣타워에서 자요
		 */
		
		
		
	}
}
