public class Teat3 {
    public static void main(String[] args) {
        BnakAccount1 b1 = new BnakAccount1(10000);
        BasicAccount1 b2 = new BasicAccount1(10000);
        System.out.println("BankAccount1 initial amount is " + b1.getBalance());
        System.out.println("BasicAccount1 initial amount is " + b2.getBalance());
         b2.withdraw(5000);
        System.out.println("Some amount remove from BasicAccount " + b2.getBalance());
        System.out.println("BasicAccount1 initial amount is " + b2.getBalance());

         b2.withdraw(6000);
        System.out.println("Some amount remove from BasicAccount " + b2.getBalance());

    }
}
