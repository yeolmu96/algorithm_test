package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 🧠 문제: 숫자 등장 횟수 세기
설명:
사용자에게 정수들을 한 줄에 입력받고, 각 숫자가 몇 번 나왔는지를 출력하세요.
(숫자 → 개수 형태로 출력)

입력
1 2 2 3 3 3 4 4 4 4

출력
1: 1
2: 2
3: 3
4: 4
 */

public class p4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < str.length; i++) {
			int temp = Integer.parseInt(str[i]);
			map.put(temp, map.getOrDefault(temp, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort((a, b) -> a.getKey() - b.getKey());

		for (Map.Entry<Integer, Integer> entry : list) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
//		for(Entry<Integer, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
	}
}