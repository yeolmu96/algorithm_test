package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 🧠 문제: 투표 결과 집계하기
설명:
여러 명이 좋아하는 음식 이름을 한 줄에 입력합니다.
누가 어떤 음식에 투표했는지 모르는 상태에서,
가장 많이 투표된 음식 순서대로 출력하세요.

pizza burger chicken pizza sushi chicken pizza

pizza: 3
chicken: 2
burger: 1
sushi: 1
 */
public class p6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < str.length; i++) {
			map.put(str[i], map.getOrDefault(str[i], 0) + 1);
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		list.sort((a, b) -> b.getValue() - a.getValue());
		
		for(Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}