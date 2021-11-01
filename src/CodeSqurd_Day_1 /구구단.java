package CodeSqurd_Day_1;

import java.io.*;

public class 구구단 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        column(n);
    }

    // n단 인지 ?
    static void column(int number) {
        for (int i = number; i <= number; i++) {
            row(number, i);
        }
    }

    static void row(int number, int i) {
        for (int j = 1; j <= 9; j++) {
            System.out.print(i+" "+ "*"+" "+j + " "+ "="+" " + i*j);
            System.out.println();
        }
        System.out.println();
    }
}

//    public static void main(String args[]) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        for (int i = n; i <= n; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.print(i+" "+ "*"+" "+j + " "+ "="+" " + i*j);
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }