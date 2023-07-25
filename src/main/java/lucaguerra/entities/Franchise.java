package lucaguerra.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Franchise {

	private String name;
	private Double price;

	public String getMenu() {
		return this.name + " - price: " + price;
	}
}
