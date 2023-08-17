package basic.array;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		//# 배열 (array)
		// > 같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형
		
		//1. 배열 변수의 선언
		//int[] arr;  자바의 스타일
		//int arr2[]; C언어의 스타일
		
		//2. 배열 객체를 생성 > 배열 객체 생성이란? 실제 값들이 저장될 공간을 형성.
		//그리고 생성할 때, 배열의 크기를 정해줘야 한다.
		//arr = new int[];                   arr = new int[5];는 int가 5개 들어갈 수 있는 공간이 생긴 것이다.
		
		//한번에 선언과 생성을 하는 방법은 : int[] arr = new int[6];
									//for (int i=0; i<6; i++){
								    //Sysout.pln(arr[i]);
									//}
		
		
		
		
		
		//3. 배열의 초기화 > 배열 내부에 실제 값들을 저장.
		//배열이 초기화는 인덱스를 통해 수행합니다.
		//인덱스란? 배열 내부의 위치를 지정할 수 있는 값이다.
		//인덱스는 0번부터 시작하여 1씩 순차적으로 증가한다.
		
		//arr[0] = 65;
		//arr[1] = 88;
		//arr[2] = arr[0];
		//arr[3] = 3.14;   (X), 배열은 동종모음. 즉, 같은 타입끼리만 모일 수 있다. 위에서 int로 선언했기 때문에 double값이 올 수 없음.
		//arr[4] = "들어갈까요?"   (X)
		//arr[4] = 100;
		//arr[5] = 77;   (X)
		//arr[6] = 953;  (X)
		
		
		
		
		//4. 배열의 총 길이(크기) 확인 하는 법
		//> 배열변수명.length
		
		int[] arr = new int[5];
		arr[0] = 65;
		arr[1] = 88;
		arr[2] = arr[0];
		arr[3] = 5;
		arr[4] = 100;
		//arr[5] = 77;  // index 범위를 초과함.
		System.out.println("arr 배열의 길이 : " + arr.length);   //출력 결과 5
		
		System.out.println("------------------------------------------------");
		
		
		//5. 배열의 저장된 값을 사용해보자. (참조하는 법)
		//> index를 이용한다
		System.out.println("배열의 첫 번째 데이터는 : " + arr[0]);
		System.out.println("배열의 두 번째 데이터는 : " + arr[1]);
		System.out.println("배열의 셋 번째 데이터는 : " + arr[2]);
		System.out.println("배열의 넷 번째 데이터는 : " + arr[3]);
		System.out.println("배열의 다 번째 데이터는 : " + arr[4]);
		
		
		System.out.println("---------------------------------------------------------");
		
		
		//6. 배열의 반복문 처리
		//배열은 인덱스 번호를 제어변수로 활용하여 쉽게 반복문을 처리 할 수 있다.
		for(int index = 0; index < arr.length; index++) {
			System.out.printf("배열의 %d번의 데이터 : %d\n", index+1, arr[index]);
			//출력결과 : 배열의 1번 데이터 : 65
			//출력결과 : 배열의 2번 데이터 : 88
			//출력결과 : 배열의 3번 데이터 : 65
			//출력결과 : 배열의 4번 데이터 : 5
			//출력결과 : 배열의 5번 데이터 : 100
			
		//System.out.println(arr);       //은 이상한 문자(배열의 주소값)이 결과로 찍힐 것임
		
		
			
			
			
			
			
		//7. 배열 내부의 요소값을 문자열 형태로 한눈에 출력하기
		System.out.println(Arrays.toString(arr));   //배열 내부를 문자열로 출력해줌
		//출력 결과 : [65, 88, 65, 5, 100]
		
		
		
		
		
		
		//8. 배열의 선언과 생성을 동시에 하는 방법
		double[] dArr = new double[3];
		String[] sArr = new String[4];
		byte[] bArr = new byte[10];
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));
		//값은 다음과 같이 출력이 된다. 배열은 생성됨과 동시에 각 타입의 기본값으로 자동 초기화가 된다.
//		System.out.println(Arrays.toString(dArr));     >    [0.0, 0.0, 0.0]
//		System.out.println(Arrays.toString(sArr));     >    [null, null, null, null]
//		System.out.println(Arrays.toString(bArr));     >    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

		
		
		
		
		
		
		//9. 배열의 생성과 동시에 초기화도 진행 할 수 있는 방법
		char[] letters =  {'A', 'B', 'C', 'D'};
		System.out.println(letters);    //출력결과 :  ABCD
		System.out.println(Arrays.toString(letters));  //출력결과 : [A, B, C, D]
		
		
		
		//9번에 이어서 하나 더 있다. 선언과 동시에 초기화를 할 때 딱 1번만 가능한 문법
		String[] names = {"홍길동", "김철수", "박영희"};
		//배열의 크기를 느리거나 줄이고 싶다면 기존의 배열을 조작하는 것이 아니라 새롭게 생성해야 한다.
		//names = {"홍길동", "ㅋㅋㅋ", "ㅎㅎㅎ", "ㄴㄴㄴ"};  로 바꾸지 못함
		//names = new String[]{"홍길동", "ㅋㅋㅋ", "ㅎㅎㅎ", "ㄴㄴㄴ"}; 는 가능
		
		}
	}
}
