package quiz01;

public class MainClass {

	public static void main(String[] args) {
		
		Student stu = new Student();
		Teacher tea = new Teacher();
		Employee emp = new Employee();
		
		
		stu.name = "홍길동";
		stu.age = 30;
		stu.studentid = "a001";
		System.out.println(stu.info());
		
		tea.name = "김철수";
		tea.age = 50;
		tea.subject = "수학";
		System.out.println(tea.info());
		
		
		emp.name = "박영희";
		emp.age = 25;
		emp.departments = "영업부";
		System.out.println(emp.info());
		
		
		
	}
}
