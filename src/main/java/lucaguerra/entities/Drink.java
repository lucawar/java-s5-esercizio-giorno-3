package lucaguerra.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lucaguerra.Interface.IElementiMenu;

@NoArgsConstructor
@Getter
@Setter

public class Drink extends AbstractProdotti implements IElementiMenu {

	private double kcal;

	public Drink(String nome, double prezzo, double kcal) {
		super(nome, prezzo);
		this.kcal = kcal;
	}

	public String getMenu() {
		return this.getNome() + " - kcal: " + kcal + " - prezzo: " + this.getPrezzo();
	}

	@Override
	public String getName() {

		return this.getMenu();
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
