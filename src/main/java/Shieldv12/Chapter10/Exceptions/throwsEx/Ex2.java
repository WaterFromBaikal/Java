package Shieldv12.Chapter10.Exceptions.throwsEx;

import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) {

            readFile("filename.txt");

    }

    static void readFile(String fileName)  {
        try (FileReader fr = new FileReader(fileName)) {
        }
        catch (IOException ioException){
            System.out.println("Ошибку не прокинули дальше, а обработали в самом методе");
        }
    }
}
