package Shieldv12.Chapter8.Inheritance;

public class InheritanceMainEx1 {
    public static void main(String[] args) {

        Book book1 = new Book(5);
        Book book2 = new Book("TestName");
        Book book3 = new Book("TestName", 5);

    }
}

class Library {
    String name = "none";
    int pageCount = 0;

    public Library(String name) {
        this.name = name;
    }

    public Library(int pageCount) {
        this.pageCount = pageCount;
    }

    public Library(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    public Library() {

    }
}

class Book extends Library{
    Book(int a){
        super(a);
    }

    public Book(String name) {
        super(name);
    }

    public Book(String name, int pageCount) {
        super(name, pageCount);
    }


}