package Shield.Chapter3.ControlOperators.Break;

public class Break6 {
    public static void main(String args[]) {
        int x = 0, y = 0;
// Здесь метка располагается перед оператором for
        stop1:
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop1;
                System.out.println("x и у: " + x + "" + y);

            }
        }
        System.out.println();
        for (x = 0; x < 5; x++) {
            stop2:
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop2;
                System.out.println("x и у: " + x + "" + y);
            }
        }
    }
}