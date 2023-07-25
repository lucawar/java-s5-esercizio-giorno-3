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
public class Topping extends AbstractProdotti {

	private List<Topping> comboToppings;

	public Topping(String nome, double prezzo) {
		super(nome, prezzo);
		comboToppings = new ArrayList<>();
	}

	public void aggiungiCombinazioneTopping(Topping topping) {
		comboToppings.add(topping);
	}

}
