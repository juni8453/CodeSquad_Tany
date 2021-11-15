package accountbooktest;

public class CheckData {

    public void checkDataInJanuary(Month valueMonth) {
        for (int i = 0; i < valueMonth.getJanuary().size(); i++) {
            int totalAmount = valueMonth.getJanuary().get(i).getTotalAmount();
            String date = valueMonth.getJanuary().get(i).getDate();
            String memo = valueMonth.getJanuary().get(i).getMemo();
            int balance = valueMonth.getJanuary().get(i).getBalance();
            int outcome = valueMonth.getJanuary().get(i).getOutcome();

            System.out.print("[" + (i) + "]" + "번째" + " ");
            System.out.println("사용 일자 : " + date + " ");
            System.out.print("간단 메모 : " + memo + " ");
            System.out.print("지출 가능 금액 : " + totalAmount + " ");
            System.out.print("지출 금액 : " + outcome + " ");
            System.out.println("남은 금액 : " + balance);
            System.out.println("---------------------------------------------------------");

        }
    }

    public void checkDataInFebruary(Month valueMonth) {
        for (int i = 0; i < valueMonth.getFebruary().size(); i++) {
            int totalAmount = valueMonth.getFebruary().get(i).getTotalAmount();
            String date = valueMonth.getFebruary().get(i).getDate();
            String memo = valueMonth.getFebruary().get(i).getMemo();
            int balance = valueMonth.getFebruary().get(i).getBalance();
            int outcome = valueMonth.getFebruary().get(i).getOutcome();

            System.out.print("[" + (i) + "]" + "번째" + " ");
            System.out.println("사용 일자 : " + date + " ");
            System.out.print("간단 메모 : " + memo + " ");
            System.out.print("지출 가능 금액 : " + totalAmount + " ");
            System.out.print("지출 금액 : " + outcome + " ");
            System.out.println("남은 금액 : " + balance);
            System.out.println("---------------------------------------------------------");

        }
    }

    public void checkDataInMarch(Month valueMonth) {
        for (int i = 0; i < valueMonth.getMarch().size(); i++) {
            int totalAmount = valueMonth.getMarch().get(i).getTotalAmount();
            String date = valueMonth.getMarch().get(i).getDate();
            String memo = valueMonth.getMarch().get(i).getMemo();
            int balance = valueMonth.getMarch().get(i).getBalance();
            int outcome = valueMonth.getMarch().get(i).getOutcome();

            System.out.print("[" + (i) + "]" + "번째" + " ");
            System.out.println("사용 일자 : " + date + " ");
            System.out.print("간단 메모 : " + memo + " ");
            System.out.print("지출 가능 금액 : " + totalAmount + " ");
            System.out.print("지출 금액 : " + outcome + " ");
            System.out.println("남은 금액 : " + balance);
            System.out.println("---------------------------------------------------------");

        }
    }

    public void checkDataInApril(Month valueMonth) {
        for (int i = 0; i < valueMonth.getApril().size(); i++) {
            int totalAmount = valueMonth.getApril().get(i).getTotalAmount();
            String date = valueMonth.getApril().get(i).getDate();
            String memo = valueMonth.getApril().get(i).getMemo();
            int balance = valueMonth.getApril().get(i).getBalance();
            int outcome = valueMonth.getApril().get(i).getOutcome();

            System.out.print("[" + (i) + "]" + "번째" + " ");
            System.out.println("사용 일자 : " + date + " ");
            System.out.print("간단 메모 : " + memo + " ");
            System.out.print("지출 가능 금액 : " + totalAmount + " ");
            System.out.print("지출 금액 : " + outcome + " ");
            System.out.println("남은 금액 : " + balance);
            System.out.println("---------------------------------------------------------");

        }
    }

    public void checkDataInMay(Month valueMonth) {
        for (int i = 0; i < valueMonth.getMay().size(); i++) {
            int totalAmount = valueMonth.getMay().get(i).getTotalAmount();
            String date = valueMonth.getMay().get(i).getDate();
            String memo = valueMonth.getMay().get(i).getMemo();
            int balance = valueMonth.getMay().get(i).getBalance();
            int outcome = valueMonth.getMay().get(i).getOutcome();

            System.out.print("[" + (i) + "]" + "번째" + " ");
            System.out.println("사용 일자 : " + date + " ");
            System.out.print("간단 메모 : " + memo + " ");
            System.out.print("지출 가능 금액 : " + totalAmount + " ");
            System.out.print("지출 금액 : " + outcome + " ");
            System.out.println("남은 금액 : " + balance);
            System.out.println("---------------------------------------------------------");

        }
    }

    public void checkDataInJune(Month valueMonth) {
        for (int i = 0; i < valueMonth.getJune().size(); i++) {
            int totalAmount = valueMonth.getJune().get(i).getTotalAmount();
            String date = valueMonth.getJune().get(i).getDate();
            String memo = valueMonth.getJune().get(i).getMemo();
            int balance = valueMonth.getJune().get(i).getBalance();
            int outcome = valueMonth.getJune().get(i).getOutcome();

            System.out.print("[" + (i) + "]" + "번째" + " ");
            System.out.println("사용 일자 : " + date + " ");
            System.out.print("간단 메모 : " + memo + " ");
            System.out.print("지출 가능 금액 : " + totalAmount + " ");
            System.out.print("지출 금액 : " + outcome + " ");
            System.out.println("남은 금액 : " + balance);
            System.out.println("---------------------------------------------------------");

        }
    }

