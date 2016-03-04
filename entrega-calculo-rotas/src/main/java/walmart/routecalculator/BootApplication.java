package walmart.routecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Classe de execução da aplicacao via Spring Boot.
 * @author Evandro da cunha luz
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class BootApplication {

	/**
	 * Metodo main de execuçao da aplicacao
	 * @param args args
	 * @throws Exception exception
	 */
	public static void main(String[] args) throws Exception{
		SpringApplication.run(BootApplication.class, args);
	}
}
