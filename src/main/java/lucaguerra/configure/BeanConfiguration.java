package lucaguerra.configure;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lucaguerra.Enum.StatoTavolo;
import lucaguerra.entities.ChinottoDrink;
import lucaguerra.entities.ColaDrink;
import lucaguerra.entities.Drink;
import lucaguerra.entities.FantaDrink;
import lucaguerra.entities.Franchise;
import lucaguerra.entities.Maglietta;
import lucaguerra.entities.Menu;
import lucaguerra.entities.Ordine;
import lucaguerra.entities.PIzzaSalame;
import lucaguerra.entities.Pizza;
import lucaguerra.entities.PizzaGricia;
import lucaguerra.entities.PizzaMargherita;
import lucaguerra.entities.Tavolo;
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
		return "FORZA ROMA";
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
	@Bean
	public Topping cheese() {
		return new toppingCheese();
	}

	@Bean
	public Topping prosciutto() {
		return new ToppingProsciutto();
	}

	@Bean
	public Topping cipolla() {
		return new ToppingCipolla();
	}

	@Bean
	public Topping salame() {
		return new ToppingSalame();
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
	@Bean
	public Franchise tazza() {
		return new Tazza();
	}

	@Bean
	public Franchise maglietta() {
		return new Maglietta();
	}

	// CREAZIONE PIZZE PERSONALIZZATE
//	@Bean
//	public Pizza margheritaToppingCheese() {
//		Pizza margherita = new Pizza("Margherita", 8.99, 180);
//		margherita.setPizzaSize(PizzaSize.STANDARD);
//		margherita.addTopping(new Topping("Cheese", 1.5, 50d));
//		return margherita;
//	}

	// CREAZIONE TAVOLI
	@Bean
	Tavolo tavolo1() {
		return new Tavolo(StatoTavolo.OCCUPATO, 1, 4);
	}

	@Bean
	Tavolo tavolo2() {
		return new Tavolo(StatoTavolo.LIBERO, 2, 4);
	}

	@Bean
	Tavolo tavolo3() {
		return new Tavolo(StatoTavolo.OCCUPATO, 3, 5);
	}

	@Bean
	Tavolo tavolo4() {
		return new Tavolo(StatoTavolo.OCCUPATO, 4, 2);
	}

	// CREAZIONE ORDINI

	@Bean
	Ordine ordine1() {
		Ordine ordine = new Ordine(1, "Pizza più alta", tavolo1(), 4, LocalDate.now());
		ordine.getListaPizza().add(margherita());
		ordine.getListaPizza().add(margherita());
		ordine.getListaPizza().add(milanese());
		ordine.getListaPizza().add(gricia());
		ordine.getListaDrink().add(colaDrink());
		ordine.getListaDrink().add(colaDrink());
		ordine.getListaDrink().add(colaDrink());
		ordine.getListaDrink().add(colaDrink());
		return ordine;
	}

	@Bean
	Ordine ordine2() {
		Ordine ordine = new Ordine(2, "Portiamo torta compleanno", tavolo3(), 5, LocalDate.now());
		ordine.getListaPizza().add(margherita());
		ordine.getListaPizza().add(margherita());
		ordine.getListaPizza().add(milanese());
		ordine.getListaPizza().add(gricia());
		ordine.getListaPizza().add(gricia());
		ordine.getListaDrink().add(colaDrink());
		ordine.getListaDrink().add(colaDrink());
		ordine.getListaDrink().add(colaDrink());
		ordine.getListaDrink().add(colaDrink());
		ordine.getListaDrink().add(chinottoDrink());
		return ordine;
	}

	@Bean
	Ordine ordine3() {
		Ordine ordine = new Ordine(3, "1 persona allergica agli arachidi", tavolo4(), 2, LocalDate.now());
		ordine.getListaPizza().add(gricia());
		ordine.getListaPizza().add(margherita());
		ordine.getListaDrink().add(fantaDrink());
		ordine.getListaDrink().add(colaDrink());

		return ordine;
	}

}
