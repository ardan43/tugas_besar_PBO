/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.util.List;

/**
 *
 * @author chali
 */
public class Librarycaller {
   public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book();
        book1.setTitle("Java Programming");
        book1.setAuthor("John Doe");
        book1.setYear(2020);
        book1.setPageCount(300);

        Magazine magazine1 = new Magazine();
        magazine1.setTitle("Science Today");
        magazine1.setAuthor("Jane Smith");
        magazine1.setYear(2023);
        magazine1.setIssue("January");

        library.addItem(book1);
        library.addItem(magazine1);

        displayCatalog(library);
    }

    public static void displayCatalog(Library library) {
        List<Item> catalog = library.getCatalog();

        System.out.println("Library Catalog:");
        for (Item item : catalog) {
            if (item instanceof Book) {
                System.out.println("Book: " + item.getTitle() + " by " + item.getAuthor() +
                        ", Year: " + item.getYear() + ", Pages: " + ((Book) item).getPageCount());
            } else if (item instanceof Magazine) {
                System.out.println("Magazine: " + item.getTitle() + " by " + item.getAuthor() +
                        ", Year: " + item.getYear() + ", Issue: " + ((Magazine) item).getIssue());
            }
        }
    }
}