/**
 * 
 */
package com.cice.clases;

import com.cice.enumerados.EnumPrestables;

/**
 * @author carlos		chcjava@gmail.com
 *
 */
public class Revista extends Stock{
	
	private double numero = 0;
	private String periocidad = "";
	
	
	public Revista(String fechaPublicacion, String nombre, EnumPrestables prestable, double numero, String periocidad,boolean sinPrestar) {
		super(fechaPublicacion, nombre, prestable,sinPrestar);
		this.numero = numero;
		this.periocidad = periocidad;
	}
	public double getNumero() {
		return numero;
	}
	public void setNumero(double numero) {
		this.numero = numero;
	}
	public String getPeriocidad() {
		return periocidad;
	}
	public void setPeriocidad(String periocidad) {
		this.periocidad = periocidad;
	}
	
	

}
