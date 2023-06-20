package Shield.Chapter3.ControlOperators.BasicKeyboardReader;
/**
 * Во время считывания символа через System.in.read(), в буффер также считывается и невидимый символ переноса строки (enter).
 * Чтобы считать следующий символ, нужно дополнительно "считать" этот enter - еще раз запустить System.in.read();
 * Тогда следующий запуск будет снова читать новый символ, в котором тоже надо разораться с enter
 */

import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        char zagadaite;
        char ugadaite;
        System.out.print("Загадайте eng-букву: ");
        zagadaite = (char) System.in.read();
        System.in.read();
        System.out.print("Угадайте eng-букву: ");
        ugadaite = (char) System.in.read();
        System.in.read();
        while (zagadaite != ugadaite) {
            System.out.print("Это не та буква, угадывай еще: ");
            ugadaite = (char) System.in.read();
            System.in.read();
            if (zagadaite == ugadaite) {
                System.out.println("О, это оно!");
                break;
            }
        }
    }
}
