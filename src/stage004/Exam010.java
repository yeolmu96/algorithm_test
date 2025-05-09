package stage004;
/*
 * 백준 1546번
 */

import java.util.Scanner;

public class Exam010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		double[] score = new double[count];
		double sum = 0;
		
		for(int i = 0; i < count; i++) {
			 score[i] = sc.nextInt();
		}
		
		double max = score[0];
		
		for(int i = 0; i < count - 1; i++) {
			if(max < score[i + 1]) {
				max = score[i + 1];
			}
		}
		
		for(int i = 0; i < count; i++) {
			score[i] = (score[i] / max * 100);
			sum += score[i];
		}
		
		System.out.println(sum / count);
	}
}