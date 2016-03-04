package walmart.routecalculator.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Tabela de dados do caminho da entrega.
 * @author Evandro da cunha luz
 */
@Entity
@Table(name = "CAMINHO")
public class DeliveryPath implements MappingEntity<DeliveryPathPK> {

	/**
	 * Identificador unico do caminho da entrega
	 */
	@EmbeddedId
	private DeliveryPathPK id;

	/**
	 * Localidade origem da entrega
	 */
	@ManyToOne
	@JoinColumn(name="CAMINHO_ORIGEM",insertable= false, updatable=false)
	private Locality origem;

	/**
	 * Localidade destino da entrega
	 */
	@ManyToOne
	@JoinColumn(name="CAMINHO_DESTINO",insertable= false, updatable=false)
	private Locality destino;

	/**
	 * Valor do custo da entrega
	 */
	@Column(name="CUSTO")
	private Double custo;

	public DeliveryPathPK getId() {
		return id;
	}

	public void setId(DeliveryPathPK id) {
		this.id = id;
	}

	public Locality getOrigem() {
		return origem;
	}

	public void setOrigem(Locality origem) {
		this.origem = origem;
	}

	public Locality getDestino() {
		return destino;
	}

	public void setDestino(Locality destino) {
		this.destino = destino;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}


}
