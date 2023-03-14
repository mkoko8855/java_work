package etc.api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		 /*
		 	자바에서 외부 경로로 폴더를 생성할 때는 File 클래스를 사용한다.
		 	
		 	생성자의 매개값으로 폴더를 생성할 경로 + 폴더명을 지정한다.
		 */
		
		File file = new File("C:\\Work\\folder_test\\test\\mytest\\apple");
		
		if(!file.exists()) {						//이 exists메서드는 경로에 파일이 존재하는지 알려주는 메서드. 존재하면 트루, 아니면 폴스를 준다.
			file.mkdirs();							//!붙였으니, 존재하지 않는다면이 궁금하다.
			System.out.println("폴더 생성 완료");		//존재 하지 않으면 mkdir폴더를 만들어라!
		}	else {
			System.out.println("해당 폴더가 존재합니다.");
		}
	}
}
			//폴더가 정상적으로 생성됨을 알 수가 있다.

			//그런데, 폴더 테스트 안에 폴더 이름을 test폴더로, 또 그안에 mytest를 또만들거고 또 그 안에 apple을 만든다면?
			//출력은 폴더 생성 완료지만 실제로 생성 되지 않는다. mkdir은 하나만 만들어준다.
			//그럼어떡해? 여러개를 만들고싶은데?
			//메서드를 다른 것을 써야 한다. mkdir이 아니라 mkdirs로 해야 한다. 그럼 생성 가능



			//그리고 폴더를 삭제 할 수 있다. folder패키지에 DeleteFile 클래스로 가보자
			//폴더랑 파일 지울 수 있다.