/**
 * 
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
	private static ArrayList<Stock> articulosPrestados;
	
	public void imprimirPrestados() {
		for (Stock stock : articulosPrestados) {
			System.out.println(articulosPrestados.indexOf(stock)+ " .- " + stock.getNombre());
		
		}
	}
	
	
	public static ArrayList<Stock> getArticulosPrestados() {
		return articulosPrestados;
	}
	public static void setArticulosPrestados(ArrayList<Stock> articulosPrestados) {
		Stock.articulosPrestados = articulosPrestados;
	}
	public Stock() {
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
			return true;
		}else {
			return false;
		}
	}
	public void setPrestamoActivo(boolean prestamoActivo) {
		
		this.prestamoActivo = prestamoActivo;
	}
		
}
	
