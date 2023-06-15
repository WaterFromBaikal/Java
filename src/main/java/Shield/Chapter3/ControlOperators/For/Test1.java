package Shield.Chapter3.ControlOperators.For;

public class Test1 {
    public static void main(String[] args) {
        int a;
        int b;
        for (a = 0, b = 10; a < b; a++, b--) {
            System.out.println("Вывод");
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }
    }
}
