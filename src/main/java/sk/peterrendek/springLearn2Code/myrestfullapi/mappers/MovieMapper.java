package sk.peterrendek.springLearn2Code.myrestfullapi.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import sk.peterrendek.springLearn2Code.myrestfullapi.model.Movie;
import sk.peterrendek.springLearn2Code.myrestfullapi.model.dto.MovieDTO;

@Mapper
public interface MovieMapper {
   MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

    @Mapping(target = "directorsOfTheMovie",source="directors")
    MovieDTO movieToMovieDTO(Movie movie);

    @Mapping(target = "directors",source="directorsOfTheMovie")
    Movie movieDTOToMovie(MovieDTO movieDTO);
}
