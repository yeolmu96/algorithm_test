package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 백준_10828번_스택
 * https://www.acmicpc.net/problem/10828
 * 
 * push/pop/size/empty/top
 * 
 */
class MyStack {
	private int[] mystack;
	private int top;
	
	public MyStack(int size) {
		mystack = new int[size];
	}
	
	public void push(int data) {
		mystack[top] = data;
		top++;
	}
	
	public int empty() {
		if(top <=0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public int pop() {
		if(empty() == 1) {
			return -1;
		} else {
			top--;
			return mystack[top];
		}
	}
	
	public int top() {
		if(top == 0) {
			return -1;
		}else {
			return mystack[top - 1];
		}
	}
	
	public int size() {
		return top;
	}
}

public class Exam00 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		MyStack stack = new MyStack(n);
		
		for(int i = 0; i < n; i++) {
			String line = br.readLine();
			String[] arr = line.split(" ");
			
			switch(arr[0]) {
			case "push" :
				stack.push(Integer.parseInt(arr[1]));
				break;
			case "pop" :
				bw.write(stack.pop() + "\n");
				break;
			case "empty" :
				bw.write(stack.empty() + "\n");
				break;
			case "size":
				bw.write(stack.size() + "\n");
				break;
			case "top" :
				bw.write(stack.top() + "\n");
				break;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}