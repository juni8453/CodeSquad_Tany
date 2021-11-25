package stream;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {

        // reduce() 메소드는 첫 번째, 두 번째 요소로 연산을 수행한 뒤, 그 결과와 세 번째 요소를 가지고 또 연산을 수행한다.
        // 이런 식으로 해당 스트림의 모든 요소를 소모하여 연산을 수행하고, 그 결과를 반환한다.

        System.out.println("첫 번째 예제");
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Optional<IntegeR> sum = numbers.reduce(Integer::sum); 와 동일한 식
        Optional<Integer> sum = numbers.reduce((x, y) -> x + y);

        // ifPresent() 메소드는 값이 있으면 주어진 람다식을 진행하고 없으면 아무 일도 하지 않는다.
        sum.ifPresent(s -> System.out.print("sum : " + s));
        System.out.println();

        System.out.println("두 번째 예제");
        // 초기 값 있는 reduce() identity 인자로 초기 값을 설정할 수 있다.
        IntStream numbers2 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum2 = numbers2.reduce(10, (x, y) -> x + y);
        System.out.println("sum2 : " + sum2);

        System.out.println("세 번째 예제");
        // 병렬 처리
        IntStream number3 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum3 = number3.parallel().reduce(0, (x, y) -> x + y);
        System.out.println("sum3 : " + sum3);

        System.out.println("네 번째 예제");
        IntStream number4 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum4 = number4.parallel().reduce(0, (x, y) -> x - y);
        System.out.println("sum4 : " + sum4);

    }
}
