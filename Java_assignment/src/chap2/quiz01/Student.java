package chap2.quiz01;

public class Student extends Person {
	
	String studentid;
	
	
	public String info() {
		String str = super.info();
		return str + ", 학번: " + studentid;
	}
}
