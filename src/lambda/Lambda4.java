package lambda;

public class Lambda4 {
    public static void main(String[] args) {
        Calculator a = (x,y) -> x + y;
        System.out.println(a.cal(1, 2));
    }
}
