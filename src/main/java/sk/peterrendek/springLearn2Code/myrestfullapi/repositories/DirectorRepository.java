package sk.peterrendek.springLearn2Code.myrestfullapi.repositories;

import org.springframework.data.repository.CrudRepository;
import sk.peterrendek.springLearn2Code.myrestfullapi.model.Director;

public interface DirectorRepository extends CrudRepository<Director, Long> {
}
