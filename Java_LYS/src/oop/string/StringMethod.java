package oop.string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		String str = "Hello java";
		//이 문자의 길이는 10이다. 공백포함이니.
		

		
		
		
		//첫번째 메서드    charAt(index값)  :  문자열 인덱스에 따른 단일 문자 준다.(반환한다).
		char c = str.charAt(4);
		System.out.println("4번 인덱스에 뭐가 있느냐?" + c);
		//출력 결과 : o              
		
		
		
		
		
		
		//두번째 메서드    substring(begin, end인덱스주면됨)   :   문자열을 범위 지정하여 추출해주는 메서드다.
		String substring1 = str.substring(1, 5);  //1번이상 5번미만
		System.out.println("substring1 : " + substring1);
		//출력 결과 : ello
		
		
		
		
		
		//두번째의 비슷한 것
		String substring2 = str.substring(6);     //6번부터 끝까지 추출
		System.out.println("substring2 : " + substring2);
		//출력 결과 : java
		
		
		
		
		
		
		//세번째 메서드  length() : 문자열의 총 길이 반환
		int len =  str.length();
		System.out.println("len : " + len);
		//출력 결과 : len : 10
		
		
		
		
		
		//네번째 메서드   indexOf(str) : 해당 문자가 있는 인덱스를 반환. 해당 문자가 존재하지 않으면 -1을 리턴, 그리고 복수 개(Hello의 l같이) 면 먼저 발견된 인덱스 값을 찾아준다.
		int idx1 = str.indexOf("l");  //리턴타입은 int겠지. int써주자. 
		System.out.println("idx1 : " + idx1);
		//출력 결과 : idx1 : 2
		
		
		
		
		
		
		//네번째의 비슷한 것
		int idx2 = str.lastIndexOf("l");   //indexOf는 앞에서부터, 이거는 뒤에서부터 찾기 시작해서 먼저 발견되는걸 출력 해준다.
		System.out.println("idx2 : " + idx2);
		//출력 결과 : idx2 : 3
		
		
		
		
		
		//네번째의 비슷한 것2
		int idx3 = str.indexOf("java");    //단일문자만 아니라 문자열도 가능함
		System.out.println("idx3 : " + idx3);
		//출력 결과 : idx3 : 6                //문자열은 6번인덱스부터 시작하는 문자로 알려준다, Hello Java의 Java는 6번째부터 시작하니.
		
		
		
		
		
		//일괄 대.소문자 변경
		String str2 = "HeLLO WoRLd";
		String lower = str2.toLowerCase();   //일괄 소문자 변경
		System.out.println("lower의 값은 : " + lower);
		//출력 결과 : lower이 값은 : hello world
		
		
		
		
		
		
		//일괄 대.소문자 변경2
		String upper = str2.toUpperCase();
		System.out.println("upper의 값은 : " + upper);
		//upper의 값은 : HELLO WORLD
		
		
		
		
		
		
		//trim() : 문자열의 앞, 뒤 공백을 제거
		String name = "					홍길동						";
		System.out.println(name + " 님 안녕하세요!");
		//출력 결과 : 					홍길동						 님 안녕하세요!
		System.out.println(name.trim() + " 님 안녕하세요!");
		//출력 결과 : 홍길동 님 안녕하세요!
		
		
		
		
		
		
		//replace(old, new)
		//replace는 기존 문자열 내부의 old값을 모두 찾아서 new 문자열로 일괄 변경해주는 메서드이다.
		String java = "자바는 재밌습니다. 자바 커피는 맛있습니다.";
		System.out.println(java.replace("자바", "Java"));
		//출력 결과 : Java는 재미 없습니다. 커피는 맛있습니다.
		
		
		
		
		
		
		
		//replace는 바꿔주는 것 뿐 아니라 다 지울 수도 있다.
		System.out.println(java.replace("습니",  ""));
		//출력 결과 : 자바는 재밌다. 자바 커피는 맛있다.
		
		
		
		
		
		
		
		//split는 문자열을 구분자로 구분해서 분할한다.
		//분할된 문자들은 String 배열에 담아서 리턴해준다.
		String phone = "010-1234-5678";
		//하나의 문자열이 아니라 010따로 1234따로 5678따로 얻고 싶다면?
		//서브스트링 메서드로 부분추출할 수 있지만 귀찮잖아.
		//하이푼을 기준으로 나누어서 받으면 괜찮겠지.
		String[] numbers = phone.split("-");  //괄호 안에는 뭘 제외할건지
		System.out.println(Arrays.toString(numbers));
		//출력 결과 : [010, 1234, 5678]
		//또 해보자
		String pet = "멍멍이, 야옹이, 짹짹이";
		String[] pets = pet.split(", ");
		System.out.println(Arrays.toString(pets));
		//출력 결과 : [멍멍이, 야옹이, 짹짹이]
		
		
		
		
		
		
		
		
		//문자열의 정수와 실수 변환
		String s1 = "100";
		String s2 = "3.14";
		//100과 3.14는 더하면 결과가 103.14가 나오지 않는다.
		//그렇다면, 먼저 100을 실수로 변환하자
		int i = Integer.parseInt(s1);  				//데이터타입이 인트이다. 얘는 문자열을 정수로.
		//그러면 더블을 변환하려면?
		double d = Double.parseDouble(s2);          //얘는 문자열을 실수로.
		System.out.println(i + d);
		//출력 결과 : 103.14
		
		
		
		
		
		//반대로 정수를 문자열로, 실수를 문자열로 바꿀 수 있다.
		//valueOf : 기본 타입을 문자열로 변경
		System.out.println(3+4);
		//그러나
		System.out.println(String.valueOf(3) + String.valueOf(4));
		//출력 결과 : 34
		
		
		
	}
}
