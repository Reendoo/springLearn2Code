package sk.peterrendek.springLearn2Code.controllers;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
import sk.peterrendek.springLearn2Code.controllers.MovieRestController;
import sk.peterrendek.springLearn2Code.model.dto.MovieDTO;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
@Component
public class MovieResourceAssembler implements RepresentationModelAssembler<MovieDTO, EntityModel<MovieDTO>> {

    @Override
    public EntityModel<MovieDTO> toModel(MovieDTO movieDTO) {
        return EntityModel.of(movieDTO,
                linkTo(methodOn(MovieRestController.class)
                        .getMovieById(movieDTO.getId())).withSelfRel(),
                linkTo(methodOn(MovieRestController.class)
                        .getAllbyName("")).withRel("movies")
        );
    }
}
