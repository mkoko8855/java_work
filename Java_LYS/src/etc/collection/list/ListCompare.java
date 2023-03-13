package etc.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {

	public static void main(String[] args) {
		
		
		 /*
		 
		 	ArrayList는 탐색 후 객체를 참조하는 경우에 유리하고
		 	
		 	LinkedList는 잦은 삽입/삭제 등으로 리스트의 크기가 변할 때 유리하다.
		 	
		 	둘 다 사이즈가 크지 않다면 큰 차이는 없다.
		 
		 */
		
		
		
		
				//어레이리스트와 링크드리스트의 차이점을 보자! 먼저 어레이리스트의 데이터 제어
		
		
		List<Integer> array = new ArrayList<>();
		List<Integer> linked = new LinkedList<>();
		
		
		
		//반복문 일단 열자
		for(int i=0; i<1000000; i++) {
			array.add(i);
			linked.add(i);
		}
		
		long start, end; //시작시간, 끝시간
		
		start = System.currentTimeMillis();
		for(int i=0; i<array.size(); i++) {
			//삭제 해보기
			array.remove(47532);                      
			
			//이번엔 값 얻어오기
			//array.get(i);							
		}
		end = System.currentTimeMillis();
		System.out.printf("어레이리스트의 소요시간 : %dms\n", end-start);
		
		
		
		
		System.out.println("--------------------------------------------------------------------------");
		
		
		
		
		//링크드리스트에서 데이터 제어 해보자
		start = System.currentTimeMillis();
		for(int i=0; i<linked.size(); i++) {
			linked.remove(47532);  
		}
		end = System.currentTimeMillis();
		System.out.printf("링크드리스트의 소요시간 : %dms\n", end-start);
	}
}
