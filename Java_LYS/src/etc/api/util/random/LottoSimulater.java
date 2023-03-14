package etc.api.util.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulater {

	static Random r = new Random();

	static int prize1 = 0; // 1등 당첨 횟수를 세줄 변수
	static int prize2 = 0; // 2등 당첨 횟수를 세줄 변수
	static int prize3 = 0; // 3등 당첨 횟수를 세줄 변수
	static int prize4 = 0; // 4등 당첨 횟수를 세줄 변수
	static int prize5 = 0; // 5등 당첨 횟수를 세줄 변수
	static int failCnt = 0; // 꽝 횟수를 세줄 변수

	public static List<Integer> createLotto() {
		/*
		 * 1~45 범위의 난수 6개를 생성하셔서 컬렉션 자료형에 모아서 리턴해주세요. 무엇을 쓰든 상관하지 않는다. 단, 중복은 발생하면 안된다.
		 */
		Set<Integer> lotto = new HashSet<>();
		while (lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}

		List<Integer> lottoList = new ArrayList<>(lotto); // 객체 생성 후
		Collections.sort(lottoList); // 정렬 후
		return lottoList; // 값을 리턴.
	}

	// 보너스 번호를 생성하는 메서드
	public static int createBounusNum(List<Integer> win) {
		/*
		 * 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후에 당첨 번호들을 피해서 보너스번호 하나만 뽑아줘. 범위는 마찬가지로 1~45 사이의
		 * 난수이다.
		 */
		while (true) {
			int bonusNum = r.nextInt(45) + 1; // 보너스번호 받음
			if (win.contains(bonusNum)) {
				continue; // 당첨번호와 보너스번호가 같지 않아야 함
			} else {
				return bonusNum;
			}
		}
	}

	// 당첨 등수를 알려주는 메서드
	public static int checkLottoNumber(List<Integer> win, List<Integer> lotto, int bonusNum) {

		/*
		 * 매개값으로 1등번호, 구매한 로또번호집합, 보너스번호를 받습니다. 내 로또번호와 당첨번호를 비교하여 일치하는 횟수를 세 주신 후 등수를
		 * 판단하라. 판단된 등수에 해당하는 static 변수의 값을 올려 주면 된다. 6개가 전부 일치 > 1등 5개 일치 + 보너스번호 일치 >
		 * 2등 5개만 일치한다 > 3등 4개만 일치한다 > 4등 3개만 일치한다 > 3등 나머지 > 꽝
		 */
		int count = 0; // 내 로또번호와 당첨번호를 비교하여 일치하는 횟수를 셀 것.
		for (int i = 0; i < lotto.size(); i++) {
			if (lotto.contains(win.get(i))) {
				count++;
			}
		}
		return count; // void > int, 리턴값 받기.
	}

	public static void main(String[] args) {

		// 로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시켜라
		List<Integer> win = createLotto(); // win = 당첨번호
		// 와일트루 안에 넣어놓으면 안됨.

		// 보너스번호도 하나 고정시켜라
		int bonusNum = createBounusNum(win); // 보너스
		int headstart = 0; // 당첨시도횟수
		long lottomoney = 0; // 로또를 구매하기 위한 금액

		List<Integer> lotto = new ArrayList<>(); // 번호를 저장할 공간
		// 그 다음 와일트루 들어감
		while (true) {
			/*
			 * 1등이 당첨 될 때 까지 반복문을 돌린다. 1등이 당첨이 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고 반복문을 종료한다. 로또를
			 * 구매하기 위한 금액도 출력해라. (long으로 출력하는 것이 값이 깨지지 않음)
			 */
			lotto = createLotto(); // 로또번호발생 메서드

			// int bonus = createBounusNum(win);
			// 등수
			int countser = checkLottoNumber(win, lotto, bonusNum); // 리턴값을받음

			if (countser == 6) {
//				System.out.println("당첨번호는 " + win + "입니다."); // 고정시킨 당첨 번호가 와야겠지.
				prize1++; // 1등 당첨 횟수를 하나씩 올려줄거임
				break;
			} else if (countser == 5) {
				if (win.contains(bonusNum)) {
//					System.out.println("당첨번호는 " + win + "입니다.");
					prize2++;
				} else {
					prize3++;
				}
			} else if (countser == 4) {
//				System.out.println("당첨번호는 " + win + "입니다.");
				prize4++;
			} else if (countser == 3) {
//				System.out.println("당첨번호는 " + win + "입니다.");
				prize5++;
			} else {
				failCnt++;
//				System.out.println("꽝이에요 꽝..다시 구매 하세요");
			}
			headstart++;
			lottomoney += 5000;
			System.out.println(headstart + "번 시도 했습니다.");
		}
		System.out.println("1등당첨 입니다!!!");
		System.out.println("2등당첨수! " + prize2);
		System.out.println("3등당첨수! " + prize3);
		System.out.println("4등당첨수! " + prize4);
		System.out.println("5등당첨수! " + prize5);
		System.out.println("꽝 당첨수! " + failCnt);
		System.out.println("로또 산 금액 : " + lottomoney + " 원");
	}
}
