package codesquad.day6.accountbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

        Member member = new Member();
        ShowScript showScript = new ShowScript();
        List<Data> data = new ArrayList<>();

        startAccountProgram(member);

        System.out.println("====================");
        System.out.println("어떤 기능을 사용하시나요 ?");


        List<Data> resultData = inputData(data);

        checkData(resultData);
    }

    private static void startAccountProgram(Member member) {
        Scanner sc = new Scanner(System.in);
        ShowScript showScript = new ShowScript();

        showScript.nameMessage();
        String name = sc.next();
        member.setName(name);

        showScript.passwordMessage();
        String password = sc.next();
        member.setPasword(password);

        showScript.startMessage();
    }

    private static List<Data> inputData(List<Data> data) {
        Scanner sc = new Scanner(System.in);
        Data valueData = new Data();
        ShowScript showScript = new ShowScript();

        showScript.dateMessage();
        String date = sc.next();
        valueData.setDate(date);

        showScript.memoMessage();
        String memo = sc.next();
        valueData.setMemo(memo);

        showScript.outcomeMessage();
        int outcome = sc.nextInt();
        valueData.setOutcome(outcome);

        data.add(valueData);

        return data;
    }

    private static void checkData(List<Data> resultData) {
        Scanner sc = new Scanner(System.in);
        ShowScript showScript = new ShowScript();

        for (Data indexResult : resultData) {
            System.out.print(indexResult.getDate() + " ");
            System.out.print(indexResult.getMemo() + " ");
            System.out.println(indexResult.getOutcome());
        }

        showScript.continueMessage();
        int keepCheck = sc.nextInt();

        if (keepCheck == 1) {
            inputData(resultData);
            checkData(resultData);
        }
    }
}




//package codesquad.day6.accountbook;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class AccountMain {
//    public static void main(String[] args) {
//        final int sequence = 0;
//
//        Member member = new Member();
//        List<Data> data = new ArrayList<>();
//
//        startAccountProgram(member);
//        List<Data> resultData = inputData(data, sequence);
//
//        checkData(resultData);
//
//    }
//
//    private static void startAccountProgram(Member member) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요.");
//        String name = sc.next();
//        member.setName(name);
//
//        System.out.println("비밀번호를 입력하세요.");
//        String password = sc.next();
//        member.setPasword(password);
//
//        System.out.println(member.getName() + "의 가계부를 실행합니다.");
//
//    }
//
//    private static List<Data> inputData(List<Data> data, int sequence) {
//        Scanner sc = new Scanner(System.in);
//        Data valueData = new Data();
//
//        valueData.setSequence(sequence);
//
//        System.out.println("날짜를 입력하세요.");
//        String date = sc.next();
//        valueData.setDate(date);
//
//        System.out.println("간단한 메모를 적어주세요.");
//        String memo = sc.next();
//        valueData.setMemo(memo);
//
//        System.out.println("수입을 입력하세요.");
//        int income = sc.nextInt();
//        valueData.setIncome(income);
//
//        System.out.println("지출을 입력하세요.");
//        int outcome = sc.nextInt();
//        valueData.setOutcome(outcome);
//
//        data.add(valueData);
//
//        return data;
//    }
//
//    private static void checkData(List<Data> resultData) {
//        Scanner sc = new Scanner(System.in);
//        int lastSequence = 0;
//
//        for (Data indexResult : resultData) {
//            lastSequence = indexResult.getSequence();
//            System.out.print(indexResult.getSequence() + "번째" +" ");
//            System.out.print(indexResult.getDate() + " ");
//            System.out.print(indexResult.getMemo() + " ");
//            System.out.print(indexResult.getIncome() + " ");
//            System.out.println(indexResult.getOutcome());
//        }
//
//        System.out.println("계속해서 작성하시겠습니까? 작성[1] / 종료[2]");
//        int keepCheck = sc.nextInt();
//
//        if (keepCheck == 1) {
//            inputData(resultData, lastSequence);
//            checkData(resultData);
//        }
//    }
//}
//
//
////package codesquad.day6.accountbook;
////
////import java.util.ArrayList;
////import java.util.List;
////import java.util.Scanner;
////
////public class AccountMain {
////    public static void main(String[] args) {
////        startAccountBook();
////    }
////
////    private static void startAccountBook() {
////        Scanner sc = new Scanner(System.in);
////
////        System.out.println("이름을 입력하세요.");
////        String name = sc.next();
////        System.out.println("비밀번호를 입력하세요.");
////        String password = sc.next();
////
////        // TODO Member 객체 따로 사용하는 곳 없음 ??
////        Member member = new Member(name, password);
////
////        System.out.println("수행할 작업을 선택해주세요.");
////        int menu = sc.nextInt();
////        List<Data> list = new ArrayList<>();
////
////        if (menu == 1) {
////            List<Data> resultData = inputData();
////            list = resultData;
////
////        }
////
////        if (menu == 2) {
////            printData(list);
////        }
////
////        if (menu == 3) {
////            deleteData();
////        }
////
////        if (menu == 4) {
////            editData();
////        }
////    }
////
////    private static List<Data> inputData() {
////        List<Data> data = new ArrayList<>();
////        Scanner sc = new Scanner(System.in);
////
////        // 몇 월에 데이터 리스트를 넣을 것인가 ?
////        System.out.println("몇 월의 가계부를 작성시나요 ?");
////        int checkMonth = sc.nextInt();
////        Month month = new Month(checkMonth);
////
////        List<Data> detailData = putDataInMonth(month, data);
////
////        return detailData;
////    }
////
////    private static List<Data> putDataInMonth(Month month, List<Data> data) {
////        // 만약 month 값이 1이라면 1월의 가계부를 작성한다고 할 수 있겠다.
////
////        Scanner sc = new Scanner(System.in);
////
////        System.out.println("해당 월의 총 소지금액을 기입하세요.");
////        int totalAmount = sc.nextInt();
////
////        System.out.println("날짜를 기입하세요.");
////        String date = sc.next();
////
////        System.out.println("간단한 메모를 기입하세요.");
////        String memo = sc.next();
////
////        System.out.println("지출 금액을 기입하세요.");
////        int outcome = sc.nextInt();
////
////        Data valueData = new Data(date, memo, outcome, totalAmount, month);
////        data.add(valueData);
////
////        return data;
////
////    }
////
////    private static void deleteData() {
////
////    }
////
////    private static void editData() {
////
////    }
////
////    private static void printData(List<Data> resultData) {
////
////    }
////
////
////}
//
//
//
//
//
//
//
