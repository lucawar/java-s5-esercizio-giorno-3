package lucaguerra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;
import lucaguerra.entities.Pizza;

@SpringBootApplication
@Slf4j

public class JavaS5Esercizio1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaS5Esercizio1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				JavaS5Esercizio1Application.class);

		GestioneMenu stampa = new GestioneMenu();

		System.out.println();
		log.info("----ESERCIZIO 1----");
		System.out.println();
		log.info((String) ctx.getBean("getMessage"));
		System.out.println();

		log.info("----ESERCIZIO 2----");
		System.out.println();
		stampa.stampaMenu();
		System.out.println();

		log.info("/PERSONALIZZA LA TUA PIZZA/");
		Pizza pizza1 = (Pizza) ctx.getBean("margheritaToppingCheese");
		log.info("Pizza 1: " + pizza1.toString());

		ctx.close();

	}
}
