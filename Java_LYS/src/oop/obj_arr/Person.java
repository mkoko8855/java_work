package oop.obj_arr;

public class Person {

	 /*
	 	우클릭 + source 들어가도 됨.
	 	근데 source가 alt+shift+s임
	 */
	
	
	
	
	

	private String name;
	private int age;
	private String gender;
	
	
	//ctrl + space + enter 면 기본 생성자 자동 생성됨
	public Person() {
		
	}
	
	
	//생성자 쉽게 만드는 방법 : alt + shift + s > Generate constructor using fields..
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	//프라이빗이니 게터랑 세터를 만들어야되는데 (값을넣고빼고해야할텐데..)
	//각 게터, 세터 만들기엔 귀찮잖아
	//그래서 게터, 세터를 자동으로 완성시켜주는 것이 있다.
	//alt+shift+s > 게터 세터 > 완성
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
	public void personInfo() {
		System.out.printf("이름 : %s\n 나이: %d세\n 성별: %s\n", this.name, this.age, this.gender);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
