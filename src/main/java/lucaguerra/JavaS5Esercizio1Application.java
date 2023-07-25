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
		log.info("----Esercizio 1----");
		log.info((String) ctx.getBean("getMessage"));

		log.info("----Esercizio 2----");
		Pizza margheritaPizza = ctx.getBean("margheritaPizza", Pizza.class);
		Pizza hawaiianPizza = ctx.getBean("hawaiianPizza", Pizza.class);

		log.info("Pizza: " + margheritaPizza);
		log.info("Pizza: " + hawaiianPizza);
		log.info(ctx.getBean("colaDrink").toString());
		log.info(ctx.getBean("fantaDrink").toString());
		log.info(ctx.getBean("chinottoDrink").toString());

		ctx.close();

	}

}
