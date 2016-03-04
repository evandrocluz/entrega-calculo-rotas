package walmart.routecalculator.entity;

import java.util.List;

/**
 * Grafo da logica de calculo de rotas
 * @author Evandro da cunha luz
 *
 */
public class Graph {
	/**
	 * Lista de vertexes de calculo de rotas
	 */
	private final List<Vertex> vertexes;

	/**
	 * Lista de edges de calculo de rotas
	 */
	private final List<Edge> edges;

	/**
	 * Construtor do grafo da logica de calculo de rotas
	 * @param vertexes lista de vertexes
	 * @param edges lista de edges
	 */
	public Graph(List<Vertex> vertexes, List<Edge> edges) {
		this.vertexes = vertexes;
		this.edges = edges;
	}

	/**
	 * Obtem a lista de vertexes
	 * @return vertexes
	 */
	public List<Vertex> getVertexes() {
		return vertexes;
	}

	/**
	 * Obtem a lista de edges
	 * @return edges
	 */
	public List<Edge> getEdges() {
		return edges;
	}
}
