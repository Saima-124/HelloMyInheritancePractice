public class Test4 {
    public static void main(String[] args) {
        BnakAccount1 b1 = new BnakAccount1(10000);
        CheckingAccount c4 = new CheckingAccount(10000);
        System.out.println("BankAccount1 initial amount is " + b1.getBalance());
        System.out.println("BasicAccount1 initial amount is " + c4.getBalance());
        c4.withdraw(5000);
        System.out.println("Some amount remove from BasicAccount " + c4.getBalance());
        System.out.println("BasicAccount1 initial amount is " + c4.getBalance());

        c4.withdraw(6000);
        System.out.println("Some amount remove from BasicAccount " + c4.getBalance());
        c4.withdraw(6000);
        System.out.println("Some amount remove from BasicAccount " + c4.getBalance());

    }
}
