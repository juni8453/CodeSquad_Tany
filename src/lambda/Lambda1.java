package lambda;

public class Lambda1 {
    public static void main(String[] args) {
        // (인터페이스 참조변수) = (반환 값, 타입, 갯수 일치시키기)
        Calculator a = (int x, int y) -> {
            return x + y;
        };

        System.out.println(a.cal(1, 2));
    }
}
