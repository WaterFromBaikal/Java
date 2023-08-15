package CodeWars;


import java.util.Arrays;

public class ArrayDiffClass {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] b = new int[]{4,4};
        System.out.println(Arrays.toString(arrayDiff(a, b)));
        int data = 2;
//        System.out.println(arrayDiff(a, b));
        int[] c = new int[a.length-1];
//        c = Arrays.copyOfRange(a, 0, data);
//        c = Arrays.copyOfRange(a, data, 6);
//        System.arraycopy(a,0,c,0,data);
//        System.arraycopy(a,data+1,c,data,c.length-data);
//        System.out.println(Arrays.toString(c));

        /**System.arrayCopy(from, fromIndex, to, toIndex, count);

        from - массив, который копируем
        to - массив в которой копируем
        fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
        toIndex - индекс в массиве to начиная с которого вставляем элементы
        count - количество элементов которые берем из массива from и вставляем в массив to
        Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы.
        */
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        int[] copyA = Arrays.copyOf(a, a.length);
        int[] copyB = Arrays.copyOf(b,b.length);


        int length = copyA.length;
        int[] tmpArr=null;
        for (int i = 0; i < copyB.length; i++) {
            for (int j = 0; j < copyA.length; j++) {
                if (copyA[j] == copyB[i]) {
                    copyA = new int[--length];
                    System.arraycopy(a,0,copyA,0,i+1);
                    System.arraycopy(a,i+1,copyA,i,copyA.length-i);

                }
            }
        }
        return copyA;
    }
}
