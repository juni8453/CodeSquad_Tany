package accountbooktest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AccountBook {

    public void settingMonthValue() {
        Month valueMonth = new Month();
        startAccountBook(valueMonth);
    }

    public void startAccountBook(Month valueMonth) {
        Scanner sc = new Scanner(System.in);
        List<Data> dataList = new ArrayList<>();
        AccountBookFunction bookFunction = new AccountBookFunction();

        System.out.println("===================");
        System.out.println("수행할 작업을 선택해주세요.");
        System.out.println("기입[1], 수정[2], 삭제[3], 월별 조회[4], 가계부 프로그램 종료[5]");
        int menu = sc.nextInt();

        // Todo 기입 메뉴 선택
        if (menu == 1) {
            System.out.println("몇 월의 가계부를 기입하십니까 ?");
            System.out.println("1 ~ 12월 중 숫자로 입력받습니다.");
            int checkMonth = sc.nextInt();

            // Todo 1월에 기입할 경우,
            if (checkMonth == 1) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            } // 1월 기입

            // Todo 2월에 기입할 경우.
            if (checkMonth == 2) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            } // 2월 기입

            if (checkMonth == 3) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            } // 3월 기입

            if (checkMonth == 4) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            } // 4월 기입

            if (checkMonth == 5) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            } // 5월 기입

            if (checkMonth == 6) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            } // 6월 기입

            if (checkMonth == 7) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            } // 7월 기입

            if (checkMonth == 8) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            } // 8월 기입

            if (checkMonth == 9) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            } // 9월 기입

            if (checkMonth == 10) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            } // 10월 기입

            if (checkMonth == 11) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            } // 11월 기입

            if (checkMonth == 12) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            } // 12월 기입
        }

        // Todo 수정 메뉴 선택
        if (menu == 2) {
            System.out.println("몇 월의 가계부를 수정하십니까 ?");
            System.out.println("1 ~ 12월 중 숫자로 입력받습니다.");
            int checkMonth = sc.nextInt();

            // Todo 1월에 수정이 있을 경우,
            if (checkMonth == 1) {

            } // 1월 수정

            // Todo 2월에 수정이 있을 경우,
            if (checkMonth == 2) {

            } // 2월 수정

        }

        // Todo 삭제 메뉴 선택
        if (menu == 3) {
            System.out.println("몇 월의 가계부에서 삭제하십니까 ?");
            System.out.println("1 ~ 12월 중 숫자로 입력받습니다.");
            int checkMonth = sc.nextInt();

            // Todo 1월에 삭제할 내용이 있을 경우,
            if (checkMonth == 1) {

            } // 1월 삭제

            // Todo 2월에 삭제할 내용이 있을 경우,
            if (checkMonth == 2) {

            } // 2월 삭제

        }

        // Todo 월별 조회 메뉴 선택
        if (menu == 4) {
            System.out.println("몇 월의 가계부를 조회하십니까 ?");
            System.out.println("1 ~ 12월 중 숫자로 입력받습니다.");
            int checkMonth = sc.nextInt();

            // Todo 1월을 조회하고 싶은 경우,
            if (checkMonth == 1) {

            } // 1월 조회

            // Todo 2월을 조회하고 싶은 경우,
            if (checkMonth == 2) {

            } // 2월 조회
        }

        // Todo 프로그램 종료 메뉴 선택
        if (menu == 5) {
            System.out.println("프로그램을 종료합니다.");
            return;
        }

    }
}
