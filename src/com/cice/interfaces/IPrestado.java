/**
 * 
 */
package com.cice.interfaces;

/**
 * @author carlos		chcjava@gmail.com
 * Metodos que son usados por todas las clases 
 */
public interface IPrestado {
	
	boolean esPrestado();
	
	void cambiarEstado();
	
	String getNombre();

	String getFechaPublicacion();
	
}
