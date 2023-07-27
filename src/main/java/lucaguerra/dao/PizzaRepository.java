package lucaguerra.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lucaguerra.entities.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

	Optional<Pizza> findByNome(String nome);

}
