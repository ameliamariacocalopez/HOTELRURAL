package Hotel_Rural;

/**
 * 
 * @author Amelia María Coca López y Juan Cortés Cortés
 *
 */
public class Suite extends Habitacion {
	private int metros;
	private String servicios;

	/**
	 * Crea una nueva instancia de la clase Suite.
	 * 
	 * @param numero    El número de la habitación.
	 * @param numCamas  El número de camas en la habitación.
	 * @param metros    Los metros cuadrados de la habitación suite.
	 * @param servicios Los servicios adicionales que se ofrecen en la habitación
	 *                  suite.
	 */
	public Suite(int numero, int numCamas, int metros, String servicios) {
		super(numero, numCamas);
		this.metros = metros;
		this.servicios = servicios;
	}

	/**
	 * Devuelve los metros cuadrados de la habitación suite.
	 * 
	 * @return Los metros cuadrados de la habitación suite.
	 */
	public int getMetros() {
		return metros;
	}

	/**
	 * Devuelve los servicios adicionales que se ofrecen en la habitación suite.
	 * 
	 * @return Los servicios adicionales que se ofrecen en la habitación suite.
	 */
	public String getServicios() {
		return servicios;
	}

	/**
	 * Calcula los gastos de la habitación suite, incluyendo los servicios
	 * adicionales y los metros cuadrados.
	 * 
	 * @return Los gastos totales de la habitación suite.
	 */
	@Override
	public double calcularGastos() {
		double precioBase = 100;
		double precioMetros = metros * 2;
		double precioServicios = servicios.equals("completo") ? 50 : 0;
		return precioBase + precioMetros + precioServicios;
	}

}
