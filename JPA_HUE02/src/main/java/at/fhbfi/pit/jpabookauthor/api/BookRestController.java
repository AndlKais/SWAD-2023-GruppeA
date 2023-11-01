package at.fhbfi.pit.jpabookauthor.api;

import at.fhbfi.pit.jpabookauthor.service.BookService;
import at.fhbfi.pit.jpabookauthor.service.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "book")
public class BookRestController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookDto> getBookList() {
        List<BookDto> books = bookService.getBookList();
        books.forEach(System.out::println);
        return books;
    }

    @GetMapping(path = "title/{title}")
    public List<BookDto> getBookByTitle(@PathVariable String title) {
        List<BookDto> books = bookService.getBooksByTitle(title);
        books.forEach(System.out::println);
        return books;
    }

    @GetMapping(path = "releaseDate/{releaseDate}")
    public List<BookDto> getBooksByReleaseDate(@PathVariable(value = "date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate releaseDate) {
        List<BookDto> books = bookService.getBooksByReleaseDate(releaseDate);
        books.forEach(System.out::println);
        return books;
    }

    @PostMapping
    public void save(@RequestBody BookDto book) {
        bookService.saveBook(book);
    }
}
