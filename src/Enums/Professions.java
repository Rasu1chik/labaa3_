package Enums;

public enum Professions {
    ENGINEER("Инженер "),
    ASTRONAUT("космонавт ");

    private String professions;
    Professions(String professions){
        this.professions = professions;
    }
    public String toString(){
        return professions;
    }



}
