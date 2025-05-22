package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 피보나치(재귀_메모이제이션)
 * 백준_2747번
 */
public class Fibonacci_Recursion_Memoization {
	static int[] myarr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		myarr = new int[n + 1];
		
		int result = getFibonacci(n);
		System.out.println(result);
	}
	
	public static int getFibonacci(int n) {
		if(myarr[n] != 0) { //저장된 값이 있으면
			return myarr[n];
		}
		
		if(n <= 1) { //첫 순회일 때
			return myarr[n] = n;
		}else {
			return myarr[n] = getFibonacci(n-1) + getFibonacci(n-2);
		}
	}
}
