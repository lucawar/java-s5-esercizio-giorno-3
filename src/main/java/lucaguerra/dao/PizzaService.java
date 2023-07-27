package lucaguerra.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import lucaguerra.entities.Pizza;
import lucaguerra.exceptions.ItemNotFoundException;

@Service
@Slf4j
public class PizzaService implements IPizzaDAO {

	@Autowired
	private PizzaRepository pizzaRepo;

	@Override
	public void save(Pizza pizza) {
		pizzaRepo.save(pizza);
		log.info(pizza.getNome() + "Pizza salvata !");

	}

	@Override
	public Pizza findByName(String nome) {

		return pizzaRepo.findByNome(nome).orElseThrow(() -> new ItemNotFoundException(nome));
	}

	@Override
	public void findByNameAndUpdate(String nome, Pizza pizza) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findByNameAndDelete(String nome) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pizza> findAll() {

		return pizzaRepo.findAll();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Pizza> findByPartialNameIgnoreCase(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
