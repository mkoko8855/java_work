package basic.array;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayModify {

	public static void main(String[] args) {

		String[] foods = { "삼겹살", "족발", "피자", "햄버거" };

		System.out.println(Arrays.toString(foods));
		// [삼겹살, 족발, 피자, 햄버거]

		foods[0] = "치킨";
		foods[2] = "탕수육";
		System.out.println(Arrays.toString(foods));
		// [치킨, 족발, 탕수육, 햄버거]

		System.out.println("-------------------------------");

		// 배열의 인덱스 탐색
		Scanner sc = new Scanner(System.in);
		System.out.println("탐색 할 음식을 입력하세요 : ");
		String name = sc.next();

		boolean flag = false;
		int i;
		// 인덱스를 알아 내야 하기 때문에 향상for문 안 쓸 것임
		for (int i1=0; i1 < foods.length; i1++) {
			if (name.equals(foods[i1])) {
				System.out.println("탐색 완료");
				System.out.println("인덱스는 " + i1 + "번");
				flag = true;
				break;
			}
		}
			//} else if(i == foods.length -1) {
				//System.out.println("없는 음식 입니다.");
		if(!flag) {
			System.out.println("없는음식");
			}
		sc.close();
	}
}
		
		
		
		
		
		
		
		
		
		
		
//		Scanner kb = new Scanner(System.in);
//		int n = kb.nextInt();
//		int [] data = new int[n];
//		
//		for(int i = 0; i<n; i++)
//			data[i] = kb.nextInt();
		//바로 위 코드 2줄은 5번 돌아 배열에 값을 집어 넣어 주겠다.
		
//		kb.close();
//		
//		int max = 0;  
//		
//		for(int i = 0; i<n; i++) {
//			int sum = 0;   //i가 바뀔 때(출발점이 변경될 때) 0으로 초기화됨
//			for(int j = i; j<n; j++) {  //data[i]에서 data[j]까지의 합 
//				sum += data[j];
//				if (sum > max)
//					max = sum;					
//			}
//		}
//		System.out.println(max);
//		

		//n = 5 라고 가정,
		
		
