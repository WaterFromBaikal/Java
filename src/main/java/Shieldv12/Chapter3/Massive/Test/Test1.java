package Shieldv12.Chapter3.Massive.Test;

public class Test1 {
    public static void main(String[] args) {
        int[] testArray = new int[]{-1, 2, 6, 8, -6, -4, 0};
        int sum = 0;
        if (testArray.length == 0) {
            System.out.println(0);
        } else {
            for (int i = 0; i < testArray.length; i++) {
                if (testArray[i] > 0) {
                    sum += testArray[i];
                }
            }
        }
        System.out.println(sum);
    }
}
