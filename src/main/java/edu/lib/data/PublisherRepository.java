package edu.lib.data;

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
    List<Publisher> findByName();
    // Find publisher by books
    List<Publisher> findByBooks();


}
