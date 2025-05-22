package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
 * 백준_1920번_수 찾기
 * https://www.acmicpc.net/problem/1920
 * 
 * 이진탐색
 */
public class Exam06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int datasize = Integer.parseInt(br.readLine());
		int[] dataarr = new int[datasize];
		String line = br.readLine();
		String[] strArr = line.split(" ");
		for(int i = 0; i < dataarr.length; i++) {
			dataarr[i] = Integer.parseInt(strArr[i]);
		}
		
		Arrays.sort(dataarr);
		
		int searchsize = Integer.parseInt(br.readLine());
		String searchValueline = br.readLine();
		String[] searchValueArr = searchValueline.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(String searchValue : searchValueArr) {
			int result = search(dataarr, Integer.parseInt(searchValue));
			sb.append(result + "\n");
		}
		System.out.println(sb);
	}
	
	public static int search(int arr[], int searchValue) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			if(searchValue > arr[mid]) {
				start = mid + 1;
			}else if(searchValue < arr[mid]) {
				end = mid - 1;
			}else {//중앙값이 작은 경우
				return 1;
			}
		}
		return 0;
	}
}