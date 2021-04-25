package edu.lib.data;

import edu.lib.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReaderRepository extends JpaRepository<Reader,Long> {

    // Possible methods to be required for finding
    //-Find those whose title contains a given string in it
    List<Reader> findById(String titlePortion);
    //Find By title
    List<Reader> findByEmail(String email);
    //-Find books by auth no
    List<Reader> findByFirstName(String firstName);
    //-Find book by ISBN
    List<Reader> findByLastName(String lastName);
    //-Find books by Category
    List<Reader> findByPhoneNum(String phoneNumber);

    //-Delete book if title contains a string passed in it
    void deleteById(Long id);

}
