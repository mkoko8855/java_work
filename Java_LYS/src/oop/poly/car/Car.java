package oop.poly.car;

public class Car {

	
//	HTire frontLeft;  //한국타이어는 앞바퀴담당
//	HTire frontRight; //한국타이어는 앞바퀴담당
	
//	NTire rearLeft;   //넥센타이어는 뒷바퀴담당
//	NTire rearRight;  //넥센타이어는 뒷바퀴담당
	
	
	
	//Tire들이 Tire클래스를 상속 받게 했으니 전부 Tire로 통일 시키자.
	Tire frontLeft;
	Tire frontRight;
	Tire rearLeft;
	Tire rearRight;
	
	
	
	void run() {
		System.out.println("자동차가 달립니다~");
	}
}
