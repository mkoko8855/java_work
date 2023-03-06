package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		
		MyBirth my = new MyBirth();
		
		//		my.year = 200051;   //객체 생성은 문제가 없지만 같은 패키지에 존재 함에도 불구하고 클래스가 달라지자 마자 접근이 안됨. (private)
		
		//		my.year = 1992;     //문제는 제대로 정상인 값도 안들어감.
		
		
		
		
		
		
		
		//이제 클래스가 다르면 직접 접근하는 방법이 없다. 이제는 문지기를 한명 세운다. 문지기를 통해 검사를 받고 값을 집어 넣도록 하자. 세터 사용.
		my.setYear(1992);
		
		
		
		
		
		//게터 사용
		System.out.printf("내 생일은 %d년 입니다.\n", my.getYear("abc1234"));
		
		
		
		
		
		
		
		
		
		System.out.println("-------------------------------");
		
		
		
		
		
		
		
		
		my.setMonth(10);
		my.setDay(31);
		System.out.printf("내 생일은 %d년 %d월 %d일\n", my.getYear("abc1234"), my.getMonth(), my.getDay());
		
	}
}
