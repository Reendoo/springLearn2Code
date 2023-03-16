package sk.peterrendek.springLearn2Code.services.impl;

import org.springframework.stereotype.Service;
import sk.peterrendek.springLearn2Code.mappers.MovieMapper;
import sk.peterrendek.springLearn2Code.model.Director;
import sk.peterrendek.springLearn2Code.model.Movie;
import sk.peterrendek.springLearn2Code.model.dto.MovieDTO;
import sk.peterrendek.springLearn2Code.repositories.DirectorRepository;
import sk.peterrendek.springLearn2Code.repositories.MovieRepository;
import sk.peterrendek.springLearn2Code.services.MovieService;

import java.util.*;
import java.util.stream.Collectors;

//@Service(ConfigurableBeanFactory.SCOPE_PROTOTYPE) -pre kazdom volani beanu sa vytvori
@Service // je to singleton, stale sa pouziva rovnaky
public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;
    DirectorRepository directorRepository;
    MovieMapper movieMapper;//musi byt oznaceny ako Spring beam Injecia implemetacie

    public MovieServiceImpl(MovieRepository movieRepository, MovieMapper movieMapper, DirectorRepository directorRepository) { //dodanie implemetacie zo Springu
        this.movieRepository = movieRepository;
        this.directorRepository = directorRepository;
        this.movieMapper = movieMapper;
    }

    @Override
    public Movie createAndAddMovie() {
        Movie movie = new Movie();
        movie.setName("Fireproof");
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> createAndAddMovies() {
        List<Movie> movies = new ArrayList<>();
        Movie movie = new Movie();
        movie.setName("Fireproof");
        movies.add(movieRepository.save(movie));

        movie = new Movie();
        movie.setName("Fireproof");
        movies.add(movieRepository.save(movie));

        movie = new Movie();
        movie.setName("JaBADABO");
        movies.add(movieRepository.save(movie));
        return movies;
    }

    @Override
    public MovieDTO getMovieById(long id) {
        return movieMapper.movieToMovieDTO(movieRepository.findById(id).orElse(null));
    }

    @Override
    public List<MovieDTO> getAllMovies() {
        return movieRepository.findAll().stream().map(movieMapper::movieToMovieDTO).collect(Collectors.toList());
    }

    @Override
    public List<MovieDTO> getMoviesByName(String name) {
        return movieRepository.findByName(name).stream().map(movieMapper::movieToMovieDTO).collect(Collectors.toList());
    }

    @Override
    public Movie createAndAddMovieFinal(String filmName, String... directorNames) {
        Movie movie = new Movie();
        movie.setName(filmName);
        movie = movieRepository.save(movie);
        Set<Director> directors = new HashSet<>();
        for (var v : directorNames) {
            Director d = new Director();
            d.setName(v);
            d.addMovie(movie);
            directors.add(directorRepository.save(d));
        }
        movie.setDirectors(directors);
        return movieRepository.save(movie);
    }

    @Override
    public MovieDTO addMovie(MovieDTO movieDTO) {
        return movieMapper.movieToMovieDTO(movieRepository.save(movieMapper.movieDTOToMovie(movieDTO)));
    }

    @Override
    public MovieDTO updateMovie(MovieDTO movieDTO, long id) {
        return movieMapper.movieToMovieDTO(
        movieRepository.findById(id).map(movie -> {
                    movie.setName(movieDTO.getName());
                    movie.setDirectors(movieDTO.getDirectorsOfTheMovie());
                    return movieRepository.save(movie);
                }
        ).orElseGet(() -> {
            movieDTO.setId(id);
            return movieRepository.save(movieMapper.movieDTOToMovie(movieDTO));
        }
        ));
    }

    @Override
    public void deleteById(long id) {
        movieRepository.deleteById(id);
    }
}
