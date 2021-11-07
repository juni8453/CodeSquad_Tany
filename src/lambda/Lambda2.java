package lambda;

public class Lambda2 {
    public static void main(String[] args) {
        Calculator a = ((x, y) -> {
            return x + y;
        });

        System.out.println(a.cal(1,2));
    }
}
