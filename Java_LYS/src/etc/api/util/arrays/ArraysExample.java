package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
		//배열의 복사
		
		char[] arr = {'J', 'A', 'V', 'A'};

		//복사는 새로운 배열이 나와야 복사다!
		//복사 하고자 하는 배열과 어디까지 적을껀지 적어주면 된다.
		char[] arr1 = Arrays.copyOf(arr, 1);
		char[] arr2 = Arrays.copyOf(arr, 2);
		char[] arr3 = Arrays.copyOf(arr, 3);
		char[] arr4 = Arrays.copyOf(arr, 4);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		//출력 결과 : 
		 /*
		 	[J, A, V, A]
			[J, A]
			[J, A, V]
			[J, A, V, A]
		 */
		
		
		
		
		
		//근데 중간 부분 부분만 복사하고 싶다.
		//시작인덱스와 끝인덱스 주면 된다.
		char[] arr5 = Arrays.copyOfRange(arr, 1, 3);
		System.out.println(Arrays.toString(arr5));
		//출력 결과 : [A, V]
		
		
		
		
		
		
		
		
		
		
		//다음은 배열의 탐색이다 : binarySearch(배열, 검색할 값) 
		//배열은 메서드로 안했지만 사실 메서드가 존재한다.
		//그러나 전제조건이 있다. 반드시 정렬이 선행 되어야 한다.
		//정렬이 선행 되어 있지 않으면 이진탐색법은 정상 동작이 안된다.
		int[] numbers = {1, 3, 5, 7, 9, 11, 13};
		System.out.println("5의 위치 : " + Arrays.binarySearch(numbers, 5));
		//넘버스 라는 배열에서 5 라는 숫자를 찾아주세요
		//출력 결과 : 5의 위치 : 2              < 2라는 숫자는 인덱스의 숫자다.
		
		//5말고 10을 주면 -6이 나오는데 0번인덱스보다 앞에서부터 -1 그 뒤로 빈자리 사이에 -2 -3 -4 -5 -6 이런식이다.
		
		
		
		
		
		
		
		
		
		
		//다음은 배열의 정렬
		int[] nums = {42, 11, 35, 88, 34 ,100};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		//출력 결과 : [11, 34, 35, 42, 88, 100]
		
		
		
		
		
		
		
		
		
		
		//다음은 배열의 내부 요소가 동일 한지 여부를  확인하는 메서드
		System.out.println(Arrays.equals(arr1, arr3));
		//arr은 J A V A고 arr3는 A V 이기 때문에 false가 나온다.
		
		
		
		
	}
}
