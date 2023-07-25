package lucaguerra.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lucaguerra.Interface.IElementiMenu;

@NoArgsConstructor
@Getter
@Setter

public class Topping implements IElementiMenu {

	private IElementiMenu elementiMenu;
	private String name;
	private Double price;
	private Double calorie;

	public Topping(IElementiMenu elementiMenu, String name, Double price, Double calorie) {
		this.elementiMenu = elementiMenu;
		this.name = name;
		this.price = price;
		this.calorie = calorie;
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
