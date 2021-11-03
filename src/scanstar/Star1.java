package scanstar;

import java.io.*;

public class Star1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        column(n);
    }

    static void column(int number) {
        for (int i = 1; i <= number; i++) {
            row(number, i);
        }
    }

    static void row(int number, int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}


//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
