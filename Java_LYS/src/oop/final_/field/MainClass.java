package oop.final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		
		Person kim = new Person("김철수");      //파이널때문에 객체 생성할 때 이름을 줘서 값을 보내 줘야 한다. 
		
     	//kim.nation = "미국";                 //nation이 파이널이라 미국 같은 선언은 안된다. 값을 얻을 거면 파이널을 지워야 한다.
		
		//kim.name = "김마이클";                //이름도 파이널이라 변경이 안된다. 객체 생성할 때 전달 했기 때문에 김철수는 이제 불변한다.
		
		kim.age = 30;                        //나이는 파이널이 아니니까 가능하다.
		
		
		
		Person park = new Person("박영희");    //같은 클래스 안이기 때문에 동일한 규칙을 받아서 nation과 name은 값이 안들어감. 박영희는 가능
		//park.nation = "영국";
		//park.name = "박영국";
		
		
		
		
		
		
	}
}
