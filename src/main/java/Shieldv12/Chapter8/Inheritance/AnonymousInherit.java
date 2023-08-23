package Shieldv12.Chapter8.Inheritance;

public class AnonymousInherit {

    public static void main(String[] args) {
        Dog dog = new Dog("Joe") { //Это не объект класса Dog, а анонимный класс {  };
                                         //Объект класса Dog создать нельзя
        };
        System.out.println(dog.name);
    }
}

abstract class Dog{
    String name;

    public Dog(String name) {
        this.name = name;
    }

}
