package CodeSqurd_Day_1;

import java.io.*;
import java.util.StringTokenizer;

public class 두_수_비교하기 {
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
