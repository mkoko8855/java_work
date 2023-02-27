package com.fast;

import java.util.Arrays;

public class aarraayyss {

	public static void main(String[] args) {
		
		/*
		  break 
		  만나는 즉시 반복문 전체 탈출
		  continue
		  만나면 해당 반복부분 탈출 후 다음반복실행
		*/
		
		
		//특징 : 같은 타입의 여러 변수를 하나의 묶음으로 다룸
		//순서 : 배열은 선언 후 생성을 하는 것
		
		//배열을 선언하자면 > 타입[] 변수이름;    (여기는 참조변수생성만)
		//배열을 생성하자면 > 변수이름 = new 타입[길이];  (여기는 실제 저장공간 생성)
		//EX)
		//배열을 선언하자면 > int[] score;
		//배열을 생성하자면 > socre = new int[5];
		
		// 실전QUIZ
		// int[] score = new int[5];    은 배열 score선언과 생성을 동시에함.
		// score[3] = 100;     			을 넣는다면
		// System.out.println(score[3]); 값은 100이 출력이 된다.
		
		//---------------------------------------------
		
		//배열의 길이 (배열은 한번 생성하면 실행 하는 동안 길이 바꿀 수 없음)
		//배열이름.length
		//int [] arr = new int[5];      > 길이가 5인 int배열
		//int tmp = arr.length;         > arr.length의 값은 5이고 tmp에 5가 저장됨.
		
		
		
		
		
		
		
//		for(int i=1; i<5; i++){
//            if(i==3) 
//            	break;
//            System.out.println(i);
//        }
//        System.out.println("반복문 끝!");
		
		
//		int[] arr = new int[9];
//		
//		System.out.println("arr.length =" + arr.length);
//		for (int i=0; i<10; i++) {
//			System.out.println(arr[8]);
//		}
		
		
		
		
		
		
		/*
		  	int[] score = new int[5];
		  	score[0] = 50;
		  	score[1] = 60;
		  	score[2] = 70;
		  	score[3] = 80;
		  	score[4] = 90;

		 	이렇게 쓰기 보단,
		 	
		 	int[] score = {50, 60, 70, 80, 90}; 이 편함
		 
		 */
		
			
			
		
		
		
		
		
		
		  	int[] iArr = {100, 96, 80, 50, 40};
		  	System.out.println(iArr);   //이러면 이상한 문자열나옴
		  	
		  	
		  	//그래서 for문 씀
		  	for(int i=0; i<iArr.length; i++) {
		  		System.out.println(iArr[i]);   //그러면 값이 100, 96, 80, 50, 40이 다 출력됨
		  	}
		  
		  	
		  	//하지만 for문 마저 불편하다면
		  	System.out.println(Arrays.toString(iArr));    //그러면 값이 [100, 96, 80, 50, 40]이 다 출력됨.
		  	
		  
		 
		  	
		  	
		  	//배열의 활용
		  	//최대값과 최소값 구하기
		  	int[] score = {79, 88, 91, 33, 100, 55, 95};
		  	
		  	int max = score[0];	//배열의 첫 번째 값으로 최대값을 초기화함
		  	int min = score[0]; //배열의 첫 번째 값으로 최소값을 초기화함
		  	
		  	for(int i=1; i<score.length; i++) {
		  		if(score[i] > max) {
		  			max = score[i];
		  		} else if(score[i] < min) {
		  			min = score[i];
		  		}
		  	}
		
		  	System.out.println("최대값 :" + max);
		  	System.out.println("최소값 :" + min);
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		  System.out.println("------------------------------");
		  
		  
		  //배열의 섞기
		  int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		  System.out.println(Arrays.toString(numArr));
		  
		  
		  for (int i = 0; i < 100; i++) {
			  int n = (int)(Math.random()*10);
			  int tmp = numArr[0];
			  numArr[0] = numArr[n];
			  numArr[n] = tmp;
			  
		
			  
			  
			  
			  
		  }
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		  	
		
	}
}
