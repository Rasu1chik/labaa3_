package Enums;

import javax.management.BadStringOperationException;

public enum Pronoun {
    HIM("ему "),
    SHE("она "),
    HE("он ");

    private String pronoun;
    Pronoun(String pronoun){
        this.pronoun=pronoun;
    }
    @Override
    public String toString(){
        return pronoun;
    }



}
