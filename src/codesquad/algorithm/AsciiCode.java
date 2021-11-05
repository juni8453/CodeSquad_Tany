package codesquad.algorithm;

import java.io.*;

public class AsciiCode {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int askiiCode = str.charAt(0);

        System.out.println(askiiCode);
    }
}
