import static org.junit.jupiter.api.Assertions.*;


import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
    public class CoffeeMachineTest extends TestCase {
        CoffeeMachine input;
        Stock stock;
        Money money;
        String s;
        @BeforeEach
        public void init() {
            input= new CoffeeMachine();
            stock= new Stock();
            money = new Money();
        }
        class coinInsert
        {
            int insert(int j)
            {
                if(j>0)
                    return j;
                else
                    return 0;
            }
        }
        @Test
        public void coffeeStub(){
            coinInsert y = new coinInsert();
            input.despence(y.insert(5));
            assertEquals(input.s.stock,5);
        }
        class doubleCoffee{
            String check(int x){
                if(x%2==0)
                    return "You can make double coffees";
                else
                    return "Sorry! You can't make double coffees";
            }
        }
        @Test
        public void stockDriver(){
            doubleCoffee dc = new doubleCoffee();
            s = dc.check(stock.DisplayAvailableStock());
            assertEquals(s,"you can make double coffees");
            stock.Take();
            s = dc.check(stock.DisplayAvailableStock());
            assertEquals(s,"you can't make double coffees");
        }
        @AfterEach
        public void clean(){
            input=null ;
        }
    }
