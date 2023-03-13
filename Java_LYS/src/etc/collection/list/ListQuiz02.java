package etc.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. User 클래스를 은닉(캡슐화)된 변수 name, age로 선언해서 구현 User클래스의 생성자는 모든 필드값을 받는 생성자 1개.
		 * (기본생성자만들었음)
		 * 
		 * 2. User 객체를 모음저장할 수 있는 ArrayList를 선언. (main method) 3. User 객체를 3개 생성해서 리스트에
		 * 추가하세요. (main method)
		 * 
		 * 4. 리스트에 저장된 모든 이름, 나이를 for문으로 출력 (향상 for문) 5. 리스트 내부 객체 중 이름이 "홍길동" 이 있다면 그
		 * 객체를 삭제해 주세요. (일반 for문)
		 */

		List<User> userList = new ArrayList<>();

		/*
		 * User hong = new User("홍길동", 35); User kim = new User("김철수", 40); User park =
		 * new User("박영희", 45);
		 * 
		 * Collections.addAll(userList, hong, kim, park);
		 */ // 이렇게 줘도 됨

		userList.add(new User("홍길동", 20));
		userList.add(new User("김철수", 23));
		userList.add(new User("박영희", 25));

		for (User user : userList) {
			// System.out.printf("이름: %s, 나이: %d\n", user.getName(), user.getAge()); //은닉이니
			// 참조와 get으로 부르자
			// 하지만 우린 toString을 오버라이딩 해놨기 때문에 굳이 이렇게 안써도됨
			System.out.println(user); // 이게 훨씬 편하다.
		}

		// for문쓰라 헀는데 잘못된 것을보기 위해 향상된 for문을 써보자
		// TIP. (리스트의 크기를 변화시키는 어떠한 것은 break써서 반복문 안돌게 해야 된다.)
		// 즉, 향상된 for문을 사용하여 반복문을 순회 할 때, 리스트의 크기를 마음대로 줄이거나 늘릴 수 없다.
		// 향상 for문은 반복문을 시작 할 때, 구조적으로 컬렉션의 크기 및 사용 가능한 요소들의 개수를 항상 파악하고 있기 때문에
		// 값의 변경이 일어나면 예외를 발생시키도록 설계되어 있다.

//		for(User user : userList) {
//			if(user.getName().equals("홍길동")) {   //리턴 된 값을 바로 할 수 있는 getName
//				userList.remove(user);			  //그러나 여기서 에러난다.
//				break; 							  //반복문 끝내는걸 걸어버리면 에러 안난다.
//			}
//		}

		// 그럼이제 일반 for문 써보자
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getName().equals("홍길동")) { // 겟을 통해 객체의 주소값을 받고 그 주소값을 통해 홍길동을 비교하자.
//				이게 어려우면 따로 따로 부르자
//				User u = userList.get(i);
//				String name = u.getName();
//				if(name.equals("홍길동")) {
//					userList.remove(i);
			}
		}
		System.out.println(userList);
	}
}
