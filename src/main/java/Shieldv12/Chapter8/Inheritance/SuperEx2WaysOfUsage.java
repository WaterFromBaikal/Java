package Shieldv12.Chapter8.Inheritance;

public class SuperEx2WaysOfUsage {
    public static void main(String[] args) {

    }
}

class Sweets{
    String name;
    int cost;

    public Sweets(String name) {
        this.name = name;
        int cost = 10;
    }
}

class Chocolate extends Sweets {
    Chocolate(String name, int cost){
        super(name); //вызов конструктора суперКласса с параметром String
        super.cost = 5;
    }
}
