package codesquad.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RefacRandomPick {
    public static void main(String args[]) {
        List<String> cocoaMembers = addMembers();
        List<String> lastMembers = shuffleMembers(cocoaMembers);

        Scanner sc = new Scanner(System.in);
        System.out.print("몇 명인가요 ?");
        int pickMemberCount = sc.nextInt();

        for (int i = 0; i < pickMemberCount; i++) {
            try {
                System.out.print(lastMembers.get(i)+ " ");

            } catch (Exception e) {
                System.out.println();
                System.out.println("범위에 맞춰 다시 입력하세요.");
                e.printStackTrace();
            }
        }

    }

    public static List<String> addMembers() {
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

        return cocoaMembers;

    }

    public static List<String> shuffleMembers(List<String> cocoaMembers) {
        Collections.shuffle(cocoaMembers);

        return cocoaMembers;

    }
}

