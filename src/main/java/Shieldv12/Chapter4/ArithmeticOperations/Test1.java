package Shieldv12.Chapter4.ArithmeticOperations;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(Arrays.toString(averages(a)));
    }

    public static double[] averages(int[] numbers)
    {
        if((numbers == null) || (numbers.length < 2)) {return new double[0];}
        else{
            double[] numToAvg = new double[numbers.length-1];
            for (int i = 0; i < numbers.length-1; i++){
                numToAvg[i] = (double)(numbers[i] + numbers[i+1])/2;
            }
            return numToAvg;
        }
    }
}
