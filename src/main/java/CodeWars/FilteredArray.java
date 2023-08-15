package CodeWars;

import java.util.Arrays;

public class FilteredArray {
    public static void main(String[] args) {
        int[] a = {1,11,3};
        int[] b = {1,2};
        System.out.println(Arrays.toString(arrayDiff(a, b)));
        System.out.println(Arrays.toString(arrayDiff2(a, b)));

    }

    public static int[] arrayDiff(int[] a, int[] b) {
        int[] aTmp = Arrays.copyOf(a, a.length);
        int t = 0;
        int aLength = a.length;
        for (int i = 0; i < a.length; i++) {
            boolean coincidence = false;
            for (int k : b) {
                if (a[i] == k) {
                    coincidence = true;
                    aTmp = Arrays.copyOf(aTmp, --aLength);
                    break;
                }
            }
            if (!coincidence) {
                aTmp = Arrays.copyOf(aTmp, aLength);
                aTmp[t] = a[i];
                t++;
            }
        }
        return aTmp;
    }

    public static int[] arrayDiff2(int[] a, int[] b) {
        if (b.length==0) {return a;}
        int[] aTmp = new int[a.length];
        int length = a.length;
        int aTmpCounter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    aTmp = Arrays.copyOf(aTmp, --length);
                    break;
                } else {
                    aTmp[aTmpCounter++] = a[i];
                }
            }
        }
        return aTmp;
    }
}


