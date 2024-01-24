package mirza.SpringFramework.spring6webapp.Repositories;

import mirza.SpringFramework.spring6webapp.Domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {

}
