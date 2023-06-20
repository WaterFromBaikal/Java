package Shield.Chapter3.ControlOperators.Break;

/**
 * break с меткой возврата.
 * Чтобы задать метку блока кода нужен блок кода формата имя:{блок кода}, и ЦИКЛ В НЕМ, который будет
 * прерываться for(...) {if(...) break имяМетки}.
 * Выполнение цикла прекратиться, выполнение продолжиться с ПОСЛЕ указанного блока кода
 *
 */
public class Break {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni равно " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                        System.out.println("Не будет выведено");
                    }
                    System.out.println("После блока three");
                }
                System.out.println("После блока two");
            }
            System.out.println("После блока one");
        }
    }
}
