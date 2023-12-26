package Classes;

import Interface.Receive;

public class Korotyshka extends Essence implements Receive {
    public Korotyshka(String name){
        super(name);
    }
    public String receive(String obj,String obj2){
        return " получает " + getName() + " на " + obj2;
    }
}
