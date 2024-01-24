package mirza.SpringFramework.spring6webapp.Repositories;

import mirza.SpringFramework.spring6webapp.Domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
