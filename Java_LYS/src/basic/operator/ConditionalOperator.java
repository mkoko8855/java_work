package basic.operator;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		/*
		 	# 3항 연산자
		 	- 피 연산자(연산을 당하는 값)가 3개인 연산자를 말합니다.
		 	- (조건식 ? 좌항 : 우항);
		 	
		 	조건식을 비교하여 true일 경우에는 좌항이,
		 	 			  false일 경우에는 우항의 값이 도출된다.
		 	 			  
		*/
		 
		
		 int x = 10, y = 20;
		 String result = (x > y ? "x는 y보다 큽니다." : "x는 y보다 작습니다.");
		 System.out.println(result);
		 
		 
		 //난수를 발생시키는 메서드 Math.random();
		 //0.0이상 1.0미만의 실수 난수 값을 반환한다.
		 
		 
		 //double random = Math.random();
		 //System.out.println(random);
		 
		 
		 //1~10까지의 정수 난수를 발생시키고 싶어요!
		 //(Math.random()*11) = 	범위 : 0.0~11.0
		 //(Math.random()*11) + 1 = 범위 : 1.0~12.0
		 //(Math.random()*10) = 	범위 : 1.0~11.0
		 int rn = (int)((Math.random()*10)+1);
		 System.out.println(rn);
		 
		 
		 //10~100까지의 정수 난수를 발생시키고 싶어요!
		 int rn2 = (int)((Math.random()*91) + 10);
		 System.out.println(rn2);
		 
		 
		 
		//System.out.println("0 ~ 1 사이의 랜덤 숫자 : " + Math.random());
		//System.out.println("0 ~ 100 사이의 랜덤 숫자 : " + (int)(Math.random() * 100));
		//System.out.println("0 ~ 10000 사이의 랜덤 숫자 : " + (int)(Math.random() * 10000));
		 
		 
		 
		//34~176까지의 정수 난수를 발생시키고 싶어요!
		int rn3 = (int)((Math.random()*143+34));
		//177-34 = 만큼 곱하고 마지막에 34만큼 덜주기
		
	}
}
