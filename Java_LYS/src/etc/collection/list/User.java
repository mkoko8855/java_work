package etc.collection.list;

public class User {

	 private String name;
	 private int age;
	 
	 
	 public User() {}
	 
	 
	 
	 
	 public User(String name, int age) {
		 super();
		 this.name = name;
		 this.age = age;
	 }
	 
	 
	 
	 
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



//바로 변수 내부의 값을 알 수 있게.
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
