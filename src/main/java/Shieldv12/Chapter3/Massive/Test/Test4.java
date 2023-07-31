package Shieldv12.Chapter3.Massive.Test;

import java.util.Arrays;

/**
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
 * Note: input will never be an empty string
 */
public class Test4 {
    public static String fakeBin(String numberString) {
        int lengthOfString = numberString.length();
        int[] tmp = new int[lengthOfString];
        for (int i = 0; i < lengthOfString; i++) {
            tmp[i] = (Character.getNumericValue(numberString.charAt(i)) < 5) ? 0 : 1;
            System.out.println(tmp[i]);
        }

        return Arrays.toString(tmp).replaceAll("\\[|\\]|,|\\s", "");
    }
    public static String fakeBin2(String numberString) {
        char[] testChar = numberString.toCharArray();
        for(int i = 0; i < numberString.length(); i++) {
            testChar[i] = (testChar[i] < '5') ? '0' : '1';
        }
        return new String(testChar);
    }
    public static String fakeBin3(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");

    }

    public static void main(String[] args) {
        System.out.println(fakeBin("9973629"));
        System.out.println(fakeBin2("9973629"));
        System.out.println(fakeBin3("9973629"));
    }
}
