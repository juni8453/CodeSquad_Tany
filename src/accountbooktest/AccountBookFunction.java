package accountbooktest;

import java.util.List;
import java.util.Scanner;

public class AccountBookFunction {

    // 해당 월에 처음 기입 시 호출
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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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



    // 해당 월에 이미 기입된 내용이 있을 때 호출
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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

            valueData.setBalance();

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

    // 가계부 수정 시 호출
    public void editDataInMonth(int checkMonth, Month valueMonth) {
        AccountBook accountBook = new AccountBook();
        CheckData checkData = new CheckData();
        Scanner sc = new Scanner(System.in);

        // 1월에서 수정할 내용이 있을 때,
        if (checkMonth == 1) {
            System.out.println("1월 가계부를 수정합니다.");

            if (valueMonth.getJanuary() == null || valueMonth.getJanuary().size() == 0) {
                System.out.println("아직 1월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInJanuary(valueMonth);

            System.out.println("1월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
            int checkIndex = sc.nextInt();

            System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
            int editContent = sc.nextInt();

            if (editContent == 1) {
                System.out.println("총액을 수정하세요.");
                int editTotalAmount = sc.nextInt();
                valueMonth.getJanuary().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getJanuary().get(checkIndex).setBalance();
                System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 2) {
                System.out.println("날짜를 수정하세요.");
                String editDate = sc.next();
                valueMonth.getJanuary().get(checkIndex).setDate(editDate);
                System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 3) {
                System.out.println("메모를 수정하세요.");
                String editMemo = sc.next();
                valueMonth.getJanuary().get(checkIndex).setMemo(editMemo);
                System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 4) {
                System.out.println("지출을 수정하세요.");
                int editOutcome = sc.nextInt();
                valueMonth.getJanuary().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getJanuary().get(checkIndex).setBalance();
                System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

        }

        // 2월에서 수정할 내용이 있을 때,
        if (checkMonth == 2) {
            System.out.println("2월 가계부를 수정합니다.");

            if (valueMonth.getFebruary() == null || valueMonth.getFebruary().size() == 0) {
                System.out.println("아직 2월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInFebruary(valueMonth);

            System.out.println("2월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
            int checkIndex = sc.nextInt();

            System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
            int editContent = sc.nextInt();

            if (editContent == 1) {
                System.out.println("총액을 수정하세요.");
                int editTotalAmount = sc.nextInt();
                valueMonth.getFebruary().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getFebruary().get(checkIndex).setBalance();
                System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 2) {
                System.out.println("날짜를 수정하세요.");
                String editDate = sc.next();
                valueMonth.getFebruary().get(checkIndex).setDate(editDate);
                System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 3) {
                System.out.println("메모를 수정하세요.");
                String editMemo = sc.next();
                valueMonth.getFebruary().get(checkIndex).setMemo(editMemo);
                System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 4) {
                System.out.println("지출을 수정하세요.");
                int editOutcome = sc.nextInt();
                valueMonth.getFebruary().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getFebruary().get(checkIndex).setBalance();
                System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

        }

        // 3월에서 수정할 내용이 있을 때,
        if (checkMonth == 3) {
            System.out.println("3월 가계부를 수정합니다.");

            if (valueMonth.getMarch() == null || valueMonth.getMarch().size() == 0) {
                System.out.println("아직 3월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInMarch(valueMonth);

            System.out.println("3월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
            int checkIndex = sc.nextInt();

            System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
            int editContent = sc.nextInt();

            if (editContent == 1) {
                System.out.println("총액을 수정하세요.");
                int editTotalAmount = sc.nextInt();
                valueMonth.getMarch().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getMarch().get(checkIndex).setBalance();
                System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 2) {
                System.out.println("날짜를 수정하세요.");
                String editDate = sc.next();
                valueMonth.getMarch().get(checkIndex).setDate(editDate);
                System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 3) {
                System.out.println("메모를 수정하세요.");
                String editMemo = sc.next();
                valueMonth.getMarch().get(checkIndex).setMemo(editMemo);
                System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 4) {
                System.out.println("지출을 수정하세요.");
                int editOutcome = sc.nextInt();
                valueMonth.getMarch().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getMarch().get(checkIndex).setBalance();
                System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

        }

        // 4월에서 수정할 내용이 있을 때,
        if (checkMonth == 4) {
            System.out.println("4월 가계부를 수정합니다.");

            if (valueMonth.getApril() == null || valueMonth.getApril().size() == 0) {
                System.out.println("아직 4월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInApril(valueMonth);

            System.out.println("4월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
            int checkIndex = sc.nextInt();

            System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
            int editContent = sc.nextInt();

            if (editContent == 1) {
                System.out.println("총액을 수정하세요.");
                int editTotalAmount = sc.nextInt();
                valueMonth.getApril().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getApril().get(checkIndex).setBalance();
                System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 2) {
                System.out.println("날짜를 수정하세요.");
                String editDate = sc.next();
                valueMonth.getApril().get(checkIndex).setDate(editDate);
                System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 3) {
                System.out.println("메모를 수정하세요.");
                String editMemo = sc.next();
                valueMonth.getApril().get(checkIndex).setMemo(editMemo);
                System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 4) {
                System.out.println("지출을 수정하세요.");
                int editOutcome = sc.nextInt();
                valueMonth.getApril().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getApril().get(checkIndex).setBalance();
                System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

        }

        // 5월에서 수정할 내용이 있을 때,
        if (checkMonth == 5) {
            System.out.println("5월 가계부를 수정합니다.");

            if (valueMonth.getMay() == null || valueMonth.getMay().size() == 0) {
                System.out.println("아직 5월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInMay(valueMonth);

            System.out.println("5월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
            int checkIndex = sc.nextInt();

            System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
            int editContent = sc.nextInt();

            if (editContent == 1) {
                System.out.println("총액을 수정하세요.");
                int editTotalAmount = sc.nextInt();
                valueMonth.getMay().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getMay().get(checkIndex).setBalance();
                System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 2) {
                System.out.println("날짜를 수정하세요.");
                String editDate = sc.next();
                valueMonth.getMay().get(checkIndex).setDate(editDate);
                System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 3) {
                System.out.println("메모를 수정하세요.");
                String editMemo = sc.next();
                valueMonth.getMay().get(checkIndex).setMemo(editMemo);
                System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 4) {
                System.out.println("지출을 수정하세요.");
                int editOutcome = sc.nextInt();
                valueMonth.getMay().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getMay().get(checkIndex).setBalance();
                System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

        }

        // 6월에서 수정할 내용이 있을 때,
        if (checkMonth == 6) {
            System.out.println("6월 가계부를 수정합니다.");

            if (valueMonth.getJune() == null || valueMonth.getJune().size() == 0) {
                System.out.println("아직 6월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInJune(valueMonth);

            System.out.println("6월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
            int checkIndex = sc.nextInt();

            System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
            int editContent = sc.nextInt();

            if (editContent == 1) {
                System.out.println("총액을 수정하세요.");
                int editTotalAmount = sc.nextInt();
                valueMonth.getJune().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getJune().get(checkIndex).setBalance();
                System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 2) {
                System.out.println("날짜를 수정하세요.");
                String editDate = sc.next();
                valueMonth.getJune().get(checkIndex).setDate(editDate);
                System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 3) {
                System.out.println("메모를 수정하세요.");
                String editMemo = sc.next();
                valueMonth.getJune().get(checkIndex).setMemo(editMemo);
                System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 4) {
                System.out.println("지출을 수정하세요.");
                int editOutcome = sc.nextInt();
                valueMonth.getJune().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getJune().get(checkIndex).setBalance();
                System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

        }

        // 7월에서 수정할 내용이 있을 때,
        if (checkMonth == 7) {
            System.out.println("7월 가계부를 수정합니다.");

            if (valueMonth.getJuly() == null || valueMonth.getJuly().size() == 0) {
                System.out.println("아직 7월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInJuly(valueMonth);

            System.out.println("7월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
            int checkIndex = sc.nextInt();

            System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
            int editContent = sc.nextInt();

            if (editContent == 1) {
                System.out.println("총액을 수정하세요.");
                int editTotalAmount = sc.nextInt();
                valueMonth.getJuly().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getJuly().get(checkIndex).setBalance();
                System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 2) {
                System.out.println("날짜를 수정하세요.");
                String editDate = sc.next();
                valueMonth.getJuly().get(checkIndex).setDate(editDate);
                System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 3) {
                System.out.println("메모를 수정하세요.");
                String editMemo = sc.next();
                valueMonth.getJuly().get(checkIndex).setMemo(editMemo);
                System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 4) {
                System.out.println("지출을 수정하세요.");
                int editOutcome = sc.nextInt();
                valueMonth.getJuly().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getJuly().get(checkIndex).setBalance();
                System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

        }

        // 8월에서 수정할 내용이 있을 때,
        if (checkMonth == 8) {
            System.out.println("8월 가계부를 수정합니다.");

            if (valueMonth.getAugust() == null || valueMonth.getAugust().size() == 0) {
                System.out.println("아직 8월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInAugust(valueMonth);

            System.out.println("8월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
            int checkIndex = sc.nextInt();

            System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
            int editContent = sc.nextInt();

            if (editContent == 1) {
                System.out.println("총액을 수정하세요.");
                int editTotalAmount = sc.nextInt();
                valueMonth.getAugust().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getAugust().get(checkIndex).setBalance();
                System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 2) {
                System.out.println("날짜를 수정하세요.");
                String editDate = sc.next();
                valueMonth.getAugust().get(checkIndex).setDate(editDate);
                System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 3) {
                System.out.println("메모를 수정하세요.");
                String editMemo = sc.next();
                valueMonth.getAugust().get(checkIndex).setMemo(editMemo);
                System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 4) {
                System.out.println("지출을 수정하세요.");
                int editOutcome = sc.nextInt();
                valueMonth.getAugust().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getAugust().get(checkIndex).setBalance();
                System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

        }

        // 9월에서 수정할 내용이 있을 때,
        if (checkMonth == 9) {
            System.out.println("9월 가계부를 수정합니다.");

            if (valueMonth.getSeptember() == null || valueMonth.getSeptember().size() == 0) {
                System.out.println("아직 9월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInSeptember(valueMonth);

            System.out.println("9월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
            int checkIndex = sc.nextInt();

            System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
            int editContent = sc.nextInt();

            if (editContent == 1) {
                System.out.println("총액을 수정하세요.");
                int editTotalAmount = sc.nextInt();
                valueMonth.getSeptember().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getSeptember().get(checkIndex).setBalance();
                System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 2) {
                System.out.println("날짜를 수정하세요.");
                String editDate = sc.next();
                valueMonth.getSeptember().get(checkIndex).setDate(editDate);
                System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 3) {
                System.out.println("메모를 수정하세요.");
                String editMemo = sc.next();
                valueMonth.getSeptember().get(checkIndex).setMemo(editMemo);
                System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 4) {
                System.out.println("지출을 수정하세요.");
                int editOutcome = sc.nextInt();
                valueMonth.getSeptember().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getSeptember().get(checkIndex).setBalance();
                System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

        }

        // 10월에서 수정할 내용이 있을 때,
        if (checkMonth == 10) {
            System.out.println("10월 가계부를 수정합니다.");

            if (valueMonth.getOctober() == null || valueMonth.getOctober().size() == 0) {
                System.out.println("아직 10월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInOctober(valueMonth);

            System.out.println("10월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
            int checkIndex = sc.nextInt();

            System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
            int editContent = sc.nextInt();

            if (editContent == 1) {
                System.out.println("총액을 수정하세요.");
                int editTotalAmount = sc.nextInt();
                valueMonth.getOctober().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getOctober().get(checkIndex).setBalance();
                System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 2) {
                System.out.println("날짜를 수정하세요.");
                String editDate = sc.next();
                valueMonth.getOctober().get(checkIndex).setDate(editDate);
                System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 3) {
                System.out.println("메모를 수정하세요.");
                String editMemo = sc.next();
                valueMonth.getOctober().get(checkIndex).setMemo(editMemo);
                System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 4) {
                System.out.println("지출을 수정하세요.");
                int editOutcome = sc.nextInt();
                valueMonth.getOctober().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getOctober().get(checkIndex).setBalance();
                System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

        }

        // 11월에서 수정할 내용이 있을 때,
        if (checkMonth == 11) {
            System.out.println("11월 가계부를 수정합니다.");

            if (valueMonth.getNovember() == null || valueMonth.getNovember().size() == 0) {
                System.out.println("아직 11월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInNovember(valueMonth);

            System.out.println("11월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
            int checkIndex = sc.nextInt();

            System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
            int editContent = sc.nextInt();

            if (editContent == 1) {
                System.out.println("총액을 수정하세요.");
                int editTotalAmount = sc.nextInt();
                valueMonth.getNovember().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getNovember().get(checkIndex).setBalance();
                System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 2) {
                System.out.println("날짜를 수정하세요.");
                String editDate = sc.next();
                valueMonth.getNovember().get(checkIndex).setDate(editDate);
                System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 3) {
                System.out.println("메모를 수정하세요.");
                String editMemo = sc.next();
                valueMonth.getNovember().get(checkIndex).setMemo(editMemo);
                System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 4) {
                System.out.println("지출을 수정하세요.");
                int editOutcome = sc.nextInt();
                valueMonth.getNovember().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getNovember().get(checkIndex).setBalance();
                System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

        }

        // 12월에서 수정할 내용이 있을 때,
        if (checkMonth == 12) {
            System.out.println("12월 가계부를 수정합니다.");

            if (valueMonth.getDecember() == null || valueMonth.getDecember().size() == 0) {
                System.out.println("아직 12월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInDecember(valueMonth);

            System.out.println("12월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
            int checkIndex = sc.nextInt();

            System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
            int editContent = sc.nextInt();

            if (editContent == 1) {
                System.out.println("총액을 수정하세요.");
                int editTotalAmount = sc.nextInt();
                valueMonth.getDecember().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getDecember().get(checkIndex).setBalance();
                System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 2) {
                System.out.println("날짜를 수정하세요.");
                String editDate = sc.next();
                valueMonth.getDecember().get(checkIndex).setDate(editDate);
                System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 3) {
                System.out.println("메모를 수정하세요.");
                String editMemo = sc.next();
                valueMonth.getDecember().get(checkIndex).setMemo(editMemo);
                System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            if (editContent == 4) {
                System.out.println("지출을 수정하세요.");
                int editOutcome = sc.nextInt();
                valueMonth.getDecember().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getDecember().get(checkIndex).setBalance();
                System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

        }

    }

    // 가계부 삭제 시 호출
    public void deleteDataInMonth(int checkMonth, Month valueMonth) {
        AccountBook accountBook = new AccountBook();
        CheckData checkData = new CheckData();
        Scanner sc = new Scanner(System.in);

        // 1월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 1) {
            System.out.println("1월의 가계부를 삭제합니다.");

            if (valueMonth.getJanuary() == null || valueMonth.getJanuary().size() == 0) {
                System.out.println("아직 1월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInJanuary(valueMonth);

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

            checkData.checkDataInFebruary(valueMonth);

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

            checkData.checkDataInMarch(valueMonth);

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

            checkData.checkDataInApril(valueMonth);

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

            checkData.checkDataInMay(valueMonth);

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

            checkData.checkDataInJune(valueMonth);

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

            checkData.checkDataInJuly(valueMonth);

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

            checkData.checkDataInAugust(valueMonth);

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

            checkData.checkDataInSeptember(valueMonth);

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

            checkData.checkDataInOctober(valueMonth);

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

            checkData.checkDataInNovember(valueMonth);

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

            checkData.checkDataInDecember(valueMonth);

            System.out.println("12월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
            int checkDeleteIndex = sc.nextInt();
            valueMonth.getDecember().remove(checkDeleteIndex);
            System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
            accountBook.startAccountBook(valueMonth);
        }


    }

    // 가계부 월별 조회 시 호출
    public void inquiryDataInMonth(int checkMonth, Month valueMonth) {
        AccountBook accountBook = new AccountBook();
        CheckData checkData =  new CheckData();
        Scanner sc = new Scanner(System.in);

        // 1월 필터링
        if (checkMonth == 1) {
            System.out.println("1월의 가계부를 조회합니다.");

            if (valueMonth.getJanuary() == null) {
                System.out.println("아직 1월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }

            checkData.checkDataInJanuary(valueMonth);

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

            checkData.checkDataInFebruary(valueMonth);

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

            checkData.checkDataInMarch(valueMonth);

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

            checkData.checkDataInApril(valueMonth);

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

            checkData.checkDataInMay(valueMonth);

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

            checkData.checkDataInJune(valueMonth);

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

            checkData.checkDataInJuly(valueMonth);

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

            checkData.checkDataInAugust(valueMonth);

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

            checkData.checkDataInSeptember(valueMonth);

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

            checkData.checkDataInOctober(valueMonth);

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

            checkData.checkDataInNovember(valueMonth);

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

            checkData.checkDataInDecember(valueMonth);

            System.out.println("12월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

            int checkRestart = sc.nextInt();
            if (checkRestart == 1) {
                accountBook.startAccountBook(valueMonth);
            }
        }
    }
}

