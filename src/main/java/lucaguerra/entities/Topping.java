package lucaguerra.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lucaguerra.Interface.IElementiMenu;

@AllArgsConstructor
@Getter
@Setter

public class Topping implements IElementiMenu {

	private String name;
	private Double price;
	private Double calorie;
	private IElementiMenu elementiMenu;

	public Topping(IElementiMenu elementiMenu, String name, Double price, Double calorie) {

		this.name = name;
		this.price = price;
		this.calorie = calorie;
		this.elementiMenu = elementiMenu;
	}

	@Override
	public String getName() {
		return this.elementiMenu.getName() + " + " + this.name;
	}

	@Override
	public Double getPrice() {
		return this.elementiMenu.getPrice() + this.price;
	}

	@Override
	public Double getCalorie() {
		return this.elementiMenu.getCalorie() + this.calorie;
	}

	public String getMenu() {
		return this.name + " - calories: " + calorie + " - price: " + price;
	}

}
