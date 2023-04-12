package sk.peterrendek.springLearn2Code.myrestfullapi.controllers;

import org.jetbrains.annotations.NotNull;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
import sk.peterrendek.springLearn2Code.myrestfullapi.model.dto.MovieDTO;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
@Component
public class MovieResourceAssembler implements RepresentationModelAssembler<MovieDTO, EntityModel<MovieDTO>> {

    @Override
    public @NotNull EntityModel<MovieDTO> toModel(@NotNull MovieDTO movieDTO) {
        return EntityModel.of(movieDTO,
                linkTo(methodOn(MovieRestController.class)
                        .getMovieById(movieDTO.getId())).withSelfRel(),
                linkTo(methodOn(MovieRestController.class)
                        .getAllbyName("")).withRel("movies")
        );
    }
}
