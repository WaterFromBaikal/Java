package Shieldv12.Chapter7.InnerAndOuterClasses;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 15);
        Cat.CatToy toy1 = cat1.new CatToy("verevochka");
        toy1.play();
        Cat.CatToy toy2 = cat1.new CatToy("Bantik");
        toy2.play();

        Cat.CatFood catFood1 = new Cat.CatFood("Whiskas", 5);
        catFood1.feed();
    }
}
