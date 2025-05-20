package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

/*
 * 백준_2164번_카드
 * https://www.acmicpc.net/problem/2164
 * 
 */
public class Exam02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> card = new ArrayDeque<Integer>();
		
		for(int i = 0; i < n ; i++) {
			card.add(i + 1);
		}
		
		while(card.size() > 1) {
			card.poll(); // 첫 번째 요소 삭제
			card.add(card.poll()); // 첫 번째 요소 삭제 및 반환하며 새로 추가함
		}
		
		System.out.println(card.peek());
	}
}