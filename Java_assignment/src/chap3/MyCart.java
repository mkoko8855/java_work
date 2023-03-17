package chap3;

public class MyCart {

	private int money;
	private Product[] cart = new Product[1]; // 상품을 저장할 배열.
	private int i = 0; // cart안에 있는 상품의 개수를 알려주는 변수.

	// 객체 생성 시 money를 받아서 초기화.
	public MyCart(int money) {
		this.money = money;
	}

	/*
	 * - public void buy(모든 상품을 전달할 수 있는 매개변수)
	 * 
	 * - 가진 돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 메서드 강제 종료. - 가진 돈이 충분하면 물건의 가격을
	 * money에서 빼고 add(상품)메서드 호출.
	 */

	public void buy(Product pro) {

		if (pro.price > money) { // 물건값이 주머니값보다 비싸니까
			System.out.println("금액 부족");
			return; //void는 리턴을 안쓰는데 강제종료용으로 사용 가능
		} else { //비싸면 물건 살 것
					// 물건의 가격을 money에서 빼고 add(상품)메서드 호출해야됨.
			money -= pro.price; // > money = money-pro.price; > 돈에서 물건값을 빼고 add호출
			add(pro);
		}
	}
	
	/*
	 * - private void add(모든 상품을 받을 수 있도록 선언)
	 * 
	 * - 매개변수로 전달된 상품을 장바구니에 담는다. 상품이 추가될 때 마다 i의 값을 하나씩 올린다.
	 * 
	 * - 만약 i의 값이 장바구니의 크기보다 같거나 크다면 기존의 장바구니보다 크기가 * 2 큰 배열을 생성. 기존의 장바구니의 값을 새로운
	 * 배열에 복사. 새로운 장바구니의 주소값을 기존의 장바구니와 바꿉니다.
	 * 
	 * - 모든 로직이 완료되면 info() 메서드를 호출합니다.
	 */

	private void add(Product pro) {
		if (i >= cart.length) {
			// 기존의 장바구니보다 크기가 *2 큰 배열을 생성
			Product pro2[] = new Product[i * 2];
			for (int h = 0; h < cart.length; h++) {
				pro2[h] = cart[h];
			}
			cart = pro2; // cart는 새로운 장바구니
		}
		cart[i] = pro;
		i++;
	}
	
	
	public void info() {
		int sum = 0;
		for (int j = 0; j < i; j++) {
			System.out.println(cart[j].name);
			sum += cart[j].price;
		}
		System.out.println("물건의 합계 금액은 > " + sum + " 원 입니다.");
		System.out.println("남은 금액은 > " + money + " 원 입니다.");
	}
}

/*
 * - 장바구니 안에 담긴 물건의 목록(name)을 출력합니다. - 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력해야 합니다. - 남은
 * 금액을 출력해야 합니다.
 * - MyCart 선언이 완료되었다면 MainClass에서 buy메서드를 호출해 봅니다.
 */
