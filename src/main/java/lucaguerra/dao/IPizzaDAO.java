package lucaguerra.dao;

import java.util.List;

import lucaguerra.entities.Pizza;

public interface IPizzaDAO {

	public void save(Pizza pizza);

	public void findByNameAndUpdate(String nome, Pizza pizza);

	public void findByNameAndDelete(String nome);

	public Pizza findByName(String nome);

	public List<Pizza> findAll();

	public long count();

	public List<Pizza> findByPartialNameIgnoreCase(String nome);
}
