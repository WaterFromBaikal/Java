package Shieldv12.Chapter8.Inheritance;

public class AnimalHierachyMain {
    public static void main(String[] args) {
        Animal a1 = new Animal("testName", 0, "testSpecies");
        a1.exist();
        Bird b1 = new Bird("Sinica", 1, "Blue color");
        b1.fly();
        b1.exist();
        Animal b2 = new Bird("testBirdName", 0, "testBirdSpecies");
        b2.exist();
    }
}

class Animal {
    String name;
    int age;
    String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void exist() {
        System.out.println("Я энимал и я существую");
    }
}

class Mammal extends Animal {
    Mammal(String name, int age, String species) {
        super(name, age, species);
    }

    public void giveBirth() {
        System.out.println("Рожаю");
    }
}

class Bird extends Animal {
    public Bird(String name, int age, String species) {
        super(name, age, species);
    }

    void fly() {
        System.out.println("Лечу");
    }
}

class Reptile extends Animal {
    public Reptile(String name, int age, String species) {
        super(name, age, species);
    }

    public void shedSkin() {
        System.out.println("Сбрасываю кожу");
    }
}
