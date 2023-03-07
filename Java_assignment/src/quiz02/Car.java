package quiz02;

public class Car {

	private String model;
	private int speed;
	private char mode;
	private boolean start;

	Car(String model) {
		this.model = model;
		System.out.println(model);
	}

	public void setSpeed(int speed) {
		boolean a = false;
		if (start == a) {
			System.out.println("시동이 안걸려서 속도를 지정 할 수가 없어요");
		} else {
			if (mode != 'D' || mode != 'R') {
				System.out.println("D나 R의 기어가 아니면 속도를 지정 할 수가 없어요");
			}
			if (speed < 0 || speed > 200) {
				System.out.println("속도 조절 잘해주세요 0미만 200이상 일 순 없어요");
			}
			if (mode == 'R') {
				if (speed > 40) {
					System.out.println("R모드는 속도를 40 초과해서 지정할 수 없습니다.");
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
		injectoil();
		injectGasoline();
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
			System.out.println("변속기의 모드를 확인을 해야 합니다.");
		}
		if (mode != 'P') {
			System.out.println("기어를 P 모드로 먼저 변속기를 변경하세요");
		} else if (mode == 'P') {
			this.start = false;
			System.out.println("시동이 꺼졌습니다.");
		} else {
			System.out.println("면허다시따라..");
		}
	}

}
