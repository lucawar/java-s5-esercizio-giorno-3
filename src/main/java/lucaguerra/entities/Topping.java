package lucaguerra.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class Topping {

	private String name;
	private Double price;
	private Double calorie;

	public String getMenu() {
		return this.name + " - calories: " + calorie + " - price: " + price;
	}

	@Override
	public String toString() {
		return "Topping aggiunto : " + name + " - prezzo aggiuntivo : " + price + " - calorie " + calorie;
	}

}
