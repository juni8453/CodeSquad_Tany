package codesquad.day1;

import java.io.*;

public class Grade {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        if (count >= 90) {
            System.out.print('A');
        }

        if (count >= 80 && count <= 89) {
            System.out.print('B');
        }

        if (count >= 70 && count <= 79) {
            System.out.print('C');
        }

        if (count >= 60 && count <= 69) {
            System.out.print('D');
        }

        if (count < 60) {
            System.out.print('F');
        }
    }
}
