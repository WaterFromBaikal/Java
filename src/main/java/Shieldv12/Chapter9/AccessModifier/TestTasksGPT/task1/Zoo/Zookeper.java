package Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task1.Zoo;

import Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task1.Enclosure.Enclosure;

public class Zookeper {
    public static void main(String[] args) {
        Animal bobr = new Animal();
        Animal lion = new Animal();
        Animal tiger = new Animal();

        Enclosure enclosure = new Enclosure(bobr, lion, tiger);

        Zookeper zookeper = new Zookeper();
        zookeper.wakeAnimals(enclosure);
    }

    void wakeAnimals(Enclosure enclosure){
        for(Animal animal : enclosure.getZooAnimals()){
            animal.makeSound();
        }
    }
}
