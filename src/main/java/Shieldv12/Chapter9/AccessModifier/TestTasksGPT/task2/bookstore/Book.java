package Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task2.bookstore;

public class Book {
    private String title;
    private int price;
    private String genre;

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public String getISBN() {
        return ISBN;
    }

    private String ISBN;

    Book(String title, int price, String genre, String ISBN){
        this.title = title;
        this.price = price;
        this.genre = genre;
        this.ISBN = ISBN;
    }

    void printBookDetails(){
        System.out.println("Title: " + title + ". Price: " + price + ". Genre:" + genre + ".");
    }
}
