package mirza.SpringFramework.spring6webapp.Repositories;

import mirza.SpringFramework.spring6webapp.Domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
