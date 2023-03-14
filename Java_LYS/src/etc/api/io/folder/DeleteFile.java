package etc.api.io.folder;

import java.io.File;
import java.util.Arrays;

public class DeleteFile {

	public static void main(String[] args) {
		
		//객체만들면서 지우고자 하는 경로를 적어주자 (폴더테스트 > 테스트 와서 주소 복사 후 복사붙여넣기)
		File file = new File("C:\\Work\\folder_test\\test\\mytest\\apple");
		
		
		//지워줘
		//파일이 존재하는지 부터. 얜 존재를 해야 삭제가 가능하니 CreateFolder클래스에 사용한 !와는 다르겠지. !는 빼준다.
		if(file.exists()) {
			file.delete(); //삭제 성공 시 트루, 실패 시 폴스를 리턴 값으로 준다.
			System.out.println("삭제 완료");
		}	else {
			System.out.println("파일 삭제 실패 or 존재하지 않음");
		}
	}
}
			//하지만 출력은 삭제 완료라고 뜨지만, 삭제가 되질 않는다.


			//C:\Work\folder_test\test\mytest\apple 라고 적으면 apple만 지워진다.


			//즉, 메서드가 따로 없다.......하나씩 안쪽부터 지워나아가야 한다..............






			//반복문으로 지워도 된다.
			//경로를 살리고 싶은 곳 까지만 남기자. 웬만하면 파일 경로를 끝까지 잡는게 좋다.(맨 깊숙한곳까지..)
			//쌤 코드
//package etc.api.io.folder;

//import java.io.File;
//import java.util.Arrays;

//public class DeleteFile {

//	public static void main(String[] args) {
		
//		File file = new File("C:\\Work\\folder_test\\test");
		
		/*
		if(file.exists()) {
			file.delete(); //delete 성공 시 true, 실패 시 false를 리턴
			System.out.println("삭제 완료!");
		} else {
			System.out.println("파일 삭제 실패 or 존재하지 않음!");
		}
		*/
		
//		if(file.exists()) {
//			if(file.isDirectory()) { //파일이 디렉토리인지 확인
//				File[] files = file.listFiles();
//				for(int i=0; i<files.length; i++) {
//					if(files[i].delete()) {
//						System.out.println(files[i].getName() + " 삭제 성공!");
//					} else {
//						System.out.println(files[i].getName() + " 삭제 실패!");
//					}
//				}
//			}
	//		if(file.delete()) {
	//			System.out.println("삭제 성공!");
	//		} else {
	//			System.out.println("삭제 실패!");
	//		}
	//	}
		
		

	//}

//}













			