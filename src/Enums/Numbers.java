package Enums;

public enum Numbers {
    TWENTYFOUR(" двадцать четыре "),
    TWOHUNDREDFIFTYSIX("двести пятьдесят шесть");
    private String numbers;
    Numbers(String numbers){
        this.numbers = numbers;
    }
    @Override
    public String toString(){
        return numbers;
    }
}
