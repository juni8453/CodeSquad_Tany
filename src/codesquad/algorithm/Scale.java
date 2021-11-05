package codesquad.algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Scale {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        String output = null;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } // arr 배열에 숫자 집어넣기

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) {
                output = "ascending";

            } else if (arr[i] == arr[i + 1] + 1) {
                output = "descending";

            } else {
                output = "mixed";
                break;
            }
        }
        System.out.println(output);
    }
}
