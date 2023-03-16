package sk.peterrendek.springLearn2Code.model.dto;

import sk.peterrendek.springLearn2Code.model.Movie;

import java.util.Set;

public class DirectorDTO {
    private Long id;
    private String name;

    private Set<Movie> moviesOfTheDirector;

    public DirectorDTO() {
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

    public Set<Movie> getMoviesOfTheDirector() {
        return moviesOfTheDirector;
    }

    public void setMoviesOfTheDirector(Set<Movie> moviesOfTheDirector) {
        this.moviesOfTheDirector = moviesOfTheDirector;
    }
}
