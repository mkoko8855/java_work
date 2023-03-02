package basic.method;



											 //return, void
                                             //리 턴 함 수, 보 이 드




/*
 	# 반환값, 반환 유형 (return value, return type)
 	
 	  return
 	  
 	1. 반환값이란? 메서드의 실행 결과 값을 의미한다.
 	2. 매개변수는 여러 개 존재할 수 있지만 반환되는 값은 오직 한 개만 존재해야 한다. 리턴은 메서드 호출 한번 당 리턴 하나다.
 	3. 앞에 족발, 치킨, 삼겹살 같은 조건문 문제는 쓴건 3번이지만 각각의 상황마다 하나씩(하나만이) 리턴되기 때문에 사용 가능함.
 	4. 전달되는 값의 타입을 반환 유형이라고 하며, 메서드를 선언 할 때 메서드 이름 앞에다가 반드시 반환 유형을 명시해야 한다.
 	   EX) static int calcRangeTotal 은 int값을 리턴하는 의미이다. (static 뒤에 그리고 메서드 앞에 int 들어갔으니)
 	5. 반환할 때는 return 이라는 키워드를 사용한다. return 뒤에 전달할 값을 지정한다.
 	   (변수 내부에 있는거 전달하던가 쌩 값(상수)를 전달해도 된다. 
 	6. 리턴이 작성되어 있는 메서드(반환값이 있는 메서드)는 호출하는 행위가 하나의 값으로 처리될 수 있다.
 	   그렇기 때문에 반환 값을 다른 변수에 대입 할 수도 있고 다른 메서드의 매개값으로도 처리될 수 있다.
*/



/*
	  void
	  
	  7. 모든 메서드가 반환값이 있는 것은 아니다. 메서드 실행 후에 반환할 값이 딱히 없다면
	  	 return을 생략 해도 된다.
	  8. 이 때는 반환유형을 메서드를 선언할 때 비워두지 마시고 void라는 키워드를 작성해 주셔야 한다.
	  
	  9. 모든 메서드는 return을 만나면 강제로 메서드가 종료된다.
	  	 따라서 조건 없이 return문 아래에 코드를 그 어떠한 것도 작성할 수 없다.
	  	 void메서드 에서는 void가 return이 없는데, return을 쓸 수도 있다. 탈출 기능으로 사용할 수 있다.
*/










public class MethodExample3 {
	
    //7번예시보자.
	static int add(int n1, int n2) {  //정수 2개 받았음.
		return n1 + n2;   //return "메롱" 은 틀리겠지. add 앞에 int라고 했으니까..
						  //System.out.println 불가함. return때문에 return문 아래에 쓸수 없다. 강제로 종료되었기 때문이다.
						  //출력과 변수 대입, 다른 메서드 호출 하는 것 또한 안된다.
	}
	
	
	
	
	
	
	
	
//	static int operateTotal(int n1, int n2){//정수 2개 받았음.
//		return n1+n2;
//		return n1-n2;    이미 바로윗줄에서 return썼으니 여기서부터 빨간줄 긁힘.
//		return n1*n2;    리턴은 메서드의 호출부로 값을 리턴하는 기능과 동시에 메서드를 강제로 종료하는 효과도 있다.
//		return n1/n2;	 그래서 2번째 리턴부터는 어떠한 값도 쓸 수가 없다. 리턴되면 메서드 종료되니까.
//		그래서 한번에 + - * / 하고 싶으면 배열로 리턴하면 된다.
		
//	}
	
//		그래서 한번에 + - * / 하고 싶으면 배열로 리턴하면 된다. 이렇게.
	static int[] operaterTotal(int n1, int n2) {
		return new int[] {n1+n2, n1-n2, n1*n2, n1/n2};
		//여기서 바로 윗줄 n1+n2를 보면 그 위에 add메서드와 비슷하다
		//return new int[] {add(n1, n2), n1-2, n1*n2, n1/n2}; 이렇게도 된다.
		//그럼 add메서드 return n1+n2; 값도 같이 저장된다.
	}
	
	
	
	
	
	
	
