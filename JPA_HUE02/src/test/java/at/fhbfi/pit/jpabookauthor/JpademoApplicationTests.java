package at.fhbfi.pit.jpabookauthor;

import at.fhbfi.pit.jpabookauthor.persistence.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@SpringBootTest
class JpademoApplicationTests {

    @Autowired
    private AuthorRepository authorRepository;

    /*@Test
    void testAuthorPersistence() {
    List<AuthorEntity> authors = new ArrayList<>();
        authors.add(AuthorEntity.builder()
                .name("Matt")
                .age(32)
                .birthday(new Date(15,9,1989))
                .dead(true)
                .writtenBooks(4)
                .build());

        authorRepository.saveAll(authors);
        authorRepository.findAll().forEach(System.out::println);

    } */

}

