package sk.peterrendek.springLearn2Code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sk.peterrendek.springLearn2Code.model.Movie;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findMoviesByName(String name);
}
