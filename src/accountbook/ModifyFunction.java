package accountbook;

import java.util.Scanner;

public class ModifyFunction {

    public void modifyData(int checkMonth, Month valueMonth) {
        Scanner sc = new Scanner(System.in);
        AccountBook accountBook = new AccountBook();
        CheckDataInMonth checkData = new CheckDataInMonth();

        System.out.println(checkMonth + "월 가계부를 수정합니다.");

        if (checkMonth == 1) {
            if (valueMonth.getJanuary() == null || valueMonth.getJanuary().size() == 0) {
                System.out.println("아직" + checkMonth + "월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInJanuary(valueMonth);
        }

        if (checkMonth == 2) {
            if (valueMonth.getFebruary() == null || valueMonth.getFebruary().size() == 0) {
                System.out.println("아직" + checkMonth + "월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInFebruary(valueMonth);
        }

        if (checkMonth == 3) {
            if (valueMonth.getMarch() == null || valueMonth.getMarch().size() == 0) {
                System.out.println("아직" + checkMonth + "월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInMarch(valueMonth);
        }

        if (checkMonth == 4) {
            if (valueMonth.getApril() == null || valueMonth.getApril().size() == 0) {
                System.out.println("아직" + checkMonth + "월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInApril(valueMonth);
        }

        if (checkMonth == 5) {
            if (valueMonth.getMay() == null || valueMonth.getMay().size() == 0) {
                System.out.println("아직" + checkMonth + "월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInMay(valueMonth);
        }

        if (checkMonth == 6) {
            if (valueMonth.getJune() == null || valueMonth.getJune().size() == 0) {
                System.out.println("아직" + checkMonth + "월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInJune(valueMonth);
        }

        if (checkMonth == 7) {
            if (valueMonth.getJuly() == null || valueMonth.getJuly().size() == 0) {
                System.out.println("아직" + checkMonth + "월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInJuly(valueMonth);
        }

        if (checkMonth == 8) {
            if (valueMonth.getAugust() == null || valueMonth.getAugust().size() == 0) {
                System.out.println("아직" + checkMonth + "월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInAugust(valueMonth);
        }

        if (checkMonth == 9) {
            if (valueMonth.getSeptember() == null || valueMonth.getSeptember().size() == 0) {
                System.out.println("아직" + checkMonth + "월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInSeptember(valueMonth);
        }

        if (checkMonth == 10) {
            if (valueMonth.getOctober() == null || valueMonth.getOctober().size() == 0) {
                System.out.println("아직" + checkMonth + "월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInOctober(valueMonth);
        }

        if (checkMonth == 11) {
            if (valueMonth.getNovember() == null || valueMonth.getNovember().size() == 0) {
                System.out.println("아직" + checkMonth + "월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInNovember(valueMonth);
        }

        if (checkMonth == 12) {
            if (valueMonth.getDecember() == null || valueMonth.getDecember().size() == 0) {
                System.out.println("아직" + checkMonth + "월 가계부에 아무것도 적혀있지 않아 수정할 내용이 없습니다. 메뉴로 돌아갑니다.");
                accountBook.startAccountBook(valueMonth);
            }
            checkData.checkDataInDecember(valueMonth);
        }

        System.out.println(checkMonth + "월 가계부 조회 완료. 몇 번 내용을 수정하시겠습니까 ?");
        int checkIndex = sc.nextInt();

        System.out.println("무엇을 수정하십니까? 총액[1], 날짜[2], 간단메모[3], 지출[4]");
        int editContent = sc.nextInt();

        if (editContent == 1) {
            System.out.println("총액을 수정하세요.");
            int editTotalAmount = sc.nextInt();

            if (checkMonth == 1) {
                valueMonth.getJanuary().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getJanuary().get(checkIndex).setBalance();
            }

            if (checkMonth == 2) {
                valueMonth.getFebruary().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getFebruary().get(checkIndex).setBalance();
            }

            if (checkMonth == 3) {
                valueMonth.getMarch().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getMarch().get(checkIndex).setBalance();
            }

            if (checkMonth == 4) {
                valueMonth.getApril().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getApril().get(checkIndex).setBalance();
            }

            if (checkMonth == 5) {
                valueMonth.getMay().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getMay().get(checkIndex).setBalance();
            }

            if (checkMonth == 6) {
                valueMonth.getJune().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getJune().get(checkIndex).setBalance();
            }

            if (checkMonth == 7) {
                valueMonth.getJuly().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getJuly().get(checkIndex).setBalance();
            }

            if (checkMonth == 8) {
                valueMonth.getAugust().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getAugust().get(checkIndex).setBalance();
            }

            if (checkMonth == 9) {
                valueMonth.getSeptember().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getSeptember().get(checkIndex).setBalance();
            }

            if (checkMonth == 10) {
                valueMonth.getOctober().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getOctober().get(checkIndex).setBalance();
            }

            if (checkMonth == 11) {
                valueMonth.getNovember().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getNovember().get(checkIndex).setBalance();
            }

            if (checkMonth == 12) {
                valueMonth.getDecember().get(checkIndex).setTotalAmount(editTotalAmount);
                valueMonth.getDecember().get(checkIndex).setBalance();
            }

            System.out.println("총액이 수정되었습니다. 메뉴로 돌아갑니다.");
            accountBook.startAccountBook(valueMonth);
        }

        if (editContent == 2) {
            System.out.println("날짜를 수정하세요.");
            String editDate = sc.next();

            if (checkMonth == 1) {
                valueMonth.getJanuary().get(checkIndex).setDate(editDate);
            }

            if (checkMonth == 2) {
                valueMonth.getFebruary().get(checkIndex).setDate(editDate);
            }

            if (checkMonth == 3) {
                valueMonth.getMarch().get(checkIndex).setDate(editDate);
            }

            if (checkMonth == 4) {
                valueMonth.getApril().get(checkIndex).setDate(editDate);
            }

            if (checkMonth == 5) {
                valueMonth.getMay().get(checkIndex).setDate(editDate);
            }

            if (checkMonth == 6) {
                valueMonth.getJune().get(checkIndex).setDate(editDate);
            }

            if (checkMonth == 7) {
                valueMonth.getJuly().get(checkIndex).setDate(editDate);
            }

            if (checkMonth == 8) {
                valueMonth.getAugust().get(checkIndex).setDate(editDate);
            }

            if (checkMonth == 9) {
                valueMonth.getSeptember().get(checkIndex).setDate(editDate);
            }

            if (checkMonth == 10) {
                valueMonth.getOctober().get(checkIndex).setDate(editDate);
            }

            if (checkMonth == 11) {
                valueMonth.getNovember().get(checkIndex).setDate(editDate);
            }

            if (checkMonth == 12) {
                valueMonth.getDecember().get(checkIndex).setDate(editDate);
            }

            System.out.println("날짜가 수정되었습니다. 메뉴로 돌아갑니다.");
            accountBook.startAccountBook(valueMonth);
        }

        if (editContent == 3) {
            System.out.println("메모를 수정하세요.");
            String editMemo = sc.next();

            if (checkMonth == 1) {
                valueMonth.getJanuary().get(checkIndex).setMemo(editMemo);
            }

            if (checkMonth == 2) {
                valueMonth.getFebruary().get(checkIndex).setMemo(editMemo);
            }

            if (checkMonth == 3) {
                valueMonth.getMarch().get(checkIndex).setMemo(editMemo);
            }

            if (checkMonth == 4) {
                valueMonth.getApril().get(checkIndex).setMemo(editMemo);
            }

            if (checkMonth == 5) {
                valueMonth.getMay().get(checkIndex).setMemo(editMemo);
            }

            if (checkMonth == 6) {
                valueMonth.getJune().get(checkIndex).setMemo(editMemo);
            }

            if (checkMonth == 7) {
                valueMonth.getJuly().get(checkIndex).setMemo(editMemo);
            }

            if (checkMonth == 8) {
                valueMonth.getAugust().get(checkIndex).setMemo(editMemo);
            }

            if (checkMonth == 9) {
                valueMonth.getSeptember().get(checkIndex).setMemo(editMemo);
            }

            if (checkMonth == 10) {
                valueMonth.getOctober().get(checkIndex).setMemo(editMemo);
            }

            if (checkMonth == 11) {
                valueMonth.getNovember().get(checkIndex).setMemo(editMemo);
            }

            if (checkMonth == 12) {
                valueMonth.getDecember().get(checkIndex).setMemo(editMemo);
            }

            System.out.println("메모가 수정되었습니다. 메뉴로 돌아갑니다.");
            accountBook.startAccountBook(valueMonth);
        }

        if (editContent == 4) {
            System.out.println("지출을 수정하세요.");
            int editOutcome = sc.nextInt();

            if (checkMonth == 1) {
                valueMonth.getJanuary().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getJanuary().get(checkIndex).setBalance();
            }

            if (checkMonth == 2) {
                valueMonth.getFebruary().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getFebruary().get(checkIndex).setBalance();
            }

            if (checkMonth == 3) {
                valueMonth.getMarch().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getMarch().get(checkIndex).setBalance();
            }

            if (checkMonth == 4) {
                valueMonth.getApril().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getApril().get(checkIndex).setBalance();
            }

            if (checkMonth == 5) {
                valueMonth.getMay().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getMay().get(checkIndex).setBalance();
            }

            if (checkMonth == 6) {
                valueMonth.getJune().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getJune().get(checkIndex).setBalance();
            }

            if (checkMonth == 7) {
                valueMonth.getJuly().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getJuly().get(checkIndex).setBalance();
            }

            if (checkMonth == 8) {
                valueMonth.getAugust().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getAugust().get(checkIndex).setBalance();
            }

            if (checkMonth == 9) {
                valueMonth.getSeptember().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getSeptember().get(checkIndex).setBalance();
            }

            if (checkMonth == 10) {
                valueMonth.getOctober().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getOctober().get(checkIndex).setBalance();
            }

            if (checkMonth == 11) {
                valueMonth.getNovember().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getNovember().get(checkIndex).setBalance();
            }

            if (checkMonth == 12) {
                valueMonth.getDecember().get(checkIndex).setOutcome(editOutcome);
                valueMonth.getDecember().get(checkIndex).setBalance();
            }

            System.out.println("지출이 수정되었습니다. 메뉴로 돌아갑니다.");
            accountBook.startAccountBook(valueMonth);
        }
    }
}
