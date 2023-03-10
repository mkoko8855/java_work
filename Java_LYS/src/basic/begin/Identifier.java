package basic.begin;

public class Identifier {

	public static void main(String[] args) {
		
		//꼭 지켜야 할 규칙 (안 지킬 시 에러 발생)
		//1. 식별자의 이름은 중복을 허용하지 않는다.
		//그리고 대, 소문자를 철저하게 구분해야 한다.
		int age = 35;
		int Age = 40;
		System.out.println(Age);    //가능
		System.out.println(age);	//가능
		//다 출력이 가능하기 때문에 대, 소문자를 철저하게 구분해야 한다.
		
		
		
		//2. 식별자의 이름은 숫자로 지정하거나 숫자로 시작하면 안된다.
		//int 700 = 365;    (X)
		//int 7number = 7;  (X)
		//int number7 = 7;  (O)
		
		
		
		//3. 식별자 이름에 공백을 포함할 수 없다.
		//int My Birth Day = 19921013;  (X)
		//int MyBirthDay = 19921013;    (O)      //camel case
		
		
		
		//4. 식별자 이름에 쓸 수 있는 특수문자는 밑줄(_), 달러기호($) 뿐이다.
		//하지만, 사용을 권장하지는 않는다.
		//저 특수문자들은 사용하기로 약속 한 곳이 지정되어 있다.
		//String $hello = "안녕"; 이라면, 가능하긴 하지만 웬만하면 특수문자는 사용(X)
		
		
		
		//5. 키워드(예약어)는 식별자 이름으로 사용이 불가능하다.
		//키워드는 이미 어떠한 기능을 내포하고 있는 지정 문자이다.
		//public, void 등 이런 키워드들을 변수 이름으로 사용할 수 없다는 것이다.
		//String class = "클래스";   (X)
		//String Class = "클래스"; 는 가능하지만
		//String className = "클래스"; 처럼 차라리 다른 뜻을 더 붙여서 사용하는게 좋다.
		
		
		
		//6. 한글이나 한자 같은 식별자 이름도 지정이 가능하다.
		//하지만 사용을 권장하지는 않는다.
		//int 숫자 = 10; 은 가능하다. 그리고
		//String 名 = "홍길동"; 도 가능하지만
		//사용 권장 안함.
	}
}
