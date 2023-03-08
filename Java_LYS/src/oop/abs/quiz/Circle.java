package oop.abs.quiz;

public class Circle extends Shape {


	double r;
	/*
    - Shape를 상속받는 Circle과 Rect 클래스를 생성해 주세요.
    
    - Circle 객체를 생성할 때, 반지름도 받아서 초기화 할 수 있는 생성자를 선언해 주세요.
      Rect 객체를 생성할 때, 이름과 변의 길이를 받도록 처리해 주세요.
     
    - 오버라이딩이 강제되는 메서드에는 각 도형의 넓이를 구하는
      로직을 알아서 작성해 주세요.
     
    - MainClass에서 길이가 5인 정사각형,
      반지름이 4인 원의 모든 내용을 호출해 보세요.
    */
	
	
	public Circle(String name, double r) {
		super(name);
		this.r = r;
	}

	@Override
	public double getArea() {
		return r*r*3.14;
	}
}
