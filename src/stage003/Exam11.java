package stage003;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			int c = a + b;
			
			if(a == 0 && b == 0) {
				break;
			}
			
			list.add(c);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}