package accountbook;

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

        if (menu == 1) {
            System.out.println("몇 월의 가계부를 기입하십니까 ?");
            System.out.println("1 ~ 12월 중 숫자로 입력받습니다.");
            int checkMonth = sc.nextInt();

            // 1월에 기입할 내용이 있을 경우,
            if (checkMonth == 1) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            if (checkMonth == 2) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            if (checkMonth == 3) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            if (checkMonth == 4) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            if (checkMonth == 5) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            if (checkMonth == 6) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            if (checkMonth == 7) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            if (checkMonth == 8) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            if (checkMonth == 9) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            if (checkMonth == 10) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            if (checkMonth == 11) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            }

            if (checkMonth == 12) {
                bookFunction.inputDataInMonth(checkMonth, dataList, valueMonth);
            }
        }

        // 수정 메뉴 선택
        if (menu == 2) {
            System.out.println("몇 월의 가계부를 수정하십니까 ?");
            System.out.println("1 ~ 12월 중 숫자로 입력받습니다.");
            int checkMonth = sc.nextInt();

            // 1월에 수정이 있을 경우,
            if (checkMonth == 1) {
                bookFunction.modifyDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 2) {
                bookFunction.modifyDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 3) {
                bookFunction.modifyDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 4) {
                bookFunction.modifyDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 5) {
                bookFunction.modifyDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 6) {
                bookFunction.modifyDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 7) {
                bookFunction.modifyDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 8) {
                bookFunction.modifyDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 9) {
                bookFunction.modifyDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 10) {
                bookFunction.modifyDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 11) {
                bookFunction.modifyDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 12) {
                bookFunction.modifyDataInMonth(checkMonth, valueMonth);
            }

        }

        // 삭제 메뉴 선택
        if (menu == 3) {
            System.out.println("몇 월의 가계부에서 삭제하십니까 ?");
            System.out.println("1 ~ 12월 중 숫자로 입력받습니다.");
            int checkMonth = sc.nextInt();

            // 1월에 삭제할 내용이 있을 경우,
            if (checkMonth == 1) {
                bookFunction.deleteDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 2) {
                bookFunction.deleteDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 3) {
                bookFunction.deleteDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 4) {
                bookFunction.deleteDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 5) {
                bookFunction.deleteDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 6) {
                bookFunction.deleteDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 7) {
                bookFunction.deleteDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 8) {
                bookFunction.deleteDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 9) {
                bookFunction.deleteDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 10) {
                bookFunction.deleteDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 11) {
                bookFunction.deleteDataInMonth(checkMonth, valueMonth);
            }

            if (checkMonth == 12) {
                bookFunction.deleteDataInMonth(checkMonth, valueMonth);
            }

        }

        // 월별 조회 메뉴 선택
        if (menu == 4) {
            System.out.println("몇 월의 가계부를 조회하십니까 ?");
            System.out.println("1 ~ 12월 중 숫자로 입력받습니다.");
            int checkMonth = sc.nextInt();

            // 1월을 조회하고 싶은 경우,
            if (checkMonth == 1) {
                bookFunction.findDataInMonth(checkMonth, valueMonth);
            }
            // 2월을 조회하고 싶은 경우,
            if (checkMonth == 2) {
                bookFunction.findDataInMonth(checkMonth, valueMonth);
            }
            // 3월을 조회하고 싶은 경우,
            if (checkMonth == 3) {
                bookFunction.findDataInMonth(checkMonth, valueMonth);
            }
            // 4월을 조회하고 싶은 경우.
            if (checkMonth == 4) {
                bookFunction.findDataInMonth(checkMonth, valueMonth);
            }
            // 5월을 조회하고 싶은 경우,
            if (checkMonth == 5) {
                bookFunction.findDataInMonth(checkMonth, valueMonth);
            }
            // 6월을 조회하고 싶은 경우,
            if (checkMonth == 6) {
                bookFunction.findDataInMonth(checkMonth, valueMonth);
            }
            // 7월을 조회하고 싶은 경우,
            if (checkMonth == 7) {
                bookFunction.findDataInMonth(checkMonth, valueMonth);
            }
            // 8월을 조회하고 싶은 경우,
            if (checkMonth == 8) {
                bookFunction.findDataInMonth(checkMonth, valueMonth);
            }
            // 9월을 조회하고 싶은 경우,
            if (checkMonth == 9) {
                bookFunction.findDataInMonth(checkMonth, valueMonth);
            }
            // 10월을 조회하고 싶은 경우,
            if (checkMonth == 10) {
                bookFunction.findDataInMonth(checkMonth, valueMonth);
            }
            // 11월을 조회하고 싶은 경우,
            if (checkMonth == 11) {
                bookFunction.findDataInMonth(checkMonth,valueMonth);
            }
            // 12월을 조회하고 싶은 경우,
            if (checkMonth == 12) {
                bookFunction.findDataInMonth(checkMonth, valueMonth);
            }
        }

        // 프로그램 종료 메뉴 선택
        if (menu == 5) {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
