package stream;

import java.util.*;

public class StreamOptional {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());

        int result1 = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).get();

        // 값이 null일 때는 NoSuchElementException이 발생하기 떄문에 get() 대신 orElse()을 써서 값을 지정한다.
        int result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt)
                .orElse(-1);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        Optional.of("456")
                .map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result3 = %d%n", x));

        // optInt1에 0을 저장
        OptionalInt optInt1 = OptionalInt.of(0);
        // optInt2에 0을 저장
        OptionalInt optInt2 = OptionalInt.empty();

        System.out.println(optInt1.getAsInt());
//        System.out.println(optInt2.getAsInt());
        System.out.println("optInt1 = " + optInt1);
        System.out.println("optInt2 = " + optInt2);

        // OptionalInt.of(0) 과 OptionalInt.empty()는 똑같이 0값이 저장되었지만 다르다.
        System.out.println("optInt1.equals(optInt2)?" + optInt1.equals(optInt2));
    }
}
