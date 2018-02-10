/**
 * 
 */
package com.cice.logica;

import java.util.Scanner;

import com.cice.clases.Stock;
import com.cice.enumerados.EnumPrestables;

/**
 * @author carlos		chcjava@gmail.com
 *
 */
public class AppGrafica extends Stock {
	
	
	DesarrolloFunciones df = new DesarrolloFunciones();
	Stock st = new Stock();
	
		
	
	public void accesoAPP() {
		showMenu();
	}

	private void showMenu(){
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
	do {
		System.out.println("		----------- Biblioteca de CICE 0.1 ----------		");
		System.out.println(" Este es el menú de usuario");	
		System.out.println(" 1.- Todos los productos.");
		System.out.println(" 2.- Todos los productos que son prestables.");
		System.out.println(" 3.- Prestar un libro.");
		System.out.println(" 4.- Imprimir listado de publicaciones y discos.");
		System.out.println(" 5.- Imprimir listado de publicaciones prestados.");
		System.out.println(" 6.- Imprimir listado de publicaciones no prestadas.");
		System.out.println(" 0.- Salir.");
		System.out.println(" Elija una opción");
		System.out.print(">>>");
		opcion = sc.nextInt();
		controles(opcion);
		}while(opcion != 0);
		
	}
	
	private void controles(int opcion) {
		
	switch(opcion) {
		case 1 : df.mostrarTodosLosProductos();
			break;
		case 2 : df.mostrarPrestables();
			break;
		case 3 : df.prestamo();
			break;
		case 4 : st.imprimirPrestados();
			break;
		case 5 : 
			break;
		case 0 : System.out.println("Gracias por usar Biblioteca Cice 0.1"); 
			break;
			
			}

		}

}
