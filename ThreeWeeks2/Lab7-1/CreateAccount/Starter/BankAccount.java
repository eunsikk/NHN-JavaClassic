import java.math.*;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;

    public void setData(long accountNumber, String ownerName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

}


class CreateAccount {
    public static BankAccount createNewBankAccount(long accountNumber, String ownerName,
            BigDecimal balance) {
        BankAccount newAccount = new BankAccount();

        newAccount.setData(accountNumber, ownerName, balance);

        // newAccount.accountNumber = accountNumber;
        // newAccount.ownerName = ownerName;
        // newAccount.balance = balance;

        return newAccount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = CreateAccount.createNewBankAccount(333304899, "Park Seongwu",
                new BigDecimal("1000.0"));
        printBankAccount(bankAccount);
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }
}
