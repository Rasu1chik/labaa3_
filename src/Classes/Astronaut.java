package Classes;

import Enums.Conjunctions;
import Enums.Numbers;
import Interface.Receive;

public class Astronaut extends Essence implements Receive {
    public Astronaut(String name){
        super(name);
    }
    public String receive(String obj1,String obj2){
        return "получает " + Numbers.TWENTYFOUR + obj1 + Conjunctions.AND + Numbers.TWOHUNDREDFIFTYSIX + obj2;
    }

}
