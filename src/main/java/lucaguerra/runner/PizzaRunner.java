package lucaguerra.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lucaguerra.dao.IPizzaDAO;
import lucaguerra.entities.Pizza;

@Component

public class PizzaRunner implements CommandLineRunner {

	@Autowired
	private IPizzaDAO pDAO;

	@Override
	public void run(String... args) throws Exception {

		Pizza capricciosa = new Pizza("Capricciosa", 10.50, 100.0);

		pDAO.save(capricciosa);
	}

}
