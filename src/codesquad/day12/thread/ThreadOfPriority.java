package codesquad.day12.thread;

public class ThreadOfPriority {
    public static void main(String[] args) {
        ThreadTest1 th1 = new ThreadTest1();
        ThreadTest2 th2 = new ThreadTest2();

        th1.setPriority(5); // 기본 우선순위는 생략해도 무방
        th2.setPriority(7);

        System.out.println("Priority of th1(-) : " + th1.getPriority());
        System.out.println("Priority of th2(l) : " + th2.getPriority());

        th1.start();
        th2.start();
    }
}

class ThreadTest1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("-");
            for (int x = 0; x < 1000000; x++); // 시간 지연용
        }
    }
}

class ThreadTest2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("l");
            for (int x = 0; x <1000000; x++);  // 시간 지연용
        }
    }
}
