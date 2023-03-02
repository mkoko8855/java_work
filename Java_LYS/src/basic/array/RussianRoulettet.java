package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulettet {

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

		System.out.println("플레이어의 이름을 등록할게요");
		String[] players = new String[playerNum]; // players 배열안에 값을 넣어준다. 뭐로? 게임인원. 왜? 등록하는거임.
		for (int i = 0; i < players.length; i++) {
			System.out.printf("%d번 플레이어 이름 : ", i + 1); // 2, 3, 4번 순으로 늘어남
			players[i] = sc.next();
		}

		// 실탄 개수 입력(1미만이면 안되고 5초과도 안됩니다.)
		System.out.println("\n실탄 개수(6미만) : ");
		int bullet = sc.nextInt();
		System.out.println(Arrays.toString(players) + " 님들이 참가해요!");
		// 출력 결과 : [ㅇㅇㅇ, ㅇㅇㅇ, ㅇㅇㅇ, ㅇㅇㅇ]님이 참가해요!

		if (bullet < 1 || bullet > 5) {
			System.out.println("실탄 수가 올바르지 않습니다. 게임을 종료합니다.");
			return;
		}

		// 실탄을 탄창에 배치합니다.
		boolean[] bulletPos = new boolean[6];
		// 난수를 생성하셔서 실탄을 탄창에 배치합니다.
		// false > true로 바꾸는 것이 실탄 장전입니다.
		// 난수는 중복으로 발생할 가능성이 있기 때문에 중복 방지 로직을 세워서
		// 같은 위치에 두 개의 실탄이 장전되지 않도록 해 주시면 됩니다.
		int checkNum = 0; // 실탄을 정확하게 장전한 횟수(while문 쓸거니 제어변수 선언)
		// 체크넘의 값이 사용자가 입력했던 불렛이라는 변수의 값과 동일하다면 반복문 끝낼것.
		// 이것을 와일트루에 if문해도 되지만, 그렇게 하지 않고 이렇게 썼음
		// 몇번 장전하는지 횟수를 모르니 while문 쓰는게 좋음.
		while (checkNum < bullet) { // for문은 반복문을 끝내도 무조건 올라가기 때문에 하나 까줘야된다. 근데 while문은 내가 직접 증감식을 제어하기 때문에 ++값을 따로
									// 주면 원할때만 ++해주면 됨. 그래서 while문이 좋다.
			int position = (int) (Math.random() * bulletPos.length); // 우리가 만들어줘야 하는 것은 0에서 5까지이기 때문에, 그리고 0부터니까 뒤에
																		// +안해줘도됨
			if (bulletPos[position]) {// 블랙포스라는 배열에 내가 생성한 난수로 포지션을 살펴봤더니 트루다. 그러면 아까 난수가 생성이 되었고 이번 회차를 무효.
				continue; // for문에서 컨티뉴는 증감식이 발동하고 while문은 조건식으로 간다. 즉, 이번 회차로 다시 돌리겠다는 것이다.
			} else { // false라면
				bulletPos[position] = true; // 그 위치에 값을 트루로 바꾸고 체크넘은 하나씩 증가할 것임
				checkNum++;
			}
		} // 총알 배치 끝.

		// 확인 한번 해보는 문장
		System.out.println(Arrays.toString(bulletPos));

		// 이제, 실행 순서 정하기
		// 난수를 이용해서 실행 순서를 정합니다.
		// 시작 인덱스를 난수로 정해서 돌아가게 하셔도 되고
		// 아예 배치를 섞으셔도 상관없습니다.
		// 난, 순차적으로 끝까지 가서 더이상 진행 할 사람이 없으면 다시 0번부터 진행되도록 로직을 짤 것이다.

		// 사용자가 4명이면 0~3. 사용자가 3명이면 0~2까지 난수의 범위를 지정했음
		int startIdx = (int) (Math.random() * playerNum);
		System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", players[startIdx]);

		// 일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		// 이 입력값(enter)은 받아서 활용할 것이 아니기 때문에
		// 따로 변수를 선언하지 않습니다.
		sc.nextLine();

		// 최후의 1인이 남을 때 까지 게임을 진행 해주세요.
		// 또는 총알을 다 소비할 때 까지 게임을 진행 해주세요.
		// 총알을 소모하면 true값을 false로 변경해 주세요.
		// 사람이 한 명 아웃되면 배열의 크기를 줄여주세요.

		int realBulletPos = 0; // 불렛포스의 0번부터 순서대로 쏘자
		while (true) { // 게임이 언제 끝나는지 모르니 while(true) 로 준다.
			System.out.printf("\n\n[%s의 턴!]\t탄창을 장전했습니다.\n", players[startIdx]);
			System.out.println("엔터를 누르면 격발합니다.");
			sc.nextLine(); // 사용자가 엔터를 눌렀을 때 sc.nextLine()이 먹을 수 있게끔 처리함.

			// 블렛포스의 0번 인덱스가 트루냐 폴스냐에 삶이 달라지겠지.
			// 블렛포스의 0번 인덱스가 트루일 경우에는 사망. 폴스는 다음으로 넘어감.
			// 다음으로 넘어가는건 startidx 하나 올려주면 된다.
			// startidx를 올려 줄 때, 배열의 끝을 넘어갈 수 있기 때문에 0으로 만들어서
			// 맨 앞으로 가게끔 만들어 줘야 한다.
			if (bulletPos[realBulletPos]) { // 총알 격발!

				System.out.printf("\n빵!!!\n[%s] 사망...\n", players[startIdx]);
				// 플레이어스의 스타트인덱스 턴인데 얘가 트루라는건 죽었다는 얘기다. 그럼 총알이 나갔으니 불렛의 값을 줄여준다.
				bullet--; // 총알 나갔으니 감소
				playerNum--; // 그리고 사람도 감소
				bulletPos[realBulletPos] = false; // 탄창 자리도 true 였던 걸 false로 변경. 즉, 총알이 소모 되었으니 false로 변경.

				// 사람도 감수 했기 때문에 players도 줄여주고 죽은 참가자를 제외하고 생존자들을 새롭게 배열에다가 집어넣자.
				// 지금 죽은 사람 기준으로 뒤에 있는 값을 한칸씩 땡기는 작업
				for (int i = startIdx; i < players.length - 1; i++) {
					players[i] = players[i + 1];
				}

				String[] temp = new String[players.length - 1];

				// 새롭게 만든 temp배열에 기존 players 값을 내려주는 작업
				for (int j = 0; j < temp.length; j++) {
					temp[j] = players[j];
				}
				players = temp; // 아무 일도 없는듯 ,주소값 넘기고
				temp = null; // 템프는 널을 준다.

				System.out.println("생존 인원 : " + Arrays.toString(players));

				// 그 다음 게임 더 할지, 멈출지 판단을 할 것이다.
				// 게임끝의 조건은 생존자 1명이거나 총알이 없는데, 그 이외에는 게임이 진행 되야함.
				// while(true)니까 break안걸면 게임이 계속 진행 되겠지.
				if (players.length == 1) { // 생존자가 1명이냐?
					System.out.println("최종 생존자 : " + players[0]);
					System.out.println("게임을 종료합니다. ");
					break;
				} else if (bullet == 0) { // 총알도 0발이라면
					System.out.println("총알이 다 떨어졌습니다.");
					System.out.println("그렇기에 최종 생존자 : " + Arrays.toString(players));
					System.out.println("그래서 게임을 종료 합니다.");
					break;
				} else {
					System.out.println("남은 인원이 게임을 재개 합니다.");
					sc.nextLine(); // 엔터를 이용해서 하게끔.
					// break는 써야하냐? 노노 안쓰고 와일 트루로 다시 돌게끔함.
				}

			} else { // false였기 때문에 생존.
				System.out.println("휴, 살았습니다.");
				startIdx++; // 하나 올려서 다음 사람이 쏠 수 있도록 함.
			}
			// 플레이어가 생존할 때 마다 startIdx의 값을 하나씩 올리고 있는데
			// 맨 마지막 사람까지 생존 했을 경우에는 다음 차례가 첫번째 사람이기 때문에
			// 인덱스를 0으로 바꿔서 배열 맨 앞사람 순서를 가질 수 있도록 처리.
			if (startIdx == playerNum) {
				startIdx = 0;
			}
			realBulletPos++;
		}
		sc.close();
	}
}
