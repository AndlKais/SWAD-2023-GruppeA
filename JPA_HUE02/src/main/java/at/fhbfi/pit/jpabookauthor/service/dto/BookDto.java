package at.fhbfi.pit.jpabookauthor.service.dto;

import at.fhbfi.pit.jpabookauthor.persistence.AuthorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class BookDto {

    private Long id;
    private String title;
    private String genre;
    private LocalDate releaseDate;
    private int pages;
    private String publisher;
    private double price;
    private Set<AuthorEntity> authors;
}
