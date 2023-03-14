package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Inputstream {

	public static void main(String[] args) {
		
		
		//파일 읽기
		
		 /*
		 	1. 파일을 읽어들이는 데 사용하는 클래스는 FileInputStream 이다.
		 	
		 	2. 생성자의 매개값으로 읽어들일 파일의 전체 경로를 적는다.
		 	
		 	3. InputStream 객체는 생성자에 throws가 있기 때문에 얘도 예외처리 해줘야 한다.
		 	
		 */
		
		
		FileInputStream fis = null;  //일단 null주고 나중에 값주면됨.
		
		
		try {
			fis = new FileInputStream("C:\\Work\\file\\hello.txt");
			//fis.read(); //리드메서드를 통해 읽어들일 수 있는데 read 메서드는 int로 읽는다. int로 받자.
			//int data = fis.read(); //1바이트 단위로 데이터를 읽어들임.
			//받고, 출력을 하자
			//System.out.println((char)data); //int를 char로 형변환. 즉, 숫자형을 문자형으로 변환 출력.
			//그러나 맨 아래 가보면 반복해야된다고 설명을 했기 때문에 while(true)로 무한반복 해주자.
			
//			while(true) {
//				int data = fis.read();
//				System.out.print((char)data);  //print로 출력.
//				if(data == -1) {
//					break; //read()메서드가 더 이상 읽을 값이 없다면 -1을 반환한다.
//				}
//			}
			
			//다음으로, 일단 위의 와일문 주석처리 하고 다른 방법이 있다.
			//바이트 배열을 준비한다.
			byte[] arr = new byte[15];
			int result = fis.read(arr); //15바이트 단위로 읽어들임. 이번엔 매개값으로 배열을 줬다. 반복문 필요가 없지.
										//한번에 읽어들이기 떄문에.
			System.out.println("읽어들인 데이터의 길이는? " + result);
			System.out.println("배열의 내부는? " + Arrays.toString(arr));
			//char로 변환해서 하나씩 읽어보자
			int i = 0;
			while(arr[i] != 0) {  //0이 아니라면 반복문 돌고 0이라면 그만 두겠다.
				System.out.print((char)arr[i]);
				i++;
			}
			//출력 결과 : 
			/*
			읽어들인 데이터의 길이는? 12
			배열의 내부는? [104, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100, 33, 0, 0, 0]   //이 배열은 아스키코드. 32는 공백. 그 다음 읽을 게 없으니 0...
			hello world!
			*/
			
			
		} catch (Exception e) {  //다른 타입의 예외가 있기에 Exception으로 바꿔주자
			e.printStackTrace(); //역추적해서 어디서, 어떻게 발생했는지 알려 주는 것.
		} finally {
			try {
				//스트림을 더 이상 사용하지 않는 경우, 시스템 자원을 반납하는 코드를 꼭 작성해야 한다.
				//스캐너 close처럼.
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}                       //출력 결과 : © 
						//이유 : (1바이트 단위로 데이터를 읽는데 hello.txt는 1바이트가 넘는다.
						//(read로 한번 부르면 1바이트만 읽으니 더 이상 읽어드릴 데이터가 없을 때 까지 반복해줘야 한다.)
		
						//그러나 반복문 돌려도 출력이 안된다. 왜? 한글은 2바이트다..1바이트씩 표현하니 안된다..
						//메모장에 내용이 영어라면 정상 작동이 된다.
						//현재 hello world!로 바꿨고, 출력 결과도 똑같다. 즉, 잘 작동한다.







						//이번에 그림파일 하나만 준비하자



							

