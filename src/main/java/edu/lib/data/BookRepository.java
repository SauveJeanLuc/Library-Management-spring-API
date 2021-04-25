package edu.lib.data;

import edu.lib.model.Book;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
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

    // Possible methods to be required for deleting

    //-Delete book if title contains a string passed in it
    List<Book> deleteByTitleContaining(String titlePortion);
    //-Delete by title
    List<Book> deleteByTitle(String title);
    //-Delete books by author number
    List<Book> deleteByAuthNo(String authNo);
    //-Delete book by ISBN
    List<Book> deleteByISBN(String ISBN);
    //-Delete book by Category
    List<Book> deleteByCategory(String category);
    //-Delete book by price range
    List<Book> deleteByPriceBetween(Float price1, Float price2);
    //-Delete book by price
    List<Book> deleteByPrice(Float price);





}
