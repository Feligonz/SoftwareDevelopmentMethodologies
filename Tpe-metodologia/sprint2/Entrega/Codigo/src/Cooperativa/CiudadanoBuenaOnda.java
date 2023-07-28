package Cooperativa;

public class CiudadanoBuenaOnda extends Cartonero {

	public CiudadanoBuenaOnda() {
		super("Ciudadano", "Buena", "Onda", "0", 0);
	}
	
	@Override
	public float porcentaje(Material m, Cooperativa c) {
		return (materiales.get(m) / c.porcentajeMaterial(m));  
	}
}
