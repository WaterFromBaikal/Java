package Shield.Chapter3.ControlOperators.Quiz;

import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        char income;
        int counter = 0;
        do {
            income = (char) System.in.read();
            if (income == ' ') {
                counter += 1;
            }
        } while (income != '.');
        System.out.println("Пробелов было: " + counter);
    }
}
