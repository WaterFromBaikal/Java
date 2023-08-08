package Shieldv12.Chapter6.Classes;

public class BoxVal {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.name = "Перекрестор";
        box1.number = 1;
        Box box2 = box1;
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box1==box2);
        System.out.println(box1.equals(box2));
        box2.name = "Пятерочка";
        System.out.println(box1);
        System.out.println(box2);
        box1.name = "Гурмэ";
        System.out.println(box1);
        System.out.println(box2);
        box1 = null;
        System.out.println(box1);
        System.out.println(box2);
    }
}
