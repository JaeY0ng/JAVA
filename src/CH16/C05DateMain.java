package CH16;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class C05DateMain {

	public static void main(String[] args) {

//		Date d1 = new Date(); 
//		System.out.println(d1);
//		System.out.println(d1.getYear()+1900+"년"); // 초기 컴퓨팅 시스템의 메모리와 처리 능력이 제한적이었기 때문에,
												   // 4자리 연도를 모두 저장하는 대신 1900년을 기준으로 몇 년이 지났는지만 저장하는 방식을 이용
//		System.out.println(d1.getMonth()+1+"월");
//		System.out.println(d1.getDay()); // 요일정보 (0-6, 일-토)
//		System.out.println(d1.getHours()); 
//		System.out.println(d1.getMinutes()); 
//		

		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 요일 ( 1 - 7 , 일 - 토 )
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		
	}

}
