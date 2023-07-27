package lucaguerra.exceptions;

public class ItemNotFoundException extends RuntimeException {

	public ItemNotFoundException(String nome) {
		super("Item with name " + nome + " not found!");
	}
}
