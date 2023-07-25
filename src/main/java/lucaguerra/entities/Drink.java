package lucaguerra.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Getter
@Setter
@Slf4j
public class Drink extends AbstractProdotti {

	private String valoreNutrizionale;

	public Drink(String nome, double prezzo, String valoreNutrizionale) {
		super(nome, prezzo);
		this.valoreNutrizionale = valoreNutrizionale;
	}

	@Override
	public String toString() {
		return "Drink :" + " " + getNome() + " " + getPrezzo() + " " + valoreNutrizionale + "]";
	}

}
