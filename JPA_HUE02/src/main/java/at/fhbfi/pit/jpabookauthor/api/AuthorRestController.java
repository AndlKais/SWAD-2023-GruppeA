package at.fhbfi.pit.jpabookauthor.api;

import at.fhbfi.pit.jpabookauthor.service.AuthorService;
import at.fhbfi.pit.jpabookauthor.service.dto.AuthorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "author")
public class AuthorRestController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<AuthorDto> getAuthorList() {

        List<AuthorDto> authors = authorService.getAuthorList();
        authors.forEach(System.out::println);
        return authors;
    }

    @GetMapping(path = "alive")
    public List<AuthorDto> getAuthorAliveList() {
        List<AuthorDto> authors = authorService.getAuthorAliveList();
        authors.forEach(System.out::println);
        return authors;
    }

    @GetMapping(path = "dead")
    public List<AuthorDto> getAuthorDeadList() {
        List<AuthorDto> authors = authorService.getAuthorDeadList();
        authors.forEach(System.out::println);
        return authors;
    }

    @GetMapping(path = "{id}/writtenBooks")
    public int getAuthorWrittenBooks(@PathVariable Long id) {
        return authorService.getAuthorWrittenBooks(id);
    }

    @GetMapping(path = "{id}")
    public AuthorDto getAuthor(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public void save(@RequestBody AuthorDto author) {
        authorService.saveAuthor(author);
    }
}
