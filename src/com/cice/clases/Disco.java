/**
 * 
 */
package com.cice.clases;

import com.cice.enumerados.EnumPrestables;

/**
 * @author carlos		chcjava@gmail.com
 *
 */
public class Disco extends Stock{
	
	private String estilo = "";

	public Disco(String fechaPublicacion, String nombre, EnumPrestables prestable, String estilo) {
		super(fechaPublicacion, nombre, prestable);
		this.estilo = estilo;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
}
