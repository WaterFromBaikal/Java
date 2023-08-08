package Shieldv12.Chapter4.ArithmeticOperations;

public class Test2 {
    public static void main(String[] args) {
        Fighter lew = new Fighter("Lew", 10, 2);
        Fighter harry = new Fighter("Harry", 5, 4);
        System.out.println(declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4),
                "Lew")
                + " <- победитель!");
        System.out.println("==============");
        System.out.println(declareWinner2(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4),
                "Lew")
                + " <- победитель!");
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (firstAttacker.equals(fighter1.name)) {
            fighter2.health = fighter2.health - fighter1.damagePerAttack;
            System.out.print(fighter1.name + " attacks " + fighter2.name + "; " + fighter2.name + " now has " + fighter2.health + " health");
        } else if (firstAttacker.equals(fighter2.name)) {
            fighter1.health = fighter1.health - fighter2.damagePerAttack;
            System.out.print(fighter2.name + " attacks " + fighter1.name + "; " + fighter1.name + " now has " + fighter1.health + " health");
        }
        if (fighter2.health <= 0) {
            System.out.print(" and is dead. " + fighter1.name + " wins.");
        } else {
            System.out.println(".");
            if (firstAttacker.equals(fighter1.name)) {
                declareWinner(fighter2, fighter1, fighter2.name);
            } else if (firstAttacker.equals(fighter2.name)) {
                declareWinner(fighter1, fighter2, fighter1.name);
            }
        }
        if (fighter1.health <= 0) {
            return fighter2.name;
        } else if (fighter2.health <= 0) {
            return fighter1.name;
        }
        return "";
    }

    public static String declareWinner2(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter a = fighter1;
        Fighter b = fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2;
            b = fighter1;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) {
                return a.name;
            }
            if ((a.health -= b.damagePerAttack) <= 0) {
                return b.name;
            }
        }
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

