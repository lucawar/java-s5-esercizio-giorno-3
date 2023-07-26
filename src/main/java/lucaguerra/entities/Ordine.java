package lucaguerra.entities;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Ordine {

	private int numeroOrdine;
	private String nota;
	private Tavolo tavolo;
	private int numeroPersone;
	private LocalDate oraAcquisto;

	@Override
	public String toString() {
		return "N°Ordine  " + numeroOrdine + " - nota " + nota + " - tavolo " + tavolo + " - numeroPersone"
				+ numeroPersone + " - oraAcquisto" + oraAcquisto;
	}

}
