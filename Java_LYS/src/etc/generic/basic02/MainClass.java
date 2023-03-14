package etc.generic.basic02;

public class MainClass {

	public static void main(String[] args) {
		
		Basic<Integer, String> b = new Basic<>(1, "홍길동");
		String name = b.get(1);
		
		b.put(10, "김메롱"); //put 메서드 이욯애서 불렀다.
		//출력 결과 : {10=김메롱}
		
		
		System.out.println(name);
		//출력 결과 : 홍길동
		
		
		System.out.println(b);
		//출력 결과 : {1=홍길동} (맵의 느낌으로 된다!)
		
	}
}
