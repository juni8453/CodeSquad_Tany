package accountbooktest;

import accountbooktest.Months.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountBookRun {

    public void inputData() {

        Scanner sc = new Scanner(System.in);
        int checkRestart;
        System.out.println("몇 월의 가계부를 작성하십니까 ?");

        int checkMonth = sc.nextInt();

        // Todo Ex) 1월인 경우 January 객체 생성 후 값 삽입
        // Todo input() 메소드 클래스 별로 새로 생성하자.
        
        if (checkMonth == 1) {
            January january = new January();
            List<January> januaryList = new ArrayList<>();

            System.out.println("총 수입을 기입하세요.");
            int totalAmount = sc.nextInt();
            january.setTotalAmount(totalAmount);

            System.out.println("날짜를 기입하세요.");
            String date = sc.next();
            january.setDate(date);

            System.out.println("간단한 지출 이유을 기입하세요.");
            String memo = sc.next();
            january.setMemo(memo);

            System.out.println("얼마나 지출했습니까 ?");
            int outcome = sc.nextInt();
            january.setOutcome(outcome);

            int balance = january.getTotalAmount() - january.getOutcome();
            january.setBalance(balance);

            januaryList.add(january);

            System.out.println("가계부 기입을 완료했습니다. 1월 가계부에 내용을 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData();
            }

            if (checkRestart == 2) {
                return;
            }
        }

        if (checkMonth == 2) {
            February february = new February();
            List<February> februaryList = new ArrayList<>();

            System.out.println("총 수입을 기입하세요.");
            int totalAmount = sc.nextInt();
            february.setTotalAmount(totalAmount);

            System.out.println("날짜를 기입하세요.");
            String date = sc.next();
            february.setDate(date);

            System.out.println("간단한 지출 이유을 기입하세요.");
            String memo = sc.next();
            february.setMemo(memo);

            System.out.println("얼마나 지출했습니까 ?");
            int outcome = sc.nextInt();
            february.setOutcome(outcome);

            int balance = february.getTotalAmount() - february.getOutcome();
            february.setBalance(balance);

            februaryList.add(february);

            System.out.println("가계부 기입을 완료했습니다. 2월 가계부에 내용을 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData();
            }

            if (checkRestart == 2) {
                return;
            }

        }

        if (checkMonth == 3) {
            March march = new March();
            List<March> marchList = new ArrayList<>();

            System.out.println("총 수입을 기입하세요.");
            int totalAmount = sc.nextInt();
            march.setTotalAmount(totalAmount);

            System.out.println("날짜를 기입하세요.");
            String date = sc.next();
            march.setDate(date);

            System.out.println("간단한 지출 이유을 기입하세요.");
            String memo = sc.next();
            march.setMemo(memo);

            System.out.println("얼마나 지출했습니까 ?");
            int outcome = sc.nextInt();
            march.setOutcome(outcome);

            int balance = march.getTotalAmount() - march.getOutcome();
            march.setBalance(balance);

            marchList.add(march);

            System.out.println("가계부 기입을 완료했습니다. 3월 가계부에 내용을 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData();
            }

            if (checkRestart == 2) {
                return;
            }

        }

        if (checkMonth == 4) {
            April april = new April();
            List<April> aprilList = new ArrayList<>();

            System.out.println("총 수입을 기입하세요.");
            int totalAmount = sc.nextInt();
            april.setTotalAmount(totalAmount);

            System.out.println("날짜를 기입하세요.");
            String date = sc.next();
            april.setDate(date);

            System.out.println("간단한 지출 이유을 기입하세요.");
            String memo = sc.next();
            april.setMemo(memo);

            System.out.println("얼마나 지출했습니까 ?");
            int outcome = sc.nextInt();
            april.setOutcome(outcome);

            int balance = april.getTotalAmount() - april.getOutcome();
            april.setBalance(balance);

            aprilList.add(april);

            System.out.println("가계부 기입을 완료했습니다. 4월 가계부에 내용을 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData();
            }

            if (checkRestart == 2) {
                return;
            }

        }

        if (checkMonth == 5) {
            May may = new May();
            List<May> mayList = new ArrayList<>();

            System.out.println("총 수입을 기입하세요.");
            int totalAmount = sc.nextInt();
            may.setTotalAmount(totalAmount);

            System.out.println("날짜를 기입하세요.");
            String date = sc.next();
            may.setDate(date);

            System.out.println("간단한 지출 이유을 기입하세요.");
            String memo = sc.next();
            may.setMemo(memo);

            System.out.println("얼마나 지출했습니까 ?");
            int outcome = sc.nextInt();
            may.setOutcome(outcome);

            int balance = may.getTotalAmount() - may.getOutcome();
            may.setBalance(balance);

            mayList.add(may);

            System.out.println("가계부 기입을 완료했습니다. 5월 가계부에 내용을 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData();
            }

            if (checkRestart == 2) {
                return;
            }

        }

        if (checkMonth == 6) {
            June june = new June();
            List<June> juneList = new ArrayList<>();

            System.out.println("총 수입을 기입하세요.");
            int totalAmount = sc.nextInt();
            june.setTotalAmount(totalAmount);

            System.out.println("날짜를 기입하세요.");
            String date = sc.next();
            june.setDate(date);

            System.out.println("간단한 지출 이유을 기입하세요.");
            String memo = sc.next();
            june.setMemo(memo);

            System.out.println("얼마나 지출했습니까 ?");
            int outcome = sc.nextInt();
            june.setOutcome(outcome);

            int balance = june.getTotalAmount() - june.getOutcome();
            june.setBalance(balance);

            juneList.add(june);

            System.out.println("가계부 기입을 완료했습니다. 6월 가계부에 내용을 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData();
            }

            if (checkRestart == 2) {
                return;
            }

        }

        if (checkMonth == 7) {
            July july = new July();
            List<July> julyList = new ArrayList<>();

            System.out.println("총 수입을 기입하세요.");
            int totalAmount = sc.nextInt();
            july.setTotalAmount(totalAmount);

            System.out.println("날짜를 기입하세요.");
            String date = sc.next();
            july.setDate(date);

            System.out.println("간단한 지출 이유을 기입하세요.");
            String memo = sc.next();
            july.setMemo(memo);

            System.out.println("얼마나 지출했습니까 ?");
            int outcome = sc.nextInt();
            july.setOutcome(outcome);

            int balance = july.getTotalAmount() - july.getOutcome();
            july.setBalance(balance);

            julyList.add(july);

            System.out.println("가계부 기입을 완료했습니다. 7월 가계부에 내용을 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData();
            }

            if (checkRestart == 2) {
                return;
            }

        }

        if (checkMonth == 8) {
            August august = new August();
            List<August> augustList = new ArrayList<>();

            System.out.println("총 수입을 기입하세요.");
            int totalAmount = sc.nextInt();
            august.setTotalAmount(totalAmount);

            System.out.println("날짜를 기입하세요.");
            String date = sc.next();
            august.setDate(date);

            System.out.println("간단한 지출 이유을 기입하세요.");
            String memo = sc.next();
            august.setMemo(memo);

            System.out.println("얼마나 지출했습니까 ?");
            int outcome = sc.nextInt();
            august.setOutcome(outcome);

            int balance = august.getTotalAmount() - august.getOutcome();
            august.setBalance(balance);

            augustList.add(august);

            System.out.println("가계부 기입을 완료했습니다. 8월 가계부에 내용을 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData();
            }

            if (checkRestart == 2) {
                return;
            }

        }

        if (checkMonth == 9) {
            September september = new September();
            List<September> septemberList = new ArrayList<>();

            System.out.println("총 수입을 기입하세요.");
            int totalAmount = sc.nextInt();
            september.setTotalAmount(totalAmount);

            System.out.println("날짜를 기입하세요.");
            String date = sc.next();
            september.setDate(date);

            System.out.println("간단한 지출 이유을 기입하세요.");
            String memo = sc.next();
            september.setMemo(memo);

            System.out.println("얼마나 지출했습니까 ?");
            int outcome = sc.nextInt();
            september.setOutcome(outcome);

            int balance = september.getTotalAmount() - september.getOutcome();
            september.setBalance(balance);

            septemberList.add(september);

            System.out.println("가계부 기입을 완료했습니다. 9월 가계부에 내용을 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData();
            }

            if (checkRestart == 2) {
                return;
            }

        }

        if (checkMonth == 10) {
            October october = new October();
            List<October> octoberList = new ArrayList<>();

            System.out.println("총 수입을 기입하세요.");
            int totalAmount = sc.nextInt();
            october.setTotalAmount(totalAmount);

            System.out.println("날짜를 기입하세요.");
            String date = sc.next();
            october.setDate(date);

            System.out.println("간단한 지출 이유을 기입하세요.");
            String memo = sc.next();
            october.setMemo(memo);

            System.out.println("얼마나 지출했습니까 ?");
            int outcome = sc.nextInt();
            october.setOutcome(outcome);

            int balance = october.getTotalAmount() - october.getOutcome();
            october.setBalance(balance);

            octoberList.add(october);

            System.out.println("가계부 기입을 완료했습니다. 10월 가계부에 내용을 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData();
            }

            if (checkRestart == 2) {
                return;
            }

        }

        if (checkMonth == 11) {
            November november = new November();
            List<November> novemberList = new ArrayList<>();

            System.out.println("총 수입을 기입하세요.");
            int totalAmount = sc.nextInt();
            november.setTotalAmount(totalAmount);

            System.out.println("날짜를 기입하세요.");
            String date = sc.next();
            november.setDate(date);

            System.out.println("간단한 지출 이유을 기입하세요.");
            String memo = sc.next();
            november.setMemo(memo);

            System.out.println("얼마나 지출했습니까 ?");
            int outcome = sc.nextInt();
            november.setOutcome(outcome);

            int balance = november.getTotalAmount() - november.getOutcome();
            november.setBalance(balance);

            novemberList.add(november);

            System.out.println("가계부 기입을 완료했습니다. 11월 가계부에 내용을 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData();
            }

            if (checkRestart == 2) {
                return;
            }

        }

        if (checkMonth == 4) {
            December december = new December();
            List<December> decemberList = new ArrayList<>();

            System.out.println("총 수입을 기입하세요.");
            int totalAmount = sc.nextInt();
            december.setTotalAmount(totalAmount);

            System.out.println("날짜를 기입하세요.");
            String date = sc.next();
            december.setDate(date);

            System.out.println("간단한 지출 이유을 기입하세요.");
            String memo = sc.next();
            december.setMemo(memo);

            System.out.println("얼마나 지출했습니까 ?");
            int outcome = sc.nextInt();
            december.setOutcome(outcome);

            int balance = december.getTotalAmount() - december.getOutcome();
            december.setBalance(balance);

            decemberList.add(december);

            System.out.println("가계부 기입을 완료했습니다. 12월 가계부에 내용을 더 기입하십니까 ? 작성[1] / 종료[2]");
            checkRestart = sc.nextInt();

            if (checkRestart == 1) {
                inputData();
            }

            if (checkRestart == 2) {
                return;
            }

        }
    }

    public void printOfMonth() {

    }

    public void deleteData() {

    }

    public void editData() {

    }
}
