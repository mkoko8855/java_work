package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {

		/*
		 * 1. 스캐너를 통해서 파일명을 정확히 입력받습니다.
		 * 
		 * 2. file폴더에 해당 파일이 존재한다면 해당 파일을 upload폴더로 복사하세요. 파일이 존재하지 않는다면 "파일명이 없습니다."
		 * 예외구문을 출력하세요.
		 * 
		 * 3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
		 */
		
		Scanner sc = new Scanner(System.in);
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;

		System.out.print("파일명을 입력하세요: ");
		String name = sc.next();

		try {
			oldFile = new FileInputStream("C:\\Work\\file\\" + name + ".txt");
			newFile = new FileOutputStream("C:\\Work\\upload\\" + name + ".txt");
			byte[] arr = new byte[50];
			while (true) {
				int result = oldFile.read(arr);
				if (result == -1) {
					break;
				}
				newFile.write(arr, 0, result);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이나 경로를 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일 처리 중에 에러가 발생했습니다.");
		} finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("close 과정에서 에러가 발생");
			}
		}
	}			//hello 입력하면 원래 work > file 문서에 hello가 있었는데
				//그 hello가 upload 문서에 성공적으로 복사가 된다.
}		
				//그러나 upload는 마우스로 직접 만들고 시작했다.
				//자바에서도 폴더 만드는게 가능하다. io.stream 패키지 > folder 패키지 > CreateFolder클래스에 가서 보자!
			








			 /*
			 	이렇게 써도 된다.
			 	Scanner sc = new Scanner(System.in);
				FileInputStream oldFile = null;
				FileOutputStream newFile = null;

				System.out.print("파일명을 입력하세요: ");
				String name = sc.next();
			 	try{
			 	oldFile = new FileInputStream("C:\\Work\\file\\" + name + ".txt");
				newFile = new FileOutputStream("C:\\Work\\upload\\" + name + ".txt");
			 	int result;
			 	byte[] arr = new byte[100];
			 	
			 	while((result = oldFile.read(arr)) ! = -1){
			 		newFile.write(arr, 0, result);
			 	}      이러면 조금 더 간추려서 쓸 수 있을 수 있다. 헷갈리면 원래 하던대로 ㄱㄱ
			 */
			
			
			
			
			
		
