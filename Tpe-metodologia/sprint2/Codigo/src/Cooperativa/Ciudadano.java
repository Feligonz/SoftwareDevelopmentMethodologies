package Cooperativa;

public class Ciudadano {

	private String nombre, apellido, telefono, direccion;
	private int capacidad_transporte;
	private float direccion_x, direccion_y;

	private static final int LIMITETRANSPORTE = 3;
	private static final float LIMITEDISTANCIA = 6; // El limite de distancia debe menor que 6 km

	public Ciudadano(String nombre, String apellido, String telefono, float direccion_x, float direccion_y,
			int capacidad_transporte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion_x = direccion_x;
		this.direccion_y = direccion_y;
		if (capacidad_transporte >= 0 && capacidad_transporte <= LIMITETRANSPORTE)
			this.capacidad_transporte = capacidad_transporte;
		else
			this.capacidad_transporte = 0 ; 

	}

	// Devuelve la distancia entre la cooperativa y la direccion
	private double calcularDistancia(float x, float y) {
		return Math.sqrt(Math.pow((x - direccion_x), 2) + Math.pow((y - direccion_y), 2));

	}

	public float getDireccion_x() {
		return direccion_x;
	}

	public void setDireccion_x(float direccion_x) {
		this.direccion_x = direccion_x;
	}

	public float getDireccion_y() {
		return direccion_y;
	}

	public void setDireccion_y(float direccion_y) {
		this.direccion_y = direccion_y;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCapacidad_transporte() {
		return capacidad_transporte;
	}

	public void setCapacidad_transporte(int capacidad_transporte) {
		if (capacidad_transporte >= 0 && capacidad_transporte <= LIMITETRANSPORTE)
			this.capacidad_transporte = capacidad_transporte;

	}

	// Se crea una clase solicitud de retiro que contiene los datos y se agrega a la
	// lista
	// Solamente en los casos donde la distancia se cumple
	public boolean solicitarRetiro(Cooperativa c, int franjaInicio, int franjaFin) {
		if (this.calcularDistancia(c.getX(), c.getY()) < LIMITEDISTANCIA) {
			SolicitudRetiro r = new SolicitudRetiro(franjaInicio, franjaFin, this, this.getCapacidad_transporte());
			c.agregarSolicitud(r);
			return true;
		}

		return false;
	}

}
