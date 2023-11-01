package at.fhbfi.pit.jpabookauthor.service;

import at.fhbfi.pit.jpabookauthor.service.dto.AuthorDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AuthorService {

    List<AuthorDto> getAuthorList();

    List<AuthorDto> getAuthorAliveList();

    List<AuthorDto> getAuthorDeadList();

    int getAuthorWrittenBooks(Long id);

    AuthorDto getAuthorById(Long id);

    //List<AuthorDto> getAuthorByBookTitle(String title);
    void saveAuthor(AuthorDto author);
    //boolean updateDeadAliveDate(AuthorDto author);

}
