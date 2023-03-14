package etc.generic.basic02;





//여기는 멀티제네릭처럼 꾸밀 것이다. 마치 map(key,value)처럼.
public class Basic<K, V> {  //2개를 선언 해주었다.

	//그래서 Basic클래스에 멤버변수 2개를 선언한다.
	private K key;  //K를 key라는 변수의 타입으로,
	private V value; //V를 value라는 변수의 타입으로.
	
	
	//생성자 만들면 제네릭 타입의 맞는 멤버변수가 선언됨
	public Basic(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
	//게터를 직접 선언해보자 값을 줄때 생성할 때 직접 값을 전달할 것이다, 키에 해당하는 밸류를 꺼내준다. 리턴을 밸류로할 것이니 타입은 V가 될 것이다.
	public V get(K Key) {  //키를 주면 밸류가 리턴.
		return this.value;
	}


	
	//toString오버라이딩
	@Override
	public String toString() {
		return "{" + key + "=" + value + "}";
	}
	
	
	
	
	public void put(K key, V value) {   //세터 대용으로 쓸 것임
		this.key = key;
		this.value = value;
	}
	
	
	
}
