package walmart.routecalculator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import walmart.routecalculator.entity.Locality;

/**
 * Repositorio do local de entrega
 * @author Evandro da cunha luz
 *
 */
@Repository
public interface LocalRepository extends CrudRepository<Locality,Long>{
}
