package edu.lib.data;

import edu.lib.model.Book;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Possible methods to be required
    //-Find book by title
    List<Book> findByTitleContaining(String title);
    //-Find books by authors
    List<Book> findBookByAuthNoContaining(String authNo);
    //-Find book by ISBN
    List<Book> findBookByISBNContaining(String ISBN);
    //-Find book by Category
    //-FInd book by price range



}