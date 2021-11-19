package shell;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OrderMenu {
    public void checkOrder(String order, String property) {
        if (order.equals("ls")) {
            File file = new File(property);
            String[] strs = file.list();
            for (String str : strs) {
                System.out.println(str);
            }
        }
    }
}
