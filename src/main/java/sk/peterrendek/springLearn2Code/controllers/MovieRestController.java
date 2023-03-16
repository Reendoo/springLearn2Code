package sk.peterrendek.springLearn2Code.controllers;

import org.springframework.web.bind.annotation.*;
import sk.peterrendek.springLearn2Code.model.dto.MovieDTO;
import sk.peterrendek.springLearn2Code.services.impl.MovieServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/myapi")
public class MovieRestController {
    MovieServiceImpl movieService;

    public MovieRestController(MovieServiceImpl movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies/{id}")
    MovieDTO getMovieById(@PathVariable long id){
        return movieService.getMovieById(id);
    }
//    @GetMapping("/movies")
//    List<MovieDTO> getAll(){
//        return movieService.getAllMovies();
//    }

    @GetMapping("/movies")
    List<MovieDTO> getAllbyName(@RequestParam(required = false) String name){
        if(name!=null && !name.isEmpty()){
            return movieService.getMoviesByName(name);
        }else{
            return movieService.getAllMovies();
        }

    }

}
