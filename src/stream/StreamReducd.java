package stream;

import java.util.*;
import java.util.stream.*;

public class StreamReducd {
    public static void main(String[] args) {
        String[] strArr =
                {"Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"};

        Stream.of(strArr).forEach(System.out::println);

        // noneMatch() -> 모든 요소가 불일치할 때 true
        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
        Optional<String> sWord = Stream.of(strArr)
                .filter(s -> s.charAt(0) == 'a').findFirst();

        Optional<String> eWord = Stream.of(strArr)
                .filter(e -> e.charAt(0) == 's').findFirst();

        System.out.println("noEmptyStr = " + noEmptyStr);

        // Optional을 반환받는 참조변수 sWord의 람다식 결과에 일치하는 것이 없음 -> 코드가 동작하지 않는다.
        // 따라서 sWord는 get() 메소드로 꺼내올 수 없다. NoSuchElementException 예외 발생
//        System.out.println(sWord.get());
        sWord.ifPresent(s -> System.out.println(sWord));
        System.out.println(eWord.get());
        eWord.ifPresent(e -> System.out.println(eWord));

        // Stream<String[]>을 IntStream으로 변환
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(s -> s.length());
        IntStream intStream4 = Stream.of(strArr).mapToInt(s -> s.length());

        int count = intStream1.reduce(0, (x, y) -> x + 1);
        int sum   = intStream2.reduce(0, (x, y) -> x + y);

        System.out.println("count : " + count);
        System.out.println("sum : " + sum);

        OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);

        // Optional 객체에서 값을 가져올 때 get() 메소드 사용
        System.out.println("max : " + max.getAsInt());
        System.out.println("min : " + min.getAsInt());
    }
}
