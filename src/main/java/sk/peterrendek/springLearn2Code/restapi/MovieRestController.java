package sk.peterrendek.springLearn2Code.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.peterrendek.springLearn2Code.model.Movie;
import sk.peterrendek.springLearn2Code.repositories.MovieRepository;


import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieRestController {
   MovieRepository movieRepository;

    public MovieRestController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    @GetMapping("/movies")
    List<Movie> all(){
        return movieRepository.findAll();
    }
}
