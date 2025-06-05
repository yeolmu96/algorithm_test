package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 🧠 문제: 단어 등장 횟수 세고, 동점은 이름순 정렬
설명:
한 줄에 여러 단어가 입력됩니다.
각 단어가 몇 번 나왔는지 세고,

먼저 등장 횟수 기준 내림차순으로 정렬

등장 횟수가 같으면 단어 알파벳순(오름차순)으로 정렬
해서 출력하세요.

입력
apple banana banana grape apple banana apple grape kiwi

출력
apple: 3  
banana: 3  
grape: 2  
kiwi: 1
 */

public class p7_01 {

	static class LengthComparator implements Comparator<Map.Entry<String, Integer>>{
		@Override
		public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
			return Integer.compare(b.getKey().length(), a.getKey().length()); // 길이 내림차순
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < str.length; i++) {
			map.put(str[i], map.getOrDefault(str[i], 0) + 1);
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		
		LengthComparator comp = new LengthComparator();
		
		list.sort(comp);
		
		for(Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}