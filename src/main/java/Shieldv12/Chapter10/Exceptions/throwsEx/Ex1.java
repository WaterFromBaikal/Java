/*

 */
package Shieldv12.Chapter10.Exceptions.throwsEx;

import java.io.FileReader;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        try {
            readFile("filename.txt");
        } catch (IOException i) {
            System.out.println("Прокинули и поймали ошибку в мейне");
        }
    }

    static void readFile(String fileName) throws IOException {
        try (FileReader fr = new FileReader(fileName)) {
        }
    }
}
