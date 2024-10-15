public class TestProgram1 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(20000);
        BasicAccount b2 = new BasicAccount(20000);
        System.out.println("BankAccount " + b1.getBalance());
        System.out.println("BasicAccount " + b2.getBalance());
        double withdrawn = b2.withdraw(10000);
        System.out.println("Withdraw amount is " + withdrawn);
        System.out.println("Now the balance is " + b2.getBalance());
        double withdrawn1 = b2.withdraw(10000);
        System.out.println("Withdraw amount is " + withdrawn1);
        System.out.println("Now the balance is " + b2.getBalance());

    }
}