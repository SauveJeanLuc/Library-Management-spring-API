package edu.lib.data;

import edu.lib.model.Book;

import java.util.List;

public interface ReaderRepository {

    // Possible methods to be required for finding
    //-Find those whose title contains a given string in it
    List<Book> findByTitleContaining(String titlePortion);
    //Find By title
    List<Book> findByTitle(String title);
    //-Find books by auth no
    List<Book> findByAuthNo(String authNo);
    //-Find book by ISBN
    List<Book> findByISBN(String ISBN);
    //-Find books by Category
    List<Book> findByCategory(String category);
    //-Find books by price range
    List<Book> findByPriceBetween(Float price1, Float price2);
}
