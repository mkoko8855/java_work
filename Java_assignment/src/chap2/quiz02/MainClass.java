package chap2.quiz02;

public class MainClass {

	public static void main(String[] args) {

		Car c = new Car("메르세데스 벤츠 AGM 1세대");

		c.setSpeed(2000);
		c.engineStart();
		c.setMode('D');
		c.setSpeed(100);
		c.engineStop();
		c.setSpeed(0);
		c.setMode('P');
		c.engineStop();
	}
}
