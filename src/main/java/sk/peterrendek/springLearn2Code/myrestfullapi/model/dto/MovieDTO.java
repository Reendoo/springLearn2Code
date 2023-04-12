package sk.peterrendek.springLearn2Code.myrestfullapi.model.dto;

import sk.peterrendek.springLearn2Code.myrestfullapi.model.Director;

import java.util.HashSet;
import java.util.Set;


public class MovieDTO {
    private Long id;
    private String name;
    private Set<Director> directorsOfTheMovie = new HashSet<>();

    public MovieDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Director> getDirectorsOfTheMovie() {
        return directorsOfTheMovie;
    }

    public void setDirectorsOfTheMovie(Set<Director> directorsOfTheMovie) {
        this.directorsOfTheMovie = directorsOfTheMovie;
    }
}
