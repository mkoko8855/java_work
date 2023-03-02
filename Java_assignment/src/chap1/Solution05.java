package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution05 {

	public static void main(String[] args) {
		/*
		 * - 게임 인원은 2 ~ 4명 입니다. - 실탄 개수는 6개 미만으로 설정하겠습니다. - 게임이 시작되면, 시작 인원은 랜덤으로 순서가
		 * 설정됩니다. 또한 총알의 위치도 랜덤으로 설정됩니다. - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다. ex)
		 * [false, false, false, true, false, false] - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를
		 * 랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다. 원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		 */
		// 6발배열 이면 총알은true, 비어있는건false

		// 출력 결과
		// 게임인원(2~4) > 3명
		// 플레이어 이름 등록
		// 1번 이름 : ㅇㅇㅇ
		// 2번 이름 : ㅇㅇㅇ
		// 3번 이름 : ㅇㅇㅇ
		// [ㅇㅇㅇ, ㅇㅇㅇ, ㅇㅇㅇ] 참가!
		// 실탄개수 (6미만 ) : 2
		// 실탄을넣고탄창을 무작위로 돌립니다. (boolean,true2개,트루위치는랜덤)
		// 총을 돌렸습니다. 홍길동부터시작합니다.
		// [홍길동의 턴!] 탄창을 무작위로 돌렸습니다.
		// #엔터를 누르면 격발합니다.

		Scanner sc = new Scanner(System.in);
		int start;

		while (true) {
			System.out.println("1. 게임시작 \t 2. 게임종료");
			start = sc.nextInt();

			if (start == 1) {
				System.out.println("게임을 시작합니다.");
				break;
			} else if (start == 2) {
				System.out.println("게임을 종료합니다. 시작을 희망하면 1번을 눌러주세요");
				continue;
			}
		}

		// 게임 인원 입력
		System.out.println("게임 인원(2~4) --- > ");
		int playerNum = sc.nextInt();
		
		
		if (playerNum < 2 || playerNum > 4) {
			System.out.println("게임 인원이 올바르지 않습니다. 게임을 종료합니다.");
			return; // main함수 종료.
		}
		// 플레이어 이름 등록하고
		// 배열을 하나 생성해서 플레이어들을 배치하시면 됩니다.
		// 배열의 크기는 게임 참가자의 명수와 동일합니다.
		System.out.println("플레이어 이름을 등록합니다. > ");
		String[] players = new String[playerNum];               //등록한 playerNum들을 players에 집어넣음
		for (int i = 0; i < players.length; i++) {				
			System.out.printf("%d번 플레이어 이름 : ", i + 1);
			players[i] = sc.next();
		}                                                        				  

		// 실탄 개수 입력(1미만이면 안되고 5초과도 안됩니다.)
		// 출력 결과 : [ㅇㅇㅇ, ㅇㅇㅇ, ㅇㅇㅇ, ㅇㅇㅇ]님이 참가해요!

		System.out.println("실탄 개수 입력 > ");
		int tangtang = sc.nextInt();
		System.out.println("실탄 개수 입력 완료");
		if (tangtang < 1 || tangtang > 5) {
			System.out.println("실탄 개수가 맞지 않기 때문에 종료합니다.");
			return;
		}
                                                                           //실탄 개수 까지만 동일. 이후 모르겠으니 천천히.
																		   //실탄 개수는 총 탄알 개수와 다름 2발을 입력해도 총 탄알 개수가 2발이 아닌 것.
		// 탄알집장전
		boolean[] bulletPos = new boolean[6];
		// false > true로 바꾸는 것이 실탄 장전.
		int bulletPosNum = 0; // 실탄을 정확하게 장전한 횟수, 장전 횟수 모르니 while쓸 것. 제어변수선언 후에 증감식쓰자
							  // 불렛포스넘의 값이 사용자가 입력했던 불렛이라는 변수의 값과 동일하다면 반복문 끝낼것.

		int random = (int) (Math.random() * bulletPos.length);

		while (bulletPosNum < tangtang) {   // for문은 반복문을 끝내도 무조건 올라가기 때문에 하나 까줘야된다. 근데 while문은 내가 직접 증감식을 제어하기 때문에 ++값을
											// 따로 주면 원할때만 ++해주면 됨. 그래서 while문이 좋다.
			
			int position = (int) (Math.random() * bulletPos.length); 	// 우리가 만들어줘야 하는 것은 0에서 5까지이기 때문에, 그리고 0부터니까 뒤에 +안해줘도됨
			
			if (bulletPos[position] == true) {  	// 불렛포스라는 배열에 내가 생성한 난수로 포지션을 살펴봤더니 트루다. 그러면 아까 난수가 생성이 되었고 이번 회차를 무효.
				continue; 							// for문에서 컨티뉴는 증감식이 발동하고 while문은 조건식으로 간다. 즉, 이번 회차로 다시 돌리겠다는 것이다.
			} else {                  	 			// false라면
				bulletPos[position] = true; 		// 그 위치에 값을 트루로 바꾸고 체크넘은 하나씩 증가할 것임
				bulletPosNum++;
				//즉, 처음엔 원래 false false false false false false 잖아.
				//사용자가 tangtang을 입력받지? 총알을 3이라고 해봐
				//if문에서 인덱스 3이 트루냐?
				//false니까 엘스문으로 와서 true로 바꿔준다.
				//근데 if문에서 인덱스 값을 물어볼때 true라면, continue(즉, 다시 조건절로 돌아가서 다시 난수를 발생시킨다).
			}
		} 	// 배치 완료

			// 확인
		System.out.println(Arrays.toString(bulletPos));


		// 이제, 실행 순서 정하기
		// 난수를 이용해서 실행 순서를 정합니다.
		// 시작 인덱스를 난수로 정해서 돌아가게 하셔도 되고
		// 아예 배치를 섞으셔도 상관없습니다.
		// 난, 순차적으로 끝까지 가서 더이상 진행 할 사람이 없으면 다시 0번부터 진행되도록 로직을 짤 것이다.

		int startIndex = (int) (Math.random() * playerNum);
		System.out.println(players[startIndex] + " 번 부터 시작 하겠습니다.");

		// 일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		// 이 입력값(enter)은 받아서 활용할 것이 아니기 때문에
		// 따로 변수를 선언하지 않습니다.
		sc.nextLine();

		
		// 최후의 1인이 남을 때 까지 게임을 진행 해주세요.
		// 또는 총알을 다 소비할 때 까지 게임을 진행 해주세요.
		// 총알을 소모하면 true값을 false로 변경해 주세요.
		// 사람이 한 명 아웃되면 배열의 크기를 줄여주세요.

		int realBulletPos = 0;

		while (true) { // 게임이 언제 끝나는지 모르니 while(true) 로 준다.
			System.out.println(players[startIndex] + " 번 님의 턴, 탄창 장전 완료. 엔터를 누르면 탄환이 나갑니다.");
			sc.nextLine(); // 사용자가 엔터를 눌렀을 때 sc.nextLine()이 먹을 수 있게끔 처리함.

			if (bulletPos[realBulletPos]) { // 탄환 나가면 (쏘면(총알 중 진짜 나가는 것))
				System.out.println(players[startIndex] + " 님이 사망 하셨습니다.");
				tangtang--; // 총알 나갔으니 감소시켜줌
				playerNum--; // 그리고 사람도 감소
				bulletPos[realBulletPos] = false; // 탄창 자리도 true 였던 걸 false로 변경. 즉, 총알이 소모 됐으니 false로 변경 해줘야지.

				// 사람도 감수 했기 때문에 players도 줄여주고 죽은 참가자를 제외하고 생존자들을 새롭게 배열에다가 집어넣자.
				// 지금 죽은 사람 기준으로 뒤에 있는 값을 한칸씩 땡기는 작업
				for (int i = startIndex; i < players.length - 1; i++) {
					players[i] = players[i + 1];
				}
				
				String[] temp = new String[players.length - 1];

				// 새롭게 만든 temp배열에 기존 players 값을 내려주는 작업
				for (int j = 0; j < temp.length; j++) {
					temp[j] = players[j];
				}
				players = temp; // 아무 일도 없는듯이 주소값 넘기고
				temp = null; // 템프는 널을 준다.

				System.out.println("생존 인원 : " + Arrays.toString(players));

				// 그 다음 게임 더 할지, 멈출지 판단을 할 것이다.
				// 게임끝의 조건은 생존자 1명이거나 총알이 없는데, 그 이외에는 게임이 진행 되야함.
				// while(true)니까 break안걸면 게임이 계속 진행 되겠지.
				if (tangtang == 0) { // 총알도 0발이라면                                   //쌤리뷰 : 생존자가 한명이라는 코드는 필요가없지.왜?
																					  //       어차피 생존자는 총알개수보다 적게 남을텐데
					                                                                  //       (한명은 무조건 사니까)
					                                                                  //       총알로만 따지는게 코드가 깔끔할듯.
					System.out.println("총알 오링");
					System.out.println("최종 생존자 : " + Arrays.toString(players));      //       배열[i]생존자를 적어주는 것이랑 toString은 같게 나온다.
					System.out.println("게임을 종료 합니다.");
					break;
				} else {
					System.out.println("남은 인원이 게임을 재개 합니다.");
					sc.nextLine(); // 엔터를 이용해서 하게끔.
					// break는 써야하냐? 노노 안쓰고 와일 트루로 다시 돌게끔함.
				}

			} else { // false였기 때문에 생존.
				System.out.println("휴, 살았습니다.");
				startIndex++; //플레이어의 실행 순서를 랜덤 = startIndex   //하나 올려서 다음 사람이 쏠 수 있도록 함. 
			}
			// 플레이어가 생존할 때 마다 startIdx의 값을 하나씩 올리고 있는데
			// 맨 마지막 사람까지 생존 했을 경우에는 다음 차례가 첫번째 사람이기 때문에
			// 인덱스를 0으로 바꿔서 배열 맨 앞사람 순서를 가질 수 있도록 처리.
			if (startIndex == playerNum) {
				startIndex = 0;          											  //이것도 마찬가지, 왜 startindex를 0으로 줘야할까? > 질문
			}																		  //위와 같음. 해결!
			realBulletPos++;
		}
		sc.close();
	}

}
