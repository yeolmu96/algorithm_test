package practice_0210;

/*
사칙연산
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10689 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);

        StringBuilder sb = new StringBuilder();
        sb.append(a+b).append('\n');
        sb.append(a-b).append('\n');
        sb.append(a*b).append('\n');
        sb.append(a/b).append('\n');
        sb.append(a%b).append('\n');

        System.out.print(sb);
    }
}