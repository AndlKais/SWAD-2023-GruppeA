package at.fhbfi.pit.jpabookauthor.service.impl;

import at.fhbfi.pit.jpabookauthor.persistence.BookEntity;
import at.fhbfi.pit.jpabookauthor.persistence.BookRepository;
import at.fhbfi.pit.jpabookauthor.service.BookService;
import at.fhbfi.pit.jpabookauthor.service.dto.BookDto;
import at.fhbfi.pit.jpabookauthor.service.mapper.BookMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

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
    public BookDto getBookById(Long id) {
        return bookMapper.toDto(Objects.requireNonNull(bookRepository.findById(id).orElse(null)));
    }

    @Override
    public List<BookDto> getBooksByTitle(String title) {
        return bookMapper.toDto(bookRepository.findByTitleOrderByTitle(title));
    }

    @Override
    public List<BookDto> getBooksByReleaseDate(LocalDate releaseDate) {
        return bookMapper.toDto(bookRepository.findByReleaseDateOrderByReleaseDateAsc(releaseDate));
    }

    @Override
    public void updateBookPages(BookDto book, int pages) {
        book.setPages(pages);
        bookRepository.save(bookMapper.toEntity(book));
    }

    @Override
    public void updateBookReleaseDate(BookDto book, LocalDate releaseDate) {
        book.setReleaseDate(releaseDate);
        bookRepository.save(bookMapper.toEntity(book));
    }

    @Override
    public void saveBook(BookDto book) {
        bookRepository.save(bookMapper.toEntity(book));
    }
}
