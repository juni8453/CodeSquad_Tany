package codesquad.day12.thread;

import javax.swing.JOptionPane;

public class IOBlokingEx2 {
    public static void main(String[] args) {
        MultiThreadTest t1 = new MultiThreadTest();
        t1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
    }
}

class MultiThreadTest extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);

            try {
                sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

// 멀티쓰레드를 활용해 사용자로부터 입력을 받는 부분과 화면에 숫자를 출력하는 부분을 두 개로 나누어 처리한다면
// 사용자가 입력을 마치지 않더라도 화면에 숫자가 출력되는 것을 확인할 수 있다.
