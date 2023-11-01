package at.fhbfi.pit.jpabookauthor.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "genre")
    private String genre;
    @Column(name = "releaseDate")
    private LocalDate releaseDate;
    @Column(name = "pages")
    private int pages;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "price")
    private double price;
    @ManyToMany(mappedBy = "books", fetch = FetchType.EAGER)
    private List<AuthorEntity> authors = new ArrayList<>();
}
