package accountbooktest;

import java.util.List;
import java.util.Scanner;

public class AccountBookFunction {

    // Todo 해당 월에 처음 값을 넣을 때 요 메서드 호출
    public void inputDataInMonth(int checkMonth, List<Data> dataList) {
        AccountBook accountBook = new AccountBook();
        Scanner sc = new Scanner(System.in);

        // Todo 1월 필터링
        if (checkMonth == 1) {
            Month valueMonth = new Month();
            Data valueData = new Data();

            System.out.println("1월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/01/01");
            String date = sc.next();
            valueData.setDate(date);

            System.out.println("간단한 메모를 기입해주세요.");
            String memo = sc.next();
            valueData.setMemo(memo);

            System.out.println("얼마 지출하셨나요 ?");
            int outcome = sc.nextInt();
            valueData.setOutcome(outcome);

            int balance = valueData.getTotalAmount() - valueData.getOutcome();
            valueData.setBalance(balance);

            dataList.add(valueData);
            valueMonth.setJanuary(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 1월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 최초로 1월에 데이터 삽입하는 메소드

        // Todo 2월 필터링
        if (checkMonth == 2) {
            // TODO 여기서 valueMonth (Month 객체) 가 새로 생성되기 때문에 리셋되는 건데..
            Month valueMonth = new Month();
            Data valueData = new Data();

            System.out.println("2월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/02/01");
            String date = sc.next();
            valueData.setDate(date);

            System.out.println("간단한 메모를 기입해주세요.");
            String memo = sc.next();
            valueData.setMemo(memo);

            System.out.println("얼마 지출하셨나요 ?");
            int outcome = sc.nextInt();
            valueData.setOutcome(outcome);

            int balance = valueData.getTotalAmount() - valueData.getOutcome();
            valueData.setBalance(balance);

            dataList.add(valueData);
            valueMonth.setFebruary(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 2월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

    }

    // Todo 해당 월에서 계속해서 입력 받을 때는 요 메서드 실행
    public void inputDataInEqualMonth(int checkMonth , List<Data> dataList, Month valueMonth) {
        AccountBook accountBook = new AccountBook();
        Data valueData = new Data();
        Scanner sc = new Scanner(System.in);

        // Todo 1월 필터링
        if (checkMonth == 1) {

            System.out.println("1월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/01/01");
            String date = sc.next();
            valueData.setDate(date);

            System.out.println("간단한 메모를 기입해주세요.");
            String memo = sc.next();
            valueData.setMemo(memo);

            System.out.println("얼마 지출하셨나요 ?");
            int outcome = sc.nextInt();
            valueData.setOutcome(outcome);

            int balance = valueData.getTotalAmount() - valueData.getOutcome();
            valueData.setBalance(balance);

            dataList.add(valueData);
            valueMonth.setJanuary(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 1월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 1월

        // Todo 2월 필터링
        if (checkMonth == 2) {

            System.out.println("2월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/02/01");
            String date = sc.next();
            valueData.setDate(date);

            System.out.println("간단한 메모를 기입해주세요.");
            String memo = sc.next();
            valueData.setMemo(memo);

            System.out.println("얼마 지출하셨나요 ?");
            int outcome = sc.nextInt();
            valueData.setOutcome(outcome);

            int balance = valueData.getTotalAmount() - valueData.getOutcome();
            valueData.setBalance(balance);

            dataList.add(valueData);
            valueMonth.setFebruary(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 2월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 2월

    }
}

