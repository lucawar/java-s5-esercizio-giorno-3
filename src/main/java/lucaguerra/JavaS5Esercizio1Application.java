package lucaguerra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class JavaS5Esercizio1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaS5Esercizio1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				JavaS5Esercizio1Application.class);

		GestioneMenu stampa = new GestioneMenu();

		log.info("----Esercizio 1----");
		System.out.println();
		log.info((String) ctx.getBean("getMessage"));

		System.out.println();

		log.info("----Esercizio 2----");
		System.out.println();
		stampa.stampaMenu();

		ctx.close();

	}

}
