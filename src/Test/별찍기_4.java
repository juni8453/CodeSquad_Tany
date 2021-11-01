package Test;

import java.io.*;

public class 별찍기_4 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
