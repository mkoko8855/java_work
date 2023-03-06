package oop.encap.bad;

public class MyBirth {

	
	int year;
	int month;
	int day;
	
	void birthInfo() {
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n", year, month, day);   //year,month,day 앞에 this는 생략되어 있다. "그" 객체를 뜻하니까.
	}
}
