package codesquad.day1;

import java.io.*;

public class LeapYear {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n % 4 == 0) {
            if (n % 100 != 0 || n % 400 == 0) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }

        }
        if (n % 4 != 0) {
            System.out.println(0);
        }
    }
}

// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력해라.
// 윤년 > 연도가 4의 배수거나 100의 배수가 아닐 때 또는 400의 배수일 때
