
import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ATMTest extends TestCase
{
    ATM x;
    Deposit d;
    Withdraw w;
    String s;
    @BeforeEach
    public void init() {
        x = new ATM();
        d = new Deposit();
        w = new Withdraw();
    }
    class moneyGrabber{
        int insert(int x){
            if(x>0)
                return x;
            else
                return 0;
        }
    }
    @Test
    public void stub1(){
        moneyGrabber y = new moneyGrabber();
        x.doingWork(2,y.insert(5000));
        assertEquals(x.balance,5000.0);
    }
    @Test
    public void stub2(){
        moneyGrabber y = new moneyGrabber();
        double z =w.withdraw(1000,y.insert(4000));
        assertEquals(z,3000.0);
    }
    @Test
    public void stub3(){
        moneyGrabber y = new moneyGrabber();
        double z = d.deposit(3000,y.insert(4000));
        assertEquals(z,7000.0);
    }
    @AfterEach
    public void clean(){
        x=null ;
    }

}