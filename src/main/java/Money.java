public class Money
{
    int c = 0;
    boolean isEmpty(){
        if(c>0)
            return true;
        else
            return false;
    }
    void redeem(int c){
        c =0;
    }
    void addOnePound(){
        c++;
    }

}
