package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution02 {

	public static void main(String[] args) {
//		********** 2번 **********
//		클래스명: Solution02
//
//		문제:
//			nums 배열에 저장된 요소의 개수만큼 ★을 출력하는 프로그램을 구현합니다.
//
//		입력: 
//			입력은 따로 진행하지 않습니다.
//			예제로 사용할 배열을 제시합니다.
//			int[] nums = {4, 2, 6, 1, 3};
//			
//		출력:
//			ex) 
//			★★★★
//			★★
//			★★★★★★
//			★
//			★★★
//			
//			의 형태로 출력합니다.

		int[] nums = { 4, 2, 6, 1, 3 }; //배열 제시
		String star = "★";
		for (int i = 0; i < nums.length; i++) {  //배열 반복
			int startcount = 0;
			startcount = nums[i];
			System.out.println(star.repeat(startcount));
			//repeat은 해당 문자를 repeat(n) n만큼 반복출력한다.
			
			// BY HELPER 우신의 친절한 설명.
		}
	}
}
