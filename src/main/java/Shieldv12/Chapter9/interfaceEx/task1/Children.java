package Shieldv12.Chapter9.interfaceEx.task1;

public class Children implements ChildAction {
    int age;
    String name;

    public Children(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void cry() {
        System.out.println("Я плачу! Дай еды!");
    }

    @Override
    public void eat() {
        System.out.println("Я кушаю омноном");
    }
}
