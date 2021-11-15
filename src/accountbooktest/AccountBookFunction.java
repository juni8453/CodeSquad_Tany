package accountbooktest;

import java.util.List;
import java.util.Scanner;

public class AccountBookFunction {

    // 가계부 기입 시 호출
   public void inputDataInMonth(int checkMonth , List<Data> dataList, Month valueMonth) {
        AccountBook accountBook = new AccountBook();
        Data valueData = new Data();
        InputFunction inputMonthData = new InputFunction();
        Scanner sc = new Scanner(System.in);

        // 1월 필터링
        if (checkMonth == 1) {

            inputMonthData.inputData(dataList, valueMonth, valueData, checkMonth);

            System.out.println("가계부 기입이 완료되었습니다. 1월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행.
            if (checkRestart == 1) {
                inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때,
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 2월 필터링
        if (checkMonth == 2) {

            inputMonthData.inputData(dataList, valueMonth, valueData, checkMonth);

            System.out.println("가계부 기입이 완료되었습니다. 2월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 3월 필터링
        if (checkMonth == 3) {

            inputMonthData.inputData(dataList, valueMonth, valueData, checkMonth);

            System.out.println("가계부 기입이 완료되었습니다. 3월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 4월 필터링
        if (checkMonth == 4) {

            inputMonthData.inputData(dataList, valueMonth, valueData, checkMonth);

            System.out.println("가계부 기입이 완료되었습니다. 4월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 5월 필터링
        if (checkMonth == 5) {

            inputMonthData.inputData(dataList, valueMonth, valueData, checkMonth);

            System.out.println("가계부 기입이 완료되었습니다. 5월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 6월 필터링
        if (checkMonth == 6) {

            inputMonthData.inputData(dataList, valueMonth, valueData, checkMonth);

            System.out.println("가계부 기입이 완료되었습니다. 6월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 7월 필터링
        if (checkMonth == 7) {

            inputMonthData.inputData(dataList, valueMonth, valueData, checkMonth);

            System.out.println("가계부 기입이 완료되었습니다. 7월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 8월 필터링
        if (checkMonth == 8) {

            inputMonthData.inputData(dataList, valueMonth, valueData, checkMonth);

            System.out.println("가계부 기입이 완료되었습니다. 8월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 9월 필터링
        if (checkMonth == 9) {

            inputMonthData.inputData(dataList, valueMonth, valueData, checkMonth);

            System.out.println("가계부 기입이 완료되었습니다. 9월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 10월 필터링
        if (checkMonth == 10) {

            inputMonthData.inputData(dataList, valueMonth, valueData, checkMonth);

            System.out.println("가계부 기입이 완료되었습니다. 10월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 11월 필터링
        if (checkMonth == 11) {

            inputMonthData.inputData(dataList, valueMonth, valueData, checkMonth);

            System.out.println("가계부 기입이 완료되었습니다. 11월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }

        // 12월 필터링
        if (checkMonth == 12) {

            inputMonthData.inputData(dataList, valueMonth, valueData, checkMonth);

            System.out.println("가계부 기입이 완료되었습니다. 12월 가계부를 더 작성하십니까 ? 작성[1], 메뉴로 돌아가기[2]");
            int checkRestart = sc.nextInt();

            // 더 작성을 원한다면, 다시 inputDataInMonth() 실행한다.
            if (checkRestart == 1) {
                inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            // 종료를 선택했을 때
            if (checkRestart == 2) {
                accountBook.startAccountBook(valueMonth);
            }
        }
    }

    // 가계부 수정 시 호출
    public void modifyDataInMonth(int checkMonth, Month valueMonth) {
        ModifyFunction modifyFunction = new ModifyFunction();

        // 1월에서 수정할 내용이 있을 때,
        if (checkMonth == 1) {
            modifyFunction.modifyData(checkMonth, valueMonth);
        }

        // 2월에서 수정할 내용이 있을 때,
        if (checkMonth == 2) {
            modifyFunction.modifyData(checkMonth, valueMonth);
        }

        // 3월에서 수정할 내용이 있을 때,
        if (checkMonth == 3) {
            modifyFunction.modifyData(checkMonth, valueMonth);
        }

        // 4월에서 수정할 내용이 있을 때,
        if (checkMonth == 4) {
            modifyFunction.modifyData(checkMonth, valueMonth);
        }

        // 5월에서 수정할 내용이 있을 때,
        if (checkMonth == 5) {
            modifyFunction.modifyData(checkMonth, valueMonth);
        }

        // 6월에서 수정할 내용이 있을 때,
        if (checkMonth == 6) {
            modifyFunction.modifyData(checkMonth, valueMonth);
        }

        // 7월에서 수정할 내용이 있을 때,
        if (checkMonth == 7) {
            modifyFunction.modifyData(checkMonth, valueMonth);
        }

        // 8월에서 수정할 내용이 있을 때,
        if (checkMonth == 8) {
            modifyFunction.modifyData(checkMonth, valueMonth);
        }

        // 9월에서 수정할 내용이 있을 때,
        if (checkMonth == 9) {
            modifyFunction.modifyData(checkMonth, valueMonth);
        }

        // 10월에서 수정할 내용이 있을 때,
        if (checkMonth == 10) {
            modifyFunction.modifyData(checkMonth, valueMonth);
        }

        // 11월에서 수정할 내용이 있을 때,
        if (checkMonth == 11) {
            modifyFunction.modifyData(checkMonth, valueMonth);
        }

        // 12월에서 수정할 내용이 있을 때,
        if (checkMonth == 12) {
            modifyFunction.modifyData(checkMonth, valueMonth);
        }
    }

    // 가계부 삭제 시 호출
    public void deleteDataInMonth(int checkMonth, Month valueMonth) {
       DeleteFunction deleteFunction = new DeleteFunction();

        // 1월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 1) {
            deleteFunction.deleteData(checkMonth, valueMonth);
        }

        // 2월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 2) {
            deleteFunction.deleteData(checkMonth, valueMonth);
        }

        // 3월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 3) {
            deleteFunction.deleteData(checkMonth, valueMonth);
        }

        // 4월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 4) {
            deleteFunction.deleteData(checkMonth, valueMonth);
        }

        // 5월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 5) {
            deleteFunction.deleteData(checkMonth, valueMonth);
        }

        // 6월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 6) {
            deleteFunction.deleteData(checkMonth, valueMonth);
        }

        // 7월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 7) {
            deleteFunction.deleteData(checkMonth, valueMonth);
        }

        // 8월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 8) {
            deleteFunction.deleteData(checkMonth, valueMonth);
        }

        // 9월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 9) {
            deleteFunction.deleteData(checkMonth, valueMonth);
        }

        // 10월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 10) {
            deleteFunction.deleteData(checkMonth, valueMonth);
        }

        // 11월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 11) {
            deleteFunction.deleteData(checkMonth, valueMonth);
        }

        // 12월에서 삭제할 내용이 있을 떄,
        if (checkMonth == 12) {
            deleteFunction.deleteData(checkMonth, valueMonth);
        }
    }

    // 가계부 월별 조회 시 호출
    public void findDataInMonth(int checkMonth, Month valueMonth) {
        AccountBook accountBook = new AccountBook();
        CheckDataInMonth checkData =  new CheckDataInMonth();
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

