package lucaguerra.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lucaguerra.Enum.PizzaSize;

@AllArgsConstructor
@Getter
@Setter

public class Pizza extends AbstractProdotti {

	private double kcal;
	private PizzaSize pizzaSize;
	private List<Topping> toppings;

	public Pizza(String nome, double prezzo, double kcal) {
		super(nome, prezzo);
		this.kcal = kcal;
		this.toppings = new ArrayList<>();

	}

	public void addTopping(Topping topping) {
		toppings.add(topping);
	}

	public String getMenu() {
		return this.getNome() + " - kcal: " + kcal + " - prezzo: " + this.getPrezzo();
	}

	@Override
	public String toString() {
		return this.getNome() + " -size: " + pizzaSize + " " + toppings;
	}

}