	/*
    문제
 	1. 메서드 이름은 calcArrayTotal로 정의한다.
 	2. 이 메서드는 정수 배열을 하나 전달 받을 것이고 해당 배열 내부에 있는
 	   모든 정수의 합계(int)와 평균(double)을 '배열'에 다시 담아서
 	   return하는 메서드이다.
 	3. 2번에 정의한 조건대로 메서드를 선언해보고 실제로 main에서 호출해서
 	   합계와 평균(소수점둘째자리까지)을 출력해라.
 	   {57, 89, 78, 91, 93, 47}
	 */
	static double[] calcArrayTotal(int[] nums) {
		int total = 0;
		for(int a : nums) {
			total += a;
		}
		double average = (double)total/nums.length;
		return new double[] {total, average};
	}
	
	
	
	
	
	
	
	
	// 보이드 리턴 타입.
	static void multi(int n1, int n2) {
		int result = n1 * n2;
		System.out.printf("%d x %d = %d\n", n1, n2, result);
	} //그 다음 메서드 선언은 끝난다. 리턴이 없고 void썼으니. return쓰면 빨간줄 긁힘.
	
	
	
	
	
	
	
	
	
	
	static void divide(int n1, int n2) {
		//0으로 나눌 수 없으니 물어봐보자.
		if(n2 == 0) {
			System.out.println("0으로 나누시면 안돼요!");
			//break; continue; 
			//밑 코드를 실행시키지 않으려 break나 continue를 쓰는데
			//break는 반복문 밖에는 사용할 수 없다는 익셉션이 뜬다. 컨티뉴도 마찬가지.
			//void메서드 에서 멈추려면 return을 써서 밑 코드를 실행 시키지 않을 수 있다.
			//이 return은 반환이 아니라 그냥 멈추려고 쓴 것이다.
			return; //리턴을 쓰면 아래 코드는 실행이 안된다.
		}
		int result = n1 / n2;       //위에서 리턴 쓰면 여긴 안먹겠지
		System.out.printf("%d / %d = %d\n", n1, n2 ,result);    //위에서 리턴 쓰면 여기도 안먹음
	}
	
	
	
	
	
	
	
	
	
	
	//------------------------아래는 메인메서드. 호출하는 부분이다.

	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {  //return타입이 void이다. 빈, 공허한. 즉, 리턴 타입이 없으면 void를 쓴다.
		
		
		
		
		
		
		
		int plus = add(3, 8);
		System.out.println(plus);   //출력 결과 : 11
		
		int plus2 = add(10, 15);
		System.out.println(plus2);  //출력 결과 : 25
		
		int plus3 = add(add(4, 6), add(7, 8));
		System.out.println(plus3);  //4+6 과 7+8 해서    출력 결과 : 25
		
		
		
		
		
		
		
		
//		그래서 한번에 + - * / 하고 싶으면 배열로 리턴하면 된다. 호출은 이렇게.
		int[] Result = operaterTotal(30, 6);
		System.out.println(Result[0]);
		System.out.println("30 + 6 = " + Result[0]);   //36
		System.out.println("30 - 6 = " + Result[1]);   //24
		System.out.println("30 * 6 = " + Result[2]);   //180
		System.out.println("30 / 6 = " + Result[3]);   //5
		
		
		
		
		
		
		
		/*
		    문제
		 	1. 메서드 이름은 calcArrayTotal로 정의한다.
		 	2. 이 메서드는 정수 배열을 하나 전달 받을 것이고 해당 배열 내부에 있는
		 	   모든 정수의 합계(int)와 평균(double)을 '배열'에 다시 담아서
		 	   return하는 메서드이다.
		 	3. 2번에 정의한 조건대로 메서드를 선언해보고 실제로 main에서 호출해서
		 	   합계와 평균(소수점둘째자리까지)을 출력해라.
		 	   {57, 89, 78, 91, 93, 47}
		 */
		int[] nums = {57, 89, 78, 91, 93, 47};
		double[] result = calcArrayTotal(nums);
		System.out.printf("합계 : %d, 평균 : %.2f\n", (int)result[0], result[1]);
		//%d는 정수를 표현하는데, 우린 result[0]번인 더블 배열을 적었다. 
		//출력 결과 : 합계 : 455, 평균 : 75.83
		
		
		
		
		
		
		
		
		System.out.println("----------------------------");
		
		
		
		
		
		
		
		
		/*
		보이드 출력 설명
		반환 값이 없는 void 타입의 메서드는 값이 돌아오지 않기 때문에 실행 결과를
		변수에 저장할 수 없고 다른 메서드에 매개값으로도 활용이 불가능하다.
		void는 반드시 단독 호출하여 사용해야 한다.
		void는 메서드는 단순히 동작을 지시하는 역할을 수행한다.
		 */
		
		
		//보이드 출력
		multi(10, 7);                       //출력 결과 : 10 x 7 = 70
		//int result = multi(10, 7)         이런식으로 안됨.
		//System.out.println(multi(10, 7)); 이런식으로도 안됨. 오? multi(10, 7)이 돌려주는 값이 없기 때문이다.
		multi(add(3, 4), add(4, 7));        //이건 가능.    출력 결과 : 7 x 11 = 77
	    //add(multi(4, 4), multi(5, 6));    이건 불가능.   멀티라는 이름의 메서드는 보이드 이기 때문에 못옴.
		
		
		
		
		
		
		
		
		
		
		//divide
		divide(20, 4);  //출력 결과 : 20 / 4 = 5
		
		divide(20, 0);  //0으로 나눈다는 행위는 자바에서 막고있다. 그러나 가능하기도함  위로 가면 설명이 적혀있다. 
						//결과 : 0으로 나누시면 안돼요!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
