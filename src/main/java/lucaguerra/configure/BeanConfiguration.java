package lucaguerra.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lucaguerra.entities.Drink;
import lucaguerra.entities.Pizza;
import lucaguerra.entities.Topping;

@Configuration
public class BeanConfiguration {

	@Bean
	String getMessage() {
		return "Forza Roma";
	}

	// CREAZIONE TOPPING
	@Bean
	public Topping margherita() {
		Topping topMargherita = new Topping("pomodoro, mozzarella", 0.50);
		return topMargherita;
	}

	// CREAZIONE PIZZE
	@Bean
	public Pizza margheritaPizza() {
		Pizza pizza = new Pizza("Margherita", 8.99, "kcl 500", margherita());
		return pizza;
	}

	@Bean
	public Pizza hawaiianPizza() {
		Pizza pizza = new Pizza("Hawaiian", 10.99, "kcl 600", margherita());
		pizza.addTopping(new Topping("Prosciutto cotto", 1.00));
		pizza.addTopping(new Topping("Ananas", 1.00));
		return pizza;
	}

	// CREAZIONE DRINK
	@Bean
	public Drink colaDrink() {
		return new Drink("Coca-Cola", 1.99, "kcl 150");
	}

	@Bean
	public Drink fantaDrink() {
		return new Drink("Fanta", 1.99, "kcl 150");
	}

	@Bean
	public Drink chinottoDrink() {
		return new Drink("Chinotto", 1.99, "kcl 150");
	}
}
