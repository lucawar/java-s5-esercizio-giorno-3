package lucaguerra.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Getter
@Setter
@Slf4j
public class Ordine {

	private int numeroOrdine;
	private String nota;
	private Tavolo tavolo;
	private int numeroPersone;
	private LocalDate oraAcquisto;
	private List<Pizza> listaPizza = new ArrayList<>();
	private List<Topping> listaTopping = new ArrayList<>();
	private List<Drink> listaDrink = new ArrayList<>();
	private List<Franchise> ListaFranchise = new ArrayList<>();

	public Ordine(int numeroOrdine, String nota, Tavolo tavolo, int numeroPersone, LocalDate oraAcquisto) {

		this.numeroOrdine = numeroOrdine;
		this.nota = nota;
		this.tavolo = tavolo;
		this.numeroPersone = numeroPersone;
		this.oraAcquisto = oraAcquisto;
	}

	@Override
	public String toString() {
		return "N°Ordine  " + numeroOrdine + " - nota " + nota + " - tavolo " + tavolo + " - numeroPersone"
				+ numeroPersone + " - oraAcquisto " + oraAcquisto;
	}

	public double calcolaTotale() {
		double totale = 0.0;

		for (Pizza pizza : listaPizza) {
			totale += pizza.getPrezzo();
		}

		for (Drink drink : listaDrink) {
			totale += drink.getPrezzo();
		}

		return totale;
	}

	public void stampaTotale() {
		double totale = calcolaTotale();
		log.info("Totale dell'ordine: " + totale + "€");
	}

}
