package Shieldv12.Chapter9.interfaceEx.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Brown", "Dog");
        Children bob = new Children(20, "Bob");

        List<ChildAction> childActionList = new ArrayList<>();
        childActionList.add(dog);
        childActionList.add(bob);

        for (ChildAction childAction : childActionList){
            childAction.cry();
            childAction.eat();
        }
        System.out.println(bob.age);
        System.out.println(dog.age);
        bob.sleep();
        dog.sleep();
        ChildAction.boom();
    }
}
