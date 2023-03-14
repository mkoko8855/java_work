package etc.api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {

	private static final char[] Month = null;

	public static void main(String[] args) {
		
		
	
		
		Date date = new Date();
		//유틸 패키지는 직접 임포트 해야됨. 그래야 Date에 빨간줄 없어짐
		System.out.println(date);
		//출력 결과 : Fri Mar 10 16:58:52 KST 2023
		
		
		System.out.println("---------------------------------");
		
		
		//현재 날자 정보 얻기(년, 월, 일)
		//메서드를 통해 받아와야 한다(변수이름은 메서드이름과똑같이했긴했는데..)
		LocalDate now = LocalDate.now();
		System.out.println(now);
		//출력 결과 : 2023-03-10
		
		
		
		
		
		
		//현재 시간 정보 얻기(시, 분, 초)
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		//출력 결과 : 17:03:37.994138900
		
		
		
		
		
		
		
		//년, 월, 일, 시, 분, 초 한번에 얻기
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println(localdatetime);
		//출력 결과 : 2023-03-10T17:04:51.327105500
		
		
		
		
		
		
		
		//로컬데이트타임의 메서드
		//나우가 싫고 내가 기준을 만들고 싶어. 한번 배워보자.
		//특정 날짜와 시간 정보를 얻으면 된다.
		LocalDateTime begindate = LocalDateTime.of(2022,7,1,9,0,0);
		System.out.println(begindate);
		//출력 결과 : 2022-07-01T09:00
		
		
		
		
		
		
		//연도나 월 따로 떼는것도 한번 보자
		//연도 추출하는 방법
		int year = localdatetime.getYear();
		System.out.println(year);
		//출력 결과 : 2023
		
		
		

		
		
		int monthValue = localdatetime.getMonthValue();
		System.out.println("monthValue: " + monthValue);
		
		
		Month month = localdatetime.getMonth();
		System.out.println("month: " + month);
		//출력 결과 :
		/*
		monthValue: 3   //인트값으로 현재가 몇 월인지 알 수 있는 것이 monthValue이다.
		month: MARCH
		*/
		
		
		
		
		
		
		
		
		
		System.out.println("-------------------------------------------------------------------");
		
		
		
		
		
		
		
		
		//오늘부터 3일 뒤에 시간을 얻고 싶다면
		LocalDateTime returnDate = localdatetime.plusDays(3);
		System.out.println(returnDate);
		//출력 결과 : 2023-03-17T16:01:50.085855100
		
		
		
		
		
		//지금으로부터 1년 2개월 7일 뒤
		LocalDateTime d1 = localdatetime.plusYears(1).plusMonths(2).plusDays(7);
		System.out.println(d1);
		//출력 결과 : 2024-05-21T16:01:50.085855100
		
		
		
		
		
		//날짜와 날짜 사이의 시간은 얼마나 흘렀을까?
		LocalDate b = LocalDate.of(2020, 12, 30);
		LocalDate f = LocalDate.of(2022,  9,  14);
		long between = ChronoUnit.DAYS.between(b,f);  //날도되고 시간도 된다.
		System.out.println(between + "일");
		long between1 = ChronoUnit.WEEKS.between(b,f);  //날도되고 시간도 된다.
		System.out.println(between1 + "주");
		//출력 결과 : 623일
		//출력 결과 : 89주
		
		
		
		
		
		
		
		
		System.out.println("--------------------------------------------------------");
		
		
		
		
		
		
		
		//날짜 포맷 변경하기
		System.out.println(localdatetime); //나우를 이용해서 받아오는 현재 시간
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		System.out.println(localdatetime.format(dtf));
		
		//출력 결과 : 2023년 03월 14일 화요일 오후 04시 09분 39초
		
		
		
		
	}
}
