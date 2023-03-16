package sk.peterrendek.springLearn2Code.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import sk.peterrendek.springLearn2Code.model.Director;
import sk.peterrendek.springLearn2Code.model.dto.DirectorDTO;


@Mapper
public interface DirectorMapper {
    DirectorMapper INSTANCE = Mappers.getMapper(DirectorMapper.class);
    @Mapping(target = "moviesOfTheDirector",source="movies")
    DirectorDTO movieToMovieDTO(Director director);
}

