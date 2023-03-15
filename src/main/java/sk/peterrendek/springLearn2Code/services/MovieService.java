package sk.peterrendek.springLearn2Code.services;

import sk.peterrendek.springLearn2Code.model.Movie;
import sk.peterrendek.springLearn2Code.model.dto.MovieDTO;

import java.util.List;

public interface MovieService {
    Movie createAddAddMovie();

    MovieDTO getMovieById(long id);
    List<MovieDTO> getAllMovies();
    MovieDTO findMovieByName(String name);
}
