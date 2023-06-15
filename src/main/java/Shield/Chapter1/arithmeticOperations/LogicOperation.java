package Shield.Chapter1.arithmeticOperations;

/**
 *  "|" - Логическое И (сложение). Правда будет, если хотя бы один из аргументов - Правда
 *  "&" - Логическое ИЛИ (Умножение). Правда будет, если все аргументы правдивы. Хоть один элемент - ложь - все ложь
 *  "||" - укороченное И, если первый аргумент правда - дальше проверять не будет, даже если там деление на ноль
 *  "&&" - укороченное ИЛИ, если первый аргумент ложь - дальше проверять не будет, даже если там деление на ноль
 *  if(d != 0 & (n % d) == 0){...} - тут важен порядок - сначала проверка на ноль, потом на остаток и только потом ИЛИ
 */
public class LogicOperation {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a & a); //1*1 = 1
        System.out.println(a | a); //1+1 = 1
        System.out.println(b & b); //0*0 = 0
        System.out.println(b | b); //0+0 = 0
        System.out.println(a & b); //1*0 = 0
        System.out.println(a | b); //1+0 = 1
        int i = 0;
        //тк тут &, идет проверка всех аргументов в тч инкремент i
        if (false & (++i < 100)){
            System.out.println("Это строка не выведется");
        }
        System.out.println(i);
        //тк тут &&, идет проверка только первого false и до инкремента не доходит.
        if (false & (++i < 100)){
            System.out.println("Это строка не выведется");
        }
        System.out.println(i);
        boolean test = true;
        boolean test2 = false;


    }
}
