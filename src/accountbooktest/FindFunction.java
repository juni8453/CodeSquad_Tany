package accountbooktest;

import java.util.Scanner;

public class FindFunction {

    public void findData(int checkMonth, Month valueMonth) {
        AccountBook accountBook = new AccountBook();
        CheckDataInMonth checkData = new CheckDataInMonth();
        Scanner sc = new Scanner(System.in);

        System.out.println(checkMonth + " " + "월의 가계부를 조회합니다.");

        if (checkMonth == 1) {
            if (valueMonth.getJanuary() == null) {
                System.out.println("아직" + checkMonth + " " + "월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInJanuary(valueMonth);
        }

        if (checkMonth == 2) {
            if (valueMonth.getFebruary() == null) {
                System.out.println("아직" + checkMonth + " " + "월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInFebruary(valueMonth);
        }

        if (checkMonth == 3) {
            if (valueMonth.getMarch() == null) {
                System.out.println("아직" + checkMonth + " " + "월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInMarch(valueMonth);
        }

        if (checkMonth == 4) {
            if (valueMonth.getApril() == null) {
                System.out.println("아직" + checkMonth + " " + "월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInApril(valueMonth);
        }
        if (checkMonth == 5) {
            if (valueMonth.getMay() == null) {
                System.out.println("아직" + checkMonth + " " + "월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInMay(valueMonth);
        }
        if (checkMonth == 6) {
            if (valueMonth.getJune() == null) {
                System.out.println("아직" + checkMonth + " " + "월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInJune(valueMonth);
        }
        if (checkMonth == 7) {
            if (valueMonth.getJuly() == null) {
                System.out.println("아직" + checkMonth + " " + "월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInJuly(valueMonth);
        }

        if (checkMonth == 8) {
            if (valueMonth.getAugust() == null) {
                System.out.println("아직" + checkMonth + " " + "월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInAugust(valueMonth);
        }

        if (checkMonth == 9) {
            if (valueMonth.getSeptember() == null) {
                System.out.println("아직" + checkMonth + " " + "월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInSeptember(valueMonth);
        }

        if (checkMonth == 10) {
            if (valueMonth.getOctober() == null) {
                System.out.println("아직" + checkMonth + " " + "월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInOctober(valueMonth);
        }

        if (checkMonth == 11) {
            if (valueMonth.getNovember() == null) {
                System.out.println("아직" + checkMonth + " " + "월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInNovember(valueMonth);
        }
        if (checkMonth == 12) {
            if (valueMonth.getDecember() == null) {
                System.out.println("아직" + checkMonth + " " + "월 가계부를 작성하지 않았습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInDecember(valueMonth);
        }





        System.out.println(checkMonth + " " +"월 가계부 조회 완료. 메뉴로 돌아가십니까 ? 메뉴로 돌아가기[1]");

        int checkRestart = sc.nextInt();
        if (checkRestart == 1) {
            accountBook.startAccountBook(valueMonth);
        }
    }
}
