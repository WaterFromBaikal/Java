package Shieldv12.Chapter10.Exceptions;

public class ThrowEx {
    static void demoproc(){
        try {
            throw new NullPointerException("Демонстрация");
        } catch (NullPointerException e){
            System.out.println("Перехвачено внутри demoproc()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        } catch (NullPointerException e){
            System.out.println("Перехвачено: " + e);
        }
    }
}
