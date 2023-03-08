package Hotel_Rural;

/**
 * 
 * @author Amelia María Coca López y Juan Cortés Cortés
 *
 */
//Clase Cliente
public class Cliente {
	private int numCliente;
	private String nombre;
	private String telefono;

	// Constructor
	/** 
	 * Crea una nueva instancia de la clase Cliente.
	 * 
	 * @param numCliente El número de identificación del cliente.
	 * @param nombre     El nombre del cliente.
	 * @param telefono   El número de teléfono del cliente.
	 */
	public Cliente(int numCliente, String nombre, String telefono) {
		this.numCliente = numCliente;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	// Getters y Setters
	/**
	 * Devuelve el número de identificación del cliente.
	 * 
	 * @return El número de identificación del cliente.
	 */
	public int getNumCliente() {
		return numCliente;
	}

	/**
	 * Establece el número de identificación del cliente.
	 * 
	 * @param numCliente El nuevo número de identificación del cliente.
	 */
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	/**
	 * Devuelve el nombre del cliente.
	 * 
	 * @return El nombre del cliente.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del cliente.
	 * 
	 * @param nombre El nuevo nombre del cliente.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el número de teléfono del cliente.
	 * 
	 * @return El número de teléfono del cliente.
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Establece el número de teléfono del cliente.
	 * 
	 * @param telefono El nuevo número de teléfono del cliente.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}