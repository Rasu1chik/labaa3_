package Enums;

public enum Conjunctions {
    AND(" и "),
    WHAT(", что "),
    BUT(", но "),
    COMMA(", "),
    TO("чтобы "),
    HOW("как "),
    WHICH("какие");


    private String conjuction;
    Conjunctions(String conjuction){
        this.conjuction=conjuction;
    }
    @Override
    public String toString() {
        return conjuction;
    }


}
