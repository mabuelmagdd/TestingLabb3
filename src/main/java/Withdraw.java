public class Withdraw
{
    double withdraw(double wd, double money){
        if(money >= wd)
            return money - wd;
        else
            return money;
    }

}
