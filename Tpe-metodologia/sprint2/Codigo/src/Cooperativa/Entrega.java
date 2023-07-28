package Cooperativa;

import java.time.LocalDate;

public class Entrega {
	
	LocalDate fechaEntrega ; 
	Material m ; 
	Float cantidad ;

	public Entrega(LocalDate fechaEntrega, Material m, float cantidad) {
		this.fechaEntrega = fechaEntrega;
		this.m = m;
		this.cantidad = cantidad;
	}
	
	

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	
	public Material getM() {
		return m;
	}
		
	public Float getCantidad() {
		return cantidad;
	}



	@Override
	public String toString() {
		return "[fechaEntrega=" + fechaEntrega + ", m=" + m.getNombre() + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
