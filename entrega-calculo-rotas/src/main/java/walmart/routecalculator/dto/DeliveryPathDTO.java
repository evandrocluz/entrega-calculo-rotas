package walmart.routecalculator.dto;

/**
 * Classe de transferencia de dados do caminho.
 * @author Evandro da cunha luz.
 */
public class DeliveryPathDTO {

	/**
	 * Origem para entrega.
	 */
	private LocalDto origem;

	/**
	 * Destino da entrega.
	 */
	private LocalDto destino;

	/**
	 * Valor de custo da entrega.
	 */
	private Double custo;

	/**
	 * Construtor default.
	 */
    public DeliveryPathDTO(){
    	super();
    }

    /**
     * Contrutor com definição dos atributos.
     * @param origem origem da entrega
     * @param destino destino da entrega
     * @param custo valor da entrega
     */
	public DeliveryPathDTO(LocalDto origem, LocalDto destino, Double custo){
		 this.origem = origem;
		 this.destino = destino;
		 this.custo = custo;
	}

	/**
	 * Obtem da origem da entrega
	 * @return origem
	 */
	public LocalDto getOrigem() {
		return origem;
	}

	/**
	 * Define a origem da entrega
	 * @param origem
	 */
	public void setOrigem(LocalDto origem) {
		this.origem = origem;
	}

	/**
	 * Obtem o destino da entrega
	 * @return destino
	 */
	public LocalDto getDestino() {
		return destino;
	}

	/**
	 * Define o destino da entrega
	 * @param destino
	 */
	public void setDestino(LocalDto destino) {
		this.destino = destino;
	}

	/**
	 * Obtem o valor da entrega
	 * @return custo
	 */
	public Double getCusto() {
		return custo;
	}

	/**
	 * Define o valor da entrega
	 * @param custo
	 */
	public void setCusto(Double custo) {
		this.custo = custo;
	}



}
