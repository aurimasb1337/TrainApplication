package lt.trains.repositories;

import lt.trains.models.Wagon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WagonRepository extends CrudRepository<Wagon,Long>{

}
