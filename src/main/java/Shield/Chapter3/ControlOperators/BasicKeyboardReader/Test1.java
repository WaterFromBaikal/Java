package Shield.Chapter3.ControlOperators.BasicKeyboardReader;
import java.io.IOException;

/**
 * Читаем символы, кастим их в char иначе на выходе - число.
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.print("Нажмите любую клавишу, затем ENTER: ");
        ch = (char)System.in.read();
        System.out.println("Вы ввели: " + ch);
    }
}
