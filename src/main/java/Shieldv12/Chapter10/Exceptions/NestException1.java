package Shieldv12.Chapter10.Exceptions;

public class NestException1 {
    public static void main(String[] args) {
        int[] a = new int[2];

        for(int i = -2; i < 5; i++){
            try{
                int b = 10/i;
                try{
                    a[3] = b;
                } catch (IndexOutOfBoundsException io){
                    System.out.println("Вылез за массив");
                }
            }
            catch (ArithmeticException ar){
                System.out.println("Поделил на ноль");
            }
        }
    }
}
