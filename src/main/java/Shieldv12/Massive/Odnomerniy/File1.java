package Shieldv12.Massive.Odnomerniy;
//page 100+

/**
 * тип[] имя-переменной =  new тип [размер] ;
 * int[] dayNumber = new dayNumber[7];
 * Отсчет элементов идет с нуля: 0 1 2 3 4 5 6 - всего семь
 */
public class File1 {
    public static void main(String[] args) {
        int[] monthDays = new int[12];
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;
        System.out.println("В марта " + monthDays[2] + " дней");

/**
 * Инициализация массива может быть и при объявлении
 */
        int[] monthDays2 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("В феврале " + monthDays2[1] + " дней");
    }
}
