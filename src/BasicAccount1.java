public class BasicAccount1 extends BnakAccount1 {
    public BasicAccount1(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
           // return amount;
        }
        else{
            balance=balance-30;
            System.out.println("Overdraft is " + 30);
            balance-=amount;
            //return amount;
        }
    }
}
