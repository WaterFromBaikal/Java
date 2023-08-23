package Shieldv12.Chapter8.Inheritance;

import java.sql.SQLOutput;

public class InheritCatEx {
    public static void main(String[] args) {
        Cat[] cats = new Cat[2];
        Cat cat = new Cat() {
            @Override
            void meow() {
                System.out.println("Я - абстрактый");
            }
        };
        cat.meow();
        cat.name = "Dave";
    }
}

abstract class Cat {
    String color;
    String name;
    int age;

    public Cat(String color, String name, int age) {
        this.color = color;
        this.name = name;
    }

    public Cat() {

    }


    abstract void meow();
}

class FatCat extends Cat {
    FatCat(String color, String name, int age) {
        super(color, name, age);
    }

    @Override
    void meow() {
        System.out.println("Мяу, давай еду");
    }
}
class VeyFatcat extends FatCat {

    VeyFatcat(String color, String name, int age) {
        super(color, name, age);
    }
    void meow(){
        super.meow();
        System.out.println("Быстрее!");
    }
}