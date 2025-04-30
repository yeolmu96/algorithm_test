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

public class Exam05_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		minute -= 45;
		if(minute < 0) {
			minute += 60;
			hour -= 1;
			
			if(hour < 0) {
				hour = 23;
			}
		}
		
		System.out.println(hour + " " + minute);
	}
}
