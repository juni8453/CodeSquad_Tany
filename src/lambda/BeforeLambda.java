package lambda;

// interface 생성
interface Goods {
    void doSome();
}

// BeforeLambda 클래스는 Goods 인터페이스를 구현한다.
public class BeforeLambda implements Goods {
    @Override
    public void doSome() {
        System.out.println("do Operation !");
    }
}

class Main {
    public static void main(String args[]) {
        // "인터페이스" = new "해당 인터페이스를 구현할 클래스"
        Goods a = new BeforeLambda();
        a.doSome();
    }
}


/* 람다식 도입 이전
* 1. 기존 자바에서 interface를 이용해 다형성을 제공하기 위해서는 interface를 만든다.
* 2. 인터페이스를 구현한 클래스를 작성한다.
* 3. 사용 시에 interface를 구현할 객체를 생성하고 오버라이드 한 메서드를 사용한다.
* */



