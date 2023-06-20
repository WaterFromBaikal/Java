package Shield.Chapter3.ControlOperators.Continue;

/**
 * continue с меткой возврата.
 * Чтобы из вложенного цикла пропустить шаг не вложенного, а внешнего цикла - можно использовать
 * continue с меткой
 * метка: for(..) {for(..){if(..) continue метка}}
 * тогда произойдет переход к началу метки с продолжением внешнего цикла
 */
public class Continue1 {
    public static void main(String[] args) {
        int i;
        outerloop:
        for(i=1; i<10; i++){
            System.out.print("\nBнemний цикл: проход " + i +
                    ", внутренний цикл: ");
            for (int j = 0; j < 10; j++) {
                if (j == 5) continue outerloop;
                System.out.println("j: " +j);
            }
        }
    }
}
