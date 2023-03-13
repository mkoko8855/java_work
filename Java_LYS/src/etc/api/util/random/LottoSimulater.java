package etc.api.util.random;

import java.util.HashSet;
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

	public static Set<Integer> createLotto() {
		/*
		 * 1~45 범위의 난수 6개를 생성하셔서 컬렉션 자료형에 모아서 리턴해주세요. 무엇을 쓰든 상관하지 않는다. 단, 중복은 발생하면 안된다.
		 */
		Random r = new Random();
		Set<Integer> lotto = new HashSet<>();
		while (lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}
		return lotto;
	}

	// 보너스 번호를 생성하는 메서드
	public static int createBounusNum(int lotto) { 
		 /*
		 	매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후에
		 	당첨 번호들을 피해서 보너스번호 하나만 뽑아줘.
		 	범위는 마찬가지로 1~45 사이의 난수이다.
		 */
		Random r2 = new Random();
		Set<Integer> bonus = new HashSet<>();
		while(bonus.size() < 6) {
			int num2 = r.nextInt(45)+1;
			bonus.add(num2);
			return num2;
		}
	}

	// 당첨 등수를 알려주는 메서드
	public static void checkLottoNumber(당첨번호, 내가산로또번호, 보너스번호) {
		
		 /*
		 	매개값으로 1등번호, 구매한 로또번호집합, 보너스번호를 받습니다.
		 	내 로또번호와 당첨번호를 비교하여 일치하는 횟수를 세 주신 후 등수를 판단하라.
		 	판단된 등수에 해당하는 static 변수의 값을 올려 주면 된다.
		 	6개가 전부 일치 > 1등
		 	5개 일치 + 보너스번호 일치 > 2등
		 	5개만 일치한다 > 3등
		 	4개만 일치한다 > 4등
		 	3개만 일치한다 > 3등
		 	나머지 > 꽝
		 */
	}

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		// 로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시켜라
		// 와일트루 안에 넣어놓으면 안됨.
		// 보너스번호도 하나 고정시켜라
		// 그 다음 와일트루

		while (true) {

			/*
			 * 1등이 당첨 될 때 까지 반복문을 돌린다. 1등이 당첨이 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고 반복문을 종료한다. 로또를
			 * 구매하기 위한 금액도 출력해라. (long으로 출력하는 것이 값이 깨지지 않음)
			 */

		}

	}
}
