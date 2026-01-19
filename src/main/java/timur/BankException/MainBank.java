package timur.BankException;

public class MainBank {
    public static void main(String[] args){

        try {
            BankAccount account1 = new BankAccount("1000", 50000);
            System.out.println("Make account: " + account1.getBalance());
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try {
            BankAccount account2 = new BankAccount("2001", -101000);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try {
            BankAccount account3 = new BankAccount("100", 25789);
            System.out.println("Счет до пополнения баланса: " + account3.getBalance());
            account3.deposit(25123);
            System.out.println("Счет после пополнения баланса: " + account3.getBalance());
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try {
            BankAccount account4 = new BankAccount("101", 5000);
            System.out.println("Счет до снятия: " + account4.getBalance());
            account4.withdraw(500);
            System.out.println("Счет после снятия: " + account4.getBalance());

            System.out.println("Счет до снятия: " + account4.getBalance());
            account4.withdraw(-500);
            System.out.println("Счет после снятия: " + account4.getBalance());
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
