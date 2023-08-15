package CodeWars;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] a = new int[]{1,-3,5,99,-4};
        System.out.println(Arrays.toString(invert(a)));
    }

    public static int[] invert(int[] array) {
        for(int i = 0; i < array.length; i++){
            array[i] = - array[i];
        }
        return array;
    }
}
