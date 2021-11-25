package stream;

import java.util.*;

public class StreamOptional {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");         // Optional.of() 사용해서 값 삽입
        Optional<Integer> optInt = optStr.map(s -> s.length()); // map() 이용해서 String > Integer 변환 > length 추출
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());

        int result1 = Optional.of("123")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt)
                .orElse(-1);    // 값이 null 일 때, NoSuchElementException 발생 > 이를 대비하여 orElse()로 대체 값 지정

        int result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt)
                .orElse(-1);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        // ifPresent()는 void 이기 때문에 return 받는 변수가 있으면 안된다.
//        int result3 = Optional.of("456")
//                .map(Integer::parseInt)
//                .ifPresent(x -> System.out.printf("result3 = %d%n", x));

        Optional.of("456")
                .map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result3 = %d%n", x));

        OptionalInt optionalInt1 = OptionalInt.of(0);   // 0 저장
        OptionalInt optionalInt2 = OptionalInt.empty(); // 빈 객체 생성

        System.out.println(optionalInt1.isPresent());
        System.out.println(optionalInt2.isPresent());

        System.out.println(optionalInt1.getAsInt());
//        System.out.println(optionalInt2.getAsInt()); 빈 객체기 때문에 NoSuchElementException 발생

        System.out.println("optionalInt1 = " + optionalInt1);
        System.out.println("optionalInt2 = " + optionalInt2);
        System.out.println("optionalInt1 와 optional2 는 같은가 ? " + optionalInt1.equals(optionalInt2));

    }
}
