package chap2.quiz02;

public class Car {

//프로젝트는 이전 과제에서 사용한 프로젝트를 이용합니다.
//
//공통 패키지명: chap2 
//
//문제를 모두 작성하신 후에 export 하셔서 압축 파일로 제출해 주시면 되겠습니다.
//
//export 하실 때는 이번 과제 내용만 체크 하셔서 export 해 주세요.
//
//이해가 가지 않는 문제라면 꼭 얘기하세요~
//
//********** 1번 **********
//
//패키지명: quiz01
//
//클래스명: Person, Student, Teacher, Employee, MainClass
//
//문제:
//	- 학생(Student), 선생(Teacher), 종업원(Employee)
//	클래스를 생성하려고 합니다.
//
//	- 세 클래스는 공통적으로 이름과 나이를 가지고 있습니다.
//
//	- 세 클래스는 공통적으로 info() 메서드를 가지고 있습니다.
//	(리턴 타입: String, 이름: XXX, 나이: XXX )
//
//	- 학생은 학번(studentId)을 가지고 있고,
//	선생은 담당 과목(subject)를 가지고 있고,
//	종업원은 부서 (departments)를 가지고 있습니다.
//
//	- 부모 클래스의 이름은 Person으로 하겠습니다.
//	Person 클래스 생성 후 각각의 자식 클래스를 생성 하시고
//	MainClass에서 정보를 출력해 보세요.
//	
//입력: 
//	입력은 따로 받지 않습니다. 값을 직접 주시면 됩니다.
//	
//출력:
//	ex) 
//		이름: 홍길동, 나이: 30세, 학번: a001
//		이름: 김철수, 나이: 50세, 과목: 수학
//		이름: 박영희, 나이: 25세, 부서: 영업부
//
//
//********** 문제 2 **********
//
//패키지명: quiz02
//
//클래스명: Car, MainClass
//
//문제: 
//	은닉(캡슐화)를 활용하여 자동차 클래스를 설계합니다.
//	클래스 요구사항에 맞게 제작해 주시면 되겠습니다.
//	클래스 설계 후 MainClass에서 객체를 생성 후 메서드를 호출합니다.
//	
//요구사항:
//	Car 클래스의 멤버변수:
//		model (String) -> 차 모델명
//		speed (int) -> 현재 속도
//		mode (char) -> 변속 모드 (P, R, N, D)
//		start (boolean) -> 시동 온/오프 상태 여부
//		
//	Car 클래스의 생성자:
//		String 매개값을 받는 생성자가 하나 존재합니다.
//		
//	Car 클래스의 메서드:
//		setSpeed -> 속도는 0 미만, 200 이상일 수 없습니다.
//					시동이 걸려있지 않은 상태라면 속도를 지정할 수 없습니다.
//					D나 R모드가 아니라면 속도를 지정할 수 없습니다.
//					R모드는 속도를 40 초과해서 지정할 수 없습니다.
//		
//		setMode -> 전달받은 변속 모드에 따라 상태를 변경합니다.
//				   지정된 값 이외의 매개값은 P 모드로 통일합니다.
//		
//		setMode, getMode -> 기본 형태로 지정합니다.
//		
//		void engineStart() -> 시동을 거는 기능입니다.
//		1. "시동버튼을 눌렀습니다." 는 출력문 실행.
//		2. 엔진오일이 주입되는 기능 실행.
//		3. 엔진에 연료가 주입되는 기능 실행.
//		4. 시동 온/오프 상태 변수의 값을 변경.
//		5. 실린더가 움직이는 기능 실행.
//		6. "시동이 걸렸습니다." 는 출력문 실행.
//		
//		void injectGasoline() -> 엔진에 연료가 주입되는 기능입니다.
//		1. "연료가 엔진에 주입됩니다." 출력문 실행.
//		
//		void injectOil() -> 엔진오일이 주입되는 기능입니다.
//		1. "엔진오일이 순환합니다." 출력문 실행.
//		
//		void moveCylinder() -> 실린더가 움직이는 기능입니다.
//		1. 시동 여부에 따라 실린더의 상태를 출력합니다.
//		시동이 켜져 있다면? "실린더가 움직입니다." 출력문 실행.
//		시동이 꺼져 있다면? "실린더가 움직이지 않습니다." 출력문 실행.
//		
//		void engineStop() -> 시동을 끄는 기능입니다.
//		1. 객체의 현재 속도를 확인해서 0 이상이라면 시동을 끌 수 없습니다.
//		"주행 중에는 시동을 끌 수 없습니다." 출력문 실행하고 강제 종료.
//		2. 속도가 0 이라면 변속기의 모드를 확인합니다.
//		P 모드가 아니라면 "P 모드로 먼저 변속기를 변경하세요." 출력 후 강제 종료.
//		3. 변속 모드까지 이상이 없다면 시동 온/오프 여부를 조작한 후 
//		"시동이 꺼졌습니다." 출력문 실행.
//		
//		isStart(), setStart() -> 기본형태로 지정합니다.
//		
//	
//	접근 제한 형태: 
//		캡슐화의 접근 제한을 기본적으로 활용하되,
//		차량 내부의 동작을 수행하는 메서드는 외부에서 호출하면 안되게 작성해 주세요.
//		(연료 주입, 실린더 동작 등)
//		
//	
//
//출력(실행): 
//	Main 메서드에서 Car 객체를 적절한 모델명과 함께 생성합니다.
//	시동을 걸지 않은 상태에서 속도를 올려 봅니다.
//	그 후 시동을 걸고 변속기를 D 모드로 지정한 후 속도를 100까지 올립니다.
//	속도가 100인 상태에서 시동을 한 번 꺼 봅니다. 
//	속도를 완전히 줄인 후 변속기를 P 모드로 지정하고 시동을 끕니다.

