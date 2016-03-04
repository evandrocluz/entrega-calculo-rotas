package walmart.routecalculator.entity;

/**
 * Vertice da logica de calculo de rotas
 * @author Evandro da cunha luz
 *
 */
public class Vertex {
	/**
	 * Identificador do vertex
	 */
	private String id;

	/**
	 * Nome do vertex
	 */
	private String name;

	/**
	 * Construtor default do vertex
	 */
	public Vertex(){
		super();
	}

	public Vertex(String id, String name){
		this.id = id;
		this.name = name;
	}

	public Vertex(String id){
		this.id = id;
		this.name = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vertex){
			Vertex other = (Vertex)obj;
			if(this.getId() != null){
				return this.getId().equals(other.getId());
			}
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		if(this.getId() != null){
			return this.getId().hashCode();
		}

		return super.hashCode();
	}



}
