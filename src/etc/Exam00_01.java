package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
/*
 * 백준_10828번_스택
 * https://www.acmicpc.net/problem/10828
 * 
 * push/pop/size/empty/top
 * 
 */
public class Exam00_01 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		for(int i = 0; i < n; i++) {
			String[] cmd = br.readLine().split(" ");
			
			switch(cmd[0]) {
			case "push":
				stack.push(Integer.parseInt(cmd[1]));
				break;
			case "pop":
				bw.write((stack.isEmpty() ? -1 : stack.pop()) + "\n");
				break;
			case "size":
				bw.write(stack.size() + "\n");
				break;
			case "empty":
				bw.write((stack.isEmpty() ? 1 : 0) + "\n");
				break;
			case "top":
				bw.write((stack.isEmpty() ? -1 : stack.peek()) + "\n");
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
