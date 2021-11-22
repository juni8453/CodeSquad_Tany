package stream;

import java.util.Arrays;

public class Peek {
    public static void main(String[] args) {
        int[] intArr = {5, 4, 3, 2, 1};

        System.out.println("[peek()를 마지막에 호출한 경우]");
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n));    // 최종 연산 메서드가 아니기 때문에 동작하지 않음

        System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n))
                .sum();                              // sum() 최종 연산 메서드이기 때문에 동작
        System.out.println("총합: " + total);

        System.out.println("[forEach를 마지막에 호출한 경우]");
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(n -> System.out.println(n)); // forEach() 또한 최종 메소드로 동작함
    }
}

