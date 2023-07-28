package Roles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Cooperativa.Cooperativa;
import Cooperativa.Material;

public class Secretaria extends Rol {

	public Secretaria(String nombre) {
		super(nombre);
	}

	
	
	
	public void Menu(Cooperativa c) {
		
		//ES UN MODELO; NO NOS MATES GUILLE gracias. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ; 
		String reader = " ";
		try {
			reader = br.readLine();
		} catch (IOException e) {
			e.printStackTrace(); //No deberia hacer nada, si no le escriben un numero. 
		} 
		int x = Integer.parseInt(reader) ;  
		switch (x) {
			
		case 1 : c.menu(1) ; //this.AgregarCartonero(null, null, null, null, 0);
		case 2 : c.menu(2) ; //this.EliminarCartonero(null);
		case 3 : c.menu(3) ; //this.AgregarMaterial(new Material(null, null), null);
		case 4 : c.menu(4) ; //this.BorrarMaterial(null);
		break ; 
		
		}
		
	}

}
