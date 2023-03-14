package etc.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterExample {

	public static void main(String[] args) {
			
			 /*
			 		Buffered I/O
			 		
			 		버퍼를 이용해서 읽기와 쓰기 성능을 향상시키는 클래스.
			 		
			 		버퍼 : 데이터를 입/출력 하기 전에 임시로 저장해 두는 배열 형태의 공간.
			 		
			 		
			 		버퍼를 이용해야 하는 이유는 무엇인가?
			 		
			 		버퍼를 이용하지 않으면 입력과 출력이 너무 자주 일어난다.
			 
			 		EX) 
			 		"Java Programming" 이라는 문자를 쓰는 경우,
			 		기본 OutputStream을 사용하면 한 글자씩 일일이, 즉 16번의 출력이 발생한다.
			 		그렇기 때문에 버퍼로 저장하고 한번에 쓰면 한 번의 출력으로 끝나지 않을까 라는 것이다.
			 */
			
			
			Scanner sc = new Scanner(System.in);
			
			//버퍼를 이용한다 했지만 FileWriter도 사용해야 한다.
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			try {
				fw = new FileWriter("C:\\Work\\file\\merong2.txt");  //객체 생성 후.
				bw = new BufferedWriter(fw); //버퍼드롸이터에게 전달.
				
				System.out.println("첫 문장 : ");
				String str1 = sc.nextLine();
				
				System.out.println("두번째 문장 : ");
				String str2 = sc.nextLine();
				
				bw.write(str1 + "\r\n" + str2);
				
				System.out.println("파일 정상 출력 완료!");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();  //bw는  fw를 받았으니 얘부터 먼저 해주는게 좋다. 만들어진 순서 반대로 닫아주면 된다.
					fw.close();
					sc.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
}


//출력 결과:  work > file > merong2 작성 완료 됨을 알 수가 있다.
/*
첫 문장 : 
안녕하세요~~
두번째 문장 : 
반갑습니다!!
파일 정상 출력 완료!
*/