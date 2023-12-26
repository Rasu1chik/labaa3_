package Classes;

import Enums.Conjunctions;
import Interface.*;

public class They extends Essence implements Think, GetStarted, ThoughtOf_It, Attach, BeAble,Take,Deliver {
    public They(String name){
        super(name);
    }
    public String getstar(){
        return " принялись ";
    }
    public String think(){
        return "думать, ";
    }
    public String thoughtOf_it(String obj){
        return obj + " додумались";
    }
    public String attach(String for_what,String obj1,String obj2){
        return " приделать " + "к " + for_what + obj1 + Conjunctions.AND + obj2;
    }

    public String beAble(boolean beAble,String obj) {
        if (beAble == true) {
            return obj + " смогли ";
        } else {
            return obj + " не смогли ";
        }
    }
    public String take(String obj1,String obj2){
        return " где взять " + obj1 + " на " + obj2;
    }
    public String deliver(String to_whom, String obj){
        return  " доставить в " + to_whom + " " + obj;
    }

}
