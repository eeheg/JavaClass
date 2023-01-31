package Ch06;

public class Account {
    private String accountName; //이름
    private String accountNo; //계좌번호
    private long accountBalance; //잔고

    // 'Alt'+'Insert': Generate > Constructor
    // 생성자
    public Account(String accountName, String accountNo, long accountBalance) {
        this.accountName = accountName;
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    // 'Alt'+'Insert': Generate > Getter
    // private에 접근가능
    public String getAccountName() {
        return accountName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void deposit(long k) { //입금
        this.accountBalance += k;
    }

    public void withdraw(long k) { //출금
        if(this.accountBalance - k > 0)
            this.accountBalance -= k;
    }
}
