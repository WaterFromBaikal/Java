package CodeWars;

import java.util.Arrays;

public class FoldAnArray {
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        int foldCount = 5;
        System.out.println(Arrays.toString(foldArray(test, foldCount)));
        System.out.println(Arrays.toString(foldArray2(test, foldCount)));
    }

    public static int[] foldArray(int[] array, int runs) {
        int lengthOfArray = array.length;
        int counter = 0;
        int[] tmp1 = array;
        int[] tmp2 = new int[0];
        if (lengthOfArray <= 1 | array == null) {
            return array;
        }
        while (counter < runs) {
            if (tmp1.length % 2 == 0) {
                tmp2 = new int[tmp1.length / 2];
                for (int i = 0; i < (tmp2.length); i++) {
                    tmp2[i] = tmp1[i] + tmp1[tmp1.length - 1 - i];
                }
                tmp1 = tmp2;
                if(tmp1.length == 1){
                    break;
                }
                counter++;

            } else if (tmp1.length % 2 == 1) {
                tmp2 = new int[tmp1.length / 2 + 1];
                for (int i = 0; i < (tmp2.length-1); i++) {
                    tmp2[i] = tmp1[i] + tmp1[tmp1.length - 1 - i];
                    tmp2[tmp2.length-1] = tmp1[tmp2.length-1];
                }
                tmp1 = tmp2;
                if(tmp1.length == 1){
                    break;
                }
                counter++;
            }

        }
        return tmp1;
    }

    public static int[] foldArray2(int[] array, int runs) {
        int[] dstArray = Arrays.copyOf(array,array.length);
        int length = dstArray.length;
        for(int i = 0; i < runs; i++){
            for(int k = 0; k < length/2; k++){
                dstArray[k]+=dstArray[length-1-k];
            }
            length=(length+1)/2;
        }
        return Arrays.copyOf(dstArray,length);
    }
}
