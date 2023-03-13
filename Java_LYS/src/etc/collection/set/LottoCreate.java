package etc.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoCreate {

	public static void main(String[] args) {

		// 로또 번호 6개를 뽑아보자

		
//		Random r = new Random();
//		int[] lotto = new int[6];
//		
//		int i = 0;
//		while(i < lotto.length) {
//			boolean flag = false;
//			int rn = r.nextInt(45) + 1;
//			for(int j=0; j<=i; j++) {
//				if(rn == lotto[j]) {
//					flag = true;
//					break;
//				}
//			}
//			if(!flag) {
//				lotto[i] = rn;
//				i++;
//			}
//		}

		
		
		// 이번에 배열 말고 리스트써보자

//		Random r = new Random();
//
//		List<Integer> lotto = new ArrayList<>();
//
//		int i = 0;
//		while (i < lotto.size()) {
//			int rn = r.nextInt(45) + 1;
//			if (!lotto.contains(rn)) {
//				lotto.add(rn);
//				i++;
//			}
//		}

		
		
		
		
		//이번에 셋을 써보자 (내가 만든 set의 중복이 되어있지 않은 6개의 숫자만 들어가 있으면 되니까 몇번 반복문도는지는 관심없음)
		//(그리고 셋은 중복X니까 중복방지로직은 안써도됨)
		
		Random r = new Random();
		Set<Integer> lotto = new HashSet<>();
		//난수가 몇번 생성될지 모르니 while문
		while(lotto.size() < 6) {
			//난수하나뽑아
			int num = r.nextInt(45)+1;
			lotto.add(num);
		}
		System.out.println(lotto);
		
		
		
		//셋을 이용해서 난수 생성했는데..중복X라서 좋긴한데
		//셋이 메서드가 별로 없어서 정렬도 안되, 특정 값도 못꺼내..
		//그럴땐 셋을 리스트로 바꾸면 된다.
		List<Integer> list = new ArrayList<>(lotto);   //생성자의 매개값으로 set을 주자. 즉, lotto를 줬다.
		//그럼 이제 정렬가능
		Collections.sort(list);
		System.out.println(list);
		//출력 결과 : 정렬 된 상태로 계속 출력이 잘 될 것이다.
		
		
		
	}
}
