/**
 * 
 */
package com.cice.enumerados;

import com.cice.clases.Libro;
import com.cice.interfaces.IPrestado;

/**
 * @author carlos 		chcjava@gmail.com
 *
 */
public enum EnumPrestables {
	
	LIBRO(true),
	DVD(true),
	DISCO(true),
	COMIC(false),
	REVISTA(false);
	

	private boolean prestable;
	private EnumPrestables() {

	}

	EnumPrestables(boolean prestable ) {this.prestable  = prestable;}
	
	public boolean isPrestable() {
		if(prestable) {
			return prestable;
		}else {
			return false;
		}
		
	}

	public void setPrestable(boolean prestable) {
		this.prestable = prestable;
	}
	
}

