package Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task2.bookstore;

public class Author {
    String name;
    String email;
    int publishedBook;

    public Author(String name, String email, int publishedBook) {
        this.name = name;
        this.email = email;
        this.publishedBook = publishedBook;
    }
    public Book writeNewBook(String title, int price, String genre, String ISBN){
        publishedBook++;
        return new Book(title, price, genre, ISBN);
    }
}
