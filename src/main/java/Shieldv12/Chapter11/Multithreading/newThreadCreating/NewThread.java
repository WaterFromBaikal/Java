package Shieldv12.Chapter11.Multithreading.newThreadCreating;

public class NewThread implements Runnable{

    Thread t;
    NewThread(){
        t = new Thread(this, "Demo thread");
        System.out.println("Дочерний поток: " + t );
    }
    @Override
    public void run() {

    }
}
