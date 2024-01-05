/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author chali
 */
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    public void addItem(Item item) {
        catalog.add(item);
    }

    public List<Item> getCatalog() {
        return new ArrayList<>(catalog); // Return a copy of the catalog to prevent direct modifications
    }

    // Other methods to manage the library, such as loanItem(), returnItem(), displayCatalog(), etc.
    // ...
}