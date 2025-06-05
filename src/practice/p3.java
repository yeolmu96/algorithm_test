package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 🧠 문제: 단어 개수 세기
설명:
사용자에게 여러 개의 단어를 입력받고, 각 단어가 몇 번 나왔는지를 출력하는 프로그램을 작성하세요.
단어 개수를 기준으로 내림차순 정렬을 추가해볼게요.

입력
apple banana apple orange banana apple

출력
apple: 3
banana: 2
orange: 1
 */
public class p3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : str) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
		entryList.sort((a,b) -> b.getValue() - a.getValue());
		
		for(Map.Entry<String, Integer> entry : entryList) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}