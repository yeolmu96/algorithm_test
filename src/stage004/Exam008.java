package stage004;
/*
 * 백준 3052번
 * 
 * 0~41까지 나머지 발생
 * 같은 나머지가 몇 개 발생하는지 카운트
 */
import java.util.Scanner;

public class Exam008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[42];
		int x = 0, y = 0, cnt = 0;
		
		for(int i = 0; i < 10; i++) {
			x = sc.nextInt();
			y = x % 42;
			nums[y] = nums[y] + 1;
		}
		
		for(int i = 0; i < 42; i++) {
			if(nums[i] != 0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}