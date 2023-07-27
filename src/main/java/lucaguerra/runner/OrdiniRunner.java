package lucaguerra.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import lucaguerra.configure.BeanConfiguration;
import lucaguerra.entities.Drink;
import lucaguerra.entities.Ordine;
import lucaguerra.entities.Pizza;

@Component
@Slf4j
@Order(1)
public class OrdiniRunner implements CommandLineRunner {

	private Ordine ordine1;
	private Ordine ordine2;
	private Ordine ordine3;

	private AnnotationConfigApplicationContext ctx;

	public OrdiniRunner() {
		ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		ordine1 = (Ordine) ctx.getBean("ordine1");
		ordine2 = (Ordine) ctx.getBean("ordine2");
		ordine3 = (Ordine) ctx.getBean("ordine3");

		ctx.close();
	}

	@Override
	public void run(String... args) throws Exception {

		stampaOrdine(ordine1);
		stampaOrdine(ordine2);
		stampaOrdine(ordine3);

	}

	private void stampaOrdine(Ordine ordine) {
		System.out.println();
		log.info("/ORDINE/");
		System.out.println();
		log.info("Numero ordine: " + ordine.getNumeroOrdine());
		log.info("Data: " + ordine.getOraAcquisto());
		log.info("Tavolo: " + ordine.getTavolo().getNumeroTavolo());
		log.info("Coperti: " + ordine.getNumeroPersone());
		log.info("Nota: " + ordine.getNota());

		log.info("Pizze:");
		for (Pizza pizza : ordine.getListaPizza()) {
			log.info("- " + pizza.getNome() + "  " + pizza.getPrezzo() + "$");
		}

		log.info("Drink:");
		for (Drink drink : ordine.getListaDrink()) {
			log.info("- " + drink.getNome() + " " + drink.getPrezzo() + "$");
		}

		double totale = ordine.contoTotaleOrdine();
		System.out.println();
		log.info("Conto Totale: " + totale + " $");
	}
}
