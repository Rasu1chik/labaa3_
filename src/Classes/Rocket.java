package Classes;

import Interface.BeAble;
import Interface.Ride;

public class Rocket extends Essence implements BeAble, Ride {
    public Rocket(String name) {
        super(name);
    }

    public String beAble(boolean beAble,String obj) {
        if (beAble == true) {
            return obj + " смогла ";
        } else {
            return obj + " не смогла ";
        }
    }

    public String ride(String obj) {
        return "кататься по " + obj;

    }
}