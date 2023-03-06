package oop.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
		my.year = 1992;
		my.month = 10;
		my.day = 13;
		my.birthInfo();
		//출력 결과 : 내 생일은 1992년 10월 13일 입니다.
	}
}
