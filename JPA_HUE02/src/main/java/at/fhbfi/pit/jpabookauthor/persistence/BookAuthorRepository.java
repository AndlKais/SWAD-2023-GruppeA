package at.fhbfi.pit.jpabookauthor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookAuthorRepository extends JpaRepository<BookAuthorEntity, Long> {

    List<BookAuthorEntity> findByBookEntity(BookEntity bookEntity);


}
