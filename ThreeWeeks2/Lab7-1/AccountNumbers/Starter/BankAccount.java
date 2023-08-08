import java.math.*;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;
    private static long nextAccountNumber;

    private static long nextnumber() {
        return nextAccountNumber++;
    }

    public void setData(String ownerName, BigDecimal balance) {
        this.accountNumber = BankAccount.nextnumber(); // 같은 클래스니까 BankAccount 안 붙여도 된다.
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public long getNumber() {
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
    public static BankAccount createNewBankAccount(String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();
        // long accountNumber = BankAccount.nextnumber();
        newAccount.setData(ownerName, balance);

        return newAccount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount =
                CreateAccount.createNewBankAccount("Vesper Lind", new BigDecimal("0.0"));
        BankAccount bankAccount2 =
                CreateAccount.createNewBankAccount("Celine ", new BigDecimal("0.0"));
        printBankAccount(bankAccount);
        printBankAccount(bankAccount2);
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }
}
