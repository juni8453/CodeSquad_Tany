package stream;

import java.util.stream.IntStream;

public class Match {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(30, 90, 70, 10);
        IntStream stream2 = IntStream.of(30, 90, 70, 10);
        IntStream stream3 = IntStream.of(30, 90, 70, 10);

        System.out.println(stream1.anyMatch(s -> s > 80));
        System.out.println(stream2.allMatch(s -> s > 80));
        System.out.println(stream3.noneMatch(s -> s > 100));

    }
}
