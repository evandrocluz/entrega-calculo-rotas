package walmart.routecalculator.entity;

import java.io.Serializable;

/**
 * Contrato para as entidades da aplicacao
 * @author Evandro da cunha luz
 *
 * @param <T> Implementacao da entidade
 */
public interface MappingEntity<T extends Serializable> {

	/**
	 * Identificacao unica da entidade
	 *
	 * @return entidade
	 */
	public T getId();

}
