package at.fhbfi.pit.jpabookauthor.service;

import at.fhbfi.pit.jpabookauthor.service.dto.BookDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public interface BookService {

    List<BookDto> getBookList();

    List<BookDto> getBooksByTitle(String title);

    List<BookDto> getBooksByReleaseDate(LocalDate releaseDate);

    /*void updateBookPages(BookDto book, int pages);
    void updateBookPublishDate(BookDto book, String date);*/
    void saveBook(BookDto book);

}
