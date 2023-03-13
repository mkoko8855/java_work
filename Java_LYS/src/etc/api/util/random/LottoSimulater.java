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
//	public static int createBounusNum(int lotto) { 
//		 /*
//		 	매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후에
//		 	당첨 번호들을 피해서 보너스번호 하나만 뽑아줘.
//		 	범위는 마찬가지로 1~45 사이의 난수이다.
//		 */
//		Random r2 = new Random();
//		Set<Integer> bonus = new HashSet<>();
//		while(bonus.size() < 6) {
//			int num2 = r.nextInt(45)+1;
//			bonus.add(num2);
//			return num2;
//		}
//	}

	// 당첨 등수를 알려주는 메서드
//	public static void checkLottoNumber(당첨번호, 내가산로또번호, 보너스번호) {
		
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
//	}

	
	
	
	
	
	
	
	
	
	
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






//package etc.api.util.random;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class LottoSimulator {
//	
//	static Random r = new Random();
//	
//	static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
//	static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
//	static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
//	static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
//	static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
//	static int failCnt = 0; //꽝 당첨 횟수를 세 줄 변수
//	
//	public static int[] createLotto() {
//		
//		int[] lotto = new int[6];
//		
//		/*
//		 - 1~45 범위의 난수 6개를 생성하셔서
//		  lotto 배열에 넣어서 리턴해 주시면 됩니다.
//		 - 난수끼리는 중복이 발생하면 안됩니다.
//		  난수를 생성한 후에 생성된 난수가 이미 배열에 있는지를
//		   확인하여, 이미 존재한다면 다시 생성해서 검사해 주시고
//		  존재하지 않는다면 배열에 추가해 주시면 됩니다.
//		 - return 전에 배열을 정렬해서 리턴해 주세요.
//		  (while으로 작성했습니다. for로 작성하셔도 됩니다.) 
//		*/
//		
//		int i = 0; //lotto 배열의 인덱스
//		
//		while(i < lotto.length) {
//			boolean flag = false; //중복 여부를 알려주는 변수.
//			int rn = r.nextInt(45) + 1;
//			for(int j=0; j<=i; j++) {
//				if(rn == lotto[j]) { //중복이 발생!
//					flag = true;
//					break;
//				}
//			}
//			if(!flag) { //중복이 발생하지 않았다면
//				lotto[i] = rn;
//				i++; //다음 인덱스로 이동. 중복 발생 시에는 올라가지 않음.
//			}		
//		}
//		Arrays.sort(lotto);
//		return lotto;	
//	}
//	
//	//보너스번호를 생성하는 메서드
//	public static int createBonusNum(int[] win) {
//		/*
//		 - 매개값으로 전달되는 당첨번호들을 피해서
//		  1~45 사이의 난수를 하나 리턴해 주시면 되겠습니다.
//		  당첨번호와 중복된다면 중복되지 않을 때 까지 다시 뽑아주시면
//		  되겠습니다. (boolean 변수를 활용하면 쉽습니다.)
//		 */
//		
//		int bonus = 0;
//		while(true) {
//			boolean flag = false;
//			int rn = r.nextInt(45) + 1;
//			for(int i : win) {
//				if(rn == i) { //중복이 발생!
//					flag = true;
//					break;
//				}
//			}
//			if(!flag) {
//				bonus = rn;
//				break;
//			}
//		}
//		return bonus;
//	}
//	
//	//당첨 등수를 알려주는 메서드
//	public static void checkLottoNumber(int[] myLotto, int[] win, int bonus) {
//		
//		/*
//		 내 로또 번호와 당첨번호 배열을 비교하여 
//		 일치하는 횟수를 기억해 두세요.
//		 일치하는 숫자만큼 위에 선언한 static 변수의 값을
//		  올려 주시면 되겠습니다.
//		 6개 일치 -> 1등
//		 5개 일치 + 보너스번호 일치 -> 2등
//		 5개 일치 -> 3등
//		 4개 일치 -> 4등
//		 3개 일치 -> 5등
//		 나머지 -> 꽝
//		 */
//		
//		int count = 0; //내 로또번호와 당첨번호가 몇 개 일치하는 지 세 줄 변수.
//		
//		for(int i : myLotto) {
//			for(int j : win) {
//				if(i == j) {
//					count++;
//					break;
//				}
//			}
//		}
//		
//		if(count == 6) prize1++;
//		else if(count == 5) {
//			boolean flag = false;
//			for(int num : myLotto) {
//				if(num == bonus) {
//					prize2++;
//					flag = true;
//					break;
//				}
//			}
//			if(!flag) prize3++;
//		} else if(count == 4) prize4++;
//		else if(count == 3) prize5++;
//		else failCnt++;
//	
//	}
//	
//	
//
//	public static void main(String[] args) {
//		
//		//당첨번호 고정
//		int[] win = createLotto();
//		//보너스번호 고정
//		int bonus = createBonusNum(win);
//		
//		int paper = 0;
//		long money = 0;
//		
//		while(true) {
//			
//			int[] myLotto = createLotto();
//			paper++;
//			checkLottoNumber(myLotto, win, bonus);
//			
//			if(prize1 == 1) {
//				money = paper * 1000;
//				System.out.println("*** 1등에 당첨되었습니다!!! ***");
//				System.out.println("--------------------------");
//				System.out.println("*** 1등에 당첨되는 동안 누적 당첨 횟수 ***");
//				System.out.printf("2등 당첨 횟수: %d회\n", prize2);
//				System.out.printf("3등 당첨 횟수: %d회\n", prize3);
//				System.out.printf("4등 당첨 횟수: %d회\n", prize4);
//				System.out.printf("5등 당첨 횟수: %d회\n", prize5);
//				System.out.printf("꽝 당첨 횟수: %d회\n", failCnt);
//				System.out.println("1등 한 번 당첨 되려고 당신이 쓴 금액: " + money + "원");
//				break;
//			} else {
//				System.out.printf("로또 %d장 째 구매 중...\n", paper);
//			}
//			
//		}
//		
//		
//		
//		
//	}
//
//}













