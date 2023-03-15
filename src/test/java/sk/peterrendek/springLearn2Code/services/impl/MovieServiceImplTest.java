package sk.peterrendek.springLearn2Code.services.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import sk.peterrendek.springLearn2Code.model.Movie;
import sk.peterrendek.springLearn2Code.model.dto.MovieDTO;
import sk.peterrendek.springLearn2Code.services.MovieService;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest


class MovieServiceImplTest {

    @Autowired
    MovieService movieService;



    @Test
    @Transactional
    public void movieToServiceToDTOIsSame() {
        Movie movie = new Movie();
        movie.setName("Fireproof");
        movie.setId(1L);
//
//        Set<String> set = new HashSet<>();
//        set.add("Alex Kendrick");

        MovieDTO movieDTO = movieService.getMovieById(1L);
        assertEquals(movie.getId(),movieDTO.getId(),"should be same id");
        assertEquals(movie.getName(),movieDTO.getName(),"should be same name");
    }
}