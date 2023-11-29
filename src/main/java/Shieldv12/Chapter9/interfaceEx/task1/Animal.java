package Shieldv12.Chapter9.interfaceEx.task1;

public class Animal implements ChildAction{
    String color;
    String type;

    public Animal(String color, String type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public void cry() {
        System.out.println("((((((((((((");
    }

    @Override
    public void eat() {
        System.out.println("Om nom nom woof woof");
    }
    public void sleep(){
        System.out.println("ZZZZZzzzzzzz");
    }
}
