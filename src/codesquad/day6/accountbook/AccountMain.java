//package codesquad.accountbook;
//
//import java.util.Scanner;
//
//public class AccountMain {
//    public static void main(String[] args) {
//        int sequence = 0;
//
//        Member member = new Member();
//        Data data = new Data();
//
//        startAccountProgram(member);
//        Data resultData = inputData(data, sequence);
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
//    private static Data inputData(Data data, int sequence) {
//        Scanner sc = new Scanner(System.in);
//
//        data.setSequence(sequence);
//
//        System.out.println("날짜를 입력하세요.");
//        String date = sc.next();
//        data.setDate(date);
//
//        System.out.println("메모를 입력하세요.");
//        String memo = sc.next();
//        data.setMemo(memo);
//
//        System.out.println("수입을 입력하세요.");
//        int income = sc.nextInt();
//        data.setIncome(income);
//
//        System.out.println("지출을 입력하세요.");
//        int outcome = sc.nextInt();
//        data.setOutcome(outcome);
//
//        return data;
//
//    }
//
//    private static void checkData(Data data) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print(data.getSequence() + "번째" + " ");
//        System.out.print(data.getDate() + " ");
//        System.out.print(data.getMemo() + " ");
//        System.out.print(data.getIncome() + " ");
//        System.out.println(data.getOutcome());
//        System.out.println("계속해서 작성하시겠습니까? 작성[1] / 종료[2]");
//        int keepCheck = sc.nextInt();
//
//        if (keepCheck == 1) {
//            inputData(data, data.getSequence());
//            checkData(data);
//        }
//
//    }
//}

package codesquad.day6.accountbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        final int sequence = 0;

        Member member = new Member();
        List<Data> data = new ArrayList<>();

        startAccountProgram(member);
        List<Data> resultData = inputData(data, sequence);

        checkData(resultData);

    }

    private static void startAccountProgram(Member member) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = sc.next();
        member.setName(name);

        System.out.println("비밀번호를 입력하세요.");
        String password = sc.next();
        member.setPasword(password);

        System.out.println(member.getName() + "의 가계부를 실행합니다.");

    }

    private static List<Data> inputData(List<Data> data, int sequence) {
        Scanner sc = new Scanner(System.in);
        Data valueData = new Data();

        valueData.setSequence(sequence);

        System.out.println("날짜를 입력하세요.");
        String date = sc.next();
        valueData.setDate(date);

        System.out.println("간단한 메모를 적어주세요.");
        String memo = sc.next();
        valueData.setMemo(memo);

        System.out.println("수입을 입력하세요.");
        int income = sc.nextInt();
        valueData.setIncome(income);

        System.out.println("지출을 입력하세요.");
        int outcome = sc.nextInt();
        valueData.setOutcome(outcome);

        data.add(valueData);

        return data;
    }

    private static void checkData(List<Data> resultData) {
        Scanner sc = new Scanner(System.in);
        int lastSequence = 0;

        for (Data indexResult : resultData) {
            lastSequence = indexResult.getSequence();
            System.out.print(indexResult.getSequence() + "번째" +" ");
            System.out.print(indexResult.getDate() + " ");
            System.out.print(indexResult.getMemo() + " ");
            System.out.print(indexResult.getIncome() + " ");
            System.out.println(indexResult.getOutcome());
        }

        System.out.println("계속해서 작성하시겠습니까? 작성[1] / 종료[2]");
        int keepCheck = sc.nextInt();

        if (keepCheck == 1) {
            inputData(resultData, lastSequence);
            checkData(resultData);
        }
    }
}

