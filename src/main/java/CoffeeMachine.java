public class CoffeeMachine
{
    Money money = new Money();
    Stock stock = new Stock();
    public void coffee(int s){
        this.stock.Add(s);
    }
    void despence(int input)
    {
        while(input>0 && stock.isEmpty())
        {
            System.out.println("Coffee");
            money.addOnePound();
            stock.Take();
            input--;
        }
        if (input!=0)
            System.out.println("Sorry ! The Machine is Empty");
    }
    void status()
    {
        System.out.println("There are  "+ money.isEmpty()+" coins\nthere are"
                 +stock.isEmpty()+ "coffees in stock\n");
    }
    public static void main(String args[]){
    }
}
