package Shieldv12.Chapter8.Inheritance;

public class UsingMethodFromSuperClassWithSuper {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.cry("Сирена!");
        boy.makeSound("Девченка!");
    }
}

class Children{
    void makeSound(String sound){
        System.out.println("Ребенок плачет как " + sound);
    }
}

class Boy extends Children{
    void cry(String cry){
        super.makeSound(cry); //Вариант использования метода с Super
    }
}
