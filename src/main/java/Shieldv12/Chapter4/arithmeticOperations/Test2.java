package Shieldv12.Chapter4.arithmeticOperations;

public class Test2 {
    public static void main(String[] args) {
        Fighter lew = new Fighter("Lew", 10, 7);
        Fighter harry = new Fighter("Harry", 11, 2);
        declareWinner(lew,harry,"test");
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        fighter2.health = fighter2.health-fighter1.damagePerAttack;
        System.out.print(fighter1.name+" attacks " + fighter2.name + "; " + fighter2.name + " now has " + fighter2.health + " health");
        if(fighter2.health <=0 ){
            System.out.print(" and is dead. " + fighter1.name + " wins.");
        } else {
            System.out.print(".");
        }

        return "";
    }

}

class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}

