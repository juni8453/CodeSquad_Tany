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
//        List<Month> monthList = new ArrayList<>();
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

            // TODO 예) 2월 데이터 삽입하고 되돌아온뒤 다시 기입하려고 하면 1월 리스트가 날아감 ㅋㅋ ㅋㅋ ㅋㅋ ㅋㅋ 고쳐라 닝겐아..
            // Todo 1월에 기입할 경우,
            if (checkMonth == 1) {
                bookFunction.inputDataInMonth(checkMonth, dataList);
            } // 1월 기입

            // Todo 2월에 기입할 경우.
            if (checkMonth == 2) {
                bookFunction.inputDataInMonth(checkMonth, dataList);
            } // 2월 기입

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


//            // Todo 기입 선택 시 해당 월의 값을 넣어주는 메서드 호출
//            if (checkMenu == 1) {
//                inputDataInMonth(checkMonth, months, dataList);
//            }
//
//        } // 1월 일단 가계부 기입만 구현
//
//        if (checkMonth == 2) {
//            System.out.println("2월의 가계부 기능을 사용합니다.");
//            System.out.println("수행할 작업을 선택해주세요.");
//            System.out.println("기입[1], 수정[2], 삭제[3], 2월 가계부 목록 확인[4], 가계부 프로그램 종료[5]");
//            int checkMenu = sc.nextInt();
//
//            // Todo 기입 선택 시 해당 월의 값을 넣어주는 메서드 호출
//            if (checkMenu == 2) {
//                inputDataInMonth(checkMonth, months, dataList);
//            }
//
//        } // 2월 일단 가계부 기입만 구현
//
//    }



//                Data valueData = new Data();
//                List<Data> january = new ArrayList<>();
//
//                valueMonth.setMonth(january);
//                inputDataInMonth(valueMonth);




//        // 가계부 기입
//        if (menu == 1) {
//            inputData(dataList, valueMonth);
//        }
//
//        // 삭제
//        if (menu == 2) {
//
//        }
//
//        // 수정
//        if (menu == 3) {
//
//        }
//
//        // 월별 출력
//        if (menu == 4) {
//
//        }
//    }
//
//    public void inputData(List<Data> dataList , Month valueMonth) {
//        Scanner sc = new Scanner(System.in);
//
//        Data valueData = new Data();
//
//        System.out.println("가계부를 기입합니다.");
//
//        System.out.println("몇 월의 가계부를 작성하시나요 ? 예) 두 자리 12, 한 자리 1");
//        int checkMonth = sc.nextInt();
//
//        System.out.println("총 수입을 기입하세요.");
//        int totalAmount = sc.nextInt();
//        valueData.setTotalAmount(totalAmount);
//
//        System.out.println("날짜를 기입하세요.");
//        String date = sc.next();
//        valueData.setDate(date);
//
//        System.out.println("간단한 메모를 기입하세요.");
//        String memo = sc.next();
//        valueData.setMemo(memo);
//
//        System.out.println("지출한 돈을 기입하세요.");
//        int outcome = sc.nextInt();
//        valueData.setOutcome(outcome);
//
//        int balance = valueData.getTotalAmount() - valueData.getOutcome();
//        valueData.setBalance(balance);
//
//        dataList.add(valueData);
//
//        dataIntoMonth(checkMonth, valueMonth, dataList);
//
//    }

