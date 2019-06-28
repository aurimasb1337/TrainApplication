package lt.trains.repositories;
import lt.trains.models.Train;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;





@Repository
public interface TrainRepository extends CrudRepository<Train,Long>{

}
