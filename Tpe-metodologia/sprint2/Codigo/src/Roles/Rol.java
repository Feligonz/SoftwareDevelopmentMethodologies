package Roles;

import Cooperativa.Cooperativa;

public abstract class Rol {

	private String nombre ; 
	
	public Rol(String nombre) {
		this.nombre = nombre ; 
	}
	

	public abstract void Menu(Cooperativa c) ;
	
}
