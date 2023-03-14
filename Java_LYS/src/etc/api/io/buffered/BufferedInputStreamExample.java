package etc.api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {
													//버퍼드를 이용한 인풋스트림@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	public static void main(String[] args) {
		
		
		//버퍼드가 붙은 애들은 다 똑같다. 앞에서 배운 것들이 다 필요하다
		
		
		FileInputStream fis = null;      //객체 생성 후
		BufferedInputStream bis = null;  //얘한테 넘겨 주는 것임.
		
		
		try {
			fis = new FileInputStream("C:\\Work\\file\\merong.txt");   //객체 생성 후
			bis = new BufferedInputStream(fis);		//얘한테 넘겨 주는 것임
			//지금 bis는 바이트 단위로 읽는 것이라 어떤 종류가 있는지 알아보자.
			
			
			 /*
			 	메서드가 여러 가지가 있다.
			 	read() : 한 바이트를 int로 읽어옴
			 	read(byte[]) : 전달한 byte[]의 크기만큼 채워준다.
			 	전달한 배열에 몇 byte를 채웠는지 반환한다.
			 	
			 	read(byte[], off, len) : 전달한 byte[] 중에 off부터 len까지만 데이터를 채운다.
			 	
			 	이들 중 원하는거 쓰자.
			 */
			
			int b;
			while((b=bis.read())!= -1) {   //전달한 결과가 -1이 아니라면,
				System.out.print((char)b);	//b를 char형식으로 출력하라.
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}							//출력 결과 : 읽어와지긴 하는데 깨진다. 어쨌든 예외 처리가 안나니 되긴 된다는 것을 보여줌.
						    //즉, 한글로 작성한 것은 깨지긴 깨진다 라는 것..
