package at.fhbfi.pit.jpabookauthor.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

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
    @Column(name = "age")
    private int age;
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "dead")
    private boolean dead;
    @Column(name = "writtenBooks")
    private int writtenBooks;
    /*@ManyToMany (mappedBy = "authors", fetch = FetchType.EAGER)*/
    @OneToMany(mappedBy = "authorEntity", fetch = FetchType.EAGER)
    private List<BookAuthorEntity> bookAuthorEntities;
}
