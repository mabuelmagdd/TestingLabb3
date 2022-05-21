
    public class Clock
    {
        public String state = "NORMAL";
        public String state1 = "TIME";
        public String state2 = "min";
        public String state3 = "ALARM";
        int m=0,h=0, D=1,M=1, Y=2000;
        String Input(char i){
            switch(state) {
                case "NORMAL": {
                    if (i == 'c')
                        this.state = "UPDATE";
                    if (i == 'b')
                        this.state = "ALARM";
                    if (i == 'a')
                        if (state1 == "TIME") {
                            state1 = "DATE";
                            return this.displayDate();
                        }
                        else{
                            state1 = "TIME";
                            return this.displayTIME();
                        }
                    return state;
                }
                case "UPDATE": {
                    if (i == 'd')
                        state = "NORMAL";
                    else if (i == 'c')
                        state = "UPDATE";
                    else {
                        switch (state2) {
                            case "min": {
                                if (i == 'a')
                                    state2 = "hour";
                                if (i == 'b'){
                                    this.m = (m+1)%60;
                                    return this.displayTIME();
                                }
                                break;
                            }
                            case "hour": {
                                if (i == 'a')
                                    state2 = "day";
                                if (i == 'b'){
                                    this.h= (h+1)%12 +1;
                                    return this.displayTIME();
                                }break;
                            }
                            case "day": {
                                if (i == 'a')
                                    state2 = "month";
                                if (i == 'b'){
                                    this.D= (D+1)%30+1;
                                    return this.displayTIME();
                                }break;
                            }
                            case "month": {
                                if (i == 'a')
                                    state2 = "year";
                                if (i == 'b'){
                                    this.M= (M+1)%12+1;
                                    return this.displayTIME();
                                }break;
                            }
                            case "year": {
                                if (i == 'a')
                                    state = "NORMAL";
                                if (i == 'b'){
                                    this.Y= (Y+1);
                                    return this.displayTIME();
                                }
                            }break;
                        }
                    }
                    return state;
                }
                case "ALARM":{
                    if(i == 'd'){
                        state = "NORMAL";
                        return state;
                    }
                    else if (i == 'a')
                        if(state3 == "ALARM"){
                            state3 = "CHIME";
                            return state3;
                        }
                        else{
                            state = "ALARM";
                            return state3;
                        }}
                return state;
            }
            return state;
        }
        String displayDate(){
            System.out.println(Y+"-"+M+"-"+D);
            return (Y+"-"+M+"-"+D);
        }
        String displayTIME(){
            System.out.println( h+":"+m);
            return ( h+":"+m);
        }
        public static void main(String args[]){
        }
    }

