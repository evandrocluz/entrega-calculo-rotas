package walmart.routecalculator.entity;

/**
 * Edge do grafo de origem, custo e destino
 * @author Evandro da cunha luz
 */
public class Edge {
	/**
	 * Identificador do edge
	 */
	private final String id;

	/**
	 * Vertex da fonte no grafo
	 */
	private final Vertex source;

	/**
	 * Vertex do destino no grafo
	 */
	private final Vertex destination;

	/**
	 * Valor de profundidade do Edge do grafo
	 */
	private final Double weight;

	/**
	 * Construtor com definicao dos atributos
	 * @param id identificador
	 * @param source fonte da entrega
	 * @param destination destino de entrega
	 * @param weight profundidade do Edge do grafo
	 */
	public Edge(String id, Vertex source, Vertex destination, Double weight) {
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	public String getId() {
		return id;
	}

	public Vertex getDestination() {
		return destination;
	}

	public Vertex getSource() {
		return source;
	}

	public Double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return source + " " + destination;
	}

}
