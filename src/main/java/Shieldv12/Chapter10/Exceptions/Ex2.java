package Shieldv12.Chapter10.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2 {
    public static void main(String[] args) {
        readFile("File.txt");
    }

    static void readFile(String file){
        try{
            FileReader fr = new FileReader(file);
        }
        catch (FileNotFoundException f){
            System.out.println("Нет файла");
        }
    }
}
