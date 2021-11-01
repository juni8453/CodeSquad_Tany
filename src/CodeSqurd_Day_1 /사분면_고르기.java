package CodeSqurd_Day_1;

import java.io.*;

public class 사분면_고르기 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x > 0 && y > 0) {
            System.out.print(1);
        }

        if (x > 0 && y < 0) {
            System.out.print(4);
        }

        if (x < 0 && y > 0) {
            System.out.print(2);
        }

        if (x < 0 && y < 0) {
            System.out.print(3);
        }
    }
}

/* x,y > 0 -> Quadrant 1
   x < 0, y > 0 -> Quadrant 2
   x,y < 0 -> Quadrant 3
   x > 0, y < 0 -> Quadrant 4
 */

//        if (x > 0) {
//            if (y > 0) {
//                System.out.print(1);
//            } else if (y < 0) {
//                System.out.print(4);
//            }
//        }
//
//        if (x < 0) {
//            if (y > 0) {
//                System.out.print(2);
//            } else if (y < 0) {
//                System.out.print(3);
//            }
//        }

