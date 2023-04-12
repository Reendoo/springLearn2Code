package sk.peterrendek.springLearn2Code.myrestfullapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.peterrendek.springLearn2Code.myrestfullapi.model.Movie;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByName(String name);
}
