package at.fhbfi.pit.jpabookauthor.service.mapper;

import at.fhbfi.pit.jpabookauthor.persistence.AuthorEntity;
import at.fhbfi.pit.jpabookauthor.service.dto.AuthorDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorMapper implements Mapper<AuthorDto, AuthorEntity>{

    @Override
    public AuthorEntity toEntity(AuthorDto s) {
        return AuthorEntity.builder()
                .id(s.getId())
                .name(s.getName())
                .age(s.getAge())
                .birthday(s.getBirthday())
                .dead(s.isDead())
                .writtenBooks(s.getWrittenBooks())
                .build();
    }

    @Override
    public AuthorDto toDto(AuthorEntity s) {
        return AuthorDto.builder()
                .id(s.getId())
                .name(s.getName())
                .age(s.getAge())
                .birthday(s.getBirthday())
                .dead(s.isDead())
                .writtenBooks(s.getWrittenBooks())
                .build();
    }
}
