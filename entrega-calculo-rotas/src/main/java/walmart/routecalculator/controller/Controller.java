package walmart.routecalculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import walmart.routecalculator.dto.LocalDto;
import walmart.routecalculator.entity.DeliveryPath;
import walmart.routecalculator.entity.Locality;
import walmart.routecalculator.service.ServiceRouteCalculator;

/**
 * Classe controladora de dos servicos do rest.
 * @author Evandro da cunha luz
 *
 */
@RestController
public class Controller {

	/**
	 * Servico de calculo das rotas.
	 */
	@Autowired
	private ServiceRouteCalculator service;

	/**
	 * Mapeamento do caminho do servico de localidades.
	 *
	 * @return Lista de localidades(json).
	 */
	@RequestMapping(value="/localidades", method=RequestMethod.GET)
	public List<Locality> obterTodasLocalidades(){
		return service.obterLocalidades();
	}

	/**
	 * Mapeamento do caminho do servico de mapas.
	 *
	 * @return Lista de mapas(json).
	 */
	@RequestMapping(value="/mapas", method=RequestMethod.GET)
	public List<DeliveryPath> obterTodosOsMapas(){
		return service.obterMapas();
	}

	/**
	 * Mapeamento do caminho do servico de rotas por menor custo.
	 *
	 * @return Lista de rotas por menor custo(json).
	 */
	@RequestMapping(value="/rotas/{origem}/{destino}", method=RequestMethod.GET)
	public List<LocalDto> obterRotas(@PathVariable Long origem, @PathVariable Long destino){
		return this.service.obterRotaMenorCusto(new Locality(origem),new Locality(destino));
 	}
}
