package stage004;

import java.util.Scanner;

public class Exam010_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		double[] score = new double[count];
		double max = 0;
		
		for(int i = 0; i < count; i++) {
			 score[i] = sc.nextInt();
			 if(score[i] > max) {
				 max = score[i];
			 }
		}

		double sum = 0;
		
		for(int i = 0; i < count; i++) {
			sum += (score[i] / max * 100);
		}
		
		System.out.println(sum / count);
	}
}