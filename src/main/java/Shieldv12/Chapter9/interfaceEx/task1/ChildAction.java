package Shieldv12.Chapter9.interfaceEx.task1;

public interface ChildAction extends Cry, Eat {
    int age = 10;
    default void sleep(){
        System.out.println("Я - спать");
    }
    static void boom(){
        System.out.println("boom");
    }
}
