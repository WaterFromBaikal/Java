package Shieldv12.Chapter4.arithmeticOperations;

public class LogicalOpTable {
    static int boolToInt (boolean a){
        return a ? 1 : 0;
    }
    public static void main(String[] args) {

        boolean p, q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true;
        q = true;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) + "\t");
        System.out.print(boolToInt(p & q) + "\t" + boolToInt(p | q) + "\t");
        System.out.println(boolToInt(p ^ q) + "\t" + boolToInt(!p));
        p = true;
        q = false;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) + "\t");
        System.out.print(boolToInt(p & q) + "\t" + boolToInt(p | q) + "\t");
        System.out.println(boolToInt(p ^ q) + "\t" + boolToInt(!p));
        p = false;
        q = true;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) + "\t");
        System.out.print(boolToInt(p & q) + "\t" + boolToInt(p | q) + "\t");
        System.out.println(boolToInt(p ^ q) + "\t" + boolToInt(!p));
        p = false;
        q = false;
        System.out.print(boolToInt(p) + "\t" + boolToInt(q) + "\t");
        System.out.print(boolToInt(p & q) + "\t" + boolToInt(p | q) + "\t");
        System.out.println(boolToInt(p ^ q) + "\t" + boolToInt(!p));
    }
}
