package at.fhbfi.pit.jpabookauthor.service.impl;

import at.fhbfi.pit.jpabookauthor.persistence.AuthorEntity;
import at.fhbfi.pit.jpabookauthor.service.AuthorService;
import at.fhbfi.pit.jpabookauthor.persistence.AuthorRepository;
import at.fhbfi.pit.jpabookauthor.service.dto.AuthorDto;
import at.fhbfi.pit.jpabookauthor.service.mapper.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapper authorMapper;


    @Override
    public List<AuthorDto> getAuthorList() {
        return authorMapper.toDto(authorRepository.findAll());
    }

    @Override
    public List<AuthorDto> getAuthorAliveList() {
        return authorMapper.toDto(authorRepository.findByDead(false));
    }

    @Override
    public List<AuthorDto> getAuthorDeadList() {
        return authorMapper.toDto(authorRepository.findByDead(true));
    }

    @Override
    public int getAuthorWrittenBooks(Long id) {
        AuthorEntity author = authorRepository.findById(id).get();
        return author.getWrittenBooks();
    }

    @Override
    public AuthorDto getAuthorById(Long id) {
        return authorMapper.toDto(Objects.requireNonNull(authorRepository.findById(id).orElse(null)));
    }

    @Override
    public void saveAuthor(AuthorDto author) {
        authorRepository.save(authorMapper.toEntity(author));
    }

}
