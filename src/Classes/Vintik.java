package Classes;

import Interface.Attach;
import Interface.Deliver;
import Interface.Launch;
import Interface.Think;

public class Vintik extends Essence implements Deliver, Think, Launch {
    public Vintik(String name){
        super(name);
    }
    public String deliver(String to_whom, String obj){
        return  " доставить в " + to_whom + obj;
    }

    public String think(){
        return " додумались ";
    }
    @Override
    public String launch(String obj){
        return " запустить ее внутрь " + obj;
    }


}
