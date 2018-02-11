/**
 * 
 */
package com.cice.logica;

import java.awt.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

import com.cice.clases.Comic;
import com.cice.clases.Disco;
import com.cice.clases.Libro;
import com.cice.clases.Revista;
import com.cice.clases.Stock;
import com.cice.enumerados.EnumPrestables;
import com.cice.interfaces.IPrestado;

/**
 * @author carlos		chcjava@gmail.com
 *
 */
public class DesarrolloFunciones{
		private static ArrayList<Stock> lista1;
		private static ArrayList<Stock> articulosPrestados = new ArrayList<>();
		private ArrayList<Stock> articuloPrestado = new ArrayList<>();
		EnumPrestables ePrestables;
	
		public DesarrolloFunciones(){
		}
	private void todosLosProductos() {
		lista1 = new ArrayList<>();
		Libro libro = new Libro();
				
		lista1.add(new Libro("01/07/1900", "Lo que el viento se llevo", EnumPrestables.LIBRO, "555559LFG", "Pedro",false));
		lista1.add(new Libro("01/05/1900", "El barco de babor", EnumPrestables.LIBRO, "55555599LSD", "Mister",false));
		lista1.add(new Comic("01/02/1988", "Spiderman", EnumPrestables.COMIC, 0001, 0000001,false));
		lista1.add(new Revista("01/03/1988", "Corazon de verano", EnumPrestables.REVISTA, 0001, "Tri-Anual",false));
		lista1.add(new Comic("01/03/1966", "Sena", EnumPrestables.COMIC, 001, 000002,false));
		lista1.add(new Comic("01/02/1900", "Tintin", EnumPrestables.COMIC , 00012, 002,false));
		lista1.add(new Libro("02/05/1900", "Asturias", EnumPrestables.LIBRO, "0000011KLD", "EDEN",false));
		lista1.add(new Disco("01/02/1900", "Heroes del silencio", EnumPrestables.DISCO, "ROCK", false));
	}
	protected void mostrarTodosLosProductos() {
		todosLosProductos();
		System.out.println("Estos son todos los productos de la base de datos.");
		for (Stock stock : lista1) {
			System.out.println(lista1.indexOf(stock)+".-"+stock.getNombre()+ "-------"+ stock.getFechaPublicacion());
		}
			System.out.println("-----------------------------------------------------");
	}
	protected void mostrarPrestables() {
		todosLosProductos();
		for (Stock stock : lista1) {
		if(stock.estadoActivo()) {
			System.out.println(lista1.indexOf(stock)+".-"+stock.getNombre()+ " se publico en: "+ stock.getFechaPublicacion());
			}
		}
	}/**
	* En este metodo intentanmos hacer el prestamo de un articulo , queriendo eliminarlo de la lista de prestables. 
	* Problemas : 
	* 1º Cuando yo muestro la lista de prestables , unicamente se ven los que se pueden prestar 
	* pero se pueden manejar el resto de datos para prestar.
	* 2º Cuando yo presto un articulo no desaparece de la lista, y además se puede volver a prestar. 
	* 
	**/
	protected void prestamo() {
		Scanner sc = new Scanner(System.in);
		int articuloSelecionado;			
			mostrarPrestables();
			Stock articuloElegido = new Stock();
			Stock prestado = new Stock();
			System.out.println("Elija de la lista el articulo que desea prestar. ");
			System.out.println("");
			System.out.println("Pulse x para cancelar");
			articuloSelecionado = sc.nextInt();
				System.out.println("Ha prestado usted el articulo.- "+ lista1.get(articuloSelecionado).getNombre());
				articuloElegido = lista1.get(articuloSelecionado);
				articulosPrestados.add(articuloElegido);
				lista1.retainAll(articuloPrestado);				
			
//			prestado.setSinPrestar(true);
//			if(prestado.isSinPrestar()) {
//				System.out.println("Se ha borrado el articulo de la lista de prestables.");
//				lista1.remove(articuloSelecionado);
//			}else {
//				System.out.println("Este articulo ha sido devuelto a la lista.");
//				} 
			//System.out.println("El articulo a prestar es: "+articuloElegido.getNombre());
	}
	protected void imprimirPrestados() {
		for (Stock stock : articulosPrestados) {
			System.out.println(articulosPrestados.indexOf(stock)+ " .- " + stock.getNombre());
		}
			System.out.println("Estos son los articulos que se encuentran prestados en este momento.");
	}
}
