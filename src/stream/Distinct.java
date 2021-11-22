package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1, 3, 4, 5, 6, 6, 7);
        Stream<Integer> stream2 = list.stream();
        stream2.distinct().forEach(s -> System.out.print(s + " "));
        System.out.println();

        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        stream1.distinct().forEach(s -> System.out.print(s + " "));
        System.out.println();
    }
}
