package sk.peterrendek.springLearn2Code.services;

import sk.peterrendek.springLearn2Code.model.Movie;
import sk.peterrendek.springLearn2Code.model.dto.MovieDTO;

import java.util.List;

public interface MovieService {
    Movie createAndAddMovie();
    List<Movie> createAndAddMovies();

    MovieDTO getMovieById(long id);
    List<MovieDTO> getAllMovies();
    List <MovieDTO> getMoviesByName(String name);

    Movie createAndAddMovieFinal(String filmName, String ... directorNames);

    MovieDTO addMovie(MovieDTO movieDTO);

    MovieDTO updateMovie(MovieDTO movieDTO, long id);

    void deleteById(long id);
}
