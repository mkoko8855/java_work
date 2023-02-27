package basic.array;

public class Array2DQuiz {

	private static final int[][] Array = null;

	public static void main(String[] args) {

		int[][] score = { { 79, 80, 99 }, // A학생
				{ 95, 85, 89 }, // B학생
				{ 90, 65, 56 }, // C학생
				{ 69, 78, 77 } // D학생
		}; // 과목은 3과목

		String[] stuName = { "A학생", "B학생", "C학생", "D학생" };
		String[] subName = { "국어", "영어", "수학" };

		/*
		 * 1.각 학생의 평균을 소수점 첫재 자리까지 출력 2.각 과목의 평균을 출력해 보세요. 3.반 평균을 출력해 보세요. (모든 학생들의 평균을
		 * 더해서 학생 수로 나누기)
		 */

		// 1번, 3번
		double totalAvg = 0.0; //학생들의 평균 점수의 총합
		int idx = 0;  //stuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수.
		
		for (int[] stu : score) {
			int total = 0;  // 위 stu변수에 배열덩어리가 하나씩 갈때마다 0이 되어야 한다. 그래서 total은 이 위치가 맞음.
							// 그래야 한명씩 바뀔 때 마다 비교를 할 수 있다. a학생하고 b학생차롄데 a학생 점수가 남아 있으면 안되기 때문.
							// 밖에 있으면 계속 누적되기 때문이다.
			for (int s : stu) { // s라는곳에 점수들이 하나씩 들어온다.
				total += s;
			}
			double avg = (double) total / subName.length; // 나누기(/)3 해도되긴함.
			totalAvg += avg;
			System.out.printf("%s 평균 : %.1f점\n", stuName[idx], avg);
			idx++;
		}
		
		System.out.println("-------------------------------------");
		//2번
		for(int i=0; i<subName.length; i++) {
			int total = 0;
			for(int j=0; j<stuName.length; j++) {
				total += score[j][i];
			}
		double avg =(double) total / stuName.length;
		System.out.printf("%s 평균점수 : %.1f점\n", subName[i], avg);
		}
		
		//반 평균을 구하기 위해 학생의 머리수만큼 총합에서 나눠줌
		double classAvg = totalAvg / stuName.length;
		System.out.printf("우리반 평균 : %.1f점\n", classAvg);
	}
}
/*결과
A학생 평균 : 86.0점
B학생 평균 : 89.7점
C학생 평균 : 70.3점
D학생 평균 : 74.7점
-------------------------------------
국어 평균점수 : 83.3점
영어 평균점수 : 77.0점
수학 평균점수 : 80.3점
우리반 평균 : 80.2점
*/
