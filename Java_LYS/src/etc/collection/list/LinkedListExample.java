package etc.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		//LinkedList 객체를 모두가 사용하려면 타입을 맞춰야겟지.
		//List로 했었는데, LinkedList 기능만을 소개하기 위해 LinkedList로 변수를 선언해주자.
		LinkedList<String> list = new LinkedList<>();
		
		
		//추가
		list.add("홍길동");
		list.add("김철수");
		list.add("박영희");
		
		list.addFirst("맨 앞");
		list.addLast("맨 뒤");
		System.out.println(list);
		//출력 결과 : [맨 앞, 홍길동, 김철수, 박영희, 맨 뒤]
		
		
		
		
		
		//꺼내기
		System.out.println(list.get(3));
		//출력 결과 : 박영희
		
		
		
		
		
		
		//맨앞 맨뒤값
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		//출력 결과 : 
		/*
		맨 앞
		맨 뒤
		*/
		
		
		
		
		
		
		//삭제
		list.remove(0);
		System.out.println(list);
		//출력 결과 : [홍길동, 김철수, 박영희, 맨 뒤]    (맨 앞이 사라짐)
		
		
		
		
		
		
		
		
		//LIFO : last in first out > stack 자료(구조)에서 사용하는 구조. (즉, 마지막으로 들어온 것이 먼저 나간다 라는..)
		//stack을 사용했을 때 메서드 : push, pop, peek
		
		list.push("김뽀삐");    //앞에서부터 값이 추가됨
		System.out.println(list);
		//출력 결과 : [김뽀삐, 홍길동, 김철수, 박영희, 맨 뒤]
		
		
		//실제로 삭제하면서 데이터를 읽기
		System.out.println(list.pop());  //list에서 값이 나오는데, return받아서 값을 활용할 수도 있다.
										 //나중에 들어간 값이 제일 먼저 나온다!
		System.out.println(list);
		//출력 결과 : [홍길동, 김철수, 박영희, 맨 뒤]    //김뽀삐가 나중에 들어갔으니 pop으로 삭제하는건 김뽀삐다.
		
		
		
		//삭제하지 않으면서 데이터만 꺼내오기(읽기)
		System.out.println(list.peek());       //홍길동
		System.out.println(list);			   //[홍길동, 김철수, 박영희, 맨 뒤]
		
		
		
		
		
		
		
		//FIFO : first in first out > 첫번째 들어간 게 첫번째로 나온다.
		//자료구조 : Queue
		//메서드 : offer, poll, peek
		
		list.offer("a");
		System.out.println(list);   //마지막에 값이 추가됨  [홍길동, 김철수, 박영희, 맨 뒤, a]
		//출력 결과 : [홍길동, 김철수, 박영희, 맨 뒤, a]
		list.offer("b");
		list.offer("c");
		System.out.println(list);
		//출력 결과 : [홍길동, 김철수, 박영희, 맨 뒤, a]
		//출력 결과 : [홍길동, 김철수, 박영희, 맨 뒤, a, b, c]
		
		
		
		
		
		
		System.out.println(list.poll()); //팝은 마지막으로 처음 튀어 나왔다면, 폴은 반대이다. 
		System.out.println(list);
		//홍길동
		//[김철수, 박영희, 맨 뒤, a, b, c]
		
		
		
		
		
		
		System.out.println(list.peek()); 
		System.out.println(list);
		//김철수
		//[김철수, 박영희, 맨 뒤, a, b, c]
		
	}
}
