package Hotel_Rural;

/**
 * La clase Habitacion representa una habitación en un hotel rural. Es una clase
 * abstracta que define las propiedades y métodos básicos de una habitación. Las
 * subclases deben implementar el método abstracto 'calcularGastos' para
 * calcular los gastos de una habitación.
 * 
 * @author Amelia María Coca López y Juan Cortés Cortés
 *
 */
public abstract class Habitacion {
	private int numero;
	private boolean estado;
	private int numCamas;

	/**
	 * Construye una nueva habitación con el número de habitación y número de camas
	 * especificados. El estado de ocupación inicial de la habitación es false.
	 * 
	 * @param numero   el número de la habitación
	 * @param numCamas el número de camas en la habitación
	 */
	public Habitacion(int numero, int numCamas) {
		this.numero = numero;
		this.numCamas = numCamas;
		this.estado = false;
	}

	/**
	 * Devuelve el número de la habitación de esta habitación.
	 * 
	 * @return el número de la habitación de esta habitación
	 * 
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Devuelve el estado de ocupación de esta habitación.
	 * 
	 * @return true si la habitación está ocupada, false de lo contrario
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * Establece el estado de ocupación de esta habitación.
	 * 
	 * @param ocupada true si la habitación está ocupada, false de lo contrario
	 */

	public void setOcupada(boolean ocupada) {
		this.estado = ocupada;
	}

	/**
	 * Devuelve el número de camas de esta habitación.
	 * 
	 * @return el número de camas de esta habitación
	 */
	public int getNumCamas() {
		return numCamas;
	}

	/**
	 * Calcula los gastos de esta habitación. Las subclases deben implementar este
	 * método para calcular los gastos de un tipo específico de habitación.
	 * 
	 * @return los gastos de esta habitación
	 */
	public abstract double calcularGastos();

}
