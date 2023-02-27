package basic.array;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		//int[] arr = {1, 3, 5, 7, 9, 11, 13};
		
		//7을 삭제하고 싶으면 몇번 인덱스인지 알아야됨 > (3번인덱스이다)
		//삭제 기준 인덱스를 기준으로 뒤에서 하나씩 밀어버린다
		//1 3 5 9 9 11 13
		//다음
		//1 3 5 9 11 11 13
		//다음
		//1 3 5 9 11 13 13
		//다 밀어버리고 난 다음
		//크기가 7인 배열이지만 하나 줄여서 6인 배열하나만들어서 반복문돌리면됨
		//1 3 5 9 11 13 13 값들을 크기가 6인 새로운 배열에 넣으면됨.
		
		//코드로 보여주는 방법
		int[] arr = {1, 3, 5, 7, 9, 11, 13};
//		arr[3] = arr[4];
//		arr[4] = arr[5];
//		arr[5] = arr[6];
//		배열의 크기가 크다면 반복문으로 처리해야됨
	
		for(int i=3; i<arr.length-1; i++) {
// 맨 마지막 배열값은 뒤에서 더 땡겨올 것이 없으니 -1해줘야됨
			arr[i] = arr[i+1];
			//27~29번줄은 삭제되는 값을 기준으로, 뒤에 있는 값을
			//한칸씩 앞으로 땡기는 작업이며, 추후에 생성될 새 배열에
			//값을 그대로 대입하기 편하게 대입하려고 하는 작업.
		}
		
		//다음으로 기존의 배열보다 크기가 하나 작은 새 배열 생성하자.
		int[] temp = new int[arr.length - 1];
		//원본 배열의 값을 새 배열에 인덱스 맞춰서 그대로 대입하기.
		//즉, 새롭게 만든 temp라는 배열에 0번 인덱스에
		//기존 배열의 0번을 넣는다.쭉쭉~~. 는 식.
		
//		temp[0] = arr[0];
//		temp[1] = arr[1];
//		temp[2] = arr[2];  그러나 이렇게 하지 말고 반복문으로.
		
		for(int j=0; j<temp.length; j++) {
			
			temp[j] = arr[j];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		//arr출력결과 : [1, 3, 5, 9, 11, 13, 13]
		//temp출력결과 : [1, 3, 5, 9, 11, 13]
		
		arr = temp;  //temp배열의 주소값을 arr에게 넘긴다.
		temp = null; //null을 사용하면서 주소값을 지워서
		             //메모리에서 temp는 자동 소멸되게 한다.
		
		System.out.println(Arrays.toString(arr));
		//출력결과 : 원래 temp와 같은 [1, 3, 5, 9, 11, 13]
	}
}
