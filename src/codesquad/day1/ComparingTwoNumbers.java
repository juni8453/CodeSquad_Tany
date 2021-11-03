package codesquad.day1;

import java.io.*;
import java.util.StringTokenizer;

public class ComparingTwoNumbers {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b) {
            System.out.print(">");
        }

        if (a < b) {
            System.out.print("<");
        }

        if (a == b) {
            System.out.print("==");
        }
    }
}
