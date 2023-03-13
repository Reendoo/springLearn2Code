package sk.peterrendek.springLearn2Code.repositories;

import org.springframework.data.repository.CrudRepository;
import sk.peterrendek.springLearn2Code.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
