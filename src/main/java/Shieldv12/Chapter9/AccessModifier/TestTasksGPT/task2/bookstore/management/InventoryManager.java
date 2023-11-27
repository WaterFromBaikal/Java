package Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task2.bookstore.management;

import Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task2.bookstore.Book;

public class InventoryManager {
    int empID;
    public InventoryManager(int empID){
        this.empID = empID;
    }

    public void addDiscount(Book book, int discount){
        book.setPrice(book.getPrice() - book.getPrice()*discount/100);
    }
}
