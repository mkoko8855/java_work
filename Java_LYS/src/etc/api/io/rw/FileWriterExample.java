package etc.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
						//문자열에 주로 사용하는 것이 reader와 writer이다.

		
		 //문자 기반 스트림을 사용하는 File Writer.
		 //영어는 읽었는데 한국어는 읽지못하는 사태가 벌어질때..
		
		
		
		 /*
			문자를 써서 저장할 때 사용하는 클래스 FilerWriter 이다.
			기본적으로 2바이트 단위로 처리하기 때문에 문자 쓰기에 적합하다.
		 */
		
		
		FileWriter fw = null; //finally에서 close를 써야 하기 때문에 생성.
		
		
		try {
			fw = new FileWriter("C:\\Work\\file\\merong.txt");  //이거 작성후 자동완성으로 예외처리!
			String str = "오늘은 3월 14일 입니다.\r\n화요일입니다.\r\n왜 화요일밖에 안됐지?";
			//  \r : 캐리지 리턴 > 커서를 맨 앞으로 땡기는 동작
			//줄 개행할 땐, \n도 맞지만 \r도 써주는 것이 관례이다. 줄 개행이 안먹을 때가 있기 때문이다. 특히 리눅스.
			//\r은 앞으로 빡 땡기고 커서를 다시 잡으라는..그런것.
			
			fw.write(str);
			System.out.println("파일이 정상적으로 저장되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}				//파일이 merong으로 txt파일로 저장이 되어 있는 것을 볼 수 있다.
