package basic;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		
		
		//Q. 섭씨를 화씨로, 소수점 한 자리 까지 출력하라.
		
		/*
		double C, F;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("섭씨 온도 입력 : ");
		C = sc.nextDouble();
		System.out.printf("섭씨 온도 : " + C + "℃ 입니다.");
		
		
		F = (5*(C*1.8))+32;
		System.out.printf("화씨 온도 : " + F + "℉ 입니다.");
		sc.close();
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("온도를 입력하세요(℃) : ");
		double cel = sc.nextDouble();  //int로 바꿨을 때 
		
		double fahr = cel*1.8+32;	   //upcasting 진행해야 int로 바꾼 행이 옳게 됨
									   //즉, cel 앞에 (double) 해줘야 됨
		System.out.printf("입력한 섭씨 : %.1f℃\n", cel);
		System.out.printf("변환한 화씨 : %.1f℉\n", fahr);
		sc.close();
		
	}
}
