package stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsEx {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");
        List<String> stringList = stream.collect(Collectors.toList());

        for (String str : stringList) {
            System.out.print(str + " ");
        }

        System.out.println();

        Stream<String> stream1 = Stream.of("a", "b", "c");
        Set<String> stringSet = stream1.collect(Collectors.toSet());

        for (String str : stringSet) {
            System.out.print(str + " ");
        }
    }
}
