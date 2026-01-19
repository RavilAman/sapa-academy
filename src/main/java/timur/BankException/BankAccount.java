package timur.BankException;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        if (balance < 0){
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным! ");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Сумма пополнения должна быть положительной!");
        }
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount <= 0){
            throw  new IllegalArgumentException("Сумма снятия должна быть положительной");
        }
        if (amount > balance){
            throw new IllegalArgumentException("Недостаточно средств на счёте");
        }
        balance -= amount;
    }
}
