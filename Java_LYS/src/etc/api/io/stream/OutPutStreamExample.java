package etc.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutPutStreamExample {

	public static void main(String[] args) {

		/*
		 * 1. 파일을 쓸 때(작성) 사용하는 클래스는 FileOutputStream 이다.
		 * 
		 * 2. 생성자의 매개값으로 파일을 쓸 전체 경로를 지정한다. (어디로 내보낼껀지 경로를 지정!)
		 * 
		 * 3. io패키지의 모든 클래스들은 생성자에 throws 키워드가 붙어 있기 때문에(떠넘기는 키워드인 throws), 즉 예외처리가 강제되기
		 * 때문에 try-catch블럭을 항상 작성해야 한다.
		 * 
		 */

		
		// 스캐너로 입력받은 값을 텍스트로 내보자보자.
		Scanner sc = new Scanner(System.in);
		// 파일명 입력받아보자
		System.out.println("파일명 : ");
		String fileName = sc.next();

		FileOutputStream fos = null;
		try {
			// 파일경로에 빽슬래쉬 마지막에 2개긋고 파일명변수 그리고 .txt까지. 그럼 저 경로에 작성이 된다.
			fos = new FileOutputStream("C:\\Work\\file\\" + fileName + ".txt");
			System.out.print("문장을 입력 하세요: ");
			sc.nextLine(); // next는 엔터로 버벅이는 것을 인식을 못하기 때문에 집어 넣음.
			String str = sc.nextLine();

			byte[] arr = str.getBytes(); // 바이트 배열로 변환시켜줘야 가능. 즉, 문자열 데이터를 바이트데이터로 변환.

			fos.write(arr); // 파일을 바이트 단위로 써 내림. (입력받은 문자열을 바이트 배열로 변환 후 그 배열을 전달하는 것이다.)
			System.out.println("파일이 정상적으로 저장되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
			// 파일 작성은 끝났지만, 메모리 해제 과정도 필요하다. 스캐너를 close해줬던거처럼..
		} finally {
			try {
				fos.close();  // fos에 빨간불들어옴. FileoutputStream을 try문 안에서 불렀기때문..변수를 바깥으로바꾸자.
				sc.close();	  // 그리고 close도 문제있다. 트라이캐치문으로 자동완성해주자.
			} catch (IOException e) {
				e.printStackTrace();
			} 	
				// 그리고 close도 문제있다. 트라이캐치문으로 자동완성해주자.
		}

		// 빽슬래쉬 싫으면 정슬래쉬 하나씩만 해도된다.
		// FileOutputStream fos = new FileOutputStream("C:/Work/file/" + fileName +
		// ".txt");
		
		
		
		
		// > 그럼 지정한 경로에 txt파일로 글이 작성이 된다. 만약 한번 더 실행 시, 파일명은 같고 문장을 다르게 해도 새로 입력한 문장이 적용된다. 즉, 기존 파일을 덮게됨.
		
	}
}
