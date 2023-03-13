package etc.api.lang.wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		
		
			//기본 타입의 값을 객체로 포장해주는 클래스 > Wrapper클래스 라고 한다.
		
		/*
		byte short int long float double boolean char 라는
		기본형 타입들을 객체로 포장해준다.
		
		객체 포장하는 클래스는 다음과 같다.
		Byte Short Integer Long Float Double Boolean Character
		*/
		
		
		
		int a = 100;
		boolean b = false;
		char c = 'A';
		double d = 3.14;
		
		
		//boxing (기본 데이터 타입을 객체타입으로 변환하는 과정)
		Integer v1 = new Integer(100);  //a라고 적어도됨
		Boolean v2 = new Boolean(b);
		Character v3 = new Character(c);
		Double v4 = new Double(d);
		//그러나 권장 되지 않는 문법이다. 훨씬 쉬운 방법이 있다.
		
		
		
		
		
		
		//쉬운 방법
		//자바1.5버전부터 autoboxing이 나왔다. 기본 타입을 자동으로 객체형으로 변환.
		Integer x1 = a; //new어쩌고 할 필요 없이 간단하게 변했다. (즉, 생성자를 부르지 않고 저렇게 쓰면 된다)
		Boolean x2 = b;
		Character x3 = c;
		Double x4 = d;
		//x1~x4라는 변수들을 통해 저장된다!
		
		
		
		
		
		
		//그럼 해제는?
		//autounboxing : 객체 포장을 기본형으로 해제 가능.
		int i = x1;   //그냥 주소값주면 인트값 알아서 던져줌.
		Boolean h6 = x2;
		Character y34 = x3;
		double d2 = x4;
		
		
		
		
		
		//AutoBoxing 이후에 wrapper 클래스들은
		//문자열을 기본형으로 변환하는데 많이 사용된다.
		
		
		
		
		
		
		
		
		String s2 = "3.14";
		Integer.parseInt(s2);
		//실수니까 더블.파스더블로 하면 실수로 변환 받겠지
		//이걸 인티져.파스인트로 하면 예외가 터진다 (변환할 수 없단다)
		//즉, 해당 타입으로 변환할 수 없는 문자열을 시도했을경우 NumberFormatException이라는 예외가 발생한다.
		
		
		
		
		
		
	}
}
