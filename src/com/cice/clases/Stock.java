/**
 * 
 */
package com.cice.clases;

import com.cice.enumerados.EnumPrestables;

/**
 * @author carlos		chcjava@gmail.com
 * 
 */
public abstract class Stock {
	// Dudo si ponerla abstracta o no -----???. 
	private String fechaPublicacion;
	private String nombre;
	private EnumPrestables prestable;
	private boolean estaPrestado;
	
	public Stock() {
		
	}
	public Stock(EnumPrestables prestable) {
		this.prestable = prestable;
	}

	
	public Stock(String fechaPublicacion, String nombre, EnumPrestables prestable) {
		this.prestable = prestable;
		this.fechaPublicacion = fechaPublicacion;
		this.nombre = nombre;
		estadoActivo();
		
		
	}
	public String getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public EnumPrestables getPrestable() {
		return prestable;
	}
	public void setPrestable(EnumPrestables prestable) {
		this.prestable = prestable;
	}
	
	public void estadoActivo() {
		estaPrestado = prestable.isPrestable();
	}

	
	
		

}
