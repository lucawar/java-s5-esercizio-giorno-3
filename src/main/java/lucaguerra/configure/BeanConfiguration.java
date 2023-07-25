package lucaguerra.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lucaguerra.entities.ChinottoDrink;
import lucaguerra.entities.ColaDrink;
import lucaguerra.entities.Drink;
import lucaguerra.entities.FantaDrink;
import lucaguerra.entities.Franchise;
import lucaguerra.entities.Maglietta;
import lucaguerra.entities.Menu;
import lucaguerra.entities.PIzzaSalame;
import lucaguerra.entities.Pizza;
import lucaguerra.entities.PizzaGricia;
import lucaguerra.entities.PizzaMargherita;
import lucaguerra.entities.Tazza;
import lucaguerra.entities.Topping;
import lucaguerra.entities.ToppingCipolla;
import lucaguerra.entities.ToppingProsciutto;
import lucaguerra.entities.ToppingSalame;
import lucaguerra.entities.toppingCheese;

@Configuration
public class BeanConfiguration {

	@Bean
	String getMessage() {
		return "Forza Roma";
	}

	@Bean
	public Menu menu() {

		Menu menu = new Menu();

		// AGGIUNGO PIZZE AL MENU
		menu.getMenuPizza().add(margherita());
		menu.getMenuPizza().add(milanese());
		menu.getMenuPizza().add(gricia());

		// AGGIUNGO TOPPING AL MENU
		menu.getMenuTopping().add(cheese());
		menu.getMenuTopping().add(cipolla());
		menu.getMenuTopping().add(prosciutto());
		menu.getMenuTopping().add(salame());

		// AGGIUNGO DRINK AL MENU
		menu.getMenuDrink().add(colaDrink());
		menu.getMenuDrink().add(fantaDrink());
		menu.getMenuDrink().add(chinottoDrink());
		// AGGIUNGO FRANCHISE AL MENU
		menu.getMenuFranchise().add(tazza());
		menu.getMenuFranchise().add(maglietta());

		return menu;

	}

	// CREAZIONE PIZZE
	@Bean
	public Pizza margherita() {
		return new PizzaMargherita();
	}

	@Bean
	public Pizza milanese() {
		return new PIzzaSalame();
	}

	@Bean
	public Pizza gricia() {
		return new PizzaGricia();
	}

	// CREAZIONE TOPPING
	public Topping cheese() {
		return new toppingCheese(null);
	}

	public Topping prosciutto() {
		return new ToppingProsciutto(null);
	}

	public Topping cipolla() {
		return new ToppingCipolla(null);
	}

	public Topping salame() {
		return new ToppingSalame(null);
	}
	// CREAZIONE DRINK

	@Bean
	public Drink colaDrink() {
		return new ColaDrink();
	}

	@Bean
	public Drink fantaDrink() {
		return new FantaDrink();
	}

	@Bean
	public Drink chinottoDrink() {
		return new ChinottoDrink();
	}

	// CREAZIONE FRANCHISE

	public Franchise tazza() {
		return new Tazza();
	}

	public Franchise maglietta() {
		return new Maglietta();
	}
}
