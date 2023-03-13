package sk.peterrendek.springLearn2Code.repositories.impl;

import sk.peterrendek.springLearn2Code.model.Movie;
import sk.peterrendek.springLearn2Code.repositories.MovieRepository;
import sk.peterrendek.springLearn2Code.services.MovieService;

public class MovieServiceImpl implements MovieService {
    MovieRepository movieRepository;
    @Override
    public Movie createAddAddMovie() {
        Movie movie = new Movie();
        movie.setName("Fireproof");
        return movieRepository.save(movie);
    }
}
