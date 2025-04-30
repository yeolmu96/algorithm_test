package stage002;
/*
 * 0~24시간
 * 0~59분
 * 45분 일찍 알람 설정하기
 * 
 * 10시 10분
 * 9시 25분
 * 
 * 00시 10분
 * 23시 25분
 * 
 * 60-45 = 15
 * 15+10 = 25
 */
import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if(hour > 0) {
			if(minute >= 45) {
				minute -= 45;
				System.out.println(hour);
				System.out.println(minute);
			}else {
				minute = 60 - 45 + minute;
				hour -= 1;
				System.out.println(hour);
				System.out.println(minute);
			}
		}
		
		if(hour == 0) {
			hour = 24 - 1;
			if(minute >= 45) {
				minute -= 45;
				System.out.println(hour);
				System.out.println(minute);
			}else {
				minute = 60 - 45 + minute;
				System.out.println(hour);
				System.out.println(minute);
			}		
		}
	}
}
