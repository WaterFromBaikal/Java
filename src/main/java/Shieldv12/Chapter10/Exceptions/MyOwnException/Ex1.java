package Shieldv12.Chapter10.Exceptions.MyOwnException;

import java.io.FileReader;

public class Ex1 {
    public static void main(String[] args) {
        readIt("test.txt");
    }

    static void readIt(String filename) {
        try {
            if (filename.equals("test.txt")) {
                throw new InvalidInputException("Invalid filename");
            }
        } catch (InvalidInputException ie) {
            System.out.println("Название файла не подходит");
            System.out.println(ie.getMessage());
        }
        try (FileReader fr = new FileReader(filename)) {
        } catch (Exception e) {
            System.out.println("Это Exception е");
        }
    }
}
