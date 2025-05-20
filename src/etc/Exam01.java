package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/*
 * 백준_9012번_스택
 * https://www.acmicpc.net/problem/9012
 * 
 */
public class Exam01 {

	public static String checkVPS(String inputdata) {
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for(char c : inputdata.toCharArray()) {
			if(c == '(') {
				stack.push(c);
			}else {
				if(stack.isEmpty()) {
					return "NO";
				}else {
					stack.pop();
				}
			}
		}
		
		return stack.isEmpty() ? "YES" : "NO";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			System.out.println(checkVPS(br.readLine()));
		}
	}
}