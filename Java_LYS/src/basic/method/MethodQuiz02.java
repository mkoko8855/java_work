package basic.method;

import java.util.Arrays;

public class MethodQuiz02 {

	static String[] foods = { "떡볶이", "치킨", "파스타" };

	// 배열의 맨 마지막 위치에 데이터를 추가하는 함수
	// 팁 : 배열의 삭제를 진행했었지. 크기가 하나 작은 배열을 선언해서 값을 내렸지.
	// 그거의 반대다. 기존의 배열보다 하나 더 큰 배열을 선언한다.
	// 값을 그대로 내린다음 전달되는 값만 마지막에 박자.
	static void push(String newFood) { // newFood는 들어올 새 값이다.
		String[] temp = new String[foods.length + 1];
		for (int i = 0; i < foods.length; i++) {
			temp[i] = foods[i];
		}
		temp[temp.length - 1] = newFood;
		foods = temp;
	} // 출력 결과 : 떡볶이, 치킨, 파스타, 라면, 김치찌개

	// 배열이 내부 데이터를 단순 출력 함수
	static void printFood() {
		System.out.println(Arrays.toString(foods));
	}

	// 배열 내의 특정 음식의 위치를 찾아주는 함수
	// 팁 : 반복문 이용해서 돌리면 됨

	static int indexOf(String targetName) {
//		int idx = 0;
//		boolean flag = false;
		for (int i = 0; i < foods.length; i++) {
			if (targetName.equals(foods[i])) {
//				idx = i;
//				flag = true;
//				break;
				return i;  //메서드가 종료되면서 i값이 리턴 된다.
			}
		}
//		if(!flag) idx = -1;
		return -1;
	}

	// 특정 음식의 배열 포함 여부(참/거짓) (포함되어 있으면 트루)
	// 팁 : include는 indexOf의 리턴값으로 판단하여 리턴
	static boolean include(String targetName) {
		//이미 완성한 메서드가 있다. 바로 indexOf이다.
		
		//인덱스오브에게 타겟을 넘겼을 때 -1이 아니라면
		return indexOf(targetName) != -1;
		//존재하는 음식이 왔다면 -1을 제외한 다른 것들이 온다.
	}

	
	
	// 특정 음식 제거 함수
	// 앞에서 진행한 배열의 삭제 로직 이용.
	static void remove(String targetName) {
	//먼저 삭제하고자 하는 이름이 targetName으로 전달될테니 얘부터 어딨는지 찾자
	//for문을 쓰지 않아도 indexOf가 해줄 수 있다.
	//indexOf를 부르자
	//(인덱스를 찾는 과정은 위 특정 음식 위치 찾는거에 있으니)
		int idx = indexOf(targetName);
		if(idx == -1) {
			System.out.println("존재하지 않는 음식명입니다.");
		} else {
			//뒤에있는거 앞으로 한칸씩 땡기면서 하자
			for(int i=idx; i<foods.length-1; i++) {
				foods[i] = foods[i+1]; //앞으로 땡기기
			}
			//추가는 길게, 지금은 삭제니까 크기가 하나 작은 배열 선언
			String[] temp = new String[foods.length-1];
			//다시 한번 반복문 열기
			for(int j=0; j<temp.length; j++) {
				//템프라는 배열의 j번째 인덱스에 푸드를 박자
				temp[j] = foods[j];
			}
			foods = temp; //이제 템프를 넘겨주자
			temp = null; //메서드 끝나면 템프는 사라지니 안써도되긴함
		}
	}

	
	// 특정 음식 수정 메서드
	static void modify(int targetIdx, String newFood) {
		//뉴푸드를 타겟인덱스에 줘버려
		foods[targetIdx] = newFood;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		printFood();
		push("라면"); // 출력 결과 : [떡볶이, 치킨, 파스타, 라면, 김치찌개]
		push("김치찌개"); // 출력 결과 : [떡볶이, 치킨, 파스타, 라면, 김치찌개]
		printFood();

		
		
		
		// 파스타의 인덱스를 알아내세요
		System.out.println("파스타의 인덱스 : " + indexOf("파스타"));
		// 출력 결과 : 파스타의 인덱스 : 2
		
		
		
		
		
		// 김치찌개의 인덱스를 알아내세요
		System.out.println("김치찌개의 인덱스 : " + indexOf("김치찌개"));
		// 출력 결과 : 김치찌개의 인덱스 : 4
		

		
		
		
		// 짜장면의 인덱스를 알아내세요 > 없으니까 -1을 리턴하시면 됩니다.
		System.out.println("짜장면의 인덱스 : " + indexOf("짜장면"));
		// 출력 결과 : 짜장면의 인덱스 : -1

		
		
		
		
		
		 remove("김치찌개");
		 remove("망고"); // "존재하지 않는 음식명입니다." 출력해야됨, 출력이 됨.
		 printFood();
		//출력 결과 : 존재하지 않는 음식명입니다. [떡볶이, 치킨, 파스타, 라면] 
		//remove를 통해 김치찌개가 있었는데 삭제가 되었다.
		
		 
		 
		 
		 
		 
		// 라면의 존재 여부 (include)
		System.out.println(include("라면"));
		// 그럼 라면을 인덱스오브로 넘기고
		// 인덱스오브는 -1 또는 제대로된 인덱스를 줄거고
	    // 제대로된 인덱스면 트루로 리턴이 된다.
		// 출력 결과 : true
		
		 
		 
		
		// 양념치킨의 존재 여부
		System.out.println(include("양념치킨"));
		// 출력 결과 : false
		
		 
		 
		
		
		// 2번 인덱스 데이터를 닭갈비로 수정
		modify(2, "닭갈비");
		printFood(); //를 통해 한번 배열의 내부를 확인해보자 닭갈비로 변경 되었는지
		//출력 결과 : [떡볶이, 치킨, 닭갈비, 라면]   (원래는 2번인덱스가 파스타였다 근데 닭갈비로 바꿨다)
	}
}