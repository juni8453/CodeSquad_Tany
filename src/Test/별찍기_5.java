package Test;

import java.io.*;

public class 별찍기_5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N ; i++) {

            for(int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}