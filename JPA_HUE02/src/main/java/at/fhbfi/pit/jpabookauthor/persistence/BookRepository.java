package at.fhbfi.pit.jpabookauthor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity,Long> {

    List<BookEntity> findByTitleOrderByTitle (String name);
    List<BookEntity> findByAuthors(List<AuthorEntity> name);
    List<BookEntity> findByReleaseDateOrderByReleaseDateAsc(Date releaseDate);
    List<BookEntity>findByPriceOrderByPriceDesc(double price);


}
