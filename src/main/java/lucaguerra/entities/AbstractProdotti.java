package lucaguerra.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public abstract class AbstractProdotti {

	private String nome;
	private double prezzo;

	public AbstractProdotti(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

}
