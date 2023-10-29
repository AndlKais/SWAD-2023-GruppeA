package at.fhbfi.pit.jpabookauthor.service.mapper;

import at.fhbfi.pit.jpabookauthor.persistence.AuthorEntity;
import at.fhbfi.pit.jpabookauthor.service.dto.AuthorDto;


public class AuthorMapper implements Mapper<AuthorDto, AuthorEntity>{

    @Override
    public AuthorEntity toEntity(AuthorDto s) {
        return null;
    }

    @Override
    public AuthorDto toDto(AuthorEntity s) {
        return null;
    }
}
