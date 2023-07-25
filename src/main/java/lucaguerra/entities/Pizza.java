package lucaguerra.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Getter
@Setter
@Slf4j
public class Pizza extends AbstractProdotti {

	private List<Topping> toppings = new ArrayList<>();
	private String valoreNutrizionale;
	private Topping topping;

	public Pizza(String nome, double prezzo, String valoreNutrizionale, Topping topping) {
		super(nome, prezzo);
		this.valoreNutrizionale = valoreNutrizionale;
		this.topping = topping;
	}

	public void addTopping(Topping topping) {
		toppings.add(topping);
	}

	@Override
	public String toString() {
		return " " + getNome() + " " + getPrezzo() + " " + " " + topping + getToppings() + valoreNutrizionale;
	}
}
