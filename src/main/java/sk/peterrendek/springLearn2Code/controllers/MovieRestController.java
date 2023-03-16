package sk.peterrendek.springLearn2Code.controllers;



import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;
import sk.peterrendek.springLearn2Code.model.dto.MovieDTO;
import sk.peterrendek.springLearn2Code.services.impl.MovieServiceImpl;
import org.springframework.hateoas.RepresentationModel;


import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
@RequestMapping("/myapi")
public class MovieRestController extends EntityModel   {
    MovieServiceImpl movieService;
    MovieResourceAssembler movieResourceAssembler;

    public MovieRestController(MovieServiceImpl movieService,MovieResourceAssembler movieResourceAssembler) {
        this.movieService = movieService;
        this.movieResourceAssembler=movieResourceAssembler;
    }

    @GetMapping("/movies/{id}")
    EntityModel<MovieDTO> getMovieById(@PathVariable long id) {
        MovieDTO movieDTO = movieService.getMovieById(id);
        return movieResourceAssembler.toModel(movieDTO);

//        EntityModel<MovieDTO> resource = EntityModel.of(movieDTO);
//        Link link = linkTo(methodOn(this.getClass()).getMovieById(id)).withSelfRel();
//        Link lin2 = linkTo(methodOn(this.getClass()).getAllbyName("")).withRel("movies");
//        resource.add(link);
//        resource.add(lin2);
//        return resource;


//        return EntityModel.of(movieDTO,
//                linkTo(methodOn(MovieRestController.class).getMovieById(id)).withSelfRel(),
//                linkTo(methodOn(MovieRestController.class).getAllbyName("")).withRel("movies")
//        );












    }




    @GetMapping("/movies")
    List<MovieDTO> getAllbyName(@RequestParam(required = false) String name) {
        if (name != null && !name.isEmpty()) {
            return movieService.getMoviesByName(name);
        } else {
            return movieService.getAllMovies();
        }
    }

    @PostMapping("/movies")
    MovieDTO addMovie(@RequestBody MovieDTO movieDTO) {
        return movieService.addMovie(movieDTO);
    }

    @PutMapping("/movies/{id}")
    EntityModel<MovieDTO> updateMovie(@RequestBody MovieDTO movieDTO, @PathVariable long id) {
        MovieDTO d =movieService.updateMovie(movieDTO, id);
        return movieResourceAssembler.toModel(d);
    }

    @DeleteMapping("/movies/{id}")
    void deleteById(@PathVariable long id) {
        movieService.deleteById(id);
    }


}
