package lucaguerra.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class Pizza extends AbstractProdotti {

	private double kcal;

	public Pizza(String nome, double prezzo, double kcal) {
		super(nome, prezzo);
		this.kcal = kcal;

	}

	public String getMenu() {
		return this.getNome() + " - kcal: " + kcal + " - prezzo: " + this.getPrezzo();
	}
}
