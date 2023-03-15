package sk.peterrendek.springLearn2Code.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import sk.peterrendek.springLearn2Code.model.Movie;
import sk.peterrendek.springLearn2Code.model.dto.MovieDTO;

import java.util.List;

@Mapper
public interface MovieMapper {
    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

    @Mapping(target = "directorsOfTheMovie",source="directors")
    MovieDTO movieToMovieDTO(Movie movie);


}
