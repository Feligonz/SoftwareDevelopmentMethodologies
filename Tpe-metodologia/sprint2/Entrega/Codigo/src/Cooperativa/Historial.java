package Cooperativa;

import java.time.LocalDate;
import java.util.ArrayList;

public class Historial {
	
	private ArrayList<Entrega> entregas ; 
		
	
	public Historial() {
		entregas = new ArrayList<Entrega>() ; 
	}
	
	public void addEntrega(LocalDate fechaEntrega, float cantidad, Material m) {
		
		entregas.add(new Entrega(fechaEntrega,m,cantidad)) ; 
	}

	@Override
	public String toString() {  //Cuando alguien lo teste chequee 
		return "Historial [entregas=" + entregas + "]";
	}
	
	
	
}
