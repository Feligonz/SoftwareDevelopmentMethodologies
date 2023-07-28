
public class Material {
	
	private String nombre ; 
	private float peso ;
	private String descripcion ;
	
		

	public Material(String nombre, float peso, String descripcion) {

		this.nombre = nombre;
		this.peso = peso;
		this.descripcion = descripcion;
	}

	
	
	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public void agregarInformacion(String info) {
		this.descripcion = this.descripcion + " " + info ; 
	}
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			
			Material o1 = (Material) obj ; 
			return o1.getNombre().equals(nombre) ; 
			
		}
		catch (Exception e) {
			return false ; 
		}
	} 
	
	
}
