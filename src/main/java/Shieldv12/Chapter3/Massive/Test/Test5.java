package Shieldv12.Chapter3.Massive.Test;

/**
 * Write a function to split a string and convert it into an array of words.
 */
public class Test5 {
//    public static String[] stringToArray(String s) {
//        //your code;
//        return "";
//    }

    public static void main(String[] args) {
        String srcData = "Hello, bro!";
        int srcDataLength = srcData.length();
        String[] dataArray = srcData.split(" ");
        for ( String s : dataArray){
            System.out.println(s);
        }
    }
}
