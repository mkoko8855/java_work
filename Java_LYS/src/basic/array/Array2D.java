package basic.array;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		//2차원 배열
		//배열 안에 배열이 조재하는 형태를 2차원 배열이라고 한다.
		//실제 배열에는 배열이 주소값이 들어가게 된다.
		
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12, 13, 14}
		};
		System.out.println(arr.length);  //출력 결과 : 4
		System.out.println(Arrays.toString(arr)); //괴상한16진수 출력됨
		System.out.println(Arrays.toString(arr[0])); // [1,2,3]
		System.out.println(Arrays.toString(arr[1])); // [4,5,6]
		System.out.println(Arrays.toString(arr[2])); // [7,8,9]
		System.out.println(arr[2][1]); //8이 출력됨
		System.out.println(arr[2][2]); //9이 출력됨
		System.out.println(arr[1][0]); //4이 출력됨
		System.out.println(Arrays.deepToString(arr)); //배열 다 보여줌
		
		System.out.println("-------------------------");
		
		
		
		//빈 2차원 배열 만들기
		int[][] arr2 = new int[3][4];
		//new int[][]는 배열 덩어리가 3개, 배열 덩어리마다 4개씩 들어있음
		System.out.println(Arrays.deepToString(arr2));
		//출력 결과 : [[0,0,0,0],[0,0,0,0],[0,0,0,0]]
		
		
		
		
		
		
		
		//그냥 값 줘보는 연습
		arr2[1][2] = 50;  //값을 줄 수 있음
		arr2[2][1] = 70;  //값을 줄 수 있음
		//출력 결과 :
		//0 0 0 0
		//0 0 50 0
		//0 70 0 0
		
		
		
		
		
		
		//2차원 배열 deepToString 쓰지 않고 값 찍어보기
		for(int[] array :arr2) {
			for(int n :array) {
				System.out.print(n + " ");
				//출력결과 : 0 0 0 0 0 0 0 0 0
				//arr2는 배열 안에 배열 덩어리를 가지는 애다.
				//첫 번째 회차에 array변수에 첫 번째 배열 덩어리가 온다
				//그리고 안쪽에 있는 포문에서 첫 번째 덩어리를 반복문을 통해
				//덩어리에 있는 모든 요소들을 출력하고 안쪽 반복문이 끝남
				//그리고 두 번째 덩어리가 array로 감
				//다시 안쪽으로 와서 반복.
			}
			System.out.println(); //줄개행
			//출력결과 : 0 0 0 0
			//		  0 0 0 0
			//		  0 0 0 0
		}
	}
}
