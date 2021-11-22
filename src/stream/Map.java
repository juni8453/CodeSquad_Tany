package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");
        List<String> list2 = Arrays.asList("HTML", "CSS", "JAVA", "JAVASCRIPT");

        System.out.println("첫 번째 예제");

        // 스트림 생성
        Stream<String> stream1 = list.stream();
        Stream<String> map = stream1.map(s -> s.toUpperCase());
        map.forEach(System.out::println);

        // 한 줄로 작성할 수 있다.
        // stream1.map(s -> s.toUpperCase()).forEach(System.out::println);

        System.out.println("두 번째 예제");

        // 스트림 생성
        Stream<String> stream2 = list2.stream();
        Stream<Integer> map2 = stream2.map(s -> s.length());
//        Stream<Integer> map2 = stream2.map(String::length);
        map2.forEach(System.out::println);

        // 한 줄로 작성할 수 있다.
        // stream2.map(s -> s.length()).forEach(System.out::println);

        System.out.println("세 번째 예제");

        // 스트림 직접 생성
        Stream<String> strArr = Stream.of("I study hard", "You study JAVA", "I am hungry");
        strArr.flatMap(s -> Stream.of(s.split(" +"))).forEach(System.out::println);

    }
}
