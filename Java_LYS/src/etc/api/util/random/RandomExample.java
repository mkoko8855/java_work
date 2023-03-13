package etc.api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		
		
		//이미 우리는 매스 랜덤처럼, 랜덤을 알고 있다.
		//실수 난수 : 0.0 <= ~ < 1.0      (0.0이상 1.0미만)
		double d= r.nextDouble();
		System.out.println(d);          //출력 결과 : 0.20710635345431427
		
		
		
		
		
		
		
		//이 유틸의 랜덤은 정수난수를 뽑을 수 있는 것을 제공한다
		//정수 난수 : nextInt();
		int i = r.nextInt();            //(범위 안잡아주면 int의 전체 범위가 나옴)
		System.out.println(i);          //출력 결과 : -983539901
		
		
		
		
		
		
		
		
		//0~5까지 정수 난수 생성(끝 값이 미만으로 처리가 된다는 것을 기억)
		int j = r.nextInt(6);
		System.out.println(j);          //출력 결과 : 1부터 5까지 랜덤으로 출력됨
		
		
		
		
		
		
		
		
		//앞자리도 변경하고싶다면?
		//10~100까지의 정수 난수 생성
		int k = r.nextInt(91) + 10;
		System.out.println(k);          //출력 결과 : 10~100까지 랜덤으로 출력됨
		

		
		
		
		
		
		
		boolean flag = r.nextBoolean();
		System.out.println(flag);       //이건 출력 결과는 트루 아니면 폴스가 랜덤으로 오겠지.
		
		
		
		
		
		
	}
}
