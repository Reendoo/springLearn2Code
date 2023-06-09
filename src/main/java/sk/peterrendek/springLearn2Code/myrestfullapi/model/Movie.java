package sk.peterrendek.springLearn2Code.myrestfullapi.model;

import jakarta.persistence.*;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity

public class Movie {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Set<Director> getDirectors() {
        return directors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Movie() {
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

    public void setDirectors(Set<Director> directors) {
        this.directors = directors;
    }

    @ManyToMany
    @JoinTable(name = "movie_director", joinColumns = @JoinColumn(name = "movie_id"), inverseJoinColumns = @JoinColumn(name = "director_id"))


    private Set<Director> directors = new HashSet<>();
}
