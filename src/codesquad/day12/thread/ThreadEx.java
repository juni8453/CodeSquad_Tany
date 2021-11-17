package codesquad.day12.thread;

public class ThreadEx {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

// Thread 클래스를 상속받아 쓰레드 구현
class ThreadEx1_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(0);
        }
    }
}

// Runnable 인터페이스를 구현해서 쓰레드 구현
class ThreadEx1_2 implements Runnable {
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(1);
        }
    }
}
