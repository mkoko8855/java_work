package oop.constructor;

public class PhoneMain {

	public static void main(String[] args) {
		
		
		Phone basic = new Phone();   
		
		//basic.model = "폴더폰";
		//basic.color = "회색";
		//basic.price = 200000;  	  10~13번째 줄은 객체를 일일이 값을 넣어줬다.  이제 편하게 생성자를 호출하자. 
		//basic.showSpec();											    근데 이미 new phone(); 이라는 객체를 만들었는데
		//    														    이게 바로 생성자까지 호출 한 것이었다. 따로 생성자를 안해도 된다!
		basic.showSpec();                                            // 생성자 호출을 했으니 결과를 출력해보자! basic.showSpec();
		//출력 결과 :
		//*** 핸드폰의 정보를 출력해줍니다. ***
		//모델명 : 폴더폰
		//색상 : 회색
		//가격 : 200000원
		
		
		Phone basic3 = new Phone();   //객체를 계속 만들어도 이제 편하게 세팅할 수 있다.
		basic3.showSpec();			  
		
		
		
		
		
		
		
		
		
		//갤럭시를 만들어 달라는 요청이 왔다면?
		Phone galaxy23 = new Phone("갤럭시 23");   //Phone클래스에서 오버로딩을 해줬다. 그래서 여기서 문자열을 받아줘야 하니 매개변수 자리에 "갤럭시23"을 적어줬다.
		galaxy23.showSpec();
		//출력 결과 :
		//*** 핸드폰의 정보를 출력해줍니다. ***
		//모델명 : 폴더폰
		//색상 : 회식
		//가격 : 200000원
		
		//문제가 생겼다. 모델명도 색상도 가격도 그대로다.
		//어떤식으로 바꿔야 할까..?
		//중복해서 바꿀 수 있다. 생성자는 여러 개 존재할 수 있다. 생김새만 다르게 해서. 그것이 오버로딩!
		
		//출력 결과 :
		//모델명 : 갤럭시 23
		//색상 : 화이트
		//가격 : 1000000원
		
		
		
		
		
		
		//다음 손님이 아이폰을 만들어 달래요
		//Phone iPhone14 = new Phone("아이폰 14");
		Phone iPhone14 = new Phone("아이폰 14", "스페이스 그레이");
		//iPhone14.color="스페이스 그레이"
		iPhone14.showSpec();
		//출력 결과 :
		//모델명 : 아이폰 14
		//색상 : 화이트
		//가격 : 1000000원
		
		//근데 색깔 바꾸고 싶다네..iPhone14.color="스페이스 그레이"; 라고 하면 계속 다음, 다다음 사람들은 일일이 바꿔줄꺼야?
		//출력 결과 :
		//*** 핸드폰의 정보를 출력해줍니다. ***
		//모델명 : 아이폰 14
		//색상 : 울트라그레이
		//가격 : 1200000원
		
	}
}
