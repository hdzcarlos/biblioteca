/**
 * 
 */
package com.cice.clases;

import com.cice.enumerados.EnumPrestables;

/**
 * @author carlos		chcjava@gmail.com
 *
 */
public class Comic extends Stock {
	
	private double numero = 0;
	private double coleccion = 0;
	
	
	public Comic(String fechaPublicacion, String nombre, EnumPrestables prestable, double numero, double coleccion) {
		super(fechaPublicacion, nombre, prestable);
		this.numero = numero;
		this.coleccion = coleccion;
	}
	public double getNumero() {
		return numero;
	}
	public void setNumero(double numero) {
		this.numero = numero;
	}
	public double getColeccion() {
		return coleccion;
	}
	public void setColeccion(double coleccion) {
		this.coleccion = coleccion;
	}
	

}
