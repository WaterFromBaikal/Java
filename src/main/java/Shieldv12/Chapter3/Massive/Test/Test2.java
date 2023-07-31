package Shieldv12.Chapter3.Massive.Test;

import jdk.swing.interop.SwingInterOpUtils;

public class Test2 {
    public static void main(String[] args) {
                long longVal = 9223372036854775807L;
        String longValAsString = String.valueOf(longVal);
        int lengthOfLongValAsString = longValAsString.length();
        int[] reversedIntArrayForLongVal = new int[lengthOfLongValAsString];
        for (int i = 0; i <= lengthOfLongValAsString-1; i++) {
            reversedIntArrayForLongVal[i] = Character.getNumericValue(longValAsString.charAt(lengthOfLongValAsString-1-i));
        }
        for (int i : reversedIntArrayForLongVal){
            System.out.print(i);
        }
        System.out.println();
        System.out.println(longVal);
        System.out.println("================");
        for (int i = lengthOfLongValAsString-1; i >= 0; i--) {
            reversedIntArrayForLongVal[lengthOfLongValAsString - i - 1] = Character.getNumericValue(longValAsString.charAt(i));
        }
        for (int i : reversedIntArrayForLongVal){
            System.out.print(i);
        }

    }
}