	private String model;
	private int speed;
	private char mode;
	private boolean start;

	Car(String model) {
		this.model = model;
		System.out.println(model);
	}

	public void setSpeed(int speed) {
		if (start == false) {
			System.out.println("시동이 안걸려서 속도를 지정 할 수가 없어요");
		} else {
			if (mode != 'D' && mode != 'R') {
				System.out.println("D나 R의 기어가 아니면 속도를 지정 할 수가 없어요");
			}
			if (speed < 0 || speed > 200) {
				System.out.println("속도 조절 잘해주세요 0미만 200이상 일 순 없어요");
			}
			if (mode == 'R') {
				if (speed > 40) {
					System.out.println("R모드는 속도를 40 초과해서 지정할 수 없습니다.");
				} else {
					System.out.println("");
				}
			}
		}
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setMode(char mode) {
		this.mode = mode;
	}

	public char getMode() {
		return mode;
	}

	void engineStart() {
		System.out.println("시동 버튼을 눌렀습니다.");
		injectGasoline();
		injectoil();
		this.start = true;
		moveCylinder();
		System.out.println("시동이 걸렸습니다.");
	}

	void injectGasoline() {
		System.out.println("연로가 엔진에 주입됩니다.");
	}

	void injectoil() {
		System.out.println("엔진오일이 순환 합니다.");
	}

	void moveCylinder() {
		if (start == true) {
			System.out.println("실린더가 움직입니다.");
		} else {
			System.out.println("실린더가 움직이지 않습니다.");
		}
	}

	void engineStop() {
		if (speed > 0) {
			System.out.println("시동을 끌 수가 없어요");
		} else if (speed != 0) {
			System.out.println("주행 중에는 시동을 끌 수가 없어요");
		} else if (speed == 0) {
			if (mode != 'P') {
				System.out.println("기어를 P로 바꾸세요");
			} else if (mode == 'P') {
				System.out.println("시동 끕니다.");
				start = false;
			}
		}
	}
}