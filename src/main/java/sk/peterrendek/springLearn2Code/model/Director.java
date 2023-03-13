package sk.peterrendek.springLearn2Code.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;
@Entity
public class Director {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "directors")
    private Set<Movie> directors = new HashSet<>();

    public Director() {
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

    public Set<Movie> getDirectors() {
        return directors;
    }

    public void setDirectors(Set<Movie> directors) {
        this.directors = directors;
    }
}
