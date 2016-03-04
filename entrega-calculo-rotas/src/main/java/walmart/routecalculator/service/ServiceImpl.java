package walmart.routecalculator.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import walmart.routecalculator.algorithm.DijkstraAlgorithm;
import walmart.routecalculator.dto.LocalDto;
import walmart.routecalculator.entity.DeliveryPath;
import walmart.routecalculator.entity.Edge;
import walmart.routecalculator.entity.MappingEntity;
import walmart.routecalculator.entity.Graph;
import walmart.routecalculator.entity.Locality;
import walmart.routecalculator.entity.Vertex;
import walmart.routecalculator.repository.LocalRepository;
import walmart.routecalculator.repository.MappingRepository;

/**
 * Implementacao do servico de calculo de rotas
 *
 * @author Evandro da cunha luz
 *
 */
@Service
public class ServiceImpl implements ServiceRouteCalculator {

	private static final String MSG_ROTA_NAO_CADSTRADA = "Rota Não Cadstrada!";

	/**
	 * Injecao do repositorio de localidade {@link LocalRepository}
	 */
	@Autowired
	private LocalRepository localidadeRepo;

	/**
	 * Injecao do repositorio de mapeamento {@link MappingRepository}
	 */
	@Autowired
	private MappingRepository mapaRepository;

	@Override
	public void add(Locality pLocalidade) {
		this.localidadeRepo.save(pLocalidade);
	}

	@Override
	public void add(DeliveryPath pRota) {
		this.mapaRepository.save(pRota);

	}

	@Override
	public void delete(Locality pLocalidade) {
		this.localidadeRepo.delete(pLocalidade.getId());
	}

	@Override
	public void delete(DeliveryPath pRota) {
		this.mapaRepository.delete(pRota.getId());
	}

	/**
	 * Obtem a rota por menor custo
	 *
	 * @param pOrigem
	 *            origem da localidade
	 * @param pDestino
	 *            origem do destino
	 */
	@Override
	public List<LocalDto> obterRotaMenorCusto(Locality pOrigem,
			Locality pDestino) {
		DijkstraAlgorithm dijkstraAlgorithm = this.getDijkstraAlgorithm();
		List<LocalDto> lRotas = new ArrayList<LocalDto>();

		pOrigem = this.localidadeRepo.findOne(pOrigem.getId());
		pDestino = this.localidadeRepo.findOne(pDestino.getId());

		if (pOrigem == null || pDestino == null) {
			lRotas.add(new LocalDto(0L, MSG_ROTA_NAO_CADSTRADA));
		} else {
			dijkstraAlgorithm.execute(new Vertex(pOrigem.getId().toString(),
					pOrigem.getDescricao()));

			LinkedList<Vertex> paths = dijkstraAlgorithm.getPath(new Vertex(
					pDestino.getId().toString(), pDestino.getDescricao()));

			if (paths != null && !paths.isEmpty()) {

				for (Vertex lVertex : paths) {
					lRotas.add(new LocalDto(Long.valueOf(lVertex.getId()),
							lVertex.getName()));
				}
			}

		}

		return lRotas;
	}

	@Override
	public List<Locality> obterLocalidades() {
		return obterLista(this.localidadeRepo.findAll());
	}

	@Override
	public List<DeliveryPath> obterMapas() {
		return obterLista(this.mapaRepository.findAll());

	}

	public static <T extends MappingEntity<? extends java.io.Serializable>> List<T> obterLista(
			Iterable<T> it) {

		List<T> lRetorno = new ArrayList<T>();
		if (it != null) {
			Iterator<T> lIt = it.iterator();
			while (lIt.hasNext()) {
				lRetorno.add(lIt.next());
			}
		}

		return lRetorno;
	}

	/**
	 * Obtem o algoritmo de calculo de rotas
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public DijkstraAlgorithm getDijkstraAlgorithm() {
		DijkstraAlgorithm dijkstra = null;

		List<Locality> lLocalidades = obterLista(this.localidadeRepo.findAll());
		List<DeliveryPath> lMapas = obterLista(this.mapaRepository.findAll());

		Long lEdgeId = 1L;
		Vertex lVertice = null;

		if (lLocalidades != null && !lLocalidades.isEmpty()) {
			Map<Long, Vertex> lMapVertices = new HashMap<Long, Vertex>(
					lLocalidades.size());
			List<Edge> lEdges = new ArrayList<Edge>(lMapas.size());

			for (Locality lLocalidade : lLocalidades) {
				lVertice = new Vertex(lLocalidade.getId().toString(),
						lLocalidade.getDescricao());
				lMapVertices.put(lLocalidade.getId(), lVertice);
			}

			for (DeliveryPath lMapa : lMapas) {
				lEdges.add(new Edge((lEdgeId++).toString(), lMapVertices
						.get(lMapa.getId().getOrigem()), lMapVertices.get(lMapa
						.getId().getDestino()), lMapa.getCusto()));
			}

			Graph graph = new Graph(
					new ArrayList<Vertex>(lMapVertices.values()), lEdges);

			dijkstra = new DijkstraAlgorithm(graph);

		} else {
			dijkstra = new DijkstraAlgorithm(new Graph(Collections.EMPTY_LIST,
					Collections.EMPTY_LIST));
		}

		return dijkstra;
	}

}
