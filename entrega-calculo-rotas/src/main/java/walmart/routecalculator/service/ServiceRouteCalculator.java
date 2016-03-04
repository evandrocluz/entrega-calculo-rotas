package walmart.routecalculator.service;

import java.util.List;

import walmart.routecalculator.dto.LocalDto;
import walmart.routecalculator.entity.DeliveryPath;
import walmart.routecalculator.entity.Locality;

/**
 * Contrato do servico de calculo de rotas
 * @author Evandro da cunha luz
 */
public interface ServiceRouteCalculator {

	/**
	 * Adiciona a localidade do mapa
	 *
	 * @param pLocalidade localidade
	 */
	public void add(Locality pLocalidade);

	/**
	 * Adiciona o caminho da rota
	 * @param pRota rota
	 */
 	public void add(DeliveryPath pRota);

 	/**
 	 * remove a lolcalidade do mapa
 	 * @param pLocalidade localidade
 	 */
	public void delete(Locality pLocalidade);

	/**
	 * remove o caminho da rota
	 * @param pRota rota
	 */
 	public void delete(DeliveryPath pRota);

 	/**
 	 * Obtem a lista de localidades do mapa
 	 * @return List<Localidade> localidades
 	 */
 	public List<Locality> obterLocalidades();

 	/**
 	 * Obtem a lista de caminhos do mapa
 	 * @return List<Caminho> lista de caminhos do mapa
 	 */
 	public List<DeliveryPath> obterMapas();

 	/**
 	 * Obtem a lista de rotas de menor custo
 	 * @param pOrigem origem da localidade de entrega
 	 * @param pDestino destino da localidade de entrega
 	 */
 	public List<LocalDto> obterRotaMenorCusto(Locality pOrigem, Locality pDestino);

}
