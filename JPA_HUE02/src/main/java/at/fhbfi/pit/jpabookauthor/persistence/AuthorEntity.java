package at.fhbfi.pit.jpabookauthor.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "dead")
    private boolean dead;
    @Column(name = "writtenBooks")
    private int writtenBooks;
    @ManyToMany (mappedBy = "authors")
    private Set<BookEntity> books;
}
