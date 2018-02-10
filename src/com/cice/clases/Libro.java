/**
 * 
 */
package com.cice.clases;

import java.awt.List;

import com.cice.enumerados.EnumPrestables;
import com.cice.interfaces.IPrestado;

/**
 * @author carlos		chcjava@gmail.com
 *
 */
public class Libro extends Stock implements IPrestado {
	

	// Se pueede prestar. 
	private String isbn = "";
	private String autor = "";
	private boolean estaPrestado; 
	
	public Libro () {
		
	}
	
	
	
	public Libro(String nombre, String fechaPublicacion) {
		super(nombre, fechaPublicacion);
		
		
	}

	public Libro(String fechaPublicacion, String nombre, EnumPrestables prestable, String isbn, String autor,boolean sinPrestar) {
		super(fechaPublicacion, nombre, prestable,sinPrestar);
		this.autor = autor;
		this.isbn = isbn;
		
	
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
		
	}
	
	@Override
	public boolean esPrestado() {
		
		return this.estaPrestado;
	}
	@Override
	public void cambiarEstado() {
		this.estaPrestado = !this.estaPrestado;	
	}
	
	
	
	
	
	
	
	
	
	
	

}
