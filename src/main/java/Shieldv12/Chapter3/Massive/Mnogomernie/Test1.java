package Shieldv12.Chapter3.Massive.Mnogomernie;
//page 102

/**
 * Многомерные массивы в Java реализованы как массивы массивов. Чтобы
 * объявить переменную многомерного массива, указывайте каждый дополнительный индекс, используя еще один набор квадратных скобок.
 * int[][] twoD = new int[4][5] - 4 строки, 5 столбцов
 */

public class Test1 {
    public static void main(String[] args) {
        int[][] twoD = new int[4][5];
        int k = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }


        /**
         * тк многомерный массив - это массив массивов, то при объявлении можно указывать размерность только первого измерения:
         * int[][] twoD2 = new int[4][];
         * остальные измерения могут иметь свою длинну и могут задаваться отдельно
         * twoD2[0] = new int[1];
         * twoD2[0] = new int[2];
         * ...
         */
        int[][] twoD2 = new int[4][];
        twoD2[0] = new int[1];
        twoD2[1] = new int[2];
        twoD2[2] = new int[3];
        twoD2[3] = new int[4];
        int i, j, n = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                twoD2[i][j] = n;
                n++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(twoD2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
