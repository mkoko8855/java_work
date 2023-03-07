package quiz01;

public class Teacher extends Person {

	String subject;
	
	
	public String info() {
		String str2 = super.info();
		return str2 + ", 과목: " +  subject;
	}
}