//    private void dataIntoMonth(int checkMonth, Month valueMonth, List<Data> dataList) {
//        Scanner sc = new Scanner(System.in);
//        int checkRestart;
//
//        //TODO valueMonth 클래스 생성 시 모든 달의 리스트가 생성되기 때문에 메모리의 낭비가 될 가능성이 높음
//        //TODO 따라서 valueMonth를 넘겨받을 때 해당 월만 넘겨받는 방식으로 구상해보기.
//
//        if (checkMonth == 1) {
//            valueMonth.setMonth(dataList);
//
//            System.out.println("가계부 기입을 완료했습니다. 더 기입하십니까 ?작성[1] / 종료[2]");
//            checkRestart = sc.nextInt();
//
//            if (checkRestart == 1) {
//                inputData(dataList, valueMonth);
//            }
//
//            if (checkRestart == 2) {
//                return;
//            }
//        }
//
//        if (checkMonth == 2) {
//            valueMonth.setFebruary(dataList);
//
//            System.out.println("가계부 기입을 완료했습니다. 더 기입하십니까 ? 작성[1] / 종료[2]");
//            checkRestart = sc.nextInt();
//
//            if (checkRestart == 1) {
//                inputData(dataList, valueMonth);
//            }
//
//            if (checkRestart == 2) {
//                return;
//            }
//        }
//
//        if (checkMonth == 3) {
//            valueMonth.setMarch(dataList);
//        }
//
//        if (checkMonth == 4) {
//            valueMonth.setApril(dataList);
//        }
//
//        if (checkMonth == 5) {
//            valueMonth.setMay(dataList);
//        }
//
//        if (checkMonth == 6) {
//            valueMonth.setJune(dataList);
//        }
//
//        if (checkMonth == 7) {
//            valueMonth.setJuly(dataList);
//        }
//
//        if (checkMonth == 8) {
//            valueMonth.setAugust(dataList);
//        }
//
//        if (checkMonth == 9) {
//            valueMonth.setSeptember(dataList);
//        }
//
//        if (checkMonth == 10) {
//            valueMonth.setOctober(dataList);
//        }
//
//        if (checkMonth == 11) {
//            valueMonth.setNovember(dataList);
//        }
//
//        if (checkMonth == 12) {
//            valueMonth.setDecember(dataList);
//        }
//    }
//
//    public void printData(int checkMonth, Month valueMonth ,List<Data> dataList) {
//        if (checkMonth == 1) {
//            for (int i = 0; i < valueMonth.getJanuary().size(); i++) {
//                System.out.println("January 가계부");
//                System.out.println("[" + (i+1) + "]번째");
//                System.out.print("날짜 :" + valueMonth.getJanuary().get(i).getDate() + " ");
//                System.out.print("간단 메모 :" + valueMonth.getJanuary().get(i).getMemo() + " ");
//                System.out.print("지출 내역 :" + valueMonth.getJanuary().get(i).getOutcome() + " ");
//                System.out.println("잔액 :" + valueMonth.getJanuary().get(i).getBalance());
//            }
//
//            System.out.println("더 작성하시겠습니까 ? 작성[1] / 종료[2]");
//            checkRewrite(valueMonth);
//        }
//
//        if (checkMonth == 2) {
//            for (int i = 0; i < valueMonth.getFebruary().size(); i++) {
//                System.out.println("February 가계부");
//                System.out.println("[" + (i+1) + "]번째");
//                System.out.print("날짜 :" + valueMonth.getFebruary().get(i).getDate() + " ");
//                System.out.print("간단 메모 :" + valueMonth.getFebruary().get(i).getMemo() + " ");
//                System.out.print("지출 내역 :" + valueMonth.getFebruary().get(i).getOutcome() + " ");
//                System.out.println("잔액 :" + valueMonth.getFebruary().get(i).getBalance());
//            }
//
//            System.out.println("더 작성하시겠습니까 ? 작성[1] / 종료[2]");
//            checkRewrite(valueMonth);
//        }
//    }
//
//    private void checkRewrite(Month valueMonth) {
//        Scanner sc = new Scanner(System.in);
//        int checkReStart = sc.nextInt();
//
//        if (checkReStart == 1) {
//            inputData();
//        }
//
//        if (checkReStart == 2) {
//            return;
//        }
//
//    }
//
//    public void deleteData() {
//
//    }
//
//    public void editData() {
//
//    }
//}
//
//
//
//
//
//
//
//
//package accountbooktest;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class AccountBook {
//
//    private Member member;
//
//    public void startAccountBook() {
//        Scanner sc = new Scanner(System.in);
//
//        List<Data> dataList = new ArrayList<>();
//        Month valueMonth = new Month();
//
//        System.out.println("가계부를 실행합니다.");
//        System.out.println("================");
//        System.out.println("수행할 기능을 선택해주세요.");
//        System.out.println("기입[1] 삭제[2] 수정[3] 월별 출력[4]");
//        int menu = sc.nextInt();
//
//        // 가계부 기입
//        if (menu == 1) {
//            inputData(dataList, valueMonth);
//        }
//
//        // 삭제
//        if (menu == 2) {
//
//        }
//
//        // 수정
//        if (menu == 3) {
//
//        }
//
//        // 월별 출력
//        if (menu == 4) {
//
//        }
//    }
//
//    public void inputData(List<Data> dataList , Month valueMonth) {
//        Scanner sc = new Scanner(System.in);
//
//        Data valueData = new Data();
//
//        System.out.println("가계부를 기입합니다.");
//
//        System.out.println("몇 월의 가계부를 작성하시나요 ? 예) 두 자리 12, 한 자리 1");
//        int checkMonth = sc.nextInt();
//
//        System.out.println("총 수입을 기입하세요.");
//        int totalAmount = sc.nextInt();
//        valueData.setTotalAmount(totalAmount);
//
//        System.out.println("날짜를 기입하세요.");
//        String date = sc.next();
//        valueData.setDate(date);
//
//        System.out.println("간단한 메모를 기입하세요.");
//        String memo = sc.next();
//        valueData.setMemo(memo);
//
//        System.out.println("지출한 돈을 기입하세요.");
//        int outcome = sc.nextInt();
//        valueData.setOutcome(outcome);
//
//        int balance = valueData.getTotalAmount() - valueData.getOutcome();
//        valueData.setBalance(balance);
//
//        dataList.add(valueData);
//
//        dataIntoMonth(checkMonth, valueMonth, dataList);
//
//    }
//
//    private void dataIntoMonth(int checkMonth, Month valueMonth, List<Data> dataList) {
//        Scanner sc = new Scanner(System.in);
//        int checkRestart;
//
//        //TODO valueMonth 클래스 생성 시 모든 달의 리스트가 생성되기 때문에 메모리의 낭비가 될 가능성이 높음
//        //TODO 따라서 valueMonth를 넘겨받을 때 해당 월만 넘겨받는 방식으로 구상해보기.
//
//        if (checkMonth == 1) {
//            valueMonth.setMonth(dataList);
//
//            System.out.println("가계부 기입을 완료했습니다. 더 기입하십니까 ?작성[1] / 종료[2]");
//            checkRestart = sc.nextInt();
//
//            if (checkRestart == 1) {
//                inputData(dataList, valueMonth);
//            }
//
//            if (checkRestart == 2) {
//                return;
//            }
//        }
//
//        if (checkMonth == 2) {
//            valueMonth.setFebruary(dataList);
//
//            System.out.println("가계부 기입을 완료했습니다. 더 기입하십니까 ? 작성[1] / 종료[2]");
//            checkRestart = sc.nextInt();
//
//            if (checkRestart == 1) {
//                inputData(dataList, valueMonth);
//            }
//
//            if (checkRestart == 2) {
//                return;
//            }
//        }
//
//        if (checkMonth == 3) {
//            valueMonth.setMarch(dataList);
//        }
//
//        if (checkMonth == 4) {
//            valueMonth.setApril(dataList);
//        }
//
//        if (checkMonth == 5) {
//            valueMonth.setMay(dataList);
//        }
//
//        if (checkMonth == 6) {
//            valueMonth.setJune(dataList);
//        }
//
//        if (checkMonth == 7) {
//            valueMonth.setJuly(dataList);
//        }
//
//        if (checkMonth == 8) {
//            valueMonth.setAugust(dataList);
//        }
//
//        if (checkMonth == 9) {
//            valueMonth.setSeptember(dataList);
//        }
//
//        if (checkMonth == 10) {
//            valueMonth.setOctober(dataList);
//        }
//
//        if (checkMonth == 11) {
//            valueMonth.setNovember(dataList);
//        }
//
//        if (checkMonth == 12) {
//            valueMonth.setDecember(dataList);
//        }
//    }
//
//    public void printData(int checkMonth, Month valueMonth ,List<Data> dataList) {
//        if (checkMonth == 1) {
//            for (int i = 0; i < valueMonth.getJanuary().size(); i++) {
//                System.out.println("January 가계부");
//                System.out.println("[" + (i+1) + "]번째");
//                System.out.print("날짜 :" + valueMonth.getJanuary().get(i).getDate() + " ");
//                System.out.print("간단 메모 :" + valueMonth.getJanuary().get(i).getMemo() + " ");
//                System.out.print("지출 내역 :" + valueMonth.getJanuary().get(i).getOutcome() + " ");
//                System.out.println("잔액 :" + valueMonth.getJanuary().get(i).getBalance());
//            }
//
//            System.out.println("더 작성하시겠습니까 ? 작성[1] / 종료[2]");
//            checkRewrite(valueMonth);
//        }
//
//        if (checkMonth == 2) {
//            for (int i = 0; i < valueMonth.getFebruary().size(); i++) {
//                System.out.println("February 가계부");
//                System.out.println("[" + (i+1) + "]번째");
//                System.out.print("날짜 :" + valueMonth.getFebruary().get(i).getDate() + " ");
//                System.out.print("간단 메모 :" + valueMonth.getFebruary().get(i).getMemo() + " ");
//                System.out.print("지출 내역 :" + valueMonth.getFebruary().get(i).getOutcome() + " ");
//                System.out.println("잔액 :" + valueMonth.getFebruary().get(i).getBalance());
//            }
//
//            System.out.println("더 작성하시겠습니까 ? 작성[1] / 종료[2]");
//            checkRewrite(valueMonth);
//        }
//    }
//
//    private void checkRewrite(Month valueMonth) {
//        Scanner sc = new Scanner(System.in);
//        int checkReStart = sc.nextInt();
//
//        if (checkReStart == 1) {
////            inputData();
//        }
//
//        if (checkReStart == 2) {
//            return;
//        }
//
//    }
//
//    public void deleteData() {
//
//    }
//
//    public void editData() {
//
//    }
//}
//    }
//}
