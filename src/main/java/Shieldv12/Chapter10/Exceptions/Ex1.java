package Shieldv12.Chapter10.Exceptions;

import org.w3c.dom.ls.LSOutput;

public class Ex1 {
    public static void main(String[] args) {
        int a = 10;
        for (int b = -3; b < 10; b++) {
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("тут поделили на ноль");
            }
        }
    }
}
