package CodeWars;

public class test1 {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        String a = "" + numbers[0] + numbers[1] + numbers[2];
        String b = "" + numbers[3] + numbers[4] + numbers[5];
        String c = "" + numbers[6] + numbers[7] + numbers[8] + numbers[9];
        return "(" + a + ") " + b + "-" + c;
    }
}
