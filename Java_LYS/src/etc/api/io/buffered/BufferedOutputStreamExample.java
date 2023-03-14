package etc.api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
		
		System.out.println("시작!");
		
		//연습용 더미 데이트를 하나 만들자
		//스트링으로 만들면 오래 걸리니, 앞에서 배웠던 스트링빌더를 이용하자
		
		StringBuilder text = new StringBuilder();   //이 빌더 객체를 이용해서 백만줄을 만든다.
		
		//반복문 이용하자
		for(int i=1; i<=1000000; i++) {
			text.append(i + "안녕하세요\n"); //이것을 백 만번 진행 할 것이다.
		}
		
		
		
		FileOutputStream fos = null;    //파일아웃스트림을 통해 한줄씩 써내려갈 것이다.
		BufferedOutputStream bos = null;
		
		//시간 측정을 위한 것.
		long start = System.currentTimeMillis();
		
		//파일아웃풋스트림객체부터 생성해보자.
		try {
//			fos = new FileOutputStream("C:\\Work\\file\\fout.txt");  //속도 측정해보자.
			fos = new FileOutputStream("C:\\Work\\file\\bout.txt");  //속도 측정해보자.

			bos = new BufferedOutputStream(fos);
			//문자열(스트링)으로 변환하자
			byte[] data = new String(text).getBytes();   //겟바이트 메서드 이용.
			
			for(byte b : data) {
//				fos.write(b); //파일인풋스트림에게 write해라 라는 뜻.
				bos.write(b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close(); 
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//끝나는 시간 체크
		long end = System.currentTimeMillis();
		
		//소요 시간 체크
		System.out.println("소요 시간 : " + (end-start)*0.001 + "초");  //초로 표현할 것이면 0.001곱하기.
	}
}
						//출력 결과 : 파일아웃풋스트림으로, 백만줄을 바이트로, 직접 타입에 접근하는 	소요 시간 : 75.01초
						//출력 결과 : 버퍼드아웃풋스트림으로, 몇초 걸리는가? 					소요 시간 : 0.509초

						//대용량의 파일은 버퍼드가 붙은 클래스를 사용하는 것이 더 빠르다는 것을 확인 할 수 있다.