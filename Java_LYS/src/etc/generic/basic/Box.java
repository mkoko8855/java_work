package etc.generic.basic;

public class Box<T> {  //꼭 T 안써도 된다. 제네릭 클래스로 선언한 것.

	
	private T t;  //클래스가 T니까 변수 타입도 T(제네릭)타입이 되는 것이다.

	
	
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
	
	
	
}
