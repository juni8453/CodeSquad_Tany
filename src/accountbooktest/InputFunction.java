package accountbooktest;

import java.util.List;
import java.util.Scanner;

public class InputFunction {

    public void inputData(List<Data> dataList, Month valueMonth, Data valueData, int checkMonth) {
        Scanner sc = new Scanner(System.in);

        System.out.println(checkMonth + "월의 가계부 작성을 시작합니다.");
        System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
        int totalAmount = sc.nextInt();
        valueData.setTotalAmount(totalAmount);

        System.out.println("언제 사용했습니까? 예) 2021/0" + checkMonth + "/01");
        String date = sc.next();
        valueData.setDate(date);

        System.out.println("간단한 메모를 기입해주세요.");
        String memo = sc.next();
        valueData.setMemo(memo);

        System.out.println("얼마 지출하셨나요 ?");
        int outcome = sc.nextInt();
        valueData.setOutcome(outcome);

        valueData.setBalance();

        dataList.add(valueData);

        if (checkMonth == 1) {
            valueMonth.setJanuary(dataList);
        }

        if (checkMonth == 2) {
            valueMonth.setFebruary(dataList);
        }

        if (checkMonth == 3) {
            valueMonth.setMarch(dataList);
        }

        if (checkMonth == 4) {
            valueMonth.setApril(dataList);
        }

        if (checkMonth == 5) {
            valueMonth.setMay(dataList);
        }

        if (checkMonth == 6) {
            valueMonth.setJune(dataList);
        }

        if (checkMonth == 7) {
            valueMonth.setJuly(dataList);
        }

        if (checkMonth == 8) {
            valueMonth.setAugust(dataList);
        }

        if (checkMonth == 9) {
            valueMonth.setSeptember(dataList);
        }

        if (checkMonth == 10) {
            valueMonth.setOctober(dataList);
        }

        if (checkMonth == 11) {
            valueMonth.setNovember(dataList);
        }

        if (checkMonth == 12) {
            valueMonth.setDecember(dataList);
        }
    }
}
