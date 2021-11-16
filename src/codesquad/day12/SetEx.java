package codesquad.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("apple");
        set.add("banana");
        set.add("kiwi");
        set.remove("apple");

        // Iterator로 내부 데이터 출력
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) {
            System.out.println("iterator : " + iter.next());
        }

        // 향상된 for문으로 내부 데이터 출력
        for (String str :
             set) {
            System.out.print(str + " ");
        }
        System.out.println();

        // toString으로 내부 데이터 출력
        System.out.println(set.toString());

        // contains()로 값 확인 (boolean 형태로 출력)
        System.out.println(set.contains("banana"));
        System.out.println(set.contains("hi"));

        System.out.println(set.size());
    }
}
