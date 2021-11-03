package codesquad.day3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomPick {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> cocoaMembers = new ArrayList<String>();
        cocoaMembers.add("Tany");
        cocoaMembers.add("땃쥐");
        cocoaMembers.add("피오");
        cocoaMembers.add("K");
        cocoaMembers.add("mandoo");
        cocoaMembers.add("donggi");
        cocoaMembers.add("Jerry");
        cocoaMembers.add("노리");
        cocoaMembers.add("Hoo");
        cocoaMembers.add("taksu");
        cocoaMembers.add("MK");

        Collections.shuffle(cocoaMembers);

        System.out.print("몇 명인가요 ?" + " ");
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            System.out.print(cocoaMembers.get(i)+" ");
        }
    }
}
