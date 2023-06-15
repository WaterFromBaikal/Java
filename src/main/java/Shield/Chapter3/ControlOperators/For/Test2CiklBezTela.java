package Shield.Chapter3.ControlOperators.For;

/**
 * Цикл без тела, но вся логика идет в третьем аргументе sum += i++
 * sum += i++, читается как
 * sum = sum + i; i = i + 1
 *
 */
public class Test2CiklBezTela {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for (i = 1; i <= 5; sum += i++) ;
        System.out.println("Сумма: " + sum);
    }
}
