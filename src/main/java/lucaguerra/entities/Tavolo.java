package lucaguerra.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lucaguerra.Enum.StatoTavolo;

@AllArgsConstructor
@Getter
@Setter
public class Tavolo {

	private StatoTavolo statoTavolo;
	private int numeroTavolo;
	private int copertiMassimi;

	@Override
	public String toString() {
		return "N°Tavolo " + numeroTavolo + " - stato tavolo=" + statoTavolo + " - copertiMassimi" + copertiMassimi;
	}
}
