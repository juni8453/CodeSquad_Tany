package accountbooktest;

import java.util.List;
import java.util.Scanner;

public class AccountBookFunction {

    // Todo 해당 월에 처음 값을 넣을 때 요 메서드 호출
    public void inputDataInMonth(int checkMonth, List<Data> dataList, Month valueMonth) {
        AccountBook accountBook = new AccountBook();
        Scanner sc = new Scanner(System.in);

        // Todo 1월 필터링
        if (checkMonth == 1) {
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
                // Todo 종료 할 때 메뉴로 되돌아가니까 뭔가 returnCount 같은 변수를 추가하고 하나씩 더해서 (어디에서 더해줄까..)
                accountBook.startAccountBook(valueMonth);
            }
        } // 최초로 1월에 데이터 삽입하는 메소드

        // Todo 2월 필터링
        if (checkMonth == 2) {
            // TODO 여기서 valueMonth (Month 객체) 가 새로 생성되기 때문에 리셋되는 건데..
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
        } // 최초로 2월에 데이터 삽입하는 메소드

        // Todo 3월 필터링
        if (checkMonth == 3) {
            // TODO 여기서 valueMonth (Month 객체) 가 새로 생성되기 때문에 리셋되는 건데..
            Data valueData = new Data();

            System.out.println("3월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/03/01");
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
            valueMonth.setMarch(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 3월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 최초로 3월에 데이터 삽입하는 메소드

        // Todo 4월 필터링
        if (checkMonth == 4) {
            // TODO 여기서 valueMonth (Month 객체) 가 새로 생성되기 때문에 리셋되는 건데..
            Data valueData = new Data();

            System.out.println("4월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/04/01");
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
            valueMonth.setApril(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 4월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 최초로 4월에 데이터 삽입하는 메소드

        // Todo 5월 필터링
        if (checkMonth == 5) {
            // TODO 여기서 valueMonth (Month 객체) 가 새로 생성되기 때문에 리셋되는 건데..
            Data valueData = new Data();

            System.out.println("5월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/05/01");
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
            valueMonth.setMay(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 5월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 최초로 5월에 데이터 삽입하는 메소드

        // Todo 6월 필터링
        if (checkMonth == 6) {
            // TODO 여기서 valueMonth (Month 객체) 가 새로 생성되기 때문에 리셋되는 건데..
            Data valueData = new Data();

            System.out.println("6월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/06/01");
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
            valueMonth.setJune(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 6월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 최초로 6월에 데이터 삽입하는 메소드

        // Todo 7월 필터링
        if (checkMonth == 7) {
            // TODO 여기서 valueMonth (Month 객체) 가 새로 생성되기 때문에 리셋되는 건데..
            Data valueData = new Data();

            System.out.println("7월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/07/01");
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
            valueMonth.setJuly(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 7월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 최초로 7월에 데이터 삽입하는 메소드

        // Todo 8월 필터링
        if (checkMonth == 8) {
            // TODO 여기서 valueMonth (Month 객체) 가 새로 생성되기 때문에 리셋되는 건데..
            Data valueData = new Data();

            System.out.println("8월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/08/01");
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
            valueMonth.setAugust(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 8월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 최초로 8월에 데이터 삽입하는 메소드

        // Todo 9월 필터링
        if (checkMonth == 9) {
            // TODO 여기서 valueMonth (Month 객체) 가 새로 생성되기 때문에 리셋되는 건데..
            Data valueData = new Data();

            System.out.println("9월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/09/01");
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
            valueMonth.setSeptember(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 9월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 최초로 9월에 데이터 삽입하는 메소드

        // Todo 10월 필터링
        if (checkMonth == 10) {
            // TODO 여기서 valueMonth (Month 객체) 가 새로 생성되기 때문에 리셋되는 건데..
            Data valueData = new Data();

            System.out.println("10월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/10/01");
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
            valueMonth.setOctober(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 10월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 최초로 10월에 데이터 삽입하는 메소드

        // Todo 11월 필터링
        if (checkMonth == 11) {
            // TODO 여기서 valueMonth (Month 객체) 가 새로 생성되기 때문에 리셋되는 건데..
            Data valueData = new Data();

            System.out.println("11월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/11/01");
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
            valueMonth.setNovember(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 11월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 최초로 11월에 데이터 삽입하는 메소드

        // Todo 12월 필터링
        if (checkMonth == 12) {
            // TODO 여기서 valueMonth (Month 객체) 가 새로 생성되기 때문에 리셋되는 건데..
            Data valueData = new Data();

            System.out.println("12월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/12/01");
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
            valueMonth.setDecember(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 12월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 최초로 12월에 데이터 삽입하는 메소드
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

        // Todo 3월 필터링
        if (checkMonth == 3) {

            System.out.println("3월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/03/01");
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
            valueMonth.setMarch(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 3월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 3월

        // Todo 4월 필터링
        if (checkMonth == 4) {

            System.out.println("4월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/04/01");
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
            valueMonth.setApril(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 4월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 4월

        // Todo 5월 필터링
        if (checkMonth == 5) {

            System.out.println("5월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/05/01");
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
            valueMonth.setMarch(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 5월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 5월

        // Todo 6월 필터링
        if (checkMonth == 6) {

            System.out.println("6월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/06/01");
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
            valueMonth.setJune(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 6월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 6월

        // Todo 7월 필터링
        if (checkMonth == 7) {

            System.out.println("7월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/07/01");
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
            valueMonth.setJuly(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 7월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 7월

        // Todo 8월 필터링
        if (checkMonth == 8) {

            System.out.println("8월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/08/01");
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
            valueMonth.setAugust(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 8월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 8월

        // Todo 9월 필터링
        if (checkMonth == 9) {

            System.out.println("9월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/09/01");
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
            valueMonth.setSeptember(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 9월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 9월

        // Todo 10월 필터링
        if (checkMonth == 10) {

            System.out.println("10월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/10/01");
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
            valueMonth.setOctober(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 10월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 10월

        // Todo 11월 필터링
        if (checkMonth == 11) {

            System.out.println("11월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/11/01");
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
            valueMonth.setNovember(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 11월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 11월

        // Todo 12월 필터링
        if (checkMonth == 12) {

            System.out.println("12월의 가계부 작성을 시작합니다.");
            System.out.println("해당 일에 사용할 수 있는 총 금액은 얼마입니까 ?");
            int totalAmount = sc.nextInt();
            valueData.setTotalAmount(totalAmount);

            System.out.println("언제 사용했습니까? 예) 2021/12/01");
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
            valueMonth.setDecember(dataList);

            System.out.println("가계부 기입이 완료되었습니다. 12월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // Todo 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // Todo 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } // 12월
    }
}
