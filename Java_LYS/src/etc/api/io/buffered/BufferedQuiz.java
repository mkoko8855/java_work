package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
		 * 1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로 오늘 날짜 20211111file 이라는 이름으로 폴더를 생성하세요.
		 * 2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다. 3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로 파일을
		 * 작성합니다. (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 연결해 주시면 됩니다.) 4. '그만'으로 파일이 작성되었다면,
		 * 아무방법으로나 파일을 읽어서 콘솔에 출력해 보세요.
		 */

		Scanner sc = new Scanner(System.in);

		LocalDateTime ldt = LocalDateTime.now();

		// 포맷 객체 생성
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYYMMDD");

		String today = ldt.format(dtf);

		File file = new File("C:\\Work\\file\\" + today + "file");

		if (!file.exists()) {
			file.mkdir();
			System.out.println("폴더가 생성됨!");
		} else {
			System.out.println("폴더가 이미 존재함!");
		}

		BufferedWriter bw = null;
		String str = null;
		String text = ""; // 빈 문자열에 이어 붙이기.

		System.out.print("파일명을 입력하세요: ");
		str = sc.nextLine();

		try {
			bw = new BufferedWriter(new FileWriter("C:/Work/file/" + today + "file/" + str + ".txt"));

			System.out.println("'그만'을 입력하시면 중지됩니다.");
			while (true) {
				System.out.print("하실 말씀이 뭐에요? 적어주세요");
				String str2 = sc.next();

				if (str2.equals("그만")) {
					System.out.println("종료합니다.");
					break;
				}

				// str2에다가 입력 받은 문자열을 text에 계속 이어 붙이자 줄개행을 포함해서.
				// 미리 선언해놓은 text에 계속 추가하자.
				text += str2 + "\r\n";

			}
			// 누적해서 계속 text에 담아준다.
			bw.write(text); // 그리고 한번에 출력!
			System.out.println("파일 작성 완료");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

				// 		파일 작성을 완료 했으니 다음 순서인 이제 위 내용을 읽어 들이면 된다.
				////////////////////////////////////////////////////////
				// 		버퍼드리드로 한줄 씩 읽을 것이다.
				//      파일 읽기

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("C:/Work/file/" + today + "file/" + str + ".txt");
			br = new BufferedReader(fr);

			String read;

			while ((read = br.readLine()) != null) {
				System.out.println(read);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}