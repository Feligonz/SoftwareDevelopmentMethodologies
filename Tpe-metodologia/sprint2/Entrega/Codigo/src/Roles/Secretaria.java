package Roles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Cooperativa.Cooperativa;
import Cooperativa.Material;
import Cooperativa.InterfazVisual;

public class Secretaria extends Rol {

	public Secretaria(String nombre) {
		super(nombre);
	}

	
	public void menu(Cooperativa c) {
		int x = 0 ; 
		while(x >= 0 && x < 5) {
			System.out.println("Menu Secretaria " + super.getNombre() );
			System.out.println(" 1. Agregar Cartonero \n 2. EliminarCartonero "
					+ "\n 3.AgregarMaterial \n 4.BorrarMaterial \n 5.Salir");

			String	reader = InterfazVisual.ingresarDato() ;
			x = Integer.parseInt(reader) ;  
			switch (x) {  
				case 1 : 
					c.menu(1) ;
					System.out.println("Registrado");
					break; 
				case 2 : 
					c.menu(2) ;
					System.out.println("Borrado");
					break;
				case 3 : 
					c.menu(3) ;
					System.out.println("Registrado nuevo Material");
					break;
				case 4 : 
					c.menu(4) ; 
					System.out.println("El material ha sido eliminado de la cooperativa");
					break ; 
			}
		}
	}



}
