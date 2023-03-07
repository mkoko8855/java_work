package oop.poly.car;

public class Porsche extends Car {

	
	
	
	@Override
	void run() {
		//super.run();      //부모가물려주는 메서드는 필요 없으니 지워줄거다.
		System.out.println("포르쉐다 길비켜라.");
	}


	
	
	
}
