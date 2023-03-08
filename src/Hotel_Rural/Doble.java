package Hotel_Rural;

/**
 * 
 * @author Amelia María Coca López y Juan Cortés Cortés La clase Doble es una
 *         subclase de Habitacion y representa una habitación doble con un
 *         número específico de camas.
 */
public class Doble extends Habitacion {
	/**
	 * Crea una nueva instancia de Doble con el número de habitación y el número de
	 * camas especificados.
	 * 
	 * @param numero   El número de habitación de la habitación doble.
	 * @param numCamas El número de camas en la habitación doble.
	 */
	public Doble(int numero, int numCamas) {
		super(numero, numCamas);
	}

	/**
	 * Calcula los gastos de la habitación doble.
	 * 
	 * @return Los gastos de la habitación doble.
	 */
	@Override
	public double calcularGastos() {
		return 50 * getNumCamas();
	}

}
