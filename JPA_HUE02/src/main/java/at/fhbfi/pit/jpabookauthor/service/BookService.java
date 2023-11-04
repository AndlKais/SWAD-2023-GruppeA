package at.fhbfi.pit.jpabookauthor.service;

import at.fhbfi.pit.jpabookauthor.service.dto.BookDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

public interface BookService {

    List<BookDto> getBookList();

    BookDto getBookById(Long id);

    List<BookDto> getBooksByTitle(String title);

    List<BookDto> getBooksByReleaseDate(LocalDate releaseDate);

    void updateBookPages(BookDto bookDto, int pages);

    void updateBookReleaseDate(BookDto bookDto, LocalDate releaseDate);

    void saveBook(BookDto book);

}
