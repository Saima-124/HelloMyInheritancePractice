public class BnakAccount1 {

        public double balance ;


    public BnakAccount1(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){

            balance= balance+amount;

        }
        public void withdraw(double amount){
            if(amount>=balance){
                //return -1;
            }else{
                balance=balance-amount;
                //return amount;
            }

        }
        public double getBalance() {
            return balance;
        }
    }



