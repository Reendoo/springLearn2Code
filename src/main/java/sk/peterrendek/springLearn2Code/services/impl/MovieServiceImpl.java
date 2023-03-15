package sk.peterrendek.springLearn2Code.services.impl;

import org.springframework.beans.factory.support.ManagedList;
import org.springframework.stereotype.Service;
import sk.peterrendek.springLearn2Code.mappers.MovieMapper;
import sk.peterrendek.springLearn2Code.model.Movie;
import sk.peterrendek.springLearn2Code.model.dto.MovieDTO;
import sk.peterrendek.springLearn2Code.repositories.MovieRepository;
import sk.peterrendek.springLearn2Code.services.MovieService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Service(ConfigurableBeanFactory.SCOPE_PROTOTYPE) -pre kazdom volani beanu sa vytvori
@Service // je to singleton, stale sa pouziva rovnaky
public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;
    MovieMapper movieMapper;//musi byt oznaceny ako Spring beam Injecia implemetacie

    public MovieServiceImpl(MovieRepository movieRepository, MovieMapper movieMapper) { //dodanie implemetacie zo Springu
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    @Override
    public Movie createAddAddMovie() {
        Movie movie = new Movie();
        movie.setName("Fireproof");
        return movieRepository.save(movie);
    }

    @Override
    public MovieDTO getMovieById(long id) {
        return MovieMapper.INSTANCE.movieToMovieDTO(movieRepository.findById(id).orElse(null));
    }

    @Override
    public List<MovieDTO> getAllMovies() {

        return movieRepository.findAll().stream()
                .map(m -> movieMapper.movieToMovieDTO(m))
                .collect(Collectors.toList());
    }

    @Override
    public List<MovieDTO> findMoviesByName(String name) {
        return movieRepository.findMoviesByName(name).stream()
                .map(m -> movieMapper.movieToMovieDTO(m))
                .collect(Collectors.toList());
    }
}
