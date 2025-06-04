package stage006;
/*
 * 백준_1157번
 * https://www.acmicpc.net/problem/1157
 * 
 * HashMap 사용 버전
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Exam005_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		int max = -1;
		char result = '?';
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				result = entry.getKey();
			}else if(entry.getValue() == max) {
				result = '?';
			}
		}
		
		System.out.println(result);
	}
}