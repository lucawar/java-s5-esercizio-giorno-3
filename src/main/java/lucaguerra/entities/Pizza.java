package lucaguerra.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lucaguerra.Enum.PizzaSize;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Pizza extends AbstractProdotti {

	@Id
	@GeneratedValue
	private int id;
	private double kcal;
	private PizzaSize pizzaSize;
	// private List<Topping> toppings;

	public Pizza(String nome, double prezzo, double kcal) {
		super(nome, prezzo);
		this.kcal = kcal;

		// this.toppings = new ArrayList<>();

	}

//	public void addTopping(Topping topping) {
//		toppings.add(topping);
//	}

	public String getMenu() {
		return this.getNome() + " - kcal: " + kcal + " - prezzo: " + this.getPrezzo();
	}

//	@Override
//	public String toString() {
//		return this.getNome() + " -size: " + pizzaSize + " " + toppings;
//	}

}
