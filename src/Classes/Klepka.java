package Classes;

import Enums.Conjunctions;
import Interface.*;

public class Klepka extends Essence implements GotOut, Jump, Became, Create, ToKnow,Came,Decide{
    public Klepka(String name){
        super(name);
    }
    public String gotOut(String from){
        return getName() + " выбился " + from;
    }
    public String jump(String obj){
        return "прыгал по " + obj;
    }
    public String became(boolean became) {
        if (became == true) {
            return  getName() + "стал ";
        } else {
            return getName() + " не стал ";
        }
    }
    public String create(String obj){
        return "создавать " + obj;
    }
    public String decide(){
        return "решил ";
    }
    public String toKnow(String obj1,String obj2){
        return " выяснить " + Conjunctions.WHICH + " " + obj1 + Conjunctions.AND + obj2;
    }
    public String came(String for_what){
        return getName() + " пришел " + for_what;
    }
}
