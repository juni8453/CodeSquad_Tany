package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoNumbers {

    public void setNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 46; i++) {
            numbers.add(i);
        }
        numbers.remove(0);
        numbers.forEach(s -> System.out.print(s + " "));
    }
}
