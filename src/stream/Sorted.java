package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Sorted {
    public static void main(String[] args) {
        System.out.println("첫 번째 예제");

        Stream<String> stream1 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream2 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");

        stream1.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();

        stream2.sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.print(s + " "));

        System.out.println("두 번째 예제");

        List<String> list = Arrays.asList("JAVA", "KOTLIN", "RUBY", "SMALLTALK");
        System.out.println("sorted : ");
        list.stream().sorted().forEach(System.out::println);

        System.out.println("reversed :");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

