package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		
		//그럼 이제 버퍼드로 읽어보자
		
		FileReader fr = null;
		BufferedReader br = null;
		//버퍼드가 있는 애들은 생성자를 매개체로, 받을 수 있다.
		try {
			fr = new FileReader("C:\\Work\\file\\merong2.txt");
			br = new BufferedReader(fr); //여기서 받기 가능.
			
			//System.out.println(br.readLine()); 	
			//BufferedReader에는 메서드가 있는데 readLine() 이라는 메서드가 있다.
			//얜 한 줄을 통째로 읽어서 String으로 리턴한다. 그래서 배열 같은거 선언 할 필요가 없다.
			//더 이상 읽어들일 데이터가 없다면 null을 리턴한다.
			
			//더이상 읽을게 없을 떄 까지 읽되, null이 안되게 알아서 종료되게 처리를 해줘 라면?
			String str;
			while((str = br.readLine())!=null) {  //한줄의 결과가 널이온다면 그만두고, 아니면 str을 계속 출력해. 라는 것이다.
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

//출력 결과 :
//안녕하세요~~
//반갑습니다!!