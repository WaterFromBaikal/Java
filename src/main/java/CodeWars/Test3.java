package CodeWars;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        String a = "azaza";
//        System.out.println(getCount(a));
//        System.out.println(getCount2(a));
        System.out.println(squareDigits(9119));

    }

    public static int getCount2(String str) {
       return str.replaceAll("(?i)[^aeiou]", "").length();
    }
    public static int getCount(String str) {
        char[] scrArray = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < scrArray.length; i++) {
            if (scrArray[i] == 'a') counter++;
            else
            if (scrArray[i] == 'e') counter++;
            else
            if (scrArray[i] == 'i') counter++;
            else
            if (scrArray[i] == 'o') counter++;
            else
            if (scrArray[i] == 'u') counter++;
        }
        return counter;
    }

    public static int squareDigits(int n) {
        char[] srcArr = Integer.toString(n).toCharArray();
        String result = "";
        for (int i = 0; i < srcArr.length; i++){
            result+=String.valueOf(Character.getNumericValue(srcArr[i]) * Character.getNumericValue(srcArr[i]));
        }
        return Integer.parseInt(result);
    }
}
