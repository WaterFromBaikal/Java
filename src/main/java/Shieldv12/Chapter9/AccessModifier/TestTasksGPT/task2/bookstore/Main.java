package Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task2.bookstore;

import Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task2.bookstore.customer.Customer;
import Shieldv12.Chapter9.AccessModifier.TestTasksGPT.task2.bookstore.management.InventoryManager;
//Public - везде и для всех
//Private - только внутри класса
//Default - Внутри пакета
//Prtected - Внутри пакета + у наследников
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Ivan", "Ivan@test.ru", 1);
        Author author2 = new Author("Ander", "ander@test.ru", 0);

        Bookstore bookstore = new Bookstore("Пушкинская",new Book("Колобок",100,"fantasy", "100-1000-1"), author.writeNewBook("Ряба",250,"fantasy", "200-1000-2"));

        InventoryManager inventoryManager = new InventoryManager(1);

        Customer customer = new Customer("Petr", 1);

        bookstore.showBooks();
    }
}
