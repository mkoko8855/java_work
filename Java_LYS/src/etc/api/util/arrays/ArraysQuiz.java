package etc.api.util.arrays;

import java.util.Arrays;

public class ArraysQuiz {

	public static String solution(String[] participant, String[] completion) {
		
		/*
        - 참가한 사람의 이름이 담긴 배열 participant와
        완주한 사람의 이름이 담긴 배열 completion이 주어질 때
        완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
        완주 하지 못한 자는 1명이라고 가정.
        */
		String a = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0; i<participant.length; i++) {
			int b = Arrays.binarySearch(completion, participant[i]);
			if(b<0) {
				a = participant[i];
			}
		}
		return a;  //배열이 다르기 때문에. 포문 밖에서 리턴.
	}
		
		
		
		
	public static void main(String[] args) {

		// 참가자
		String[] participant = { "홍길동", "김길동", "김철수", "최철수", "박영희" };
		// 완주자
		String[] completion = { "홍길동", "김길동", "박영희", "김철수" };
		
		System.out.println(solution(participant, completion));

	}
}