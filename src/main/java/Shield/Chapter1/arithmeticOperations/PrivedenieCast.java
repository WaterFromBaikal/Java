package Shield.Chapter1.arithmeticOperations;

/**
 *  автоматическое приведение - меньшее к большему. byte в int;
 *  неявное приведение - нужно самому прописать (cast)
 */
public class PrivedenieCast {
    public static void main(String[] args) {
        byte b = 127;
        int i = 1000;
        i = b; //автоматическое приведение, byte входит в значения int
        b = (byte) i; //"неявное" приведение, int больше макс значений байта, произойдет округление ло 127(макс у байта)
        System.out.println(i + " " + b);

    }
}
