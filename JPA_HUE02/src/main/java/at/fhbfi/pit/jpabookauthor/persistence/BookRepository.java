package at.fhbfi.pit.jpabookauthor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity,Long> {

    List<BookEntity> findByTitle (String name);
    List<BookEntity> findByTitleOrderByTitle (String name);
    List<BookEntity> findByReleaseDateOrderByReleaseDateAsc(LocalDate releaseDate);
    List<BookEntity> findByPriceOrderByPriceDesc(double price);

    @Query("select a from BookEntity a left join fetch a.authors")
    List<BookEntity> findAllWithBooks();
}
