package codesquad.day12.thread;

import javax.swing.JOptionPane;

public class IOBlokingEx {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

// 사용자가 입력하기 전까지는 10부터 1까지 세지 않는다.
