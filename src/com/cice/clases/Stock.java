/**
 * Hay muchas de las cosas que estan definidas en esta clase que no uso , o uso bastante mal .... si me he dado cuenta.
 * creeo que este ejercicio lo voy hacer en un futuro mucho mas sencillo, espero.
 */
package com.cice.clases;


import java.util.ArrayList;
import com.cice.enumerados.EnumPrestables;
import com.cice.interfaces.IPrestado;
import com.cice.logica.DesarrolloFunciones;

/**
 * @author carlos		chcjava@gmail.com
 * 
 */
public class Stock implements IPrestado {
	// Dudo si ponerla abstracta o no -----???. 
	private String fechaPublicacion;
	private String nombre;
	private EnumPrestables prestable;
	private boolean estaPrestado;
	private boolean prestamoActivo = true;
	private boolean sinPrestar = false;
	DesarrolloFunciones df = new DesarrolloFunciones();
	ArrayList<Stock> lista1;
	/**
	 * Constructores con sobrecarga de constructores.
	 */
	public Stock() {
	 lista1 = new ArrayList<>();
	}
	public Stock(boolean estaPrestado, boolean prestamoActivo) {
		this.estaPrestado = estaPrestado;
		this.prestamoActivo = prestamoActivo;
	}
	public Stock(String nombre, String fechaPublicacion) {	
	}
	public Stock(EnumPrestables prestable) {
		this.prestable = prestable;
	}
	public Stock(String fechaPublicacion, String nombre, EnumPrestables prestable,boolean sinPrestar) {
		this.sinPrestar = sinPrestar;
		this.prestable = prestable;
		this.fechaPublicacion = fechaPublicacion;
		this.nombre = nombre;
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
	/**
	 * Este metodo nos dice si el articulo tiene la caracteristica de ser prestado o no indicada en el Enum {@link #Stock(EnumPrestables)}
	 * @return
	 */
	public boolean estadoActivo() {
		return estaPrestado = prestable.isPrestable();
	}

	@Override
	public boolean esPrestado() {
		
		return sinPrestar;
	}

	@Override
	public void cambiarEstado() {

		
		}
		 

	public boolean isPrestamoActivo() {
		if(this.prestamoActivo) {
			System.out.println("Este articulo acaba de pasar a estar prestado.");
			
			return true;
		}else {
			return false;
		}
	}
	public void setPrestamoActivo(boolean prestamoActivo) {
		
		this.prestamoActivo = prestamoActivo;
	}
	public boolean isSinPrestar() {
		return sinPrestar;
	}
	public void setSinPrestar(boolean sinPrestar) {
		this.sinPrestar = sinPrestar;
	}
	public ArrayList<Stock> getLista1() {
		return lista1;
	}
	public void setLista1(ArrayList<Stock> lista1) {
		this.lista1 = lista1;
	}
	
	
	
}
	
