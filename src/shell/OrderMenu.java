package shell;

import java.io.File;

public class OrderMenu {
    Shell shell = new Shell();

    public void checkOrder(String order, String property) {

        if (order.equals("ls")) {
            File file = new File(property);
            String[] files = file.list();
            for (String str : files) {
                System.out.print(str + " ");
            }
            System.out.println();

            shell.startShell();
        }

        else {
            System.out.println("존재하지 않는 명령어입니다. 명령어를 다시 확인해주세요.");
            shell.startShell();
        }
    }
}
