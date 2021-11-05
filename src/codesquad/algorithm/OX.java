package codesquad.algorithm;

import java.io.*;

public class OX {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        String[] arr = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            arr[i] = br.readLine();
            int sum = 0;
            int a = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    a = a + 1;
                    sum += a;
                }

                if (arr[i].charAt(j) == 'X') {
                    sum += 0;
                    a = 0;
                }
            } // for

            System.out.println(sum);
        }
    }
}
