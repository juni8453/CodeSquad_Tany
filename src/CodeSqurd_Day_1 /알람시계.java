package CodeSqurd_Day_1;

import java.io.*;
import java.util.StringTokenizer;

public class 알람시계 {
    public static void main(String args[]) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M >= 45) {
            System.out.print(H + " " + (M - 45));

        }

        else if (M < 45) {

            if (H == 0) {
                H = 24;
                System.out.print((H - 1) + " " + (M + 15));
                H = 0;
            }

            if (H != 0) {
                System.out.print((H - 1) + " " + (M + 15));
            }
        }
    }
}

// (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
// 입력 시간은 24시간 표현 사용, 하루의 시작은 0:0 (자정), 하루의 끝은 23:59