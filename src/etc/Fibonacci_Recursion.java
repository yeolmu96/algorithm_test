package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 피보나치(재귀)
 * 백준_2747번
 */
public class Fibonacci_Recursion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = getFibonacci(n);
		System.out.println(result);
	}
	
	public static int getFibonacci(int n) {

		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return getFibonacci(n-1) + getFibonacci(n-2);
	}
}
