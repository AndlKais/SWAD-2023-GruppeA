package at.fhbfi.pit.jpabookauthor.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<AuthorEntity,Long> {

    List<AuthorEntity> findByName (String name);
    List<AuthorEntity> findByNameOrAgeAndDead(String name, Integer age, Boolean dead);
    List<AuthorEntity> findByNameAndDead(String name, Boolean dead);
    List<AuthorEntity> findByWrittenBooksOrderByWrittenBooksDesc(int writtenBooks);

}
