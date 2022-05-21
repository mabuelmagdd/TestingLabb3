public class Deposit
{
    public double deposit(double deposit, double balance)
    {
        //check if there's deposit
        if(deposit<=0)
            return balance;
        //add deposit to balance
        balance = balance + deposit;
        return balance;
    }

}
