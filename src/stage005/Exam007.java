package stage005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_2675번
 * https://www.acmicpc.net/problem/2675
 * 
 */
public class Exam007 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		//n번 값을 입력받을 차례
		for(int i = 0; i < n; i++) {
			//반복 회수와 문자열을 공백 구분으로 입력받음
			String[] str = br.readLine().split(" ");
			//공백을 기준으로 나눠서 변수에 넣어줌
			int r = Integer.parseInt(str[0]);
			char[] charArray = str[1].toCharArray();
			
			//입력받은 문자열만큼 반복
			for(int j = 0 ; j < charArray.length; j++) {
				//반복 회수만큼 반복
				for(int k = 0; k < r; k++) {
					System.out.print(charArray[j]);
				}
			}
			//한 줄 띄우기
			System.out.println();
		}
	}
}