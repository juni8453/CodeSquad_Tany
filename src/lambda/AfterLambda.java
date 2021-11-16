package lambda;

@FunctionalInterface
interface Good {
    void doSome();
}

class Main2 {
    public static void main(String[] args) {
        Good a = () -> System.out.println("do Operation !");
        a.doSome();
    }
}

/* 람다식 도입 이전
* 인터페이스를 생성하고 그 인터페이스를 구현하는 클래스를 만들어준다.
* 이후 인터페이스의 메소드를 오버라이드하고, (인터페이스) = new (구현 객체)를 만들어서 메소드를 이용한다.
*/

/* 람다식 도입 이후
* 인터페이스를 생성하고 (인터페이스 참조변수) = () -> ~ 와 같은 람다식을 사용해서 바로 메소드를 이용할 수 있게 되었다.
* */
