package at.fhbfi.pit.jpabookauthor.service.impl;

import at.fhbfi.pit.jpabookauthor.persistence.BookRepository;
import at.fhbfi.pit.jpabookauthor.service.BookService;
import at.fhbfi.pit.jpabookauthor.service.dto.BookDto;
import at.fhbfi.pit.jpabookauthor.service.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<BookDto> getBookList() {
        return bookMapper.toDto(bookRepository.findAll());
    }

    @Override
    public List<BookDto> getBooksByTitle(String title) {
        return bookMapper.toDto(bookRepository.findByTitleOrderByTitle(title));
    }

    @Override
    public List<BookDto> getBooksByReleaseDate(LocalDate releaseDate) {
        return bookMapper.toDto(bookRepository.findByReleaseDateOrderByReleaseDateAsc(releaseDate));
    }

    /*@Override
    public void updateBookPages(BookDto book, int pages) {

    }

    @Override
    public void updateBookPublishDate(BookDto book, String date) {

    }*/

    @Override
    public void saveBook(BookDto book) {
        bookRepository.save(bookMapper.toEntity(book));
    }
}
