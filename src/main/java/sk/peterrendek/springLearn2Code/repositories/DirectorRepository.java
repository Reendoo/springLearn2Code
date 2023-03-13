package sk.peterrendek.springLearn2Code.repositories;

import org.springframework.data.repository.CrudRepository;
import sk.peterrendek.springLearn2Code.model.Director;

public interface DirectorRepository  extends CrudRepository<Director, Long> {
}
