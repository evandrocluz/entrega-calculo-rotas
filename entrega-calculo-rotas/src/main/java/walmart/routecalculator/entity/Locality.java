package walmart.routecalculator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidade da Localidade do mapa
 * @author Evandro da cunha luz
 */
@Entity
@Table(name="LOCALIDADE")
public class Locality implements MappingEntity<Long>{

	/**
	 * Identificador unico da entidade
	 */
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	/**
	 * Descricao da localidade
	 */
	@Column(name="DESCRICAO")
	private String descricao;

	/**
	 * Construtor default da entidade
	 */
	public Locality(){
		super();
	}

	public Locality(Long id){
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
