package quiz01;

public class Employee extends Person {

	String departments;
	
	
	public String info(){
		String str1 = super.info();
		return str1 + ", 부서 :" + departments;
	}
}
