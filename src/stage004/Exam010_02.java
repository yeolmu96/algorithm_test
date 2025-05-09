package stage004;

import java.util.Scanner;

public class Exam010_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		double max = 0;
		double sum = 0;
		
		for(int i = 0; i < count; i++) {
			 double score = sc.nextInt();
			 sum += score;
			 
			 if(score > max) {
				 max = score;
			 }
		}
			
		System.out.println((sum / count) / max * 100);
	}
}