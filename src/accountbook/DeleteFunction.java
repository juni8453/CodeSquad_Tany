package accountbook;

import java.util.Scanner;

public class DeleteFunction {

    public void deleteData(int checkMonth, Month valueMonth) {
        Scanner sc = new Scanner(System.in);
        AccountBook accountBook = new AccountBook();
        CheckDataInMonth checkData = new CheckDataInMonth();

        System.out.println(checkMonth + "월의 가계부를 삭제합니다.");

        if (checkMonth == 1) {
            if (valueMonth.getJanuary() == null || valueMonth.getJanuary().size() == 0) {
                System.out.println("아직" + " "+ checkMonth + "월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInJanuary(valueMonth);
        }

        if (checkMonth == 2) {
            if (valueMonth.getFebruary() == null || valueMonth.getFebruary().size() == 0) {
                System.out.println("아직" + " "+ checkMonth + "월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInFebruary(valueMonth);
        }

        if (checkMonth == 3) {
            if (valueMonth.getMarch() == null || valueMonth.getMarch().size() == 0) {
                System.out.println("아직" + " "+ checkMonth + "월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInMarch(valueMonth);
        }

        if (checkMonth == 4) {
            if (valueMonth.getApril() == null || valueMonth.getApril().size() == 0) {
                System.out.println("아직" + " "+ checkMonth + "월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInApril(valueMonth);
        }

        if (checkMonth == 5) {
            if (valueMonth.getMay() == null || valueMonth.getMay().size() == 0) {
                System.out.println("아직" + " " +checkMonth + "월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInMay(valueMonth);
        }

        if (checkMonth == 6) {
            if (valueMonth.getJune() == null || valueMonth.getJune().size() == 0) {
                System.out.println("아직" + " " +checkMonth + "월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInJune(valueMonth);
        }

        if (checkMonth == 7) {
            if (valueMonth.getJuly() == null || valueMonth.getJuly().size() == 0) {
                System.out.println("아직" + " " +checkMonth + "월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInJuly(valueMonth);
        }

        if (checkMonth == 8) {
            if (valueMonth.getAugust() == null || valueMonth.getAugust().size() == 0) {
                System.out.println("아직" + " " +checkMonth + "월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInAugust(valueMonth);
        }

        if (checkMonth == 9) {
            if (valueMonth.getSeptember() == null || valueMonth.getSeptember().size() == 0) {
                System.out.println("아직" + " " +checkMonth + "월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInSeptember(valueMonth);
        }

        if (checkMonth == 10) {
            if (valueMonth.getOctober() == null || valueMonth.getOctober().size() == 0) {
                System.out.println("아직" + " " +checkMonth + "월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInOctober(valueMonth);
        }

        if (checkMonth == 11) {
            if (valueMonth.getNovember() == null || valueMonth.getNovember().size() == 0) {
                System.out.println("아직" + " " +checkMonth + "월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInNovember(valueMonth);
        }

        if (checkMonth == 12) {
            if (valueMonth.getDecember() == null || valueMonth.getDecember().size() == 0) {
                System.out.println("아직" + " " +checkMonth + "월 가계부에 아무것도 적혀있지 않아 삭제할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInDecember(valueMonth);
        }

        System.out.println(checkMonth + "월 가계부 조회 완료. 몇 번 내용을 삭제하시겠습니까 ?");
        int checkDeleteIndex = sc.nextInt();

        if (checkMonth == 1) {
            valueMonth.getJanuary().remove(checkDeleteIndex);
        }

        if (checkMonth == 2) {
            valueMonth.getFebruary().remove(checkDeleteIndex);
        }

        if (checkMonth == 3) {
            valueMonth.getMarch().remove(checkDeleteIndex);
        }

        if (checkMonth == 4) {
            valueMonth.getApril().remove(checkDeleteIndex);
        }

        if (checkMonth == 5) {
            valueMonth.getMay().remove(checkDeleteIndex);
        }

        if (checkMonth == 6) {
            valueMonth.getJune().remove(checkDeleteIndex);
        }

        if (checkMonth == 7) {
            valueMonth.getJuly().remove(checkDeleteIndex);
        }

        if (checkMonth == 8) {
            valueMonth.getAugust().remove(checkDeleteIndex);
        }

        if (checkMonth == 9) {
            valueMonth.getSeptember().remove(checkDeleteIndex);
        }

        if (checkMonth == 10) {
            valueMonth.getOctober().remove(checkDeleteIndex);
        }

        if (checkMonth == 11) {
            valueMonth.getNovember().remove(checkDeleteIndex);
        }

        if (checkMonth == 12) {
            valueMonth.getDecember().remove(checkDeleteIndex);
        }

        System.out.println("[" + checkDeleteIndex + "]번 데이터가 삭제되었습니다.");
        accountBook.startAccountBook(valueMonth);
    }
}
