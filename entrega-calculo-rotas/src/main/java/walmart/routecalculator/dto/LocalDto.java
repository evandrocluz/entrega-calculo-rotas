package walmart.routecalculator.dto;

/**
 * Classe de transferencia de dados do local da entrega.
 * @author Evandro da cunha luz.
 */
public class LocalDto {

	/**
	 * Identificado unico do local da entrega.
	 */
	private Long id;

	/**
	 * Descricao do local de entrega.
	 */
	private String descricao;

	/**
	 * Construtor default
	 */
	public LocalDto(){
		super();
	}

	/**
	 * Construtor com a definicao dos atributos.
	 * @param id identificador
	 * @param descricao descricao do local de entrega
	 */
	public LocalDto(Long id, String descricao){
		this.id = id;
		this.descricao = descricao;
	}

	/**
	 * Obtem o identificador do local de entrega.
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Define o identificador do local de entrega.
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Obtem a descricao da local de entrega.
	 * @return
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Define a descricao da local de entrega.
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
