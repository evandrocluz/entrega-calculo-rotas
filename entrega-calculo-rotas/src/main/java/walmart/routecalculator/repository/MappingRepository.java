package walmart.routecalculator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import walmart.routecalculator.entity.DeliveryPath;
import walmart.routecalculator.entity.DeliveryPathPK;

/**
 * Repositorio do mapeamento
 * @author Evandro da cunha luz
 *
 */
@Repository
public interface MappingRepository extends CrudRepository<DeliveryPath, DeliveryPathPK>{

}
