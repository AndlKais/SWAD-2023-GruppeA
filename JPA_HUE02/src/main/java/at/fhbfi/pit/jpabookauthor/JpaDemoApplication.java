package at.fhbfi.pit.jpabookauthor;

import at.fhbfi.pit.jpabookauthor.persistence.AuthorEntity;
import at.fhbfi.pit.jpabookauthor.persistence.AuthorRepository;
import at.fhbfi.pit.jpabookauthor.persistence.BookEntity;
import at.fhbfi.pit.jpabookauthor.persistence.BookRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void insertFakeData() {

        saveTwoAuthors();
        saveTwoBooks();
    }

    void saveTwoAuthors() {
        List<AuthorEntity> authors = new ArrayList<>();
        authors.add(AuthorEntity.builder()
                .name("Harald")
                .age(35)
                .birthday(LocalDate.of(1988, 9, 13))
                .dead(true)
                .writtenBooks(2)
                .build());
        authors.add(AuthorEntity.builder()
                .name("Lena")
                .age(32)
                .birthday(LocalDate.of(1991, 5, 20))
                .dead(false)
                .writtenBooks(3)
                .build());

        authorRepository.saveAll(authors);
    }

    void saveTwoBooks() {
        List<BookEntity> books = new ArrayList<>();
        books.add(BookEntity.builder()
                .title("Das Geschenk 2")
                .genre("Horror")
                .releaseDate(LocalDate.of(1998, 10, 19))
                .pages(569)
                .publisher("Sebastian Fitzek")
                .price(29.99)
                .build());
        books.add(BookEntity.builder()
                .title("Das Geschenk 3")
                .genre("Horror")
                .releaseDate(LocalDate.of(1998, 10, 19))
                .pages(569)
                .publisher("Sebastian Fitzek")
                .price(29.99)
                .build());

        bookRepository.saveAll(books);
    }
}
