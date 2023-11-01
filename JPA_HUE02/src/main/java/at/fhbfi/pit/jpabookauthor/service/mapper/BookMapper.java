package at.fhbfi.pit.jpabookauthor.service.mapper;

import at.fhbfi.pit.jpabookauthor.persistence.BookEntity;
import at.fhbfi.pit.jpabookauthor.service.dto.BookDto;
import org.springframework.stereotype.Component;


@Component
public class BookMapper implements Mapper<BookDto, BookEntity> {

    @Override
    public BookEntity toEntity(BookDto s) {
        return BookEntity.builder()
                .id(s.getId())
                .title(s.getTitle())
                .genre(s.getGenre())
                .releaseDate(s.getReleaseDate())
                .pages(s.getPages())
                .publisher(s.getPublisher())
                .price(s.getPrice())
                .build();
    }

    @Override
    public BookDto toDto(BookEntity s) {
        return BookDto.builder()
                .id(s.getId())
                .title(s.getTitle())
                .genre(s.getGenre())
                .releaseDate(s.getReleaseDate())
                .pages(s.getPages())
                .publisher(s.getPublisher())
                .price(s.getPrice())
                .build();
    }
}
