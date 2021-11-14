package accountbooktest;

import java.util.List;
import java.util.Scanner;

public class AccountBookFunction {
    // 해당 월에 처음 값을 넣을 때 요 메서드 호출
    public void inputDataInMonth(int checkMonth, List<Data> dataList, Month valueMonth) {
        AccountBook accountBook = new AccountBook();
        Scanner sc = new Scanner(System.in);

        // 1월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 2월 필터링
        if (checkMonth == 2) {
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

            // 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 3월 필터링
        if (checkMonth == 3) {
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

            // 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 4월 필터링
        if (checkMonth == 4) {
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

            // 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        } //

        // 5월 필터링
        if (checkMonth == 5) {
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

            // 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 6월 필터링
        if (checkMonth == 6) {
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

            // 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 7월 필터링
        if (checkMonth == 7) {
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

            // 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 8월 필터링
        if (checkMonth == 8) {
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

            // 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 9월 필터링
        if (checkMonth == 9) {
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

            //더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 10월 필터링
        if (checkMonth == 10) {
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

            // 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 11월 필터링
        if (checkMonth == 11) {
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

            // 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 12월 필터링
        if (checkMonth == 12) {
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

            // 더 작성을 원한다면, 다시 inputDataInEqualMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }
    }



    // 해당 월에서 계속해서 입력 받을 때는 요 메서드 실행
    public void inputDataInEqualMonth(int checkMonth , List<Data> dataList, Month valueMonth) {
        AccountBook accountBook = new AccountBook();
        Data valueData = new Data();
        Scanner sc = new Scanner(System.in);

        // 1월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 2월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 3월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 4월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 5월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 6월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 7월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 8월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 9월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 10월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 11월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 12월 필터링
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

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInEqualMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }
    }

    public void deleteMonthData(int checkMonth, Month valueMonth) {
        AccountBook accountBook = new AccountBook();
        Scanner sc = new Scanner(System.in);

        // 1월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 1) {
            System.out.println("1월의 가계부를 삭제합니다.");

            if (valueMonth.getJanuary() == null || valueMonth.getJanuary().size() == 0) {
                System.out.println("아직 1월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getJanuary().size(); i++) {
                int totalAmount = valueMonth.getJanuary().get(i).getTotalAmount();
                String date = valueMonth.getJanuary().get(i).getDate();
                String memo = valueMonth.getJanuary().get(i).getMemo();
                int balance = valueMonth.getJanuary().get(i).getBalance();
                int outcome = valueMonth.getJanuary().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");

            }

            System.out.println("1월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getJanuary().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }

        // 2월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 2) {
            System.out.println("2월의 가계부를 삭제합니다.");

            if (valueMonth.getFebruary() == null || valueMonth.getFebruary().size() == 0) {
                System.out.println("아직 2월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getFebruary().size(); i++) {
                int totalAmount = valueMonth.getFebruary().get(i).getTotalAmount();
                String date = valueMonth.getFebruary().get(i).getDate();
                String memo = valueMonth.getFebruary().get(i).getMemo();
                int balance = valueMonth.getFebruary().get(i).getBalance();
                int outcome = valueMonth.getFebruary().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");

            }

            System.out.println("2월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getJanuary().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }

        // 3월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 3) {
            System.out.println("3월의 가계부를 삭제합니다.");

            if (valueMonth.getMarch() == null || valueMonth.getMarch().size() == 0) {
                System.out.println("아직 3월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getMarch().size(); i++) {
                int totalAmount = valueMonth.getMarch().get(i).getTotalAmount();
                String date = valueMonth.getMarch().get(i).getDate();
                String memo = valueMonth.getMarch().get(i).getMemo();
                int balance = valueMonth.getMarch().get(i).getBalance();
                int outcome = valueMonth.getMarch().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");

            }

            System.out.println("3월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getMarch().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }

        // 4월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 4) {
            System.out.println("4월의 가계부를 삭제합니다.");

            if (valueMonth.getApril() == null || valueMonth.getApril().size() == 0) {
                System.out.println("아직 4월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getApril().size(); i++) {
                int totalAmount = valueMonth.getApril().get(i).getTotalAmount();
                String date = valueMonth.getApril().get(i).getDate();
                String memo = valueMonth.getApril().get(i).getMemo();
                int balance = valueMonth.getApril().get(i).getBalance();
                int outcome = valueMonth.getApril().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");

            }

            System.out.println("4월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getApril().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }

        // 5월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 5) {
            System.out.println("5월의 가계부를 삭제합니다.");

            if (valueMonth.getMay() == null || valueMonth.getMay().size() == 0) {
                System.out.println("아직 5월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getMay().size(); i++) {
                int totalAmount = valueMonth.getMay().get(i).getTotalAmount();
                String date = valueMonth.getMay().get(i).getDate();
                String memo = valueMonth.getMay().get(i).getMemo();
                int balance = valueMonth.getMay().get(i).getBalance();
                int outcome = valueMonth.getMay().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");

            }

            System.out.println("5월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getMay().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }

        // 6월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 6) {
            System.out.println("6월의 가계부를 삭제합니다.");

            if (valueMonth.getJune() == null || valueMonth.getJune().size() == 0) {
                System.out.println("아직 6월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getJune().size(); i++) {
                int totalAmount = valueMonth.getJune().get(i).getTotalAmount();
                String date = valueMonth.getJune().get(i).getDate();
                String memo = valueMonth.getJune().get(i).getMemo();
                int balance = valueMonth.getJune().get(i).getBalance();
                int outcome = valueMonth.getJune().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");

            }

            System.out.println("6월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getJune().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }

        // 7월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 7) {
            System.out.println("7월의 가계부를 삭제합니다.");

            if (valueMonth.getJuly() == null || valueMonth.getJuly().size() == 0) {
                System.out.println("아직 7월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getJuly().size(); i++) {
                int totalAmount = valueMonth.getJuly().get(i).getTotalAmount();
                String date = valueMonth.getJuly().get(i).getDate();
                String memo = valueMonth.getJuly().get(i).getMemo();
                int balance = valueMonth.getJuly().get(i).getBalance();
                int outcome = valueMonth.getJuly().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");

            }

            System.out.println("7월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getJuly().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }

        // 8월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 8) {
            System.out.println("8월의 가계부를 삭제합니다.");

            if (valueMonth.getAugust() == null || valueMonth.getAugust().size() == 0) {
                System.out.println("아직 8월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getAugust().size(); i++) {
                int totalAmount = valueMonth.getAugust().get(i).getTotalAmount();
                String date = valueMonth.getAugust().get(i).getDate();
                String memo = valueMonth.getAugust().get(i).getMemo();
                int balance = valueMonth.getAugust().get(i).getBalance();
                int outcome = valueMonth.getAugust().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");

            }

            System.out.println("8월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getAugust().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }

        // 9월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 9) {
            System.out.println("9월의 가계부를 삭제합니다.");

            if (valueMonth.getSeptember() == null || valueMonth.getSeptember().size() == 0) {
                System.out.println("아직 9월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getSeptember().size(); i++) {
                int totalAmount = valueMonth.getSeptember().get(i).getTotalAmount();
                String date = valueMonth.getSeptember().get(i).getDate();
                String memo = valueMonth.getSeptember().get(i).getMemo();
                int balance = valueMonth.getSeptember().get(i).getBalance();
                int outcome = valueMonth.getSeptember().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");

            }

            System.out.println("9월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getSeptember().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }

        // 10월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 10) {
            System.out.println("10월의 가계부를 삭제합니다.");

            if (valueMonth.getOctober() == null || valueMonth.getOctober().size() == 0) {
                System.out.println("아직 10월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getOctober().size(); i++) {
                int totalAmount = valueMonth.getOctober().get(i).getTotalAmount();
                String date = valueMonth.getOctober().get(i).getDate();
                String memo = valueMonth.getOctober().get(i).getMemo();
                int balance = valueMonth.getOctober().get(i).getBalance();
                int outcome = valueMonth.getOctober().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");

            }

            System.out.println("10월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getOctober().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }

        // 11월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 11) {
            System.out.println("11월의 가계부를 삭제합니다.");

            if (valueMonth.getNovember() == null || valueMonth.getNovember().size() == 0) {
                System.out.println("아직 11월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getNovember().size(); i++) {
                int totalAmount = valueMonth.getNovember().get(i).getTotalAmount();
                String date = valueMonth.getNovember().get(i).getDate();
                String memo = valueMonth.getNovember().get(i).getMemo();
                int balance = valueMonth.getNovember().get(i).getBalance();
                int outcome = valueMonth.getNovember().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");

            }

            System.out.println("11월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getNovember().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }

        // 12월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 12) {
            System.out.println("12월의 가계부를 삭제합니다.");

            if (valueMonth.getDecember() == null || valueMonth.getDecember().size() == 0) {
                System.out.println("아직 12월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getDecember().size(); i++) {
                int totalAmount = valueMonth.getDecember().get(i).getTotalAmount();
                String date = valueMonth.getDecember().get(i).getDate();
                String memo = valueMonth.getDecember().get(i).getMemo();
                int balance = valueMonth.getDecember().get(i).getBalance();
                int outcome = valueMonth.getDecember().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");

            }

            System.out.println("12월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getDecember().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }


    }

    // 가계부 월별 조회 기능
    public void inquiryIntoMonth(int checkMonth, Month valueMonth) {
        AccountBook accountBook = new AccountBook();
        Scanner sc = new Scanner(System.in);

        // 1월 필터링
        if (checkMonth == 1) {
            System.out.println("1월의 가계부를 조회합니다.");

            if (valueMonth.getJanuary() == null) {
                System.out.println("아직 1월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getJanuary().size(); i++) {
                int totalAmount = valueMonth.getJanuary().get(i).getTotalAmount();
                String date = valueMonth.getJanuary().get(i).getDate();
                String memo = valueMonth.getJanuary().get(i).getMemo();
                int balance = valueMonth.getJanuary().get(i).getBalance();
                int outcome = valueMonth.getJanuary().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("1월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 2월 필터링
        if (checkMonth == 2) {
            System.out.println("2월의 가계부를 조회합니다.");

            if (valueMonth.getFebruary() == null) {
                System.out.println("아직 2월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getFebruary().size(); i++) {
                int totalAmount = valueMonth.getFebruary().get(i).getTotalAmount();
                String date = valueMonth.getFebruary().get(i).getDate();
                String memo = valueMonth.getFebruary().get(i).getMemo();
                int balance = valueMonth.getFebruary().get(i).getBalance();
                int outcome = valueMonth.getFebruary().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
            }

            System.out.println("1월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 3월 필터링
        if (checkMonth == 3) {
            System.out.println("3월의 가계부를 조회합니다.");

            if (valueMonth.getMarch() == null) {
                System.out.println("아직 3월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getMarch().size(); i++) {
                int totalAmount = valueMonth.getMarch().get(i).getTotalAmount();
                String date = valueMonth.getMarch().get(i).getDate();
                String memo = valueMonth.getMarch().get(i).getMemo();
                int balance = valueMonth.getMarch().get(i).getBalance();
                int outcome = valueMonth.getMarch().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("3월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 4월 필터링
        if (checkMonth == 4) {
            System.out.println("4월의 가계부를 조회합니다.");

            if (valueMonth.getApril() == null) {
                System.out.println("아직 4월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getApril().size(); i++) {
                int totalAmount = valueMonth.getApril().get(i).getTotalAmount();
                String date = valueMonth.getApril().get(i).getDate();
                String memo = valueMonth.getApril().get(i).getMemo();
                int balance = valueMonth.getApril().get(i).getBalance();
                int outcome = valueMonth.getApril().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("4월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 5월 필터링
        if (checkMonth == 5) {
            System.out.println("5월의 가계부를 조회합니다.");

            if (valueMonth.getMay() == null) {
                System.out.println("아직 5월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getMay().size(); i++) {
                int totalAmount = valueMonth.getMay().get(i).getTotalAmount();
                String date = valueMonth.getMay().get(i).getDate();
                String memo = valueMonth.getMay().get(i).getMemo();
                int balance = valueMonth.getMay().get(i).getBalance();
                int outcome = valueMonth.getMay().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("5월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 6월 필터링
        if (checkMonth == 6) {
            System.out.println("6월의 가계부를 조회합니다.");

            if (valueMonth.getJune() == null) {
                System.out.println("아직 6월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getJune().size(); i++) {
                int totalAmount = valueMonth.getJune().get(i).getTotalAmount();
                String date = valueMonth.getJune().get(i).getDate();
                String memo = valueMonth.getJune().get(i).getMemo();
                int balance = valueMonth.getJune().get(i).getBalance();
                int outcome = valueMonth.getJune().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("6월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 7월 필터링
        if (checkMonth == 7) {
            System.out.println("7월의 가계부를 조회합니다.");

            if (valueMonth.getJuly() == null) {
                System.out.println("아직 7월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getJuly().size(); i++) {
                int totalAmount = valueMonth.getJuly().get(i).getTotalAmount();
                String date = valueMonth.getJuly().get(i).getDate();
                String memo = valueMonth.getJuly().get(i).getMemo();
                int balance = valueMonth.getJuly().get(i).getBalance();
                int outcome = valueMonth.getJuly().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("7월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 8월 필터링
        if (checkMonth == 8) {
            System.out.println("8월의 가계부를 조회합니다.");

            if (valueMonth.getAugust() == null) {
                System.out.println("아직 8월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getAugust().size(); i++) {
                int totalAmount = valueMonth.getAugust().get(i).getTotalAmount();
                String date = valueMonth.getAugust().get(i).getDate();
                String memo = valueMonth.getAugust().get(i).getMemo();
                int balance = valueMonth.getAugust().get(i).getBalance();
                int outcome = valueMonth.getAugust().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("8월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 9월 필터링
        if (checkMonth == 9) {
            System.out.println("9월의 가계부를 조회합니다.");

            if (valueMonth.getSeptember() == null) {
                System.out.println("아직 9월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getSeptember().size(); i++) {
                int totalAmount = valueMonth.getSeptember().get(i).getTotalAmount();
                String date = valueMonth.getSeptember().get(i).getDate();
                String memo = valueMonth.getSeptember().get(i).getMemo();
                int balance = valueMonth.getSeptember().get(i).getBalance();
                int outcome = valueMonth.getSeptember().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("9월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 10월 필터링
        if (checkMonth == 10) {
            System.out.println("10월의 가계부를 조회합니다.");

            if (valueMonth.getOctober() == null) {
                System.out.println("아직 10월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getOctober().size(); i++) {
                int totalAmount = valueMonth.getOctober().get(i).getTotalAmount();
                String date = valueMonth.getOctober().get(i).getDate();
                String memo = valueMonth.getOctober().get(i).getMemo();
                int balance = valueMonth.getOctober().get(i).getBalance();
                int outcome = valueMonth.getOctober().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("10월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 11월 필터링
        if (checkMonth == 11) {
            System.out.println("11월의 가계부를 조회합니다.");

            if (valueMonth.getNovember() == null) {
                System.out.println("아직 11월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getNovember().size(); i++) {
                int totalAmount = valueMonth.getNovember().get(i).getTotalAmount();
                String date = valueMonth.getNovember().get(i).getDate();
                String memo = valueMonth.getNovember().get(i).getMemo();
                int balance = valueMonth.getNovember().get(i).getBalance();
                int outcome = valueMonth.getNovember().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("11월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 12월 필터링
        if (checkMonth == 12) {
            System.out.println("12월의 가계부를 조회합니다.");

            if (valueMonth.getDecember() == null) {
                System.out.println("아직 12월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            for (int i = 0; i < valueMonth.getDecember().size(); i++) {
                int totalAmount = valueMonth.getDecember().get(i).getTotalAmount();
                String date = valueMonth.getDecember().get(i).getDate();
                String memo = valueMonth.getDecember().get(i).getMemo();
                int balance = valueMonth.getDecember().get(i).getBalance();
                int outcome = valueMonth.getDecember().get(i).getOutcome();

                System.out.print("[" + (i) + "]" + "번째" + " ");
                System.out.println("사용 일자 : " + date + " ");
                System.out.print("간단 메모 : " + memo + " ");
                System.out.print("지출 가능 금액 : " + totalAmount + " ");
                System.out.print("지출 금액 : " + outcome + " ");
                System.out.println("남은 금액 : " + balance);
                System.out.println("---------------------------------------------------------");
            }

            System.out.println("12월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }
    }
}

