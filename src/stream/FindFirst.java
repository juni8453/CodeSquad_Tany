package stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindFirst {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        IntStream stream2 = IntStream.of(4, 2, 7, 3, 5, 1, 6);

        OptionalInt result1 = stream1.sorted().findFirst();
        System.out.println(result1.getAsInt());

        OptionalInt result2 = stream2.sorted().findFirst();
        System.out.println(result2.getAsInt());
    }
}
