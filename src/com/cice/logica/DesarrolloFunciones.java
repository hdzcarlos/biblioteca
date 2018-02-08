/**
 * 
 */
package com.cice.logica;

import java.awt.List;
import java.util.ArrayList;

import com.cice.clases.Comic;
import com.cice.clases.Libro;
import com.cice.clases.Revista;
import com.cice.clases.Stock;
import com.cice.enumerados.EnumPrestables;
import com.cice.interfaces.IPrestado;

/**
 * @author carlos		chcjava@gmail.com
 *
 */
public class DesarrolloFunciones extends AppGrafica{
	
		private static ArrayList<Stock> lista;


	public void TodosLosProductos() {
		
		lista = new ArrayList<>();
		
		System.out.println("Estos son los libros de la base de datos.");		
		lista.add(new Libro("01/07/1900", "Lo que el viento se llevo", EnumPrestables.LIBRO, "555559LFG", "Pedro"));
		lista.add(new Libro("01/05/1900", "El barco de babor", EnumPrestables.LIBRO, "55555599LSD", "Mister"));
		lista.add(new Comic("01/02/1988", "Spiderman", EnumPrestables.COMIC, 0001, 0000001));
		lista.add(new Revista("01/03/1988", "Corazon de verano", EnumPrestables.REVISTA, 0001, "TriAnual"));
		lista.add(new Comic("01/03/1966", "Sena", EnumPrestables.COMIC, 001, 000002));
	}
	
	public void mostrarPrestados(boolean estaPrestado ) {
		
			
		}
	}
