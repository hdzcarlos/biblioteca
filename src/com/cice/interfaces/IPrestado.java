/**
 * 
 */
package com.cice.interfaces;

/**
 * @author carlos		chcjava@gmail.com
 *
 */
public interface IPrestado {
	
	boolean esPrestado();
	
	void cambiarEstado();
	
	String getNombre();

	String getFechaPublicacion();
	
}
