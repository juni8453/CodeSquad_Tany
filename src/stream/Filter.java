package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");

        // 스트림 생성
        Stream<String> stream1 = list.stream();
        Stream<String> filtered1 = stream1.filter(s -> s.contains("1"));
        filtered1.forEach(System.out::println);

        // 한 줄로 합쳐서 쓸 수도 있다.
        // stream1.filter(s -> s.contains("1")).forEach(System.out::println);

        // 스트림은 일회용이므로 다시 사용하기 위해 생성
        Stream<String> stream2 = list.stream();
        Stream<String> filtered2 = stream2.filter(s -> s.startsWith("c"));
        filtered2.forEach(System.out::println);
    }
}
