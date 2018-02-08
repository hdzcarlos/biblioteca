/**
 * 
 */
package com.cice.enumerados;

import com.cice.clases.Libro;

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

	EnumPrestables(boolean prestable ) {this.prestable  = prestable;}
	
	public boolean isPrestable() {
		if(prestable) {
			System.out.println("Este producto es prestable.");
		}else {
			System.out.println("Este producto No es prestable.");
		}
		
		return prestable;
	}
	
}

