package practice;
/*
 * ✅ 연습 1: 문자 빈도수 세기
🔹 목표
사용자로부터 문자열 입력받기

각 문자(대소문자 무시)의 등장 횟수를 출력

HashMap<Character, Integer> 사용
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			if(Character.isLetter(c)) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		
//		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
		
		for(Character key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	}
}