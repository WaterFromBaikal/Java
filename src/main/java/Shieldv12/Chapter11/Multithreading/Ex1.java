package Shieldv12.Chapter11.Multithreading;

public class Ex1 {
    public static void main(String[] args)  {
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println("Тестовый соут");
        System.out.println(t);

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(i);
                System.out.println(t);
                Thread.sleep(2000);
            }
        }catch (InterruptedException ie){
            System.out.println("Тред прервали");
        }

    }
}
