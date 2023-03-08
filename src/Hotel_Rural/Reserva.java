package Hotel_Rural;

/**
 * 
 * @author Amelia María Coca López y Juan Cortés Cortés
 *
 */
import java.time.LocalDate;

/**
 * La clase Reserva representa una reserva de una habitación en un hotel.
 * 
 * Contiene información como el número de la reserva, las fechas de entrada y
 * salida, el número de personas y la habitación reservada.
 */
public class Reserva {
	private int numero;
	private LocalDate fechaEntrada;
	private LocalDate fechaSalida;
	private int numPersonas;
	private Habitacion habitacion;

	/**
	 * 
	 * Constructor de la clase Reserva.
	 * 
	 * @param numero       El número de la reserva.
	 * @param fechaEntrada La fecha de entrada en la habitación.
	 * @param fechaSalida  La fecha de salida de la habitación.
	 * @param numPersonas  El número de personas que se quedarán en la habitación.
	 * @param habitacion   La habitación reservada.
	 */
	public Reserva(int numero, LocalDate fechaEntrada, LocalDate fechaSalida, int numPersonas, Habitacion habitacion) {
		this.numero = numero;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.numPersonas = numPersonas;
		this.habitacion = habitacion;
	}

	/**
	 * 
	 * Devuelve el número de la reserva.
	 * 
	 * @return El número de la reserva.
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * 
	 * Devuelve la fecha de entrada en la habitación.
	 * 
	 * @return La fecha de entrada en la habitación.
	 */
	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * 
	 * Devuelve la fecha de salida de la habitación.
	 * 
	 * @return La fecha de salida de la habitación.
	 */
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * 
	 * Devuelve el número de personas que se quedarán en la habitación.
	 * 
	 * @return El número de personas que se quedarán en la habitación.
	 */
	public int getNumPersonas() {
		return numPersonas;
	}

	/**
	 * 
	 * Devuelve la habitación reservada.
	 * 
	 * @return La habitación reservada.
	 */
	public Habitacion getHabitacion() {
		return habitacion;
	}

	/**
	 * 
	 * Establece el número de la reserva.
	 * 
	 * @param numero El número de la reserva.
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * 
	 * Establece la fecha de entrada en la habitación.
	 * 
	 * @param fechaEntrada La fecha de entrada en la habitación.
	 */
	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * 
	 * Establece la fecha de salida de la habitación.
	 * 
	 * @param fechaSalida La fecha de salida de la habitación.
	 */
	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	/**
	 * 
	 * Establece el número de personas.
	 * 
	 * @param numPersonas el número de personas a establecer.
	 */
	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	/**
	 * 
	 * Establece la habitación reservada.
	 * 
	 * @param habitacion la habitación reservada a establecer.
	 */
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	/**
	 * 
	 * Retorna una representación en cadena de la reserva.
	 * 
	 * @return una cadena que representa la reserva.
	 */
	@Override
	public String toString() {
		return "Reserva [numero=" + numero + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida
				+ ", numPersonas=" + numPersonas + ", habitacion=" + habitacion + "]";
	}

	public void darBaja() {

	}

	public void darAlta() {

	}

}
