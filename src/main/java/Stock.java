public class Stock
{
    int stock=10;
    boolean isEmpty(){
        if(stock>0)
            return true;
        else
            return false;
    }
    void Add(int add){
        stock +=add;
    }
    void Take(){
        stock -=1;
    }
    void Redeeem(){
        stock =0;
    }
    int DisplayAvailableStock(){
        return stock;
    }

}
