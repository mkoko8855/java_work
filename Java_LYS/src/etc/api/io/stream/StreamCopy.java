package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopy {

	public static void main(String[] args) {
		
		
		//인풋 아웃풋 둘다 필요함
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		//객체 생성 후 자동완성으로 try-catch문
		try {
			oldFile = new FileInputStream("C:\\Work\\file\\blackflower.jpg");  //읽는것은 여기서
			newFile = new FileOutputStream("C:\\Users\\ict03-21\\Desktop\\copy.jpg"); //쓰는것은 여기서, 바탕화면에 뽑아보자
			
			byte[] arr = new byte[100];  //100바이트 정도 준비.
			//무한루프, 더 이상 읽을 게 없을 때 까지
			while(true) {
				//읽어들인 데이터가 있다면 읽은 데이터 길이를 반환, 없다면 -1을 반환.
				int result = oldFile.read(arr); //얼마나 읽었는지 알기 위해 int타입으로 result라는 변수를 선언해줬다.
				if(result == -1) {
					break; 
				}
				//바이트 단위로 0에서부터 읽은 크기까지의 파일을 작성하자.
				newFile.write(arr, 0, result);  //0부터 읽어들인 값까지인 result까지.
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oldFile.close();  //oldFile.close()만 하면 여기에 빨간줄 긁히니 자동완성으로 try-catch문 포함시켜주고 newFile도 close해주자.
				newFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

							//그럼 바탕화면에 copy.jpg라는 흑장미의 사진이 나온다.