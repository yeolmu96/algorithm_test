package stage005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_5622번
 * https://www.acmicpc.net/problem/5622
 * 
 * 숫자 | 알파벳 | 걸리는 시간
----|--------|-------------
 2  | ABC    |     3초
 3  | DEF    |     4초
 4  | GHI    |     5초
 5  | JKL    |     6초
 6  | MNO    |     7초
 7  | PQRS   |     8초
 8  | TUV    |     9초
 9  | WXYZ   |    10초
 * 
 */
public class Exam010 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] strArr = str.toCharArray();
		int totalTime = 0;
		
		String[] dial = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		
		//입력받은 각 문자를 하나씩 처리
		for(int i = 0; i < strArr.length; i++) {
			char ch = strArr[i];
			
			//문자가 어느 다이얼 그룹에 속하는지 찾는 용도
			for(int j = 0; j < dial.length; j++) {
				//indexOf메소드로 해당 문자가 존재하는지 확인
				if(dial[j].indexOf(ch) != -1) {
					totalTime += j + 1;
					//존재하면 더이상 반복하지 않고 빠져나옴
					break;
				}
			}
		}
		
		System.out.println(totalTime);
	}
}