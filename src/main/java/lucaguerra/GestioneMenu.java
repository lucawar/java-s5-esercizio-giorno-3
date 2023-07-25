package lucaguerra;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;
import lucaguerra.configure.BeanConfiguration;
import lucaguerra.entities.Menu;

@Slf4j
public class GestioneMenu {

	private Menu menu;
	private AnnotationConfigApplicationContext ctx;

	public GestioneMenu() {
		ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		menu = (Menu) ctx.getBean("menu");
	}

	public void stampaMenu() {

		log.info("•MENU•");
		System.out.println();

		log.info("/PIZZE/");
		menu.getMenuPizza().forEach(p -> log.info(p.getMenu()));
		System.out.println();

		log.info("/TOPPING/");
		menu.getMenuTopping().forEach(p -> log.info(p.getMenu()));
		System.out.println();

		log.info("/DRINK/");
		menu.getMenuDrink().forEach(p -> log.info(p.getMenu()));
		System.out.println();

		log.info("/FRANCHISE/");
		menu.getMenuFranchise().forEach(p -> log.info(p.getMenu()));
		System.out.println();

	}
}
