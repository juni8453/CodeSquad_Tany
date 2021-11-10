package accountbooktest.Months;

public class January {

    private String date;
    private String memo;
    private int outcome;
    private int totalAmount;
    private int balance;

    public void setDate(String date) {
        this.date = date;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setOutcome(int outcome) {
        this.outcome = outcome;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public String getMemo() {
        return memo;
    }

    public int getOutcome() {
        return outcome;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getBalance() {
        return balance;
    }
}
