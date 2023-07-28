package Cooperativa;
import java.time.LocalDate;
import java.util.HashMap;

public class Cartonero {

	protected HashMap<Material,Float> materiales ;
	private Historial historial ; 
	private String nombre, apellido, direccion, dni ; 
	private int capacidadTransporte;
	
	public Cartonero(String nombre, String apellido, String direccion, String dni, int capacidadTransporte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.capacidadTransporte = capacidadTransporte;
		materiales = new HashMap<Material,Float>() ; 
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCapacidadTransporte() {
		return capacidadTransporte;
	}

	public void setCapacidadTransporte(int capacidadTransporte) {
		this.capacidadTransporte = capacidadTransporte;
	} 
	
	public void agregarMaterial(Material m, Float cantidad, Cooperativa c) {
		if (materiales.containsKey(m)) {
			materiales.put(m, materiales.get(m)+ cantidad) ; 
		}else
			materiales.put(m, cantidad) ;
		c.agregarMaterial(m, cantidad); //Este suma al balance total.
		historial.addEntrega(LocalDate.now(), cantidad, m); //Con esto registramos la entrega

	}
	
	public float porcentaje(Material m, Cooperativa c) {
		return (materiales.get(m) / c.porcentajeMaterial(m)) + c.retribucionBuenaOnda(m);  
	}
	
	public void verHistorial() {
		historial.toString() ; 
	}


	@Override
	public String toString() {
		return "Cartonero [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}


	public void eliminarMaterial(Material m) {
		materiales.remove(m) ;
	}
	
	
	
}
