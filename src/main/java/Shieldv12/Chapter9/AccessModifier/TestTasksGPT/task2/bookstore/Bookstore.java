package Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task2.bookstore;


import java.util.List;

public class Bookstore {
    String nameBookstore;
    List<Book> BooksFromStore;
    Bookstore(String nameBookstore, Book... book){
        this.nameBookstore = nameBookstore;
        this.BooksFromStore = List.of(book);
    }
    void addBook(Book book){
        BooksFromStore.add(book);
    }
    void showBooks(){
        for (Book book : BooksFromStore){
            book.printBookDetails();
        }
    }
}
