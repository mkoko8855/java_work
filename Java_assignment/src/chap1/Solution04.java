package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {
//		********** 4번 **********
//		클래스명: Solution04
//
//		문제:
//			학생들 중 과제를 제출하지 않은 학생을 적발하는 문제 입니다.
//			총 학생의 수는 10명 입니다. 각 학생들은 1번부터 10번까지 번호를 가지고 있습니다.
//			학생들 중 2명의 학생이 과제를 제출하지 않았습니다. 그 학생이 몇 번 학생인지를 출력하면 됩니다.
//
//		입력: 
//			Scanner를 활용하여 총 8개의 정수를 입력 받습니다.
//			출석번호에 중복은 없습니다.
//			입력되는 값을 제시합니다. 
//			-> 3 1 4 5 7 9 6 10
//			
//		출력:
//			ex) 
//			숙제를 안 낸 학생의 번호:
//			2
//			8
//			
//			의 형태로 출력합니다. 
		
		Scanner sc = new Scanner(System.in);
		int[] student = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  			 //> 난 배열을 new int[10]으로 해서 제대로 된 출력이 나오지 않았다. 
		int[] okStudent = new int[8];							     //우신과 강사쌤 설명 : new int[10]으로 하면 반복문을 돌려서 출력을 해야 한다.
																     //이렇게 할 필요가 없고 값을 바로 넣어주면 편하지.
		for(int i=0; i<okStudent.length; i++) {
			System.out.println("1~10의 학생의 번호 입력 : ");
			int OK = sc.nextInt();   //8명의 과제를 제출한 학생.
			okStudent[i] = OK;
		}
		
		System.out.println("제출한 학생들은 다음과 같습니다. > " + Arrays.toString(okStudent));
		
		
		for(int i = 0; i < student.length; i++) {
			boolean flag = false;   //제출한 학생이 없는지 확인할 변수.
			for(int j = 0; j < 8; j++) {
				if(student[i]==okStudent[j]) {   //제출한 학생 수 10명에서 존재하면 변수 트루.
					flag =true;
				}
			}
			if(!flag) {		//제출한 학생이 10명 중에서 없음. boolean이 false유지
				System.out.println("숙제 제출을 안한 학생 번호 : " + student[i]);
																								// BY HELPER 우신의 친절한 설명.
			}
		}
	}
}
//모든 내용을 다 작성하셨다면, 파일을 추출합니다. 
//상단 메뉴 File -> Export를 선택합니다. 
//창이 하나 뜰 텐데, General 폴더 내에 있는 Archive File을 선택합니다.
//새 창이 뜰 겁니다. 추출하고자 하는 프로젝트를 체크합니다. 
//중간에 To archive file 에 있는 Browse를 눌러서 추출할 파일 경로를 설정한 후에 
//finish를 누르시면 추출이 완료됩니다.
//
//Russian Roulette 파일은 그냥 Java 파일만 따로 워크스페이스 폴더에서 첨부해 주시면 되겠습니다. 
//
//두 파일을 하나로 합쳐서 압축하신 후에 제출해 주시면 되겠습니다.
//수고하셨습니다.