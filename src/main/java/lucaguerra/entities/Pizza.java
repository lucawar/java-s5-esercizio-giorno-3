package lucaguerra.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lucaguerra.Enum.PizzaSize;
import lucaguerra.Interface.IElementiMenu;

@AllArgsConstructor
@Getter
@Setter

public class Pizza extends AbstractProdotti implements IElementiMenu {

	private double kcal;
	private PizzaSize pizzaSize;

	public Pizza(String nome, double prezzo, double kcal) {
		super(nome, prezzo);
		this.kcal = kcal;

	}

	public String getMenu() {
		return this.getNome() + " - kcal: " + kcal + " - prezzo: " + this.getPrezzo();
	}

	@Override
	public String getName() {

		return this.getName();
	}

	@Override
	public Double getPrice() {

		return this.getPrice();
	}

	@Override
	public Double getCalorie() {

		return this.getCalorie();
	}
}
