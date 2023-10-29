package at.fhbfi.pit.jpabookauthor.service.mapper;

import at.fhbfi.pit.jpabookauthor.persistence.AuthorEntity;
import at.fhbfi.pit.jpabookauthor.persistence.BookEntity;
import at.fhbfi.pit.jpabookauthor.service.dto.BookDto;

public class BookMapper implements Mapper<BookDto, BookEntity> {

    @Override
    public BookEntity toEntity(BookDto s) {
        return null;
    }

    @Override
    public BookDto toDto(BookEntity s) {
        return null;
    }
}
