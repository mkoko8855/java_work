package etc.api.io.rw;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
					//문자열에 주로 사용하는 것이 reader와 writer이다.
		/*
		 * 문자 기반으로 읽어들이는 클래스는 FileReader 이다.
		 * 
		 * 2바이트 단위로 읽기 때문에 문자로 읽어들이기 적합하다.
		 */

		FileReader fr = null;

		try {
			fr = new FileReader("C:\\Work\\file\\merong.txt"); // 한국어로 작성된 txt문을 읽어올 때 과연 문제가 없는지 보자!

			char[] arr = new char[100];
			int result = fr.read(arr); // read라는 메서드를 통해 문자열을 한 개씩 읽어들임. 바이트 단위가 아니라 char단위니까 읽을 것이다.
			System.out.println("문자의 개수 : " + result);

			// 반복문으로 출력
			for (char c : arr) {
				System.out.print(c);
				if (c == 0) { // 근데 만약 c가 없다면 그만 읽으라고 break;넣어주자
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}										//출력 결과 :
/*
										문자의 개수 : 38
										오늘은 3월 14일 입니다.
										화요일입니다.
										왜 화요일밖에 안됐지?
*/