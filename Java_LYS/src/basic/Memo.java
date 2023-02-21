package basic;

public class Memo {
	public static void main(String[] args) {
		int number = 10;
		int result = 0;

		for(int i = 0;i<10;i++){
			try{
				result = number / (int)(Math.random()*10);
				System.out.println(result);
			}catch (ArithmeticException e){
				System.out.println("예외 처리");
			}
		}
	}
}

