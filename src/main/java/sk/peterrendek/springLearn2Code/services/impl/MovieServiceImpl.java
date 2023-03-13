package sk.peterrendek.springLearn2Code.services.impl;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Service;
import sk.peterrendek.springLearn2Code.model.Movie;
import sk.peterrendek.springLearn2Code.repositories.MovieRepository;
import sk.peterrendek.springLearn2Code.services.MovieService;
//@Service(ConfigurableBeanFactory.SCOPE_PROTOTYPE) -pre kazdom volani beanu sa vytvori
@Service // je to singleton, stale sa pouziva rovnaky
public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;        //musi byt oznaceny ako Spring beam Injecia implemetacie

    public MovieServiceImpl(MovieRepository movieRepository) { //dodanie implemetacie zo Springu
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie createAddAddMovie() {
        Movie movie = new Movie();
        movie.setName("Fireproof");
        return movieRepository.save(movie);
    }
}
