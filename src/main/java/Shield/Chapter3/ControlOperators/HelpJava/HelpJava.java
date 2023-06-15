package Shield.Chapter3.ControlOperators.HelpJava;

import java.io.IOException;

public class HelpJava {
    public static void main(String[] args) throws IOException {
        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("Выберите: ");
        char choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else(условие) оператор;");
                break;
            case '2':
                System.out.println("Оператор switch:\n");
                System.out.println("switch(выpaжeниe) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ... ");
                System.out.println("}");
                break;
            default:
                System.out.println("Запрос не найден");
        }
    }
}
