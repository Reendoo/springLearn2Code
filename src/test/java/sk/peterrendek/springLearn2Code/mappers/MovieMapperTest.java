package sk.peterrendek.springLearn2Code.mappers;

import org.junit.jupiter.api.Test;
import sk.peterrendek.springLearn2Code.model.Movie;
import sk.peterrendek.springLearn2Code.model.dto.MovieDTO;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MovieMapperTest {


    @Test
    void movieToMovieDTOIsSame() {
        Movie movie = new Movie();
        movie.setName("Fireproof");
        movie.setId(1L);

        Set<String> set = new HashSet<>();
        set.add("Alex Kendrick");

        MovieDTO movieDTO = MovieMapper.INSTANCE.movieToMovieDTO(movie);
        assertEquals(movie.getId(),movieDTO.getId(),"should be same id");
        assertEquals(movie.getName(),movieDTO.getName(),"should be same name");
        assertArrayEquals(movie.getDirectors().toArray(), movieDTO.getDirectorsOfTheMovie().toArray(),"should be same directors");
    }
}