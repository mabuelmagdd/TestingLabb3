public class ATM
{
    double balance = 0;
    Withdraw wd = new Withdraw();
    Deposit deposit = new Deposit();
    public double doingWork(int x, double amount) {
        switch(x)
        {
            case 1:
                this.balance =wd.withdraw(amount,balance);
            case 2:
                this.balance = deposit.deposit(amount,balance);
        }return balance;}
    public static void main(String args[] ) {
    }

}
