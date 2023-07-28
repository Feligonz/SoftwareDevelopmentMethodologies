
public class SolicitudRetiro {
	
	private int fHorariaInicio, fHorariaFinal ; 
	private Ciudadano c ; 
	private int opcionRetiro ;
	
	
	public SolicitudRetiro(int fHorariaInicio, int fHorariaFinal, Ciudadano c, int opcionRetiro) {
		this.fHorariaInicio = fHorariaInicio;
		this.fHorariaFinal = fHorariaFinal;
		this.c = c;
		this.opcionRetiro = opcionRetiro;
	} 
	
	public int getFHorariaInicio(){
		return this.fHorariaInicio;
	}
	
	public int getFHorariaFinal(){
		return this.fHorariaFinal;
	}
	
	public int getOpcionRetiro(){
		return this.opcionRetiro;
	}
	
	public void setFHorariaInicio(int fHorarioInicio){
		this.fHorariaInicio = fHorariaInicio;
	}
	
	public void setFHorariaFinal(int fHorarioFinal){
		this.fHorariaFinal = fHorariaFinal;
	}
	
	public void setOpcionRetiro(int opcionRetiro){
		this.opcionRetiro = opcionRetiro;
	}
	
	public Ciudadano getCiudadano(){
		return new Ciudadano(c.getNombre(),c.getApellido(),c.getTelefono(),c.getDireccion_x(),c.getDireccion_y(),c.getCapacidad_transporte());
	}
	
	
}
