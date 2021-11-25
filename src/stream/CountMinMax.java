package stream;

import java.util.stream.IntStream;

public class CountMinMax {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(30, 90, 70, 10);
        IntStream stream2 = IntStream.of(30, 90, 70, 10);
        IntStream stream3 = IntStream.of(30, 90, 70, 10);

        System.out.println(stream1.count());

        // max(), min()은 Optional 객체를 얻기 때문에 get() 사용해서 값 출력
        System.out.println(stream2.max().getAsInt());
        System.out.println(stream3.min().getAsInt());
    }
}
