package Shieldv12.Chapter7.String;

/**
 * Параметр переменной длинны - массив,
 * int doit ( int а, int Ь, double с, int ... val s) {} Параметр переменной длинны можно использовать с другими, но он должен идти последним
 * int doit ( int а, int Ь, douЫe с, int ... vals, boolean stopFlag ) {} Ошибка !
 * Может быть только один такой параметр:
 * int doit ( int а, int Ь, double с, int ... vals, int ... vald){} Ошибка!
 */
public class VarArgs1 {
    public static void main(String[] args) {
        System.out.println(count(1));
        System.out.println(count());
        System.out.println(count(1, 2, 3));
    }
    static int count(int...a){ // <-- параметр переменной длинны
        int count = 0;
        for(int b : a){
            count+=b;
        }
        return count;
    }
}
