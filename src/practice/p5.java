package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 🧠 문제: 가장 많이 나온 단어 순으로 출력하기
설명:
사용자에게 문장을 한 줄 입력받아서, 각 단어가 몇 번 나왔는지 세고,
많이 나온 순서대로 정렬해서 출력하세요.

입력
hi hi hello hi hello bye

출력
hi: 3
hello: 2
bye: 1
 */
public class p5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < str.length; i++) {
			map.put(str[i], map.getOrDefault(str[i], 0) + 1);
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		list.sort((a , b) -> a.getValue() - b.getValue());
		
		for(Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}