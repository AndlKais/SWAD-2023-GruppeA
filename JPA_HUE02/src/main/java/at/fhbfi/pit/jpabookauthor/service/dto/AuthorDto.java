package at.fhbfi.pit.jpabookauthor.service.dto;

import at.fhbfi.pit.jpabookauthor.persistence.BookEntity;
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

public class AuthorDto {

    private Long id;
    private String name;
    private int age;
    private LocalDate birthday;
    private boolean dead;
    private int writtenBooks;
    private Set<BookEntity> books;

}
