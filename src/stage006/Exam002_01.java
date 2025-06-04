package stage006;
/*
 * 백준_3003번
 * https://www.acmicpc.net/problem/3003
 * 
 * 킹 퀸 룩 비 나 폰
 * 1 1 2 2 2 8 = 16
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam002_01 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int[] origin = {1, 1, 2, 2, 2, 8};
		
		for(int i = 0; i < 6; i++ ) {
			System.out.print(origin[i] - Integer.parseInt(str[i]) + " ");
		}
	}
}