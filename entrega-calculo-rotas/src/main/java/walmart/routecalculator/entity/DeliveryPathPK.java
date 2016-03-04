package walmart.routecalculator.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Chave composta do caminho de entrega
 * @author Evandro da cunha luz
 */
@Embeddable
public class DeliveryPathPK implements java.io.Serializable {

	/**
	 * Versao da serializacao da classe
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Caminho origem da entrega
	 */
	@Column(name="CAMINHO_ORIGEM")
	private Long origem;

	/**
	 * Caminho destino de entrega
	 */
	@Column(name="CAMINHO_DESTINO")
	private Long destino;

	public Long getOrigem() {
		return origem;
	}

	public void setOrigem(Long origem) {
		this.origem = origem;
	}

	public Long getDestino() {
		return destino;
	}

	public void setDestino(Long destino) {
		this.destino = destino;
	}




}
