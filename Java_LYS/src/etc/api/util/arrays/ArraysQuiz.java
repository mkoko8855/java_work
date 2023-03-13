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
		
		Arrays.sort(participant);  //참가자
		Arrays.sort(completion);   //완주자
		
		
		for(int i=0; i<participant.length; i++) {   //짧은 배열을 기준해도됨
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










//쌤 코드
//package etc.api.util.arrays;
//
//import java.util.Arrays;
//
//public class ArraysQuiz {
//	
//	public static String solution(String[] participant, String[] completion) {
//		
//		/*
//		 - 참가한 사람의 이름이 담긴 배열 participant와
//		 완주한 사람의 이름이 담긴 배열 completion이 주어질 때
//		 완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
//		 완주하지 못한 자는 1명이라고 가정합니다.
//		*/
//		
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		
//		for(int i=0; i<completion.length; i++) {
//			if(!participant[i].equals(completion[i])) {
//				return participant[i];
//			}
//		}
//		
//		return participant[participant.length-1];      //마지막 남는 한명을 찾으면 되니, 이걸 리턴하면 됨.
//		
//		
//	}
//
//	public static void main(String[] args) {
//		
//		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"};
//		String[] completion = {"홍길동", "김길동", "박영희", "김철수"};
//		System.out.println("완주하지 못한자: " + solution(participant, completion));
//
//
//
//
//	}
//}
