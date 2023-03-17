package chap2.quiz02;

public class MainClass {

	public static void main(String[] args) {

		Car c = new Car("벤츄르~~~");

		c.engineStart(); //시동걸자
		c.setMode('D');  //달리자
		c.setSpeed(100);
		c.setSpeed(0);
		c.setMode('P');
		c.engineStop();
	}
}
