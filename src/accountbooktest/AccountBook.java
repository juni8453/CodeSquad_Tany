package accountbooktest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountBook {

    private Member member;

    public void startAccountBook() {
        Scanner sc = new Scanner(System.in);

        List<Data> dataList = new ArrayList<>();
        List<Month> monthList = new ArrayList<>();

        System.out.println("가계부를 실행합니다.");
        System.out.println("================");
        System.out.println("가계부 기능을 선택해주세요.");
        System.out.println("기입[1] 삭제[2] 수정[3] 월별 출력[4]");
        int menu = sc.nextInt();
        int count = 1;

        // 가계부 기입
        if (menu == 1) {
            inputData(count, dataList, monthList);
        }

        // 삭제
        if (menu == 2) {

        }

        // 수정
        if (menu == 3) {

        }

        // 월별 출력
        if (menu == 4) {

        }
    }

    public void inputData(int count, List<Data> dataList, List<Month> monthList) {
        Scanner sc = new Scanner(System.in);

        Data valueData = new Data();
        Month valueMonth = new Month();

        System.out.println("가계부를 기입합니다.");

        System.out.println("몇 월의 가계부를 작성하시나요 ? 예) 두 자리 12, 한 자리 1");
        int checkMonth = sc.nextInt();

        System.out.println("총 수입을 기입하세요.");
        int totalAmount = sc.nextInt();
        valueData.setTotalAmount(totalAmount);

        System.out.println("날짜를 기입하세요.");
        String date = sc.next();
        valueData.setDate(date);

        System.out.println("간단한 메모를 기입하세요.");
        String memo = sc.next();
        valueData.setMemo(memo);

        System.out.println("지출한 돈을 기입하세요.");
        int outcome = sc.nextInt();
        valueData.setOutcome(outcome);

        int balance = valueData.getTotalAmount() - valueData.getOutcome();
        valueData.setBalance(balance);

        dataList.add(valueData);

        dataIntoMonth(checkMonth, valueMonth, dataList, valueData ,count, monthList);

    }

    private void dataIntoMonth(int checkMonth, Month valueMonth, List<Data> dataList, Data valueData, int count, List<Month> monthList) {
        Scanner sc = new Scanner(System.in);
        int checkRestart;

        if (checkMonth == 1) {
            valueMonth.setJanuary(dataList);
            if (count == 1) {
                monthList.add(valueMonth);
            }
            count++;

            System.out.println("가계부 기입을 완료했습니다. 더 기입하십니까 ?작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData(count, dataList, monthList);
            }

            if (checkRestart == 2) {
                return;
            }
        }

        //TODO 2월도 1월처럼 고쳐놓기 카운터는 1로 초기화가 될까 ?
        if (checkMonth == 2) {
            valueMonth.setFebruary(dataList);
            if (count == 1) {
                monthList.add(valueMonth);
            }
            count++;

            System.out.println("가계부 기입을 완료했습니다. 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData(count, dataList, monthList);
            }

            if (checkRestart == 2) {
                return;
            }
        }
//
//        if (checkMonth == 3) {
//            valueMonth.setMarch(dataList);
//        }
//
//        if (checkMonth == 4) {
//            valueMonth.setApril(dataList);
//        }
//
//        if (checkMonth == 5) {
//            valueMonth.setMay(dataList);
//        }
//
//        if (checkMonth == 6) {
//            valueMonth.setJune(dataList);
//        }
//
//        if (checkMonth == 7) {
//            valueMonth.setJuly(dataList);
//        }
//
//        if (checkMonth == 8) {
//            valueMonth.setAugust(dataList);
//        }
//
//        if (checkMonth == 9) {
//            valueMonth.setSeptember(dataList);
//        }
//
//        if (checkMonth == 10) {
//            valueMonth.setOctober(dataList);
//        }
//
//        if (checkMonth == 11) {
//            valueMonth.setNovember(dataList);
//        }
//
//        if (checkMonth == 12) {
//            valueMonth.setDecember(dataList);
//        }
    }

    public void printData(int checkMonth, Month valueMonth ,List<Data> dataList) {
        if (checkMonth == 1) {
            for (int i = 0; i < valueMonth.getJanuary().size(); i++) {
                System.out.println("January 가계부");
                System.out.println("[" + (i+1) + "]번째");
                System.out.print("날짜 :" + valueMonth.getJanuary().get(i).getDate() + " ");
                System.out.print("간단 메모 :" + valueMonth.getJanuary().get(i).getMemo() + " ");
                System.out.print("지출 내역 :" + valueMonth.getJanuary().get(i).getOutcome() + " ");
                System.out.println("잔액 :" + valueMonth.getJanuary().get(i).getBalance());
            }

            System.out.println("더 작성하시겠습니까 ? 작성[1] / 종료[2]");
            checkRewrite(valueMonth);
        }

        if (checkMonth == 2) {
            for (int i = 0; i < valueMonth.getFebruary().size(); i++) {
                System.out.println("February 가계부");
                System.out.println("[" + (i+1) + "]번째");
                System.out.print("날짜 :" + valueMonth.getFebruary().get(i).getDate() + " ");
                System.out.print("간단 메모 :" + valueMonth.getFebruary().get(i).getMemo() + " ");
                System.out.print("지출 내역 :" + valueMonth.getFebruary().get(i).getOutcome() + " ");
                System.out.println("잔액 :" + valueMonth.getFebruary().get(i).getBalance());
            }

            System.out.println("더 작성하시겠습니까 ? 작성[1] / 종료[2]");
            checkRewrite(valueMonth);
        }
    }

    private void checkRewrite(Month valueMonth) {
        Scanner sc = new Scanner(System.in);
        int checkReStart = sc.nextInt();

        if (checkReStart == 1) {
//            inputData();
        }

        if (checkReStart == 2) {
            return;
        }

    }

    public void deleteData() {

    }

    public void editData() {

    }
}