    public void checkDataInJuly(Month valueMonth) {
        for (int i = 0; i < valueMonth.getJuly().size(); i++) {
            int totalAmount = valueMonth.getJuly().get(i).getTotalAmount();
            String date = valueMonth.getJuly().get(i).getDate();
            String memo = valueMonth.getJuly().get(i).getMemo();
            int balance = valueMonth.getJuly().get(i).getBalance();
            int outcome = valueMonth.getJuly().get(i).getOutcome();

            System.out.print("[" + (i) + "]" + "번째" + " ");
            System.out.println("사용 일자 : " + date + " ");
            System.out.print("간단 메모 : " + memo + " ");
            System.out.print("지출 가능 금액 : " + totalAmount + " ");
            System.out.print("지출 금액 : " + outcome + " ");
            System.out.println("남은 금액 : " + balance);
            System.out.println("---------------------------------------------------------");

        }
    }

    public void checkDataInAugust(Month valueMonth) {
        for (int i = 0; i < valueMonth.getAugust().size(); i++) {
            int totalAmount = valueMonth.getAugust().get(i).getTotalAmount();
            String date = valueMonth.getAugust().get(i).getDate();
            String memo = valueMonth.getAugust().get(i).getMemo();
            int balance = valueMonth.getAugust().get(i).getBalance();
            int outcome = valueMonth.getAugust().get(i).getOutcome();

            System.out.print("[" + (i) + "]" + "번째" + " ");
            System.out.println("사용 일자 : " + date + " ");
            System.out.print("간단 메모 : " + memo + " ");
            System.out.print("지출 가능 금액 : " + totalAmount + " ");
            System.out.print("지출 금액 : " + outcome + " ");
            System.out.println("남은 금액 : " + balance);
            System.out.println("---------------------------------------------------------");

        }
    }

    public void checkDataInSeptember(Month valueMonth) {
        for (int i = 0; i < valueMonth.getSeptember().size(); i++) {
            int totalAmount = valueMonth.getSeptember().get(i).getTotalAmount();
            String date = valueMonth.getSeptember().get(i).getDate();
            String memo = valueMonth.getSeptember().get(i).getMemo();
            int balance = valueMonth.getSeptember().get(i).getBalance();
            int outcome = valueMonth.getSeptember().get(i).getOutcome();

            System.out.print("[" + (i) + "]" + "번째" + " ");
            System.out.println("사용 일자 : " + date + " ");
            System.out.print("간단 메모 : " + memo + " ");
            System.out.print("지출 가능 금액 : " + totalAmount + " ");
            System.out.print("지출 금액 : " + outcome + " ");
            System.out.println("남은 금액 : " + balance);
            System.out.println("---------------------------------------------------------");

        }
    }

    public void checkDataInOctober(Month valueMonth) {
        for (int i = 0; i < valueMonth.getOctober().size(); i++) {
            int totalAmount = valueMonth.getOctober().get(i).getTotalAmount();
            String date = valueMonth.getOctober().get(i).getDate();
            String memo = valueMonth.getOctober().get(i).getMemo();
            int balance = valueMonth.getOctober().get(i).getBalance();
            int outcome = valueMonth.getOctober().get(i).getOutcome();

            System.out.print("[" + (i) + "]" + "번째" + " ");
            System.out.println("사용 일자 : " + date + " ");
            System.out.print("간단 메모 : " + memo + " ");
            System.out.print("지출 가능 금액 : " + totalAmount + " ");
            System.out.print("지출 금액 : " + outcome + " ");
            System.out.println("남은 금액 : " + balance);
            System.out.println("---------------------------------------------------------");

        }
    }

    public void checkDataInNovember(Month valueMonth) {
        for (int i = 0; i < valueMonth.getNovember().size(); i++) {
            int totalAmount = valueMonth.getNovember().get(i).getTotalAmount();
            String date = valueMonth.getNovember().get(i).getDate();
            String memo = valueMonth.getNovember().get(i).getMemo();
            int balance = valueMonth.getNovember().get(i).getBalance();
            int outcome = valueMonth.getNovember().get(i).getOutcome();

            System.out.print("[" + (i) + "]" + "번째" + " ");
            System.out.println("사용 일자 : " + date + " ");
            System.out.print("간단 메모 : " + memo + " ");
            System.out.print("지출 가능 금액 : " + totalAmount + " ");
            System.out.print("지출 금액 : " + outcome + " ");
            System.out.println("남은 금액 : " + balance);
            System.out.println("---------------------------------------------------------");

        }
    }

    public void checkDataInDecember(Month valueMonth) {
        for (int i = 0; i < valueMonth.getDecember().size(); i++) {
            int totalAmount = valueMonth.getDecember().get(i).getTotalAmount();
            String date = valueMonth.getDecember().get(i).getDate();
            String memo = valueMonth.getDecember().get(i).getMemo();
            int balance = valueMonth.getDecember().get(i).getBalance();
            int outcome = valueMonth.getDecember().get(i).getOutcome();

            System.out.print("[" + (i) + "]" + "번째" + " ");
            System.out.println("사용 일자 : " + date + " ");
            System.out.print("간단 메모 : " + memo + " ");
            System.out.print("지출 가능 금액 : " + totalAmount + " ");
            System.out.print("지출 금액 : " + outcome + " ");
            System.out.println("남은 금액 : " + balance);
            System.out.println("---------------------------------------------------------");

        }
    }

}
