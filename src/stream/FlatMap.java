package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        String[][] arrays = new String[][] {
                {"a1", "a2", "a3"},
                {"b1", "b2", "b3"},
                {"c1", "c2", "c3"}
        };

        Stream<String[]> stream1 = Arrays.stream(arrays);
        Stream<String> stream2 = stream1.flatMap(s -> Arrays.stream(s));
//        Stream<String> stream2 = stream1.flatMap(Arrays::stream);
        stream2.forEach(System.out::println);

        // 한 줄로 바꿔쓰기
        // Stream<String[]> stream1 = Arrays.stream(arrays);
        // stream1.flatMap(s -> Arrays.stream(s)).forEach(System.out::println);

        // 이렇게 써도 가능!
//        Stream<String[]> strArr = Stream.of(
//                new String[]{"a1", "a2", "a3"},
//                new String[]{"b1", "b2", "b3"},
//                new String[]{"c1", "c2", "c3"});
//
//        strArr.flatMap(s -> Arrays.stream(s)).forEach(System.out::println);
    }
}
