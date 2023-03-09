package etc.exception.basic;

public class FinallyExample {

	public static void main(String[] args) {
		
		String[] pets = {"강아지", "고양이", "짹짹이"};
		
		for(int i=0; i<4; i++) {
			try {
				System.out.println(pets[i] + "키우고 싶다");
			} catch (Exception e) {
				System.out.println("애완 동물의 정보가 없다.");
			} finally {  //예외가 발생 하든 말든 실행 하고 싶을 때 사용한다. 
						 //finally는 필수는 아님. 필요없으면 안 써도 됨, 주로 객체를 반납하거나 메모리에서 해제할 때 주로 사용한다.
				System.out.println("예외 발생 하던 말던 아무튼 실행 될 문장");
				System.out.println("----------------------------");
			}
		}
	}
}
				//출력 결과 :
				/*
				 
				 
				 
				강아지키우고 싶다
				예외 발생 하던 말던 아무튼 실행 될 문장
				----------------------------
				고양이키우고 싶다
				예외 발생 하던 말던 아무튼 실행 될 문장
				----------------------------
				짹짹이키우고 싶다
				예외 발생 하던 말던 아무튼 실행 될 문장
				----------------------------
				애완 동물의 정보가 없다.
				예외 발생 하던 말던 아무튼 실행 될 문장
				----------------------------
				
				
				
				*/