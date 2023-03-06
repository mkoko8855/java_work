package oop.encap.good;

public class MyBirth {

	 /*
	 	# 캡슐화(은닉) : 데이터 보호의 목적으로 사용하는 OOP(객체지향프로그래밍) 기술 중 하나.
	 	
	 	- 외부에서 직접 변수에 접근 할 수 없도록 멤버변수에 private 제한을 붙임.
	 */
	
	
	private int year;
	private int month;
	private int day;
	
	
	
	 /*
	 	- 캡슐화는 데이터에 접근 제한을 걸어서 정보를 보호하는 것이 목적 이지만
	 	  private으로 설정하면 데이터 접근 자체가 불가능해진다.
	 	  
	 	- 따라서 데이터의 유효성을 검증 할 수 있는 제어문이 포함 된 메서드를 사용하여 데이터의 접근을 허용하도록 설계하는데,
	 	  이 때 사용하는 메서드를 getter / setter 메서드라고 부른다. (문지기)
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  
	 	  # setter method
	 	  
	 	  1. 세터는 숨겨진 변수에 값을 저장하기 위한 메서드 이다.
	 	  
	 	  2. 메서드 내부에 데이터 유효성 검증 로직을 작성하여 
	 	  	 적절한 데이터만 멤버변수에 저장시키고, 접근제한자는 public으로 설정하여 외부에서 누구나 사용할 수 있게 한다.
	 	  
	 	  3. 메서드 이름은 일반적으로 set + 멤버변수이름 으로 설정한다. (이것이 관례이다)
	 	  
	 	
	 */
	
	
	
	
	
	
	
	//year라는 멤버변수에 값을 저장하고 싶으면 직접 접근하지 말고 setYear을 통해서 값 전달을 하자, 정확하면 넣고 아니면 안넣으면 되는 것이다.
	public void setYear(int year) {
		
		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 연도 입력입니다.");
		} else {
			this.year = year;
		}
		
	}
	
	
	
	
	
	
	
	/*
    - month와 day의 setter / getter 메서드를 선언하세요.
    - month: 1 ~ 12
    - day: 1 ~ 31
    - getter 메서드는 따로 비밀번호 등 권한 검사 없이
     바로 return 속성값 해 주세요.
    */
	
	public void setMonth(int month) {
		if(month>12 || month<1) {
			System.out.println("잘못");
		} else {
			this.month = month;
		}
	}
	
	
	public int getMonth() {
		return this.month;
	}
	
	
	
	public void setDay(int day) {
		if(day>31 || day <1) {
			System.out.println("잘못");
		} else {
			this.day = day;
		}
	}
	
	
	public int getDay() {
		return this.day;
	}
	
	
	
	
	
	
	
	
	
	/*
	 	#getter method
	 	
	 	1. 게터는 숨겨진 변수의 값을 참조할 때 사용하는 메서드 이다.
	 	
	 	2. 세터와 마찬가지로 public으로 제한을 주고, 이걸 통해 외부에 메서드를 공개하고,
	 	   이름은 일반적으로 get + 멤버변수이름 으로 지정한다. (관례) 
	 */
	
	
	
	public int getYear(String pw) {  //안정장치 = 비밀번호
		if(pw.equals("abc1234")) {
			return this.year;                       		//사실 이거 다 제끼고 return this.year; 만 써도 됨;; 어차피 세팅 잘못하면 0이 나오기 때문이다.
		} else {
			System.out.println("비번 틀렸어요");
			return 0;
		}
	}
}
