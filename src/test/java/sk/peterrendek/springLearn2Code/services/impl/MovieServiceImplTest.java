package sk.peterrendek.springLearn2Code.services.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import sk.peterrendek.springLearn2Code.model.Movie;
import sk.peterrendek.springLearn2Code.model.dto.MovieDTO;
import sk.peterrendek.springLearn2Code.services.MovieService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest


class MovieServiceImplTest {

    public static final String FIREPROOF = "Fireproof";
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
    @Test
    @Transactional
    public void moviesToServiceToDTOsIsSame() {
        Movie movie = new Movie();
        movie.setName("Fireproof");
        movie.setId(1L);

        Movie movie2 = new Movie();
        movie2.setName("Fireproof");
        movie2.setId(2L);

        List<Movie> movies = new ArrayList<>();
        movies.add(movie);
        movies.add(movie2);

//
//        Set<String> set = new HashSet<>();
//        set.add("Alex Kendrick");

       List<MovieDTO> dtos = movieService.getAllMovies();
       assertEquals(movie.getId(),dtos.get(0).getId());
       assertEquals(movie.getName(),dtos.get(0).getName());
       assertEquals(movie2.getId(),dtos.get(1).getId());
       assertEquals(movie2.getName(),dtos.get(1).getName());;

    }

    @Test
    @Transactional
    public void movieFromDBIsFireproof(){
        List<MovieDTO> moviesDTO =movieService.findMoviesByName(FIREPROOF);
        assertEquals(FIREPROOF,moviesDTO.get(0).getName());
        assertEquals(1L,moviesDTO.get(0).getId());
        assertEquals(FIREPROOF,moviesDTO.get(1).getName());
        assertEquals(2L,moviesDTO.get(1).getId());

    }



}