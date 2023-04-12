package sk.peterrendek.springLearn2Code.services.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import sk.peterrendek.springLearn2Code.myrestfullapi.model.Movie;
import sk.peterrendek.springLearn2Code.myrestfullapi.model.dto.MovieDTO;
import sk.peterrendek.springLearn2Code.myrestfullapi.services.MovieService;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MovieServiceImplTest {
    private final MovieService movieService;
    @Autowired
    MovieServiceImplTest(MovieService movieService) {
        this.movieService = movieService;
    }

    @Test
    @Transactional
    public void movieToServiceToDTOIsSame() {
        Movie movie = new Movie();
        movie.setName("Fireproof");
        movie.setId(1L);
        MovieDTO movieDTO = movieService.getMovieById(1L);
        assertEquals(movie.getId(),movieDTO.getId(),"should be same id");
        assertEquals(movie.getName(),movieDTO.getName(),"should be same name");
    }
}