public class CheckingAccount extends BnakAccount1{
    public double overDraftCount =0 ;

    public CheckingAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }
        else if( amount>balance && overDraftCount==0){
            System.out.println("1st overdraft occurs  " + 20);
            balance-=20;
            overDraftCount++;
            balance-=amount;
        }
        else{
            System.out.println("Second overdraft occurs " + 30);
            balance-=30;
            balance-=amount;
        }
    }
}
