package shell;

import java.util.Scanner;

public class Shell {

    // Shell을 실행한다.
    public void startShell() {
        Scanner sc = new Scanner(System.in);
        OrderMenu orderMenu = new OrderMenu();

        String property = System.getProperty("user.dir");

        System.out.print(" " + property + ">");
        String order = sc.next();
        orderMenu.checkOrder(order, property);
    }
}

// Path path = Paths.get("/Users/jeonbyeongjun/Desktop/study/CodeSquad_Tany");

// 상위 디렉토리 보기
// Path parent = path.getParent();
// System.out.println("이전 디렉토리는 " + parent + "입니다.");
