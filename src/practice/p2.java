package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
 * ✅ 문제 설명
🎯 목표
사용자로부터 학생 이름과 점수를 여러 번 입력받고,

HashMap<String, Integer>에 저장한 뒤,

전체 학생의 평균 점수를 출력
 */
public class p2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("학생 수: ");
		int student = Integer.parseInt(br.readLine());
		
		System.out.println("학생 이름과 점수 입력(예: Kim 80):");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < student; i++) {
			String[] str = br.readLine().split(" ");
			String name = str[0];
			int score = Integer.parseInt(str[1]);
			map.put(name, score);
		}
		
		double sum = 0;
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
			sum += entry.getValue();
		}
		System.out.println("전체 평균 점수: " + (sum / map.size()));
	}
}