package chap4;

import java.util.List;
import java.util.Scanner;

//프로그램의 기능들을 메서드화 시킨 클래스.
public class Point {

	private Scanner sc = new Scanner(System.in);

	// 점수 입력창 틀 메서드.
	public void showPointUI() {
		System.out.println("================================================================");
		System.out.printf("%4s%6s%7s%8s%8s%8s%8s%8s\n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "학점");
		System.out.println("================================================================");
	}

	// 프로그램 메뉴 정보를 보여줄 메서드
	public int menuInfo() {
		System.out.println("\n*** 성적 관리 프로그램 ***");
		System.out.println("# 1. 성적 정보 입력");
		System.out.println("# 2. 전체 성적 조회");
		System.out.println("# 3. 개별 성적 조회");
		System.out.println("# 4. 성적 정보 수정");
		System.out.println("# 5. 성적 정보 삭제");
		System.out.println("# 6. 프로그램 종료");
		System.out.println("------------------------");
		System.out.print("# 메뉴를 입력하세요: ");
		int menu = sc.nextInt();
		return menu;
	}

	// 1. 학생의 성적 정보를 입력할 메서드
	public void inputPoints(List<Student> students) {
		/* Student 객체가 담긴 List 선언 > students */

		/*
		 * 1. 학생 객체를 1개 생성합니다. 2. 학생 객체에 속성값을 설정하는 메서드들을 호출해야 합니다. > 모든걸 계산해서 세팅해라 라는
		 * 얘기다 input이랑 calc랑 처리를 해라!라는 얘기다. 근데 부를 필요가 없다. 왜? 생성자인 public Student(){에서
		 * 부르잖아.. 생성자가 없다면 Stu.inputStuInfo(); Stu.calc..등()으로 불러야한다. 근데 생성자가 있으니 객체
		 * 생성만해도 호출이 된다. 3. 정보 저장이 완료된 객체를 리스트(sList)에 추가해야 합니다. 4. 저장 완료 메세지를 호출하세요.
		 * ex) XXX님의 성적 정보가 정상적으로 입력되었습니다.
		 */
		Student stu = new Student();
		students.add(stu); /* add는 내가 지정한 위치에도 추가할 수 있는 기능도 있긴 하다 */
		System.out.println(stu.getName() + "님의 성적 정보가 등록 되었습니다.");
	}

	// 2. 전체 학생들의 성적 정보를 출력할 메서드
	public void showAllPoints(List<Student> students) { // 학생 객체들이 들어있는 리스트가 와야죠?
		/*
		 * 1. 리스트 안에 들어있는 학생 객체들의 정보를 반복문을 이용하여 하나씩 전체 출력해야 합니다. 한 명의 학생 정보를 출력하는 메서드는
		 * 이미 작성 했습니다. (Student 클래스 -> outputStuInfo)
		 * 
		 * 2. 학생 점수를 출력할 때 showPointUI를 먼저 출력하고 학생들의 점수를 밑에 반복 출력해 주세요.
		 * 
		 * 3. 우리 반 평균을 가장 아랫부분에 출력해야 합니다.
		 */

		double totalAvg = 0.0; /* 모든 학생의 평균 총합을 모아놓을 변수 */

		showPointUI();

		/* 반복문 시작 */

		for (Student stu : students) {
			stu.outputStuInfo(); /* 첫번쨰학생오면 아웃풋불러주고 두번쨰도 세번째도 다 불러줄것 */
			totalAvg += stu.getAverage();
		}
		System.out.printf("\t\t\t\t\t우리반 전체 평균: %.2f점\n", totalAvg / students.size());
	}

	// 3. 개별 성적 조회 로직을 처리할 메서드
	// 아래 메서드를 이용한 것으로 풀어보자( 원래 한것들은 주석으로!)
	public void searchPoint(List<Student> studentss) {

		Student stu = findInstance("조회", studentss);
		if (stu != null) {
			System.out.printf("%s님의 성적 정보를 출력합니다.\n", stu.getName());
			showPointUI();
			stu.outputStuInfo();
		} else {
			System.out.println("입력한 학번과 일치하는 학생 정보가 없습니다.");
		}
	}

	/*
	 * 1. 입력받은 학번과 일치하는 학생 객체를 리스트에서 찾아내어 그 학생의 성적 정보만 출력합니다. 2. 찾는 학번이 존재하지 않는다면
	 * 검색하지 못했다는 메세지를 출력해 주세요.
	 */

//	public void searchPoint(List<Student> studentss) {
//
//		System.out.println("성적을 조회할 학생의 학번을 입력하세요.");
//		System.out.print("> ");
//		String stuNum = sc.next();
//
//		boolean flag = false;
	/*
	 * 리스트는 컨테인즈로 찾으면 되지않느냐? > 이 결과는 무조건 false만 나온다. 왜? studentss라는 List엔 학번만 들어있는게
	 * 아니기 떄문이다. 컨테인즈는 객체를 확인하는거지 객체 내부는 확인 X 즉, 객체안에있는 내부요소들을 비교할라면 객체안에 내부요소들을 직접
	 * 비교해나아가야지..
	 */

//		for (Student stu : studentss) {
//			if (stuNum.equals(stu.getStuId())) {
//				System.out.printf("%s님의 성적 정보를 출력합니다.\n", stu.getName());
//				showPointUI();
//				stu.outputStuInfo();
	/* 찾았으니까 플래그를 즉시 트루로 바꿔주고 반복문 나오니 브레이크까지 */
//				flag = true;
//				break;
//			}
//		}
//
//		if (!flag) {
	/* 만약 플래그가 false라면? > 못맞았구나 */
//			System.out.println("입력한 학번과 일치하는 학생 정보가 없습니다. ");
//		}
//
//	}

	// 4. 학생의 개인 성적 정보를 수정하는 메서드
	public void modifyPoint(List<Student> students) {
		/*
		 * - 학번을 먼저 입력받으세요. - 해당 학번과 일치하는 학생 객체를 리스트에서 찾아내어 그 학생의 국어, 영어, 수학점수를 새롭게 입력받아
		 * 수정을 진행합니다. 점수를 수정했다면 그 학생의 총점, 평균, 학점도 새롭게 계산해 주셔야 합니다.
		 * 
		 * - 찾는 학번이 없을 시 검색하지 못했다는 메세지를 출력해 주세요.
		 */

		System.out.println("성적을 수정할 학생의 학번을 입력하세요");
		System.out.print("> ");
		String stuNum = sc.next();

		boolean flag = false;

		for (Student stu : students) {
			if (stu.getStuId().equals(stuNum)) {
				System.out.printf("%s님의 성적 정보를 수정합니다.\n", stu.getName());

				while (true) {
					try {
						System.out.print("국어 : ");
						stu.setKor(sc.nextInt());
						System.out.print("영어 : ");
						stu.setEng(sc.nextInt());
						System.out.print("수학 : ");
						stu.setMath(sc.nextInt());
						break; /* 와일트루(입력) 브레이크 */
					} catch (Exception e) {
						System.out.println("정수로만 입력 하세요");
						sc.nextLine();
					}
				}
				stu.calcTotAvgGrade();
				System.out.println("성적 수정이 정상적으로 처리되었습니다.");
				flag = true;
				break; /* for문(학생 검색하는 for문 브레이크) 브레이크 */
			}
		}

		if (!flag) {
			System.out.println("해당 학번과 일치하는 학생 정보가 없습니다.");
		}
	}

	// 5. 학생 정보를 삭제하는 메서드
	/*
	 * - 학번을 입력받아서, 해당 학번과 일치하는 학생 객체를 리스트에서 찾아내어 그 학생의 모든 정보를 삭제해야 합니다. (리스트에서 해당
	 * 객체의 주소값 없애기) 학생 정보를 삭제할 때 "XXX님의 정보를 삭제합니다.[Y / N]" 를 출력하셔서 한 번 더 삭제 여부를 확인해
	 * 주세요. (힌트 : 리스트에서 학생 객체를 날리면 되게 쉽겠지? )
	 * 
	 * - 학생이 없다면 없다고도 출력해 주세요.
	 */
	public void deletePoint(List<Student> students) {

		System.out.println("정보를 삭제할 학생의 학번을 입력하세요");
		System.out.print("> ");
		String stuNum = sc.next();

		boolean flag = false;
		for (Student stu : students) {
			if (stuNum.equals(stu.getStuId())) {
				/*
				 * 근데 코드를 적다보니 앞에부분과 반복되는게 같잖아? 메서드 하나 더 선언해서 아예 학생 객체를 찾아주는 메서드를 만들어주는게 더 코드가
				 * 좋을꺼같긴한데....? 메서드 화 해 보자 맨 밑에 임의로 작성해보자.
				 */
				System.out.printf("%s학생의 성적 정보를 삭제합니다. [ Y / N ]\n", stu.getName());
				System.out.print("> ");

				String answer = sc.next();

				if (answer.toUpperCase().equals("Y")) { /* 입력받은 값을 일괄 대문자로 변경. > 소문자 y까지 ||를 써주는 것은 코드가 너무 길다 */
					students.remove(stu); /* remove(객체) 하면 객체 삭제되니 되겠지. */
					System.out.println("삭제가 정상 처리되었습니다. ");
				} else {
					System.out.println("삭제를 취소 합니다. ");
					return;
				}
				flag = true;
				break;
			}
		}
		if (!flag) { /* 학번을 잘못 입력 했을 수도 있으니 false다? > 학생 정보가 없다라는 것이다 */
			System.out.println("해당 학번과 일치하는 학생 정보가 없습니다.");
		}

	}

	public void close() { /* 스캐너를 닫는 메서드이다. */
		sc.close();
	}

	/* 포인트클래스 내에서만 사용할것이니 일단 private으로 주자 */
	private Student/* 리턴타입모르니 일단 냄겨 > return stu 나왔으니 Student타입이다. */ findInstance(String req,
			List<Student> list) { /* 매개값으로 수정인지 조회인지 삭제인지 어떠한 메서드를 불렸냐에 따라 다르겠지. */
		System.out.printf("%s하실 학생의 학번을 입력하세요.\n", req);
		System.out.print("> ");
		String stuNum = sc.next();

		/* 반복문 돌리고 싶은 리스트의 이름은 list */
		for (Student stu : list) {
			if (stuNum.equals(stu.getStuId())) {
				return stu; /* 객체리턴하며 끝나니 break를 안써줌 */
			}
		}

		return null; /*
						 * 그럼이제 각각의 메서드에서는 객체가 왔는지 널이 왔는지 확인하면 된다. 널이 왔다는건 학번을 잘못 입력했구나, 객체가 왔다는건 지가 원래
						 * 해야될일 한 것.
						 */

		/* 3번에다 적용 해보자. */
	}

}