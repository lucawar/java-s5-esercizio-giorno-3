package lucaguerra.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Menu {

	private final List<Pizza> menuPizza = new ArrayList<>();
	private final List<Topping> menuTopping = new ArrayList<>();
	private final List<Drink> menuDrink = new ArrayList<>();
	private final List<Franchise> menuFranchise = new ArrayList<>();

}
