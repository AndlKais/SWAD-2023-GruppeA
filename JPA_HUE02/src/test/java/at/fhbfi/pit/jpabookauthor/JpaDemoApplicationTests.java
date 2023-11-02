package at.fhbfi.pit.jpabookauthor;

import at.fhbfi.pit.jpabookauthor.persistence.*;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class JpaDemoApplicationTests {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testAuthorPersistence() {
        List<AuthorEntity> authors = new ArrayList<>();

        authors.add(AuthorEntity.builder()
                .name("Matt")
                .age(32)
                .birthday(LocalDate.of(1988, 12, 12))
                .dead(true)
                .writtenBooks(4)
                .build());

        authorRepository.saveAll(authors);
        authorRepository.findAll().forEach(System.out::println);

    }

    @Test
    void testBookPersistence() {
        List<BookEntity> books = new ArrayList<>();

        books.add(BookEntity.builder()
                .title("Das Geschenk")
                .genre("Horror")
                .releaseDate(LocalDate.of(1998, 10, 19))
                .pages(569)
                .publisher("Sebastian Fitzek")
                .price(29.99)
                .build());

        bookRepository.saveAll(books);
        bookRepository.findAll().forEach(System.out::println);

    }

    @Test
    @Transactional
    void testAuthorBookPersistence() {

        AuthorEntity authorMax = (AuthorEntity.builder()
                .name("Max")
                .age(24)
                .birthday(LocalDate.of(1999, 7, 21))
                .dead(false)
                .writtenBooks(9)
                .build());
        AuthorEntity authorJohn = (AuthorEntity.builder()
                .name("John")
                .age(35)
                .birthday(LocalDate.of(1988, 9, 13))
                .dead(true)
                .writtenBooks(2)
                .build());
        AuthorEntity authorLisa = (AuthorEntity.builder()
                .name("Lisa")
                .age(32)
                .birthday(LocalDate.of(1991, 5, 20))
                .dead(false)
                .writtenBooks(3)
                .build());

        authorRepository.saveAll(List.of(authorMax, authorJohn, authorLisa));

        BookEntity bookMindhunter = (BookEntity.builder()
                .title("Mindhunter")
                .genre("Thriller")
                .releaseDate(LocalDate.of(2004, 9, 30))
                .pages(460)
                .publisher("Riva Verlag")
                .price(24.50)
                .build());
        BookEntity bookFearstreet = (BookEntity.builder()
                .title("Fearstreet")
                .genre("Horror")
                .releaseDate(LocalDate.of(1989, 1, 1))
                .pages(710)
                .publisher("Loewe Verlag")
                .price(22.50)
                .build());
        BookEntity bookTodesfrist = (BookEntity.builder()
                .title("Todesfrist")
                .genre("Horror")
                .releaseDate(LocalDate.of(2007, 5, 17))
                .pages(637)
                .publisher("Goldmann Verlag")
                .price(21.90)
                .build());

        bookRepository.saveAll(List.of(bookMindhunter, bookFearstreet, bookTodesfrist));

        AuthorEntity max = authorRepository.findByName("Max").get(0);
        AuthorEntity john = authorRepository.findByName("John").get(0);

        ArrayList<AuthorEntity> authors = new ArrayList<>();
        authors.add(max);
        authors.add(john);

        bookFearstreet.setAuthors(authors);
        bookRepository.save(bookFearstreet);

        System.out.println("Alle Bücher: ");
        bookRepository.findAll().forEach(System.out::println);
        System.out.println();
        System.out.println("Alle Autoren: ");
        authorRepository.findAll().forEach(System.out::println);
        System.out.println();

        System.out.println("Fearstreet wurde geschrieben von: ");
        System.out.println();

        bookRepository.findByTitle("Fearstreet").forEach(c -> c.getAuthors().forEach(System.out::println));
        Assertions.assertEquals(2, bookRepository.findAllWithBooks().get(3).getAuthors().size());

        System.out.println();

        System.out.println("Welches Buch kann ich mir um 22,50 kaufen?");
        bookRepository.findByPriceOrderByPriceDesc(22.50).forEach(System.out::println);
    }
}

