package edu.lib.data;

import edu.lib.model.Book;
import edu.lib.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    // Possible methods to be required for finding
    // Find publisher by Id
    Optional<Publisher> findById(Long id);
    // Find publisher by name
    List<Publisher> findByName(String name);
    // Find those whose name contains a given string in it
    List<Publisher> findByNameContaining(String namePortion);
    // Find publisher by books
    List<Publisher> findByBooks(Book book);

    // Possible methods to be required for deleting

    //-Delete book if title contains a string passed in it
    List<Publisher> deleteById(String titlePortion);
    //-Delete by title
    List<Publisher> deleteByName(String name);
    //-Delete books by author number
    List<Publisher> deleteByAuthNo(String authNo);



}
