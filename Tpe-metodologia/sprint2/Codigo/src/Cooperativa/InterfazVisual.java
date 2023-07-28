package Cooperativa;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InterfazVisual {

	public static void agregarCartonero(Cooperativa c) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		String nombre = " ";
		String apellido = " " ; 
		String direccion = " " ; 
		String dni = " " ;
		String ct = " " ;  
		try {
			nombre = br.readLine();
			apellido = br.readLine() ; 
			direccion = br.readLine() ; 
			dni = br.readLine() ; 
			ct = br.readLine() ; 
		} catch (IOException e) {
			e.printStackTrace();  
		} 
		int capacidadTransporte = Integer.parseInt(ct) ;
		c.agregarCartonero(nombre, apellido, direccion, dni, capacidadTransporte);
		
	}
	
	public static void eliminarCartonero(Cooperativa cooperativa) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		String dni = " " ;
		try { 
			dni = br.readLine() ; 
		} catch (IOException e) {
			e.printStackTrace();  
		} 
		cooperativa.eliminarCartonero(dni);
	}
	
	public static void agregarMaterial(Cooperativa c) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		String nombre = " ";
		String descripcion = " " ;
		String cantidad = " " ; 
		try {
			nombre = br.readLine();
			descripcion = br.readLine() ;
			cantidad = br.readLine() ; 
		} catch (IOException e) {
			e.printStackTrace();  
		} 
		int cant = Integer.parseInt(cantidad) ; 
		c.agregarMaterial(new Material(nombre,descripcion), cant);
	}

	public static void borrarMaterial(Cooperativa c) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		String nombre = " ";
		String descripcion = " " ; 
		try {
			nombre = br.readLine();
			descripcion = br.readLine() ; 
		} catch (IOException e) {
			e.printStackTrace();  
		}  
		c.borrarMaterial(new Material(nombre,descripcion));
	}
	
	
	
	
	
	public static void main (String[] args) {
		Cooperativa c = new Cooperativa() ; 
		
		c.menu(1);
		
		
	}

	



	
	
}
